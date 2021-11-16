package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GioiThieuUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public GioiThieuUI() {
		
		JLabel lblNewLabel = new JLabel("NHÓM 5 PHÁT TRIỂN ỨNG DỤNG --- QUẢN LÝ CỬA HÀNG H&L");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(148)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(363, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	@Override
	protected void paintChildren(Graphics g) {
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint gradientPaint = new GradientPaint(0, 0, new Color(119,136,153), 0, getHeight(), new Color(119,136,153));
		graphics2d.setPaint(gradientPaint);
		graphics2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		graphics2d.fillRect(0, 0, getWidth(), getHeight());
		super.paintChildren(graphics2d);
	}
}
