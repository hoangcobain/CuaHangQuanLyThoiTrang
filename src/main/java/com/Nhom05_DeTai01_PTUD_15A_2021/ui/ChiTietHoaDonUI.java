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
	protected JButton btnTimSP, btnCapNhat, btnXoa, btnXoaTrang,btnInHD;
	private JLabel lblGiaThanh;
	public JTextField txtGiaThanh;
	protected JTextField txtKichCo;
	private JLabel lblMauSac;
	protected JTextField txtMauSac;
	private JLabel lblTnKhchHng;
	protected JTextField txtTenKhachHang;
	private JLabel lblTnNhnVin;
	protected JTextField txtTenNhanVien;
	private JLabel lblNewLabel;

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
		
		lblTnKhchHng = new JLabel("Tên khách hàng");
		lblTnKhchHng.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTenKhachHang = new JTextField();
		txtTenKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenKhachHang.setEditable(false);
		txtTenKhachHang.setColumns(10);
		
		lblTnNhnVin = new JLabel("Tên nhân viên");
		lblTnNhnVin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTenNhanVien = new JTextField();
		txtTenNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNhanVien.setEditable(false);
		txtTenNhanVien.setColumns(10);
		
		lblNewLabel = new JLabel("CHI TIẾT HÓA ĐƠN");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaKhachHang)
								.addComponent(lblMaHoaDon)
								.addComponent(lblTnKhchHng, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTenKhachHang, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
								.addComponent(txtMaKhachHang, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
								.addComponent(txtMaHoaDon, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTnNhnVin, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTongTien)
								.addComponent(lblNgayLap))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNgayLap, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
								.addComponent(txtMaNhanVien, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
								.addComponent(txtTenNhanVien, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlCenter, GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
					.addGap(13))
				.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNgayLap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNgayLap))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaKhachHang, Alignment.TRAILING)
								.addComponent(txtMaKhachHang, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTnKhchHng, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenKhachHang, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlCenter, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(121)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTnNhnVin, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenNhanVien, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(80)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTongTien)
								.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(txtMaHoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(lblMaHoaDon)))
					.addContainerGap())
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaHoaDon, txtMaKhachHang, txtNgayLap, txtMaNhanVien, lblMaHoaDon, lblMaKhachHang, lblNgayLap, lblTongTien, lblTnKhchHng, txtTenKhachHang, lblTnNhnVin, txtTenNhanVien});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaHoaDon, lblMaKhachHang, lblTnKhchHng});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNgayLap, lblTongTien, lblTnNhnVin});
		
		listCTHD = new DefaultTableModel(null,new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp", "Số lượng", "Kích cỡ", "Màu sắc", "Giá thành"});
		tblCTHD = new JTable();
		tblCTHD.setRowHeight(25);
		tblCTHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblCTHD.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
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
		btnTimSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		txtMaSanPham.setEditable(false);
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
		
		btnInHD = new JButton("In");
		btnInHD.setIcon(new ImageIcon(ChiTietHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/bill.png")));
		btnInHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInHD.setBackground(new Color(255, 166, 182));
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTSanPham)
								.addComponent(lblTenNCC)
								.addComponent(lblKichCo)
								.addComponent(lblMauSac)
								.addComponent(lblSoLuong)
								.addComponent(lblDonGia)
								.addComponent(lblGiaThanh, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtKichCo, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMauSac, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaTrang)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTimSP)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnInHD, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
						.addGroup(gl_pnlCenter.createSequentialGroup()
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTSanPham)
								.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTenNCC)
								.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblKichCo)
								.addComponent(txtKichCo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMauSac)
								.addComponent(txtMauSac, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSoLuong)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDonGia, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGiaThanh, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenter.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenter.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnXoaTrang)
									.addComponent(btnXoa))
								.addComponent(btnInHD, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
					.addGap(7))
		);
		gl_pnlCenter.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenSanPham, lblMaSanPham, lblSoLuong, lblDonGia, lblTSanPham, txtTenNCC, lblTenNCC, txtMaSanPham, txtSoLuong, txtDonGia, lblGiaThanh, txtGiaThanh, lblKichCo, txtKichCo, lblMauSac, txtMauSac});
		gl_pnlCenter.linkSize(SwingConstants.VERTICAL, new Component[] {btnTimSP, btnCapNhat, btnXoa, btnXoaTrang});
		gl_pnlCenter.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtTenSanPham, txtTenNCC, txtMaSanPham, txtSoLuong, txtDonGia, txtGiaThanh, txtKichCo, txtMauSac});
		gl_pnlCenter.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaSanPham, lblSoLuong, lblDonGia, lblTSanPham, lblTenNCC, lblGiaThanh, lblKichCo, lblMauSac});
		listSanPham = new DefaultTableModel(null, new String[] {"Mã", "Tên SP", "Tên NCC", "Số lượng", "Kích thước", "Màu sắc", "Đơn giá"});
		tblSanPham = new JTable();
		tblSanPham.setRowHeight(25);
		tblSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblSanPham.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblSanPham.setModel(listSanPham);
		scrCTHD.setViewportView(tblSanPham);
		pnlCenter.setLayout(gl_pnlCenter);
		setLayout(gl_contentPane);
	}
}
