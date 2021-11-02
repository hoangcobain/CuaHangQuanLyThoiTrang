package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class NhanVienUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtTenNhanVien;
	protected JTextField txtMaNhanVien;
	protected JTextField txtSoDienThoai;
	protected JTextField txtDiaChi;
	protected final ButtonGroup buttonGroup = new ButtonGroup();
	protected JTable tblDSNhanVien;
	protected JButton btnThem, btnSua, btnXoaTrang,btnTimTheoSDT,btnTimNV,btnLamMoi;
	protected JRadioButton radNam, radNu;
	protected DefaultTableModel listNhanVien;
	protected JComboBox<String> cmbTimKiem;
	protected JTextField txtEmail;
	/**
	 * Create the panel.
	 */
	public NhanVienUI() {
		setBackground(Color.WHITE);
		JLabel lblQuanLyKhachHang = new JLabel("BẢNG QUẢN LÝ NHÂN VIÊN");
		lblQuanLyKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuanLyKhachHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBackground(Color.decode("#FFB6F8"));
		
		JPanel pnlTimKiem = new JPanel();
		pnlTimKiem.setBackground(Color.decode("#FFB6F8"));
		
		JScrollPane scrDSNhanVien = new JScrollPane();
		
		JPanel pnlDienThongTin = new JPanel();
		pnlDienThongTin.setBackground(Color.decode("#FFB6F8"));
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(354)
					.addComponent(lblQuanLyKhachHang, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
					.addGap(376))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(pnlDienThongTin, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlChucNang, GroupLayout.PREFERRED_SIZE, 222, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlTimKiem, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(scrDSNhanVien, GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblQuanLyKhachHang)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlDienThongTin, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlChucNang, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlTimKiem, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrDSNhanVien, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
					.addGap(0))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {pnlChucNang, pnlTimKiem, pnlDienThongTin});
		
		JLabel lblMaNhanVien = new JLabel("Mã khách hàng:");
		lblMaNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTenNhanVien = new JLabel("Tên khách hàng:");
		lblTenNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		lblTenNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSoDT = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i:");
		lblSoDT.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDiaChi = new JLabel("\u0110\u1ECBa ch\u1EC9:");
		lblDiaChi.setHorizontalAlignment(SwingConstants.LEFT);
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblGioiTinh = new JLabel("Gi\u1EDBi t\u00EDnh:");
		lblGioiTinh.setHorizontalAlignment(SwingConstants.LEFT);
		lblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setEditable(false);
		txtMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaNhanVien.setColumns(10);
		
		txtTenNhanVien = new JTextField();
		txtTenNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNhanVien.setColumns(10);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoDienThoai.setColumns(10);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDiaChi.setColumns(10);
		
		radNam = new JRadioButton("Nam");
		radNam.setSelected(true);
		buttonGroup.add(radNam);
		
		radNam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radNu = new JRadioButton("N\u1EEF");
		buttonGroup.add(radNu);
		radNu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radNu.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setColumns(10);
		GroupLayout gl_pnlDienThongTin = new GroupLayout(pnlDienThongTin);
		gl_pnlDienThongTin.setHorizontalGroup(
			gl_pnlDienThongTin.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlDienThongTin.createSequentialGroup()
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlDienThongTin.createSequentialGroup()
							.addGap(8)
							.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(radNam, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radNu, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDienThongTin.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDiaChi, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(lblSoDT, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(lblTenNhanVien, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(lblMaNhanVien, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDiaChi, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
								.addComponent(txtSoDienThoai, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
								.addComponent(txtTenNhanVien, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
								.addComponent(txtMaNhanVien, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
								.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_pnlDienThongTin.setVerticalGroup(
			gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDienThongTin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaNhanVien)
						.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTenNhanVien)
						.addComponent(txtTenNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoDT)
						.addComponent(txtSoDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDiaChi)
						.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(radNam)
						.addComponent(radNu)
						.addComponent(lblGioiTinh))
					.addContainerGap())
		);
		gl_pnlDienThongTin.linkSize(SwingConstants.VERTICAL, new Component[] {lblGioiTinh, txtMaNhanVien, txtTenNhanVien, txtSoDienThoai, txtDiaChi, radNam, txtEmail});
		gl_pnlDienThongTin.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaNhanVien, lblTenNhanVien, lblSoDT, lblDiaChi, lblGioiTinh});
		pnlDienThongTin.setLayout(gl_pnlDienThongTin);
		
		tblDSNhanVien = new JTable();
		tblDSNhanVien.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblDSNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		listNhanVien = new DefaultTableModel(null,new String[] {"Mã nhân viên", "Họ tên", 
				"Số điện thoại", "Địa chỉ", "Email", "Giới tính"});
		tblDSNhanVien.setModel(listNhanVien);
		scrDSNhanVien.setViewportView(tblDSNhanVien);
		
		JLabel lblTimKiem = new JLabel("T\u00ECm ki\u1EBFm:");
		lblTimKiem.setHorizontalAlignment(SwingConstants.LEFT);
		lblTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		cmbTimKiem = new JComboBox<String>();
		cmbTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbTimKiem.setEditable(true);
		
		btnTimTheoSDT = new JButton("SDT");
		btnTimTheoSDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnTimNV = new JButton("");
		btnTimNV.setIcon(new ImageIcon(NhanVienUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_search_20px.png")));
		btnTimNV.setToolTipText("Tìm khách hàng");
		btnTimNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTimNV.setFocusable(false);
		btnTimNV.setFocusPainted(false);
		btnTimNV.setBorder(BorderFactory.createEmptyBorder());
		btnTimNV.setBackground(new Color(64, 224, 208));
		
		btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_pnlTimKiem = new GroupLayout(pnlTimKiem);
		gl_pnlTimKiem.setHorizontalGroup(
			gl_pnlTimKiem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTimKiem.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTimKiem, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cmbTimKiem, 0, 153, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnTimNV, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(35))
				.addGroup(gl_pnlTimKiem.createSequentialGroup()
					.addGap(74)
					.addComponent(btnTimTheoSDT)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLamMoi)
					.addContainerGap(110, Short.MAX_VALUE))
		);
		gl_pnlTimKiem.setVerticalGroup(
			gl_pnlTimKiem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTimKiem.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlTimKiem.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlTimKiem.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_pnlTimKiem.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbTimKiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTimKiem)))
						.addComponent(btnTimNV, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlTimKiem.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnLamMoi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnTimTheoSDT, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(155, Short.MAX_VALUE))
		);
		pnlTimKiem.setLayout(gl_pnlTimKiem);
		
		btnThem = new JButton("Th\u00EAm");
		btnThem.setIcon(new ImageIcon(NhanVienUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_add_user_group_man_woman_40px.png")));
		btnThem.setBackground(Color.decode("#A6FFEA"));
		btnThem.setFocusPainted(false);
		btnThem.setFocusable(false);
		btnThem.setBorder(BorderFactory.createEmptyBorder());
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnSua = new JButton("S\u1EEDa");
		btnSua.setIcon(new ImageIcon(NhanVienUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_edit_property_40px.png")));
		btnSua.setBackground(Color.decode("#E2A6FF"));
		btnSua.setFocusPainted(false);
		btnSua.setFocusable(false);
		btnSua.setBorder(BorderFactory.createEmptyBorder());
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnXoaTrang = new JButton("Xóa Trắng");
		btnXoaTrang.setIcon(new ImageIcon(NhanVienUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_ccleaner_40px.png")));
		btnXoaTrang.setBackground(Color.decode("#E2A6FF"));
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaTrang.setFocusPainted(false);
		btnXoaTrang.setFocusable(false);
		btnXoaTrang.setBorder(BorderFactory.createEmptyBorder());
		GroupLayout gl_pnlChucNang = new GroupLayout(pnlChucNang);
		gl_pnlChucNang.setHorizontalGroup(
			gl_pnlChucNang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlChucNang.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlChucNang.createParallelGroup(Alignment.LEADING)
						.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(btnSua, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(btnXoaTrang, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlChucNang.setVerticalGroup(
			gl_pnlChucNang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlChucNang.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSua, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(89, Short.MAX_VALUE))
		);
		pnlChucNang.setLayout(gl_pnlChucNang);
		setLayout(gl_contentPane);
	}
}
