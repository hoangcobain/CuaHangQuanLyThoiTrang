/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:10/12/2021
 * Mô tả: Giao diện thống kê hóa đơn
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.jfree.data.category.DefaultCategoryDataset;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongKeHoaDon extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Table table;

	private DefaultCategoryDataset dataset2;
	private DefaultTableModel listHoaDon;
	protected JDatePickerImpl txtNgayThongKe;

	private JComboBox comboBox;

	private JButton btnThongKe;

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JDatePickerImpl getTxtNgayThongKe() {
		return txtNgayThongKe;
	}

	public JButton getBtnThongKe() {
		return btnThongKe;
	}

	public DefaultCategoryDataset getDataset2() {
		return dataset2;
	}

	public DefaultTableModel getListHoaDon() {
		return listHoaDon;
	}

	public ThongKeHoaDon() {
		setBorder(null);
		setBackground(Color.WHITE);
		
		dataset2 = new DefaultCategoryDataset();
		dataset2.addValue(20, "A", "1");
		dataset2.addValue(10, "A", "2");
		dataset2.addValue(30, "A", "3");
		dataset2.addValue(40, "A", "4");		
		dataset2.addValue(10, "A", "5");
		dataset2.addValue(50, "A", "6");
		LineChart panelChart = new LineChart(dataset2);
		panelChart.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane panelContent = new JScrollPane();
		panelContent.setForeground(Color.WHITE);
		panelContent.setBackground(Color.WHITE);
		panelContent.getVerticalScrollBar().setBackground(Color.WHITE);
		panelContent.getViewport().setBackground(Color.WHITE);
		
		Object[] header = {"Mã hóa đơn","Ngày lập","Mã khách hàng","Mã nhân viên","Tổng Tiền"};
		boolean[] editColumn = new boolean[] {false, false, false, false, false};
		Object[][] body = new Object[][] {};
		
		listHoaDon = new DefaultTableModel(body,header){
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return editColumn[column];
			}
		};
		
		table = new Table();
		table.setModel(listHoaDon);
		panelContent.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Loại thống kê:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tuần", "Tháng", "Năm"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNgyT = new JLabel("Ngày Bắt Đầu Thống Kê:");
		lblNgyT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNgyT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		txtNgayThongKe = new JDatePickerImpl(datePanel);
		txtNgayThongKe.getJFormattedTextField().setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtNgayThongKe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnThongKe = new JButton("Thống Kê");
		btnThongKe.setBackground(Color.decode("#E2A6FF"));
		btnThongKe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panelChart, GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNgyT, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtNgayThongKe, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(11))
				.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panelChart, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNgyT, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtNgayThongKe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThongKe, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel, comboBox, lblNgyT, txtNgayThongKe, btnThongKe});
		setLayout(groupLayout);

	}
}
