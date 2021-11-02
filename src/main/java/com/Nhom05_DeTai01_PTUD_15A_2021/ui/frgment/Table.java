package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Color;

public class Table extends JTable {
	private static final long serialVersionUID = 1L;

	public Table() {
		setBackground(Color.WHITE);
		setShowHorizontalLines(true);
		setRowHeight(40);
		getTableHeader().setReorderingAllowed(false);
		getTableHeader().setDefaultRenderer(new TableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				TableHeader header = new TableHeader(value+"");
				header.setHorizontalAlignment(JLabel.CENTER);			
				return header;
			}
		});
		setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if (isSelected) {
                    com.setForeground(Color.WHITE);
                    com.setBackground(new Color(255, 92, 239));
                } else {
                    com.setForeground(Color.BLACK);
                    com.setBackground(null);
                }
				return com;
			}
		});
	}
	
	public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
}
