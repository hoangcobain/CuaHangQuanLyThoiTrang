package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import javax.swing.SwingConstants;

import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ModelMenu.MenuType;
import javax.swing.JButton;

public class Menu extends JPanel {
	private static final long serialVersionUID = 1L;

	private MenuList<Object> lstMenu;
	public JButton btnDangXuat, btnMatKhau;
	public JLabel lblEmail, lblUser;
	
	public void addEventMenuSelected(EventMenuSelected eventMenuSelected) {
		lstMenu.addEventMenuSelected(eventMenuSelected);
	}
	
	/**
	 * Create the panel.
	 */	
	public Menu() {
		setOpaque(false);
		
		JPanel panelHead = new JPanel();
		panelHead.setBorder(null);
		panelHead.setOpaque(false);
		
		lstMenu = new MenuList<Object>();
		lstMenu.addItem(new ModelMenu(""," Sản Phẩm",MenuType.TITLE));
		lstMenu.addItem(new ModelMenu("gift","Sản Phẩm",MenuType.MENU));
		lstMenu.addItem(new ModelMenu("product","Loại Sản Phẩm",MenuType.MENU));
		lstMenu.addItem(new ModelMenu("supplier","Nguồn Hàng",MenuType.MENU));
		
		lstMenu.addItem(new ModelMenu("","",MenuType.EMPTY));
		lstMenu.addItem(new ModelMenu(""," Thông Tin",MenuType.TITLE));
		lstMenu.addItem(new ModelMenu("customer","Khách Hàng",MenuType.MENU));
		lstMenu.addItem(new ModelMenu("employees","Nhân Viên",MenuType.MENU));
		
		lstMenu.addItem(new ModelMenu("","",MenuType.EMPTY));
		lstMenu.addItem(new ModelMenu(""," Cửa Hàng",MenuType.TITLE));
		lstMenu.addItem(new ModelMenu("bill","Quản Lý Hóa Đơn",MenuType.MENU));
		lstMenu.addItem(new ModelMenu("page","Lập Hóa Đơn",MenuType.MENU));
		lstMenu.addItem(new ModelMenu("trend","Thống Kê",MenuType.MENU));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(lstMenu, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
				.addComponent(panelHead, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panelHead, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lstMenu, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		lblUser = new JLabel("User");
		lblUser.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		lblEmail = new JLabel("Email@gmail.com");
		lblEmail.setVerticalAlignment(SwingConstants.TOP);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblLogo = new JLabel("H&L");
		lblLogo.setForeground(Color.WHITE);
		lblLogo.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnDangXuat = new JButton("Đăng Xuất");
		btnDangXuat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDangXuat.setBackground(Color.WHITE);
		
		btnMatKhau = new JButton("Đổi Mật Khẩu");
		btnMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMatKhau.setBackground(Color.WHITE);
		GroupLayout gl_panelHead = new GroupLayout(panelHead);
		gl_panelHead.setHorizontalGroup(
			gl_panelHead.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHead.createSequentialGroup()
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelHead.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
						.addComponent(lblUser, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
				.addGroup(gl_panelHead.createSequentialGroup()
					.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMatKhau, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelHead.setVerticalGroup(
			gl_panelHead.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHead.createSequentialGroup()
					.addGroup(gl_panelHead.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblLogo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panelHead.createSequentialGroup()
							.addComponent(lblUser, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelHead.createParallelGroup(Alignment.LEADING)
						.addComponent(btnDangXuat, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMatKhau, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelHead.setLayout(gl_panelHead);
		setLayout(groupLayout);
	}

	@Override
	protected void paintChildren(Graphics g) {
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint gradientPaint = new GradientPaint(0, 0, new Color(90, 101, 112), 0, getHeight(), new Color(119,136,153));
		graphics2d.setPaint(gradientPaint);
		graphics2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		graphics2d.fillRect(0, 0, getWidth(), getHeight());
		super.paintChildren(graphics2d);
	}
}
