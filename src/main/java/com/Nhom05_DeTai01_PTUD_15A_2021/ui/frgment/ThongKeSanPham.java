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
	
	public ThongKeSanPham() {
		setBorder(null);
		setBackground(Color.WHITE);
		
		DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
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
		
		Object[] header = {"Mã hóa đơn","Ngày lập","Tổng Tiền","Mã nhân viên","Mã khách hàng"};
		boolean[] editColumn = new boolean[] {false, false, false, false, false};
		Object[][] body = new Object[][] {};
		
		table = new Table();
		table.setModel(new DefaultTableModel(body,header){
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return editColumn[column];
			}
		});
		panelContent.setViewportView(table);
		
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		table.addRow(new Object[] {"1","1",1,1,"2"});
		
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
