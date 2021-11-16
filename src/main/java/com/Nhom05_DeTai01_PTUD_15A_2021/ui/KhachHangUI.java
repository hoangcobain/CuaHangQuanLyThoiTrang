package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class KhachHangUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtTenNhanVien;
	protected JTextField txtMaKhachHang;
	protected JTextField txtSoDienThoai;
	protected JTextField txtDiaChi;
	protected final ButtonGroup buttonGroup = new ButtonGroup();
	protected JTable tblDSNhanVien;
	protected JButton btnThem, btnSua, btnLapHoaDon, btnXoaTrang, btnTimKH,btnLamMoi;
	protected JRadioButton radNam, radNu;
	protected DefaultTableModel listKhachHang;
	protected JComboBox<String> cmbTimKiem;
	protected JScrollPane scrDSNhanVien;
	/**
	 * Create the panel.
	 */
	public KhachHangUI() {
		setBackground(Color.WHITE);
		JLabel lblBangQuanLyKhachHang = new JLabel("BẢNG QUẢN LÝ KHÁCH HÀNG");
		lblBangQuanLyKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblBangQuanLyKhachHang.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel pnlChucNang = new JPanel();
		pnlChucNang.setBackground(new Color(119, 136, 153));
		
		JPanel pnlTimKiem = new JPanel();
		pnlTimKiem.setBackground(new Color(119, 136, 153));
		
		scrDSNhanVien = new JScrollPane();
		
		JPanel pnlDienThongTin = new JPanel();
		pnlDienThongTin.setBackground(new Color(119, 136, 153));
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(354)
					.addComponent(lblBangQuanLyKhachHang, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
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
					.addComponent(lblBangQuanLyKhachHang)
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
		
		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setEditable(false);
		txtMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaKhachHang.setColumns(10);
		
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
		radNam.setBackground(new Color(119, 136, 153));
		radNam.setSelected(true);
		buttonGroup.add(radNam);
		
		radNam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radNu = new JRadioButton("N\u1EEF");
		radNu.setBackground(new Color(119, 136, 153));
		buttonGroup.add(radNu);
		radNu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radNu.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout gl_pnlDienThongTin = new GroupLayout(pnlDienThongTin);
		gl_pnlDienThongTin.setHorizontalGroup(
			gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDienThongTin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDienThongTin.createSequentialGroup()
							.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaNhanVien, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenNhanVien, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(lblSoDT, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(lblDiaChi, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTenNhanVien, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
								.addComponent(txtSoDienThoai, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
								.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
								.addComponent(txtMaKhachHang, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
						.addGroup(gl_pnlDienThongTin.createSequentialGroup()
							.addComponent(lblGioiTinh, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(radNam, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(radNu, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addGap(2)))
					.addGap(18))
		);
		gl_pnlDienThongTin.setVerticalGroup(
			gl_pnlDienThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDienThongTin.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaNhanVien)
						.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTenNhanVien)
						.addComponent(txtTenNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSoDienThoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSoDT))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDiaChi))
					.addGap(16)
					.addGroup(gl_pnlDienThongTin.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGioiTinh)
						.addComponent(radNam)
						.addComponent(radNu))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_pnlDienThongTin.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaKhachHang, txtTenNhanVien, txtSoDienThoai, txtDiaChi, radNam, radNu});
		gl_pnlDienThongTin.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaNhanVien, lblTenNhanVien, lblSoDT, lblDiaChi, lblGioiTinh});
		pnlDienThongTin.setLayout(gl_pnlDienThongTin);
		
		tblDSNhanVien = new JTable();
		tblDSNhanVien.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblDSNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblDSNhanVien.setRowHeight(35);
		listKhachHang = new DefaultTableModel(null,new String[] {"Mã khách hàng", "Họ tên", 
				"Số điện thoại", "Địa chỉ", "Giới tính"});
		tblDSNhanVien.setModel(listKhachHang);
		scrDSNhanVien.setViewportView(tblDSNhanVien);
		
		JLabel lblTimKiem = new JLabel("T\u00ECm ki\u1EBFm:");
		lblTimKiem.setHorizontalAlignment(SwingConstants.LEFT);
		lblTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		cmbTimKiem = new JComboBox<String>();
		cmbTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbTimKiem.setEditable(true);
		
		btnTimKH = new JButton("");
		btnTimKH.setBackground(new Color(119, 136, 153));
		btnTimKH.setToolTipText("Tìm khách hàng");
		btnTimKH.setIcon(new ImageIcon(KhachHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_search_20px.png")));
		btnTimKH.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTimKH.setFocusable(false);
		btnTimKH.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnLamMoi = new JButton("Làm Mới");
		btnLamMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLamMoi.setFocusable(false);
		btnLamMoi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GroupLayout gl_pnlTimKiem = new GroupLayout(pnlTimKiem);
		gl_pnlTimKiem.setHorizontalGroup(
			gl_pnlTimKiem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTimKiem.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlTimKiem.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLamMoi)
						.addComponent(lblTimKiem, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cmbTimKiem, 0, 198, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnTimKH, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(23))
		);
		gl_pnlTimKiem.setVerticalGroup(
			gl_pnlTimKiem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTimKiem.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_pnlTimKiem.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnTimKH, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlTimKiem.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTimKiem)
							.addComponent(cmbTimKiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(btnLamMoi)
					.addContainerGap(138, Short.MAX_VALUE))
		);
		pnlTimKiem.setLayout(gl_pnlTimKiem);
		
		btnThem = new JButton("Th\u00EAm");
		btnThem.setIcon(new ImageIcon(KhachHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_add_user_group_man_woman_40px.png")));
		btnThem.setBackground(Color.decode("#A6FFEA"));
		btnThem.setFocusable(false);
		btnThem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnSua = new JButton("S\u1EEDa");
		btnSua.setIcon(new ImageIcon(KhachHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_edit_property_40px.png")));
		btnSua.setBackground(Color.decode("#E2A6FF"));
		btnSua.setFocusable(false);
		btnSua.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnLapHoaDon = new JButton("Lập Hóa Đơn");
		btnLapHoaDon.setIcon(new ImageIcon(KhachHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_billing_machine_40px.png")));
		btnLapHoaDon.setEnabled(false);
		btnLapHoaDon.setBackground(Color.decode("#FFA6B6"));
		btnLapHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLapHoaDon.setFocusable(false);
		btnLapHoaDon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnXoaTrang = new JButton("Xóa Trắng");
		btnXoaTrang.setIcon(new ImageIcon(KhachHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_ccleaner_40px.png")));
		btnXoaTrang.setBackground(Color.decode("#E2A6FF"));
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaTrang.setFocusable(false);
		btnXoaTrang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		GroupLayout gl_pnlChucNang = new GroupLayout(pnlChucNang);
		gl_pnlChucNang.setHorizontalGroup(
			gl_pnlChucNang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlChucNang.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlChucNang.createParallelGroup(Alignment.LEADING)
						.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(btnSua, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
						.addComponent(btnLapHoaDon, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
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
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addComponent(btnLapHoaDon, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlChucNang.setLayout(gl_pnlChucNang);
		setLayout(gl_contentPane);
	}
}
