package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.ImageIcon;

public class SanPhamUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtMaSanPham;
	protected JTextField txtSoLuong;
	protected JTextField txtGiaThanh;
	protected JTextField txtTenSanPham;
//	protected JTextField cmbTenNCC;
	protected JComboBox<String> cmbTenLoai, cmbTimSanPham,cmbTenNCC;
	protected JTextField txtTenThuocTinh;
	protected JTextField txtGiaTri;
	protected JTable tblSanPham;
	protected JTable tblThuocTinh;
	protected DefaultTableModel listSanPham, listThuocTinh;
	protected JButton btnThemSanPham, btnCapNhatSanPham, btnXoaSanPham, btnXoaTrangSanPham, 
	btnThemThuocTinh, btnXoaRong, btnXoaThuocTinh, btnXoaTrangThuocTinh,btnImage;
	protected JLabel lblImage;
	protected JTextField txtKichCo;
	protected JTextField txtMauSac;

	/**
	 * Create the panel.
	 */
	public SanPhamUI() {
		setBackground(Color.WHITE);
		JPanel pnlLeftSanPham = new JPanel();
		pnlLeftSanPham.setBackground(new Color(119, 136, 153));
		
		JPanel pnlRightSanPham = new JPanel();
		pnlRightSanPham.setBackground(new Color(119, 136, 153));
		
		btnThemSanPham = new JButton("Thêm mới");
		btnThemSanPham.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_clothes_23px.png")));
		btnThemSanPham.setBackground(new Color(192, 192, 192));
		btnThemSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThemSanPham.setFocusable(false);
		btnThemSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnCapNhatSanPham = new JButton("Cập nhật");
		btnCapNhatSanPham.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_refresh_23px.png")));
		btnCapNhatSanPham.setBackground(new Color(192, 192, 192));
		btnCapNhatSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCapNhatSanPham.setFocusable(false);
		btnCapNhatSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnXoaSanPham = new JButton("Xóa");
		btnXoaSanPham.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/remove.png")));
		btnXoaSanPham.setBackground(new Color(192, 192, 192));
		btnXoaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaSanPham.setFocusable(false);
		btnXoaSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnXoaTrangSanPham = new JButton("Xóa trắng");
		btnXoaTrangSanPham.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_erase_23px.png")));
		btnXoaTrangSanPham.setBackground(new Color(192, 192, 192));
		btnXoaTrangSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaTrangSanPham.setFocusable(false);
		btnXoaTrangSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		cmbTimSanPham = new JComboBox<String>();
		cmbTimSanPham.setEditable(true);
		cmbTimSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbTimSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JLabel lblDanhSachSanPham = new JLabel("Danh sách sản phẩm");
		lblDanhSachSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrSanPham = new JScrollPane();
		GroupLayout gl_pnlSanPham = new GroupLayout(this);
		gl_pnlSanPham.setHorizontalGroup(
			gl_pnlSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
						.addComponent(pnlLeftSanPham, GroupLayout.PREFERRED_SIZE, 969, Short.MAX_VALUE)
						.addGroup(gl_pnlSanPham.createSequentialGroup()
							.addComponent(btnThemSanPham, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCapNhatSanPham, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaSanPham, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaTrangSanPham, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
						.addGroup(gl_pnlSanPham.createSequentialGroup()
							.addComponent(lblDanhSachSanPham, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbTimSanPham, 0, 754, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlRightSanPham, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pnlSanPham.setVerticalGroup(
			gl_pnlSanPham.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlSanPham.createSequentialGroup()
					.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlRightSanPham, GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
						.addGroup(gl_pnlSanPham.createSequentialGroup()
							.addComponent(pnlLeftSanPham, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnXoaTrangSanPham, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btnXoaSanPham, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btnCapNhatSanPham, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btnThemSanPham, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDanhSachSanPham)
								.addComponent(cmbTimSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
					.addGap(0))
		);
		
		tblSanPham = new JTable();
		tblSanPham.setRowHeight(35);
		listSanPham = new DefaultTableModel(null,new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "T\u00EAn NCC", "S\u1ED1 l\u01B0\u1EE3ng","Kích cỡ","Màu sắc", "T\u00EAn lo\u1EA1i", "Gi\u00E1 th\u00E0nh"
			});
		tblSanPham.setModel(listSanPham);
		tblSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrSanPham.setViewportView(tblSanPham);
		
		JLabel lblThuocTinh = new JLabel("Thuộc tính sản phẩm");
		lblThuocTinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblThuocTinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblTenThuocTinh = new JLabel("Tên thuộc tính");
		lblTenThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblGiaTri = new JLabel("Giá trị");
		lblGiaTri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTenThuocTinh = new JTextField();
		txtTenThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenThuocTinh.setColumns(10);
		
		txtGiaTri = new JTextField();
		txtGiaTri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGiaTri.setColumns(10);
		
		btnThemThuocTinh = new JButton("Thêm mới");
		btnThemThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThemThuocTinh.setFocusPainted(false);
		btnThemThuocTinh.setFocusable(false);
		btnThemThuocTinh.setBorder(BorderFactory.createEmptyBorder());
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoaRong.setFocusPainted(false);
		btnXoaRong.setFocusable(false);
		btnXoaRong.setBorder(BorderFactory.createEmptyBorder());
		
		btnXoaThuocTinh = new JButton("Xóa");
		btnXoaThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoaThuocTinh.setFocusPainted(false);
		btnXoaThuocTinh.setFocusable(false);
		btnXoaThuocTinh.setBorder(BorderFactory.createEmptyBorder());
		
		btnXoaTrangThuocTinh = new JButton("Xóa trắng");
		btnXoaTrangThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoaTrangThuocTinh.setFocusPainted(false);
		btnXoaTrangThuocTinh.setFocusable(false);
		btnXoaTrangThuocTinh.setBorder(BorderFactory.createEmptyBorder());
		
		JScrollPane scrThuocTinh = new JScrollPane();
		GroupLayout gl_pnlRightSanPham = new GroupLayout(pnlRightSanPham);
		gl_pnlRightSanPham.setHorizontalGroup(
			gl_pnlRightSanPham.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlRightSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(lblThuocTinh, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrThuocTinh, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_pnlRightSanPham.createSequentialGroup()
							.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.LEADING)
								.addComponent(btnThemThuocTinh, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(lblGiaTri, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenThuocTinh)
								.addComponent(btnXoaThuocTinh, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.LEADING)
								.addComponent(txtGiaTri, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenThuocTinh, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnXoaRong, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
								.addComponent(btnXoaTrangThuocTinh, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_pnlRightSanPham.setVerticalGroup(
			gl_pnlRightSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightSanPham.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblThuocTinh)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTenThuocTinh)
						.addComponent(txtTenThuocTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGiaTri, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtGiaTri, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnThemThuocTinh)
						.addComponent(btnXoaRong, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnXoaThuocTinh, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnXoaTrangThuocTinh, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrThuocTinh, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_pnlRightSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {btnThemThuocTinh, btnXoaRong});
		gl_pnlRightSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenThuocTinh, txtGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {lblTenThuocTinh, lblGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtTenThuocTinh, txtGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblTenThuocTinh, lblGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblThuocTinh, scrThuocTinh});
		
		tblThuocTinh = new JTable();
		tblThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tblThuocTinh.setSurrendersFocusOnKeystroke(true);
		tblThuocTinh.setShowHorizontalLines(false);
		listThuocTinh = new DefaultTableModel(null,new String[] {
				"Tên thuộc tính", "Giá trị"
			});
		tblThuocTinh.setModel(listThuocTinh);
		scrThuocTinh.setViewportView(tblThuocTinh);
		pnlRightSanPham.setLayout(gl_pnlRightSanPham);
		
		JLabel lblMaSanPham = new JLabel("Mã sản phẩm");
		lblMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setEditable(false);
		txtMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaSanPham.setColumns(10);
		
		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoLuong.setColumns(10);
		
		JLabel lblGiạThanh = new JLabel("Giá thành");
		lblGiạThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTenSanPham = new JLabel("Tên sản phẩm");
		lblTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGiaThanh.setColumns(10);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenSanPham.setColumns(10);
		
		JLabel lblTenNCC = new JLabel("Tên NCC");
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTenLoai = new JLabel("Tên loại");
		lblTenLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		cmbTenNCC = new JComboBox<String>();
		cmbTenNCC.setEditable(true);
		cmbTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		cmbTenLoai = new JComboBox<String>();
		cmbTenLoai.setEditable(true);
		cmbTenLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cmbTenLoai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_product_127px.png")));
		
		btnImage = new JButton("Mở hình");
		btnImage.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_opened_folder_25px.png")));
		btnImage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnImage.setFocusPainted(false);
		btnImage.setFocusable(false);
		
		JLabel lblKichCo = new JLabel("Kích cỡ");
		lblKichCo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtKichCo = new JTextField();
		txtKichCo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKichCo.setColumns(10);
		
		JLabel lblMauSac = new JLabel("Màu sắc");
		lblMauSac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMauSac = new JTextField();
		txtMauSac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMauSac.setColumns(10);
		GroupLayout gl_pnlLeftSanPham = new GroupLayout(pnlLeftSanPham);
		gl_pnlLeftSanPham.setHorizontalGroup(
			gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_pnlLeftSanPham.createSequentialGroup()
							.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMaSanPham, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSoLuong, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSoLuong, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_pnlLeftSanPham.createSequentialGroup()
							.addComponent(lblKichCo)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtKichCo, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblMauSac)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMauSac, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_pnlLeftSanPham.createSequentialGroup()
							.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTenSanPham, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTenLoai, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbTenLoai, 0, 246, Short.MAX_VALUE))
						.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
							.addComponent(lblGiạThanh, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtGiaThanh, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTenNCC, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbTenNCC, 0, 246, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(btnImage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
						.addComponent(lblImage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
					.addGap(8))
		);
		gl_pnlLeftSanPham.setVerticalGroup(
			gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
							.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaSanPham)
								.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSoLuong)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTenNCC, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGiạThanh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenLoai, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbTenLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(9))
						.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnImage)
						.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
							.addComponent(lblMauSac, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtMauSac, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtKichCo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblKichCo)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_pnlLeftSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaSanPham, txtGiaThanh, txtTenSanPham, txtKichCo});
		gl_pnlLeftSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {lblSoLuong, txtSoLuong, lblTenNCC, lblTenLoai, cmbTenNCC, cmbTenLoai, lblMauSac, txtMauSac});
		gl_pnlLeftSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {lblMaSanPham, lblGiạThanh, lblTenSanPham, lblKichCo});
		gl_pnlLeftSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblSoLuong, lblTenNCC, lblTenLoai, lblMauSac});
		gl_pnlLeftSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaSanPham, lblGiạThanh, lblTenSanPham, lblKichCo});
		pnlLeftSanPham.setLayout(gl_pnlLeftSanPham);
		setLayout(gl_pnlSanPham);
	}
}
