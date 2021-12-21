package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {
	private static final long serialVersionUID = 1L;

	public TableHeader(String text) {
		super(text);
		setOpaque(true);
		setBackground(Color.WHITE);
		setFont(new Font("Tahoma", Font.PLAIN, 20));
		setForeground(new Color(102,102,102));
		setBorder(new EmptyBorder(10,5,10,5));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(255, 92, 239));
        g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);	
	}

}
