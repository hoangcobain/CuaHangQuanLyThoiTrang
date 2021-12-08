package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.jfree.data.general.DefaultPieDataset;

public class ThongKeKhachHang extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private Table table;

	private DefaultPieDataset dataset;
	private DefaultTableModel listKhachHang;
	
	public DefaultPieDataset getDataset() {
		return dataset;
	}

	public void setDataset(DefaultPieDataset dataset) {
		this.dataset = dataset;
	}

	public DefaultTableModel getListKhachHang() {
		return listKhachHang;
	}

	public void setListKhachHang(DefaultTableModel listKhachHang) {
		this.listKhachHang = listKhachHang;
	}

	public ThongKeKhachHang() {
		setBorder(null);
		setBackground(Color.WHITE);
		
		dataset = new DefaultPieDataset();
		dataset.setValue("A", 20);
		dataset.setValue("B", 20);
		dataset.setValue("C", 40);
		dataset.setValue("D", 10);
		PieChart panelChart = new PieChart(dataset);
		panelChart.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane panelContent = new JScrollPane();
		panelContent.setForeground(Color.WHITE);
		panelContent.setBackground(Color.WHITE);
		panelContent.getVerticalScrollBar().setBackground(Color.WHITE);
		panelContent.getViewport().setBackground(Color.WHITE);
		
		Object[] header = {"Mã khách hàng","Tên","Số điện thoại","Địa chỉ","Giới tính"};
		boolean[] editColumn = new boolean[] {false, false, false, false, false};
		Object[][] body = new Object[][] {};
		
		listKhachHang = new DefaultTableModel(body,header){
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return editColumn[column];
			}
		};
		
		table = new Table();
		table.setModel(listKhachHang);
		panelContent.setViewportView(table);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panelChart, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
				.addComponent(panelContent, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panelChart, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
