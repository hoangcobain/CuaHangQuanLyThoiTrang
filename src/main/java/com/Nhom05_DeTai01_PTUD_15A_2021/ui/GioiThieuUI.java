/**
 * Tác giả: Nguyễn Viết Hoàng - mssv:19473871 - Nhóm 5
 * 
 * Ngày tạo:16/10/2021
 * Mô tả: Giao diện giới thiệu 
 */
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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;

public class GioiThieuUI extends JPanel {

	/**
	 * Create the panel.
	 */
	public GioiThieuUI() {
		
		JLabel lblNewLabel = new JLabel("NHÓM 5 PHÁT TRIỂN ỨNG DỤNG --- QUẢN LÝ CỬA HÀNG H&L");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Đội ngũ phát triển:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Nguyễn Viết Hoàng");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2_1 = new JLabel("Trương Nhật Long");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Lê Hoàng Long");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Đoàn Thế Long");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblMiThcMc = new JLabel("Mọi thắc mắc xin liên hệ qua email cuahanghandl@gmail.com");
		lblMiThcMc.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiThcMc.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(lblMiThcMc, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(85)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_2_1_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(246, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(149)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2_1_2)
					.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
					.addComponent(lblMiThcMc, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
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
