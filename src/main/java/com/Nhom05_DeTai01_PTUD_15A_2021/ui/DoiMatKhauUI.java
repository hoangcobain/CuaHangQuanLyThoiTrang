package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Nhom05_DeTai01_PTUD_15A_2021.controller.TaiKhoanController;
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;

@SpringBootApplication
public class DoiMatKhauUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField pwdMatKhauCu;
	private JPasswordField pwdMatKhauMoi;
	private JPasswordField pwdLaiMatKhauMoi;
	private int mouseX ,mouseY;

	@Autowired
	private TaiKhoanController controller;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiMatKhauUI frame = new DoiMatKhauUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoiMatKhauUI() {
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
		lblLockImage.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_keepass_200px.png")));

		lblLockImage.setBounds(76, 148, 194, 195);
		gradientPanel.add(lblLockImage);

		JLabel lblDoiMatKHau = new JLabel("Đổi mật khẩu");
		lblDoiMatKHau.setFont(new Font("Segoe UI", Font.BOLD, 38));
		lblDoiMatKHau.setForeground(Color.WHITE);
		lblDoiMatKHau.setBounds(57, 52, 272, 51);
		gradientPanel.add(lblDoiMatKHau);

		pwdMatKhauCu = new JPasswordField();
		//		passwordField.setEchoChar('*');
		pwdMatKhauCu.setOpaque(false);
		pwdMatKhauCu.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		pwdMatKhauCu.setBounds(382, 121, 238, 20);
		gradientPanel.add(pwdMatKhauCu);

		pwdMatKhauMoi = new JPasswordField();
		pwdMatKhauMoi.setBackground(Color.BLACK);
		pwdMatKhauMoi.setCaretColor(Color.BLACK);
		pwdMatKhauMoi.setOpaque(false);
		pwdMatKhauMoi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		pwdMatKhauMoi.setBounds(382, 200, 238, 20);
		gradientPanel.add(pwdMatKhauMoi);

		pwdLaiMatKhauMoi = new JPasswordField();
		pwdLaiMatKhauMoi.setOpaque(false);
		pwdLaiMatKhauMoi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.WHITE));
		pwdLaiMatKhauMoi.setBounds(382, 281, 238, 20);
		gradientPanel.add(pwdLaiMatKhauMoi);

		JLabel lblMatKhauCu = new JLabel("Nhập mật khẩu cũ");
		lblMatKhauCu.setForeground(Color.WHITE);
		lblMatKhauCu.setBounds(382, 96, 115, 14);
		gradientPanel.add(lblMatKhauCu);

		JLabel lblMatKhauMoi = new JLabel("Nhập mật khẩu mới");
		lblMatKhauMoi.setForeground(Color.WHITE);
		lblMatKhauMoi.setBounds(382, 175, 115, 14);
		gradientPanel.add(lblMatKhauMoi);

		JLabel lblLaiMatKhauMoi = new JLabel("Nhập lại mật khẩu");
		lblLaiMatKhauMoi.setForeground(Color.WHITE);
		lblLaiMatKhauMoi.setBounds(382, 256, 115, 14);
		gradientPanel.add(lblLaiMatKhauMoi);

		KButton btnDoiMatKhau = new KButton();
		btnDoiMatKhau.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String matKhauMoi = String.valueOf(pwdMatKhauMoi.getPassword());
				String matKhauLai = String.valueOf(pwdLaiMatKhauMoi.getPassword());
				if(matKhauMoi.equals(matKhauLai))
					if(controller.doiMatKhau(pwdMatKhauCu.getPassword(),pwdMatKhauMoi.getPassword())) {
						JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
						dispose();
					}else
						JOptionPane.showMessageDialog(null, "Mật khẩu cũ không khớp");
				else
					JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không khớp");
			}
		});
		btnDoiMatKhau.setText("Đổi mật khẩu");
		btnDoiMatKhau.setFocusPainted(false);
		btnDoiMatKhau.setFocusable(false);
		btnDoiMatKhau.setBorder(BorderFactory.createEmptyBorder());
		btnDoiMatKhau.kStartColor = new Color(255, 51, 153);
		btnDoiMatKhau.setkStartColor(new Color(255, 51, 153));
		btnDoiMatKhau.kSelectedColor = new Color(255, 51, 153);
		btnDoiMatKhau.setkSelectedColor(new Color(255, 51, 153));
		btnDoiMatKhau.kHoverStartColor = Color.WHITE;
		btnDoiMatKhau.setkHoverStartColor(Color.WHITE);
		btnDoiMatKhau.kHoverForeGround = Color.BLACK;
		btnDoiMatKhau.setkHoverForeGround(Color.BLACK);
		btnDoiMatKhau.kHoverEndColor = new Color(255, 51, 153);
		btnDoiMatKhau.setkHoverEndColor(new Color(255, 51, 153));
		btnDoiMatKhau.kForeGround = Color.WHITE;
		btnDoiMatKhau.setkForeGround(Color.WHITE);
		btnDoiMatKhau.kEndColor = Color.WHITE;
		btnDoiMatKhau.setkEndColor(Color.WHITE);
		btnDoiMatKhau.kBorderRadius = 40;
		btnDoiMatKhau.setkBorderRadius(40);
		btnDoiMatKhau.kBackGroundColor = new Color(255, 51, 153);
		btnDoiMatKhau.setkBackGroundColor(new Color(255, 51, 153));
		btnDoiMatKhau.setBounds(382, 338, 115, 45);
		gradientPanel.add(btnDoiMatKhau);

		KButton btnXoaTrang = new KButton();
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pwdMatKhauCu.setText("");
				pwdMatKhauMoi.setText("");
				pwdLaiMatKhauMoi.setText("");
				pwdMatKhauCu.requestFocus();


			}
		});
		btnXoaTrang.setText("Xóa trắng");
		btnXoaTrang.setFocusPainted(false);
		btnXoaTrang.setFocusable(false);
		btnXoaTrang.setBorder(BorderFactory.createEmptyBorder());
		btnXoaTrang.kStartColor = new Color(255, 51, 153);
		btnXoaTrang.setkStartColor(new Color(255, 51, 153));
		btnXoaTrang.kSelectedColor = new Color(255, 51, 153);
		btnXoaTrang.setkSelectedColor(new Color(255, 51, 153));
		btnXoaTrang.kHoverStartColor = Color.WHITE;
		btnXoaTrang.setkHoverStartColor(Color.WHITE);
		btnXoaTrang.kHoverForeGround = Color.BLACK;
		btnXoaTrang.setkHoverForeGround(Color.BLACK);
		btnXoaTrang.kHoverEndColor = new Color(255, 51, 153);
		btnXoaTrang.setkHoverEndColor(new Color(255, 51, 153));
		btnXoaTrang.kForeGround = Color.WHITE;
		btnXoaTrang.setkForeGround(Color.WHITE);
		btnXoaTrang.kEndColor = Color.WHITE;
		btnXoaTrang.setkEndColor(Color.WHITE);
		btnXoaTrang.kBorderRadius = 40;
		btnXoaTrang.setkBorderRadius(40);
		btnXoaTrang.kBackGroundColor = new Color(255, 51, 153);
		btnXoaTrang.setkBackGroundColor(new Color(255, 51, 153));
		btnXoaTrang.setBounds(505, 338, 115, 45);
		gradientPanel.add(btnXoaTrang);

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

		final JLabel lblShow1 = new JLabel("");
		lblShow1.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_eye_20px.png")));
		final JLabel lblHide1 = new JLabel("");
		lblHide1.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_hide_20px.png")));
		final JLabel lblShow2 = new JLabel("");
		lblShow2.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_eye_20px.png")));
		final JLabel lblHide2 = new JLabel("");
		lblHide2.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_hide_20px.png")));
		final JLabel lblShow3 = new JLabel("");
		lblShow3.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_eye_20px.png")));
		final JLabel lblHide3 = new JLabel("");
		lblHide3.setIcon(new ImageIcon(DoiMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_hide_20px.png")));
		lblShow2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblHide2.setVisible(true);
				lblShow2.setVisible(false);
				pwdMatKhauMoi.setEchoChar((char) 0);
			}
		});

		lblHide2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblShow2.setVisible(true);
				lblHide2.setVisible(false);
				pwdMatKhauMoi.setEchoChar('•');
			}
		});

		lblShow3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblHide3.setVisible(true);
				lblShow3.setVisible(false);
				pwdLaiMatKhauMoi.setEchoChar((char) 0);
			}
		});

		lblHide3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblShow3.setVisible(true);
				lblHide3.setVisible(false);
				pwdLaiMatKhauMoi.setEchoChar('•');
			}
		});
		lblHide1.setVisible(false);
		lblHide2.setVisible(false);
		lblHide3.setVisible(false);
		lblHide1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblShow1.setVisible(true);
				lblHide1.setVisible(false);
				pwdMatKhauCu.setEchoChar('•');
			}
		});

		lblShow1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblHide1.setVisible(true);
				lblShow1.setVisible(false);
				pwdMatKhauCu.setEchoChar((char) 0);

			}
		});



		lblShow1.setBounds(624, 121, 20, 20);
		gradientPanel.add(lblShow1);



		lblHide1.setBounds(624, 121, 20, 20);
		gradientPanel.add(lblHide1);



		lblShow2.setBounds(624, 200, 20, 20);
		gradientPanel.add(lblShow2);



		lblHide2.setBounds(624, 200, 20, 20);
		gradientPanel.add(lblHide2);



		lblShow3.setBounds(624, 281, 20, 20);
		gradientPanel.add(lblShow3);



		lblHide3.setBounds(624, 281, 20, 20);
		gradientPanel.add(lblHide3);
	}

}
