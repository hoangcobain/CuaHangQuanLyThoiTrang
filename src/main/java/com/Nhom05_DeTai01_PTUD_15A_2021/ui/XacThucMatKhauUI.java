/**
 * Tác giả: Nguyễn Viết Hoàng - mssv:19473871 - Nhóm 5
 * 
 * Ngày tạo:15/10/2021
 * Mô tả: Giao diện xác thực mật khẩu
 */
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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.Nhom05_DeTai01_PTUD_15A_2021.controller.NhanVienController;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import javax.swing.JPasswordField;

@SpringBootApplication
public class XacThucMatKhauUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int mouseX ,mouseY;
	private JPasswordField txtMatKhauMoi;
	private JPasswordField txtMatKhauLai;

	@Autowired
	private NhanVienController controller;
	@Autowired
	private BCryptPasswordEncoder encoder;

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
		gradientPanel.kEndColor = new Color(192, 192, 192);
		gradientPanel.kStartColor = new Color(192, 192, 192);
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
		lblMatKhauMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatKhauMoi.setForeground(Color.WHITE);
		lblMatKhauMoi.setBounds(320, 114, 164, 34);
		gradientPanel.add(lblMatKhauMoi);

		KButton btnVerify = new KButton();
		btnVerify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String matKhauMoi = String.valueOf(txtMatKhauMoi.getPassword());
				String matKhauLai = String.valueOf(txtMatKhauLai.getPassword());
				if(matKhauLai.compareTo(matKhauMoi)!=0) {
					JOptionPane.showMessageDialog(null, "Nhập mật khẩu không khớp");
					return;
				}
				NhanVien nhanVien = controller.getNhanVien();
				nhanVien.getTaiKhoan().setMatKhau(encoder.encode(matKhauLai));
				controller.saveNhanVien(nhanVien);
				JOptionPane.showMessageDialog(null, "Tài khoản: "+ nhanVien.getTaiKhoan().getTaiKhoan()+" đổi mật khẩu thành công");
				dispose();
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

		txtMatKhauMoi = new JPasswordField();
		txtMatKhauMoi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMatKhauMoi.setForeground(Color.WHITE);
		txtMatKhauMoi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtMatKhauMoi.setOpaque(false);
		txtMatKhauMoi.setBounds(320, 159, 238, 39);
		gradientPanel.add(txtMatKhauMoi);
		txtMatKhauMoi.setColumns(10);

		txtMatKhauLai = new JPasswordField();
		txtMatKhauLai.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtMatKhauLai.setOpaque(false);
		txtMatKhauLai.setForeground(Color.WHITE);
		txtMatKhauLai.setColumns(10);
		txtMatKhauLai.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtMatKhauLai.setBounds(320, 247, 238, 39);
		gradientPanel.add(txtMatKhauLai);

		JLabel lblMatKhauLai = new JLabel("Nhập lại mật khẩu:");
		lblMatKhauLai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatKhauLai.setForeground(Color.WHITE);
		lblMatKhauLai.setBounds(320, 208, 206, 34);
		gradientPanel.add(lblMatKhauLai);
	}
}
