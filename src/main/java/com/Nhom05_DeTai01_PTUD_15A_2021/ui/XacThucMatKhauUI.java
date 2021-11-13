package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;



import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Nhom05_DeTai01_PTUD_15A_2021.controller.TaiKhoanController;
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;


import javax.swing.JTextField;

@SpringBootApplication
public class XacThucMatKhauUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int mouseX ,mouseY;
	private JTextField txtMatKhauMoi;
	
	@Autowired
	private TaiKhoanController controller;
	
	
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public XacThucMatKhauUI() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 420);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				setLocation(getX() + e.getX() - mouseX , getY() + e.getY() - mouseY);
			}
		});
		gradientPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		gradientPanel.kGradientFocus = -1;
		gradientPanel.kEndColor = Color.WHITE;
		gradientPanel.kStartColor = new Color(255, 51, 153);
		gradientPanel.setBounds(0, 0, 669, 420);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);

		JLabel lblLockImage = new JLabel("");
		lblLockImage.setIcon(new ImageIcon(XacThucMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_keepass_200px.png")));

		lblLockImage.setBounds(76, 148, 194, 195);
		gradientPanel.add(lblLockImage);

		JLabel lblDoiMatKHau = new JLabel("Quên mật khẩu");
		lblDoiMatKHau.setFont(new Font("Segoe UI", Font.BOLD, 38));
		lblDoiMatKHau.setForeground(Color.WHITE);
		lblDoiMatKHau.setBounds(49, 53, 282, 51);
		gradientPanel.add(lblDoiMatKHau);

		JLabel lblMatKhauMoi = new JLabel("Nhập Mật Khẩu ");
		lblMatKhauMoi.setForeground(Color.WHITE);
		lblMatKhauMoi.setBounds(324, 209, 115, 14);
		gradientPanel.add(lblMatKhauMoi);

		KButton btnVerify = new KButton();
		btnVerify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String matKhauMoi = txtMatKhauMoi.getText();
				controller.xacthucMatKhau(matKhauMoi);
				JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
				dispose();
					
//					}else
//						JOptionPane.showMessageDialog(null, "Mật khẩu không khớp");
				
			}
		});

		btnVerify.setText("Xác nhận");
		btnVerify.setFocusPainted(false);
		btnVerify.setFocusable(false);
		btnVerify.setBorder(BorderFactory.createEmptyBorder());
		btnVerify.kStartColor = new Color(255, 51, 153);
		btnVerify.setkStartColor(new Color(255, 51, 153));
		btnVerify.kSelectedColor = new Color(255, 51, 153);
		btnVerify.setkSelectedColor(new Color(255, 51, 153));
		btnVerify.kHoverStartColor = Color.WHITE;
		btnVerify.setkHoverStartColor(Color.WHITE);
		btnVerify.kHoverForeGround = Color.BLACK;
		btnVerify.setkHoverForeGround(Color.BLACK);
		btnVerify.kHoverEndColor = new Color(255, 51, 153);
		btnVerify.setkHoverEndColor(new Color(255, 51, 153));
		btnVerify.kForeGround = Color.WHITE;
		btnVerify.setkForeGround(Color.WHITE);
		btnVerify.kEndColor = Color.WHITE;
		btnVerify.setkEndColor(Color.WHITE);
		btnVerify.kBorderRadius = 40;
		btnVerify.setkBorderRadius(40);
		btnVerify.kBackGroundColor = new Color(255, 51, 153);
		btnVerify.setkBackGroundColor(new Color(255, 51, 153));
		btnVerify.setBounds(472, 310, 86, 45);
		gradientPanel.add(btnVerify);

		JLabel btnTatManHinh = new JLabel("X");
		btnTatManHinh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnTatManHinh.setForeground(Color.WHITE);
		btnTatManHinh.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnTatManHinh.setBounds(647, 0, 12, 25);
		gradientPanel.add(btnTatManHinh);
		
		txtMatKhauMoi = new JTextField();
		txtMatKhauMoi.setForeground(Color.WHITE);
		txtMatKhauMoi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtMatKhauMoi.setOpaque(false);
		txtMatKhauMoi.setBounds(324, 234, 238, 20);
		gradientPanel.add(txtMatKhauMoi);
		txtMatKhauMoi.setColumns(10);
	}
}
