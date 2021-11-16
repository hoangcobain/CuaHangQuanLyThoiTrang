package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class HoaDonUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtTongTien;
	protected JDatePickerImpl txtNgayLap;
	protected JTextField txtMaNhanVien;
	protected JTextField txtMaHoaDon;
	protected JTextField txtMaKhachHang;
	protected JTextField txttenNhanVien;
	protected JTextField txtsoDT;
	protected JTextField txtemail;
	protected JTable tableNhanVien;
	protected JTextField txttenKhachHang;
	protected JTextField txtsoDTKH;
	protected JComboBox<Object> cmbgioiTinh;
	protected JTable tableKhachHang;
	protected JTable tblHoaDon;
	protected JButton btnTimNhanVien, btnCapNhat, btnXoa, btnXoaTrang, btnCTHD, btnTimKiem, btnTimKhachHang, btnXemPhiu;
	protected DefaultTableModel listHoaDon = new DefaultTableModel(null,
			new String[] {
					"M\u00E3 h\u00F3a \u0111\u01A1n", "Ng\u00E0y l\u1EADp h\u00F3a \u0111\u01A1n", "T\u00EAn kh\u00E1ch h\u00E0ng", "T\u00EAn nh\u00E2n vi\u00EAn", "T\u1ED5ng ti\u1EC1n"
				});
	protected DefaultTableModel listNhanVien, listKhachHang;
	
	protected HoaDonUI() {
		setBackground(Color.WHITE);
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaHoaDon.setEditable(false);
		txtMaHoaDon.setColumns(10);
		
		txtTongTien = new JTextField();
		txtTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);
		
		JLabel lblMaHoaDon = new JLabel("Mã hóa đơn");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNgayLap = new JLabel("Ngày lập hóa đơn");
		lblNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTongTien = new JLabel("Tổng tiền");
		lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		txtNgayLap = new JDatePickerImpl(datePanel);
		txtNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setEditable(false);
		txtMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaNhanVien.setColumns(10);
		
		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setEditable(false);
		txtMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaKhachHang.setColumns(10);
		
		JLabel lblMaNhanVien = new JLabel("Mã nhân viên");
		lblMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMaKhachHang = new JLabel("Mã khách hàng");
		lblMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel pnlNhanVien = new JPanel();
		pnlNhanVien.setBackground(new Color(119, 136, 153));
		pnlNhanVien.setBorder(new LineBorder(Color.BLACK));
		
		JPanel pnlKhachHang = new JPanel();
		pnlKhachHang.setBackground(new Color(119, 136, 153));
		pnlKhachHang.setBorder(new LineBorder(Color.BLACK));
		
		JScrollPane scrHoaDon = new JScrollPane();
		
		btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBackground(Color.decode("#A6FFEA"));
		btnCapNhat.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/updated.png")));
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCapNhat.setFocusable(false);
		btnCapNhat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnXoa = new JButton("Xóa");
		btnXoa.setBackground(Color.decode("#E2A6FF"));
		btnXoa.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/remove.png")));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa.setFocusable(false);
		btnXoa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setBackground(Color.decode("#E2A6FF"));
		btnXoaTrang.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/clean.png")));
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoaTrang.setFocusable(false);
		btnXoaTrang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnCTHD = new JButton("Chi tiết hóa đơn");
		btnCTHD.setEnabled(false);
		btnCTHD.setBackground(Color.decode("#FFEAB6"));
		btnCTHD.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/details.png")));
		btnCTHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCTHD.setFocusable(false);
		btnCTHD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.setBackground(Color.decode("#E2A6FF"));
		btnTimKiem.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searching.png")));
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTimKiem.setFocusable(false);
		btnTimKiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnXemPhiu = new JButton("Xem Phiếu");
		btnXemPhiu.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/report.png")));
		btnXemPhiu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXemPhiu.setBackground(new Color(255, 234, 182));
		btnXemPhiu.setFocusable(false);
		btnXemPhiu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlNhanVien, GroupLayout.PREFERRED_SIZE, 556, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaHoaDon)
								.addComponent(lblMaNhanVien))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtMaHoaDon)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNgayLap)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(pnlKhachHang, GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
							.addGap(9))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtNgayLap, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtTongTien, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblMaKhachHang)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtMaKhachHang, GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(0))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnXemPhiu, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCTHD, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnTimKiem, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(scrHoaDon, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1515, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMaHoaDon)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtNgayLap, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNgayLap)
							.addComponent(lblTongTien))
						.addComponent(txtMaHoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMaNhanVien)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblMaKhachHang)
							.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlKhachHang, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlNhanVien, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCapNhat)
							.addComponent(btnXoa)
							.addComponent(btnXoaTrang))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnXemPhiu, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnTimKiem)
							.addComponent(btnCTHD)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrHoaDon, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {btnCapNhat, btnXoa, btnXoaTrang, btnCTHD, btnTimKiem, btnXemPhiu});
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaHoaDon, txtTongTien, lblMaHoaDon, lblNgayLap, lblTongTien, txtNgayLap});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaHoaDon, lblMaNhanVien});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNgayLap, lblMaKhachHang});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnCapNhat, btnXoa, btnXoaTrang, btnTimKiem});
		
		tblHoaDon = new JTable();
		tblHoaDon.setRowHeight(25);
		tblHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblHoaDon.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblHoaDon.setModel(listHoaDon);
		
		scrHoaDon.setViewportView(tblHoaDon);
		
		txttenKhachHang = new JTextField();
		txttenKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txttenKhachHang.setColumns(10);
		
		txtsoDTKH = new JTextField();
		txtsoDTKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtsoDTKH.setColumns(10);
		
		String gioiTinh[] = { "Nam", "Nữ"};
		cmbgioiTinh = new JComboBox<Object>(gioiTinh);
		cmbgioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lbltenKhachHang = new JLabel("Tên khách hàng");
		lbltenKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblsoDTKH = new JLabel("Số điện thoại");
		lblsoDTKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblgioiTinh = new JLabel("Giới tính");
		lblgioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrollPaneKhachHang = new JScrollPane();
		
		btnTimKhachHang = new JButton("Tim KH");
		btnTimKhachHang.setBackground(Color.decode("#FFA6B6"));
		btnTimKhachHang.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchKH.png")));
		btnTimKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTimKhachHang.setFocusable(false);
		btnTimKhachHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GroupLayout gl_pnlKhachHang = new GroupLayout(pnlKhachHang);
		gl_pnlKhachHang.setHorizontalGroup(
			gl_pnlKhachHang.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlKhachHang.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.LEADING)
						.addComponent(lblsoDTKH)
						.addComponent(lblgioiTinh)
						.addComponent(lbltenKhachHang, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtsoDTKH, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
						.addGroup(gl_pnlKhachHang.createSequentialGroup()
							.addComponent(cmbgioiTinh, 0, 212, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTimKhachHang, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addComponent(txttenKhachHang, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
					.addContainerGap())
				.addComponent(scrollPaneKhachHang, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
		);
		gl_pnlKhachHang.setVerticalGroup(
			gl_pnlKhachHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlKhachHang.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(txttenKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbltenKhachHang))
					.addGap(18)
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtsoDTKH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblsoDTKH))
					.addGap(18)
					.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlKhachHang.createParallelGroup(Alignment.BASELINE)
							.addComponent(cmbgioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblgioiTinh))
						.addComponent(btnTimKhachHang, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPaneKhachHang, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
		);
		gl_pnlKhachHang.linkSize(SwingConstants.HORIZONTAL, new Component[] {lbltenKhachHang, lblsoDTKH, lblgioiTinh});
		
		tableKhachHang = new JTable();
		tableKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tableKhachHang.setRowHeight(25);
		tableKhachHang.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
		listKhachHang = new DefaultTableModel(null,new String[] {"Mã khách hàng", "Tên", "Số điện thoại", "Địa chỉ"});
		tableKhachHang.setModel(listKhachHang);
		scrollPaneKhachHang.setViewportView(tableKhachHang);
		pnlKhachHang.setLayout(gl_pnlKhachHang);
		
		txttenNhanVien = new JTextField();
		txttenNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txttenNhanVien.setColumns(10);
		
		txtsoDT = new JTextField();
		txtsoDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtsoDT.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtemail.setColumns(10);
		
		JLabel lbltenNhanVien = new JLabel("Tên nhân viên");
		lbltenNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblsoDTNV = new JLabel("Số điện thoại");
		lblsoDTNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrollPaneNhanVien = new JScrollPane();
		
		btnTimNhanVien = new JButton("Tim NV");
		btnTimNhanVien.setBackground(Color.decode("#FFA6B6"));
		btnTimNhanVien.setIcon(new ImageIcon(HoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchNV.png")));
		btnTimNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTimNhanVien.setFocusable(false);
		btnTimNhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GroupLayout gl_pnlNhanVien = new GroupLayout(pnlNhanVien);
		gl_pnlNhanVien.setHorizontalGroup(
			gl_pnlNhanVien.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlNhanVien.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlNhanVien.createParallelGroup(Alignment.LEADING)
						.addComponent(lbltenNhanVien)
						.addComponent(lblsoDTNV)
						.addComponent(lblemail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlNhanVien.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtsoDT, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addComponent(txttenNhanVien, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
						.addGroup(gl_pnlNhanVien.createSequentialGroup()
							.addComponent(txtemail, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTimNhanVien, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addComponent(scrollPaneNhanVien, GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
		);
		gl_pnlNhanVien.setVerticalGroup(
			gl_pnlNhanVien.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlNhanVien.createSequentialGroup()
					.addGroup(gl_pnlNhanVien.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlNhanVien.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlNhanVien.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbltenNhanVien)
								.addComponent(txttenNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlNhanVien.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtsoDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblsoDTNV))
							.addGap(18)
							.addGroup(gl_pnlNhanVien.createParallelGroup(Alignment.LEADING)
								.addComponent(btnTimNhanVien, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlNhanVien.createSequentialGroup()
							.addGap(111)
							.addComponent(lblemail)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPaneNhanVien, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
		);
		gl_pnlNhanVien.linkSize(SwingConstants.VERTICAL, new Component[] {txtemail, btnTimNhanVien});
		
		tableNhanVien = new JTable();
		tableNhanVien.setRowHeight(25);
		tableNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tableNhanVien.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
		listNhanVien = new DefaultTableModel(null,new String[] {"Mã nhân viên", "Tên", "Số điện thoại", "Email"});
		tableNhanVien.setModel(listNhanVien);
		scrollPaneNhanVien.setViewportView(tableNhanVien);
		pnlNhanVien.setLayout(gl_pnlNhanVien);
		setLayout(gl_contentPane);
	}
}
