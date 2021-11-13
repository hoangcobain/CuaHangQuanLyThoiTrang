package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LapHoaDonUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtMaKhachHang;
	protected JTextField txtTongTien;
	protected JTextField txtTenSanPham;
	protected JTextField txtTenNCC;
	protected JTable tblSanPham;
	protected JTable tblCTHD;
	protected JTextField txtMaSanPham;
	protected JTextField txtSoLuong;
	protected JTextField txtTienKhachDua;
	protected JButton btnTimSP,btnThem, btnXoa, btnXoaTrang, btnThanhToan, btnTim;
	protected DefaultTableModel listSanPham, listCTHD;
	protected JLabel lblTienKhach;
	protected JLabel lblNewLabel;
	protected JTextField txtSize;
	protected JTextField txtTenKhachHang;
	protected JLabel lblChietKhau;
	protected JTextField txtChietKhau;
	protected JLabel lblGiaThanh;
	protected JTextField txtGiaThanh;
	protected JLabel lblKhuyenMai;
	protected JComboBox cmbKhuyenMai;
	protected JLabel lblMuSc;
	protected JTextField txtMauSac;

	public LapHoaDonUI() {
		setBackground(Color.WHITE);

		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaKhachHang.setEditable(false);
		txtMaKhachHang.setColumns(10);

		txtTongTien = new JTextField();
		txtTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);

		JLabel lblMaKhachHang = new JLabel("Mã khách hàng");
		lblMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblTongTien = new JLabel("Tổng tiền");
		lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JPanel pnlCenTer = new JPanel();
		pnlCenTer.setBackground(Color.decode("#FFB6F8"));
		pnlCenTer.setBorder(new LineBorder(Color.BLACK));

		JScrollPane scrSanPham = new JScrollPane();

		btnTim = new JButton("Tìm");
		btnTim.setBackground(Color.decode("#FFA6B6"));
		btnTim.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchNV.png")));
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnThanhToan = new JButton("Thanh toán");
		btnThanhToan.setBackground(Color.decode("#A6FFEA"));
		btnThanhToan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThanhToan.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/checkout.png")));
		btnThanhToan.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblTienKhach = new JLabel("Tiền khách");
		lblTienKhach.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtTienKhachDua = new JTextField();
		txtTienKhachDua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTienKhachDua.setColumns(10);

		JLabel lblTenKhachHang = new JLabel("Tên khách hàng");
		lblTenKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtTenKhachHang = new JTextField();
		txtTenKhachHang.setEditable(false);
		txtTenKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenKhachHang.setColumns(10);

		lblChietKhau = new JLabel("Chiết khấu");
		lblChietKhau.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtChietKhau = new JTextField();
		txtChietKhau.setText("0");
		txtChietKhau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtChietKhau.setColumns(10);

		lblKhuyenMai = new JLabel("Khuyến mại");
		lblKhuyenMai.setFont(new Font("Tahoma", Font.PLAIN, 20));

		cmbKhuyenMai = new JComboBox();
		cmbKhuyenMai.setModel(new DefaultComboBoxModel(new String[] {"Bình Thường 0%", "Sinh Viên 5%", "Nhân Viên 10%", "Khách Hàng Thân Thiết 15%"}));
		cmbKhuyenMai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(lblMaKhachHang, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
										.addGap(26)
										.addComponent(lblTenKhachHang, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtTenKhachHang, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblKhuyenMai, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblChietKhau, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(cmbKhuyenMai, 0, 325, Short.MAX_VALUE)
												.addComponent(txtChietKhau, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblTienKhach, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtTongTien)
												.addComponent(txtTienKhachDua, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnThanhToan, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
								.addComponent(scrSanPham, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
								.addComponent(pnlCenTer, GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE))
						.addContainerGap())
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(25)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaKhachHang)
								.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTim)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtTenKhachHang, Alignment.LEADING)
										.addComponent(lblTenKhachHang, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGap(18)
						.addComponent(pnlCenTer, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(cmbKhuyenMai, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTongTien))
												.addComponent(lblKhuyenMai, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(txtTienKhachDua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTienKhach))
												.addComponent(lblChietKhau)
												.addComponent(txtChietKhau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnThanhToan, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
										.addContainerGap())))
				);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtTongTien, lblTongTien, lblKhuyenMai, cmbKhuyenMai});
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaKhachHang, lblMaKhachHang, btnTim, lblTenKhachHang, txtTenKhachHang});
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {lblTienKhach, txtTienKhachDua, lblChietKhau, txtChietKhau});

		tblCTHD = new JTable();
		tblCTHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblCTHD.setRowHeight(25);
		tblCTHD.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		listCTHD = new DefaultTableModel(null,new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp","Kích cỡ","Màu sắc", "Số lượng", "Giá thành"});
		tblCTHD.setModel(listCTHD);
		scrSanPham.setViewportView(tblCTHD);

		txtTenSanPham = new JTextField();
		txtTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenSanPham.setColumns(10);

		JLabel lblMaSanPham = new JLabel("Mã sản phẩm");
		lblMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtTenNCC = new JTextField();
		txtTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNCC.setColumns(10);

		JLabel lblTenNCC = new JLabel("Tên NCC");
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JScrollPane scrCTHD = new JScrollPane();

		btnThem = new JButton("Thêm - Cập Nhật");
		btnThem.setBackground(Color.decode("#ffe19c"));
		btnThem.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/floppy-disk.png")));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnXoa = new JButton("Xóa SP trong HĐơn");
		btnXoa.setBackground(Color.decode("#FFA6B6"));
		btnXoa.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/remove.png")));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));

		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setBackground(Color.decode("#E2A6FF"));
		btnXoaTrang.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/clean.png")));
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtMaSanPham = new JTextField();
		txtMaSanPham.setEditable(false);
		txtMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaSanPham.setColumns(10);

		txtSoLuong = new JTextField();
		txtSoLuong.setText("0");
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoLuong.setColumns(10);

		JLabel lblTenSanPham = new JLabel("Tên SP");
		lblTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblNewLabel = new JLabel("Kích cỡ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtSize = new JTextField();
		txtSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSize.setColumns(10);

		btnTimSP = new JButton("Tìm");
		btnTimSP.setBackground(Color.decode("#E2A6FF"));
		btnTimSP.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searching.png")));
		btnTimSP.setFont(new Font("Tahoma", Font.PLAIN, 25));

		lblGiaThanh = new JLabel("Giá thành");
		lblGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtGiaThanh = new JTextField();
		txtGiaThanh.setEditable(false);
		txtGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGiaThanh.setColumns(10);

		lblMuSc = new JLabel("Màu sắc");
		lblMuSc.setFont(new Font("Tahoma", Font.PLAIN, 20));

		txtMauSac = new JTextField();
		txtMauSac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMauSac.setColumns(10);
		GroupLayout gl_pnlCenTer = new GroupLayout(pnlCenTer);
		gl_pnlCenTer.setHorizontalGroup(
				gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenTer.createSequentialGroup()
						.addGap(10)
						.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenTer.createSequentialGroup()
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
												.addComponent(lblGiaThanh)
												.addComponent(lblSoLuong, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMuSc, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(txtMaSanPham, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
														.addComponent(txtTenSanPham, 375, 375, Short.MAX_VALUE)
														.addComponent(txtTenNCC, 375, 375, Short.MAX_VALUE)
														.addComponent(txtSize, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
														.addComponent(txtMauSac, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
												.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenNCC, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlCenTer.createSequentialGroup()
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
												.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING, false)
												.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap())
				);
		gl_pnlCenTer.setVerticalGroup(
				gl_pnlCenTer.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCenTer.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrCTHD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
								.addGroup(gl_pnlCenTer.createSequentialGroup()
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
												.addComponent(lblMaSanPham)
												.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
												.addComponent(lblTenSanPham)
												.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblTenNCC)
												.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel)
												.addComponent(txtSize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtMauSac, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMuSc, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
												.addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnXoaTrang))
										.addGap(6)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblSoLuong)
												.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(7)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblGiaThanh))
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnXoa)
												.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap())
				);
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {lblSoLuong, lblNewLabel, txtSize, lblMuSc});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenSanPham, lblTenSanPham});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {lblMaSanPham, txtMaSanPham});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenNCC, lblTenNCC});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {btnThem, btnXoa, lblGiaThanh});
		gl_pnlCenTer.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtTenSanPham, txtTenNCC, txtMaSanPham, txtSoLuong, txtSize, txtGiaThanh, txtMauSac});
		gl_pnlCenTer.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaSanPham, lblSoLuong, lblTenNCC, lblTenSanPham, lblNewLabel, lblGiaThanh, lblMuSc});

		tblSanPham = new JTable();
		tblSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblSanPham.setRowHeight(25);
		tblSanPham.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		listSanPham = new DefaultTableModel(null,new String[] {"Mã", "Tên SP", "Nhà CCấp", "Số lượng","Kích cỡ","Màu sắc","Đơn giá"});
		tblSanPham.setModel(listSanPham);
		scrCTHD.setViewportView(tblSanPham);
		pnlCenTer.setLayout(gl_pnlCenTer);
		setLayout(gl_contentPane);
	}
}
