package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Nhom05_DeTai01_PTUD_15A_2021.Nhom05DeTai01Ptud15A2021Application;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.TaiKhoanController;
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SpringBootApplication
public class DangNhapUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField txtTaiKhoan;
	private JPasswordField pwdMatKhau;
	private int mouseX , mouseY;
	private JPanel contentPane;
	protected JLabel lblQuenMatKHau;
	
	@Autowired
	private TaiKhoanController controller;

	/**
	 * Create the frame.
	 */
	public DangNhapUI() {
		setUndecorated(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 626);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 0, 1045, 647);
		gradientPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		gradientPanel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				setLocation(getX() + e.getX() - mouseX , getY() +e.getY() - mouseY);
			}
		});
		gradientPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		gradientPanel.kBorderRadius = 0;
		gradientPanel.kGradientFocus = -1;
		gradientPanel.kStartColor = new Color(119, 136, 153);
		gradientPanel.kEndColor = new Color(119, 136, 153);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setBounds(289, 228, 468, 20);
		txtTaiKhoan.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtTaiKhoan.setForeground(Color.WHITE);
		txtTaiKhoan.setCaretColor(new Color(255, 51, 153));
		txtTaiKhoan.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		txtTaiKhoan.setOpaque(false);
		txtTaiKhoan.setColumns(10);
		
		pwdMatKhau = new JPasswordField();
		pwdMatKhau.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()==KeyEvent.VK_ENTER)
					dangNhap();
			}
		});
		pwdMatKhau.setBounds(289, 299, 468, 20);
		pwdMatKhau.setCaretColor(new Color(255, 51, 153));
		pwdMatKhau.setForeground(Color.WHITE);
		pwdMatKhau.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		pwdMatKhau.setOpaque(false);
		pwdMatKhau.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản");
		lblTaiKhoan.setBounds(289, 203, 125, 14);
		lblTaiKhoan.setForeground(Color.WHITE);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu");
		lblMatKhau.setBounds(289, 279, 125, 14);
		lblMatKhau.setForeground(Color.WHITE);
		
		KButton btnDangNhap = new KButton();
		btnDangNhap.kHoverColor = new Color(119, 136, 153);
		btnDangNhap.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDangNhap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dangNhap();
			}
		});
		btnDangNhap.setBounds(436, 376, 185, 45);
		btnDangNhap.setFocusPainted(false);
		btnDangNhap.setFocusable(false);
		btnDangNhap.setBorder(BorderFactory.createEmptyBorder());
		btnDangNhap.kForeGround = Color.WHITE;
		btnDangNhap.kSelectedColor = new Color(255, 51, 153);
		btnDangNhap.kHoverForeGround = Color.BLACK;
		btnDangNhap.kHoverEndColor = new Color(119, 136, 153);
		btnDangNhap.kHoverStartColor = Color.WHITE;
		btnDangNhap.kBackGroundColor = new Color(255, 51, 153);
		btnDangNhap.kBorderRadius = 40;
		btnDangNhap.kEndColor = Color.WHITE;
		btnDangNhap.kStartColor = new Color(105, 105, 105);
		btnDangNhap.setText("Đăng nhập");
		
		JLabel btnDangXuat = new JLabel("X");
		btnDangXuat.setBounds(1018, 0, 12, 25);
		btnDangXuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnDangXuat.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnDangXuat.setForeground(Color.WHITE);
		
		JLabel lblImageHL = new JLabel("H&L");
		lblImageHL.setBounds(88, 58, 209, 68);
		lblImageHL.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblImageHL.setForeground(Color.WHITE);
		
		JLabel lblUserimage = new JLabel("");
		lblUserimage.setIcon(new ImageIcon(DangNhapUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_user_100px.png")));
		lblUserimage.setBounds(472, 83, 100, 100);
		
		lblUserimage.setForeground(Color.WHITE);
		lblUserimage.setFont(new Font("Segoe UI", Font.BOLD, 30));
		contentPane.setLayout(null);
		gradientPanel.setLayout(null);
		gradientPanel.add(txtTaiKhoan);
		gradientPanel.add(lblMatKhau);
		gradientPanel.add(pwdMatKhau);
		gradientPanel.add(lblTaiKhoan);
		gradientPanel.add(btnDangNhap);
		gradientPanel.add(btnDangXuat);
		gradientPanel.add(lblImageHL);
		gradientPanel.add(lblUserimage);
		contentPane.add(gradientPanel);
		
		lblQuenMatKHau = new JLabel("Quên mật khẩu...?");
		lblQuenMatKHau.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					QuenMatKhauUI frame = Nhom05DeTai01Ptud15A2021Application.getApp().getBean(QuenMatKhauUI.class);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		lblQuenMatKHau.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblQuenMatKHau.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblQuenMatKHau.setForeground(Color.WHITE);
		lblQuenMatKHau.setBounds(477, 451, 125, 14);
		gradientPanel.add(lblQuenMatKHau);
	}

	protected void dangNhap() {
		String password = String.valueOf(pwdMatKhau.getPassword());
		if(controller.Login(txtTaiKhoan.getText(), password)) {
			try {
				HomePageUI homePageUI = Nhom05DeTai01Ptud15A2021Application.getApp().getBean(HomePageUI.class);
				homePageUI.setVisible(true);
				homePageUI.panelMenu.lblUser.setText(controller.getTaiKhoan().getTaiKhoan());
				homePageUI.panelMenu.lblEmail.setText(controller.getTaiKhoan().getNhanVien().getEmail().toString());
			} catch (Exception e) {
				e.printStackTrace();
			}			
			this.dispose();
		}
	}
}
