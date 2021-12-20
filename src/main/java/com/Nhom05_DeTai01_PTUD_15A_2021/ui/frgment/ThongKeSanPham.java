/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:10/12/2021
 * Mô tả: Giao diện thống kê sản phẩm
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.Color;
import javax.swing.JScrollPane;

public class ThongKeSanPham extends JPanel {
	private static final long serialVersionUID = 1L;
	private Table table;
	private DefaultCategoryDataset dataset2;
	private DefaultTableModel listSanPham;

	public DefaultCategoryDataset getDataset2() {
		return dataset2;
	}

	public void setDataset2(DefaultCategoryDataset dataset2) {
		this.dataset2 = dataset2;
	}

	public DefaultTableModel getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(DefaultTableModel listSanPham) {
		this.listSanPham = listSanPham;
	}

	public ThongKeSanPham() {
		setBorder(null);
		setBackground(Color.WHITE);

		dataset2 = new DefaultCategoryDataset();
		dataset2.addValue(20, "A", "1");
		dataset2.addValue(10, "A", "2");
		dataset2.addValue(30, "A", "3");
		dataset2.addValue(40, "A", "4");
		dataset2.addValue(10, "A", "5");
		dataset2.addValue(50, "A", "6");
		HistoChart panelChart = new HistoChart(dataset2);
		panelChart.setBackground(Color.LIGHT_GRAY);

		JScrollPane panelContent = new JScrollPane();
		panelContent.setForeground(Color.WHITE);
		panelContent.setBackground(Color.WHITE);
		panelContent.getVerticalScrollBar().setBackground(Color.WHITE);
		panelContent.getViewport().setBackground(Color.WHITE);

		Object[] header = { "Mã sản phẩm", "Tên", "Nhà Cung Cấp", "Số Lương", "Size", "Màu Sắc", "Loại", "Giá Thành" };
		boolean[] editColumn = new boolean[] { false, false, false, false, false, false, false, false };
		Object[][] body = new Object[][] {};

		listSanPham = new DefaultTableModel(body, header) {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return editColumn[column];
			}
		};

		table = new Table();
		table.setModel(listSanPham);
		panelContent.setViewportView(table);

		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(panelChart, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
				.addComponent(panelContent, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(panelChart, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)));
		setLayout(groupLayout);

	}
}
