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


public class ChiTietHoaDonUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtMaHoaDon;
	protected JTextField txtMaKhachHang;
	protected JTextField txtNgayLap;
	protected JTextField txtMaNhanVien;
	protected JTextField txtTenSanPham;
	protected JTextField txtTenNCC;
	protected JTable tblSanPham;
	protected JTable tblCTHD;
	protected JTextField txtMaSanPham;
	protected JTextField txtSoLuong;
	protected JTextField txtDonGia;
	protected DefaultTableModel listCTHD, listSanPham;
	protected JButton btnTimSP, btnCapNhat, btnXoa, btnXoaTrang;
	private JLabel lblGiaThanh;
	public JTextField txtGiaThanh;
	protected JTextField txtKichCo;
	private JLabel lblMauSac;
	protected JTextField txtMauSac;

	protected ChiTietHoaDonUI() {
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaHoaDon.setEditable(false);
		txtMaHoaDon.setColumns(10);
		
		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaKhachHang.setEditable(false);
		txtMaKhachHang.setColumns(10);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setEditable(false);
		txtNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNgayLap.setColumns(10);
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaNhanVien.setEditable(false);
		txtMaNhanVien.setColumns(10);
		
		JLabel lblMaHoaDon = new JLabel("Mã hóa đơn");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMaKhachHang = new JLabel("Mã khách hàng");
		lblMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNgayLap = new JLabel("Ngày lập ");
		lblNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTongTien = new JLabel("Mã nhân viên");
		lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(119, 136, 153));
		pnlCenter.setBorder(new LineBorder(Color.BLACK));
		
		JScrollPane scrSanPham = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMaKhachHang)
						.addComponent(lblMaHoaDon))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtMaHoaDon, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
						.addComponent(txtMaKhachHang, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNgayLap)
						.addComponent(lblTongTien))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNgayLap, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
						.addComponent(txtMaNhanVien, GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlCenter, GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
					.addGap(13))
				.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(63)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaKhachHang)
								.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(63)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTongTien)
								.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaHoaDon)
								.addComponent(lblNgayLap)
								.addComponent(txtMaHoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNgayLap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlCenter, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
		);
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNgayLap, lblTongTien});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaHoaDon, lblMaKhachHang});
		
		listCTHD = new DefaultTableModel(null,new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp", "Số lượng", "Kích cỡ", "Màu sắc", "Giá thành"});
		tblCTHD = new JTable();
		tblCTHD.setRowHeight(25);
		tblCTHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblCTHD.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		tblCTHD.setModel(listCTHD);
		scrSanPham.setViewportView(tblCTHD);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenSanPham.setColumns(10);
		
		JLabel lblMaSanPham = new JLabel("Mã sản phẩm");
		lblMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDonGia = new JLabel("Đơn giá");
		lblDonGia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTSanPham = new JLabel("Tên sản phẩm");
		lblTSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTenNCC = new JTextField();
		txtTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNCC.setColumns(10);
		
		JLabel lblTenNCC = new JLabel("Tên NCC");
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrCTHD = new JScrollPane();
		
		btnTimSP = new JButton("Tìm");
		btnTimSP.setBackground(Color.decode("#FFA6B6"));
		btnTimSP.setIcon(new ImageIcon(ChiTietHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchSP.png")));
		btnTimSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setBackground(Color.decode("#A6FFEA"));
		btnCapNhat.setIcon(new ImageIcon(ChiTietHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/updated.png")));
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnXoa = new JButton("Xóa");
		btnXoa.setBackground(Color.decode("#E2A6FF"));
		btnXoa.setIcon(new ImageIcon(ChiTietHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/remove.png")));
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setBackground(Color.decode("#E2A6FF"));
		btnXoaTrang.setIcon(new ImageIcon(ChiTietHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/clean.png")));
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaSanPham.setColumns(10);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoLuong.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setEditable(false);
		txtDonGia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDonGia.setColumns(10);
		
		lblGiaThanh = new JLabel("Giá thành");
		lblGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGiaThanh.setEditable(false);
		txtGiaThanh.setColumns(10);
		
		JLabel lblKichCo = new JLabel("Kích cỡ");
		lblKichCo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtKichCo = new JTextField();
		txtKichCo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKichCo.setColumns(10);
		
		lblMauSac = new JLabel("Màu sắc");
		lblMauSac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMauSac = new JTextField();
		txtMauSac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMauSac.setColumns(10);
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(10)
									.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnXoa)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnXoaTrang)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblKichCo))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
												.addComponent(lblMauSac)
												.addComponent(lblTenNCC)
												.addComponent(lblTSanPham))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING, false)
												.addGroup(Alignment.LEADING, gl_pnlCenter.createSequentialGroup()
													.addGap(18)
													.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txtKichCo, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
														.addComponent(txtMauSac, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)))
												.addGroup(Alignment.LEADING, gl_pnlCenter.createSequentialGroup()
													.addGap(18)
													.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))
												.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_pnlCenter.createSequentialGroup()
											.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSoLuong)
									.addGap(3)
									.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(lblDonGia)
									.addGap(3)
									.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
									.addGap(1)))
							.addGap(18))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblGiaThanh, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
							.addGap(19)))
					.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrCTHD, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTSanPham))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTenNCC)
								.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblKichCo)
								.addComponent(txtKichCo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(txtMauSac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMauSac))
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblSoLuong)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(Alignment.TRAILING, gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(6)))
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(6)
									.addComponent(lblDonGia, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(12)
									.addComponent(lblGiaThanh, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addGap(6)
									.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnXoaTrang)
									.addComponent(btnXoa)
									.addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlCenter.createSequentialGroup()
									.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(7))
		);
		gl_pnlCenter.linkSize(SwingConstants.VERTICAL, new Component[] {lblMaSanPham, lblSoLuong, lblDonGia, lblTSanPham, lblTenNCC, lblGiaThanh, lblKichCo, lblMauSac});
		gl_pnlCenter.linkSize(SwingConstants.VERTICAL, new Component[] {btnCapNhat, btnXoa, btnXoaTrang});
		gl_pnlCenter.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtTenSanPham, txtTenNCC, txtMaSanPham, txtSoLuong, txtDonGia, txtGiaThanh, txtKichCo, txtMauSac});
		gl_pnlCenter.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaSanPham, lblSoLuong, lblDonGia});
		gl_pnlCenter.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnCapNhat, btnXoa, btnXoaTrang});
		listSanPham = new DefaultTableModel(null, new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp", "Số lượng", "Kích thước", "Màu sắc", "Đơn giá"});
		tblSanPham = new JTable();
		tblSanPham.setRowHeight(25);
		tblSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblSanPham.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		tblSanPham.setModel(listSanPham);
		scrCTHD.setViewportView(tblSanPham);
		pnlCenter.setLayout(gl_pnlCenter);
		setLayout(gl_contentPane);
	}
}
