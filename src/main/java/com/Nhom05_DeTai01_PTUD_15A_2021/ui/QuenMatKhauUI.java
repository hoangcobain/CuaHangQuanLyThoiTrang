/**
 * Tác giả: Nguyễn Viết Hoàng - mssv:19473871 - Nhóm 5
 * 
 * Ngày tạo:16/10/2021
 * Mô tả: Giao diện quên mật khẩu
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Nhom05_DeTai01_PTUD_15A_2021.Nhom05DeTai01Ptud15A2021Application;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.NhanVienController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.TaiKhoanController;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;


import javax.swing.JTextField;

@SpringBootApplication
public class QuenMatKhauUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int mouseX ,mouseY;
	private int randomCode;
	private JTextField txtEmail;
	private JTextField txtMaXacNhan;
	private String to;
	
	@Autowired
	private TaiKhoanController controller;
	@Autowired
	private NhanVienController nhanVienController;
	@Value("${app.email.username}")
	String user = "cuahangHandL@gmail.com";
	@Value("${app.email.password}")
	String password = "HL1234567";

	/**
	 * Create the frame.
	 */
	public QuenMatKhauUI() {
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
		lblLockImage.setIcon(new ImageIcon(QuenMatKhauUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_keepass_200px.png")));

		lblLockImage.setBounds(76, 148, 194, 195);
		gradientPanel.add(lblLockImage);

		JLabel lblDoiMatKHau = new JLabel("Quên mật khẩu");
		lblDoiMatKHau.setFont(new Font("Segoe UI", Font.BOLD, 38));
		lblDoiMatKHau.setForeground(Color.WHITE);
		lblDoiMatKHau.setBounds(49, 53, 282, 51);
		gradientPanel.add(lblDoiMatKHau);

		JLabel lblEmail = new JLabel("Nhập Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setBounds(325, 128, 115, 14);
		gradientPanel.add(lblEmail);

		JLabel lblMaXacNhan = new JLabel("Mã xác nhận");
		lblMaXacNhan.setForeground(Color.WHITE);
		lblMaXacNhan.setBounds(325, 228, 115, 14);
		gradientPanel.add(lblMaXacNhan);

		KButton btnGui = new KButton();
		btnGui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				to = txtEmail.getText();
				NhanVien nhanVien = nhanVienController.getNhanVienByEmail(to);
				if (nhanVien == null) {
					JOptionPane.showMessageDialog(null, "Email không đúng");
					return;
				}
				
				try {
				Random rand = new Random();
				randomCode	= rand.nextInt(999999);
				String host = "smtp.gmail.com";
				String subject = "Resting Code";
				String message = "Your code is " +randomCode;
				boolean sessionDebug = false;
				Properties pros = System.getProperties();
				pros.put("mail.smtp.starttls.enable", "true");
				pros.put("mail.smtp.host", "host");
				pros.put("mail.smtp.port", "587");
				pros.put("mail.smtp.auth", "true");
				pros.put("mail.smtp.starttls.required", "true");
				
				Session mailSession = Session.getDefaultInstance(pros,null);
				mailSession.setDebug(sessionDebug);
				Message msg = new MimeMessage(mailSession);
				msg.setFrom(new InternetAddress(user));
				InternetAddress [] address = {new InternetAddress(to)};
				msg.setRecipients(Message.RecipientType.TO, address);
				msg.setSubject(subject);
				msg.setText(message);
				Transport transport = mailSession.getTransport("smtp");
				transport.connect(host, user, password);
				transport.sendMessage(msg, msg.getAllRecipients());
				transport.close();
				JOptionPane.showMessageDialog(null, "Code đã được gửi qua email");
				}catch(Exception ex){
					JOptionPane.showMessageDialog(contentPane, ex);
				}
				
			}
		});
	
		btnGui.setText("Gửi");
		btnGui.setFocusPainted(false);
		btnGui.setFocusable(false);
		btnGui.setBorder(BorderFactory.createEmptyBorder());
		btnGui.kStartColor = new Color(128, 128, 128);
		btnGui.setkStartColor(new Color(255, 51, 153));
		btnGui.kSelectedColor = new Color(192, 192, 192);
		btnGui.setkSelectedColor(new Color(255, 51, 153));
		btnGui.kHoverStartColor = Color.WHITE;
		btnGui.setkHoverStartColor(Color.WHITE);
		btnGui.kHoverForeGround = Color.BLACK;
		btnGui.setkHoverForeGround(Color.BLACK);
		btnGui.kHoverEndColor = new Color(255, 255, 255);
		btnGui.setkHoverEndColor(new Color(255, 51, 153));
		btnGui.kForeGround = Color.WHITE;
		btnGui.setkForeGround(Color.WHITE);
		btnGui.kEndColor = Color.WHITE;
		btnGui.setkEndColor(Color.WHITE);
		btnGui.kBorderRadius = 40;
		btnGui.setkBorderRadius(40);
		btnGui.kBackGroundColor = new Color(192, 192, 192);
		btnGui.setkBackGroundColor(new Color(255, 51, 153));
		btnGui.setBounds(573, 148, 86, 45);
		gradientPanel.add(btnGui);

		KButton btnXacNhan = new KButton();
		btnXacNhan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(Integer.valueOf(txtMaXacNhan.getText()) == randomCode) {
						XacThucMatKhauUI rs = Nhom05DeTai01Ptud15A2021Application.getApp().getBean(XacThucMatKhauUI.class);
						rs.setVisible(true);
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "Mã không khớp");
					}
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Mã phải là số");
				}
			}
		});

		btnXacNhan.setText("Xác nhận");
		btnXacNhan.setFocusPainted(false);
		btnXacNhan.setFocusable(false);
		btnXacNhan.setBorder(BorderFactory.createEmptyBorder());
		btnXacNhan.kStartColor = new Color(192, 192, 192);
		btnXacNhan.setkStartColor(new Color(255, 51, 153));
		btnXacNhan.kSelectedColor = new Color(192, 192, 192);
		btnXacNhan.setkSelectedColor(new Color(255, 51, 153));
		btnXacNhan.kHoverStartColor = Color.WHITE;
		btnXacNhan.setkHoverStartColor(Color.WHITE);
		btnXacNhan.kHoverForeGround = Color.BLACK;
		btnXacNhan.setkHoverForeGround(Color.BLACK);
		btnXacNhan.kHoverEndColor = new Color(255, 255, 255);
		btnXacNhan.setkHoverEndColor(new Color(255, 51, 153));
		btnXacNhan.kForeGround = Color.WHITE;
		btnXacNhan.setkForeGround(Color.WHITE);
		btnXacNhan.kEndColor = Color.WHITE;
		btnXacNhan.setkEndColor(Color.WHITE);
		btnXacNhan.kBorderRadius = 40;
		btnXacNhan.setkBorderRadius(40);
		btnXacNhan.kBackGroundColor = new Color(255, 51, 153);
		btnXacNhan.setkBackGroundColor(new Color(255, 51, 153));
		btnXacNhan.setBounds(573, 240, 86, 45);
		gradientPanel.add(btnXacNhan);

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
		
		txtEmail = new JTextField();
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtEmail.setOpaque(false);
		txtEmail.setBounds(325, 160, 238, 20);
		gradientPanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtMaXacNhan = new JTextField();
		txtMaXacNhan.setForeground(Color.WHITE);
		txtMaXacNhan.setOpaque(false);
		txtMaXacNhan.setColumns(10);
		txtMaXacNhan.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 255, 255)));
		txtMaXacNhan.setBounds(325, 253, 238, 20);
		gradientPanel.add(txtMaXacNhan);
	}
}
