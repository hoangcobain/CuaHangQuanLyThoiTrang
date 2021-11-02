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

public class LapHoaDonUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtMaHoaDon;
	protected JTextField txtMaKhachHang;
	protected JTextField txtNgayLap;
	protected JTextField txtTongTien;
	protected JTextField txtTenSanPham;
	protected JTextField txtTenNCC;
	protected JTable tblSanPham;
	protected JTable tblCTHD;
	protected JTextField txtMaSanPham;
	protected JTextField txtSoLuong;
	protected JTextField txtDonGia;
	protected JTextField txtTienKhachDua;
	protected JButton btnTimSP,btnThem, btnXoa, btnXoaTrang, btnThanhToan, btnTim;
	protected DefaultTableModel listSanPham, listCTHD;
	private JLabel lblGiaThanh,lblTienKhach;
	protected JTextField txtGiaThanh;

	public LapHoaDonUI() {
		setBackground(Color.WHITE);
		txtMaHoaDon = new JTextField();
		txtMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaHoaDon.setEnabled(false);
		txtMaHoaDon.setEditable(false);
		txtMaHoaDon.setColumns(10);
		
		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaKhachHang.setEnabled(false);
		txtMaKhachHang.setEditable(false);
		txtMaKhachHang.setColumns(10);
		
		txtNgayLap = new JTextField();
		txtNgayLap.setEditable(false);
		txtNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNgayLap.setColumns(10);
		
		txtTongTien = new JTextField();
		txtTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTongTien.setEnabled(false);
		txtTongTien.setEditable(false);
		txtTongTien.setColumns(10);
		
		JLabel lblMaHoaDon = new JLabel("Mã hóa đơn");
		lblMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblMaKhachHang = new JLabel("Mã khách hàng");
		lblMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNgayLap = new JLabel("Ngày lập ");
		lblNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
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
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMaKhachHang)
						.addComponent(lblMaHoaDon))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtMaKhachHang, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtMaHoaDon, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTienKhach)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTienKhachDua, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnThanhToan, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNgayLap)
								.addComponent(lblTongTien))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTongTien, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
								.addComponent(txtNgayLap, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlCenTer, GroupLayout.PREFERRED_SIZE, 1045, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaHoaDon)
								.addComponent(txtMaHoaDon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNgayLap)
								.addComponent(txtNgayLap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaKhachHang)
								.addComponent(lblTongTien)
								.addComponent(txtMaKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTim)
								.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnThanhToan, Alignment.TRAILING)
								.addComponent(txtTienKhachDua, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlCenTer, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblTienKhach)))
					.addContainerGap())
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaHoaDon, txtMaKhachHang, txtNgayLap, lblMaHoaDon, lblMaKhachHang, lblNgayLap, lblTongTien, btnTim});
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtTongTien, btnThanhToan, txtTienKhachDua});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNgayLap, lblTongTien});
		gl_contentPane.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaHoaDon, lblMaKhachHang});
		
		tblCTHD = new JTable();
		tblCTHD.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		listCTHD = new DefaultTableModel(null,new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp", "Số lượng", "Giá thành"});
		tblCTHD.setModel(listCTHD);
		scrSanPham.setViewportView(tblCTHD);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenSanPham.setColumns(10);
		
		JLabel lblMaSanPham = new JLabel("Mã sản phẩm");
		lblMaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSoLuong = new JLabel("Số lượng");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDonGia = new JLabel("Đơn  giá");
		lblDonGia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblTenSanPham = new JLabel("Tên sản phẩm");
		lblTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTenNCC = new JTextField();
		txtTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNCC.setColumns(10);
		
		JLabel lblTenNCC = new JLabel("Tên NCC");
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrCTHD = new JScrollPane();
		
		btnTimSP = new JButton("Tìm");
		btnTimSP.setBackground(Color.decode("#E2A6FF"));
		btnTimSP.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchSP.png")));
		btnTimSP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		btnThem = new JButton("Thêm");
		btnThem.setBackground(Color.decode("#E2A6FF"));
		btnThem.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/floppy-disk.png")));
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnXoa = new JButton("Xóa");
		btnXoa.setBackground(Color.decode("#E2A6FF"));
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
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoLuong.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setEditable(false);
		txtDonGia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDonGia.setColumns(10);
		
		lblGiaThanh = new JLabel("Giá thành");
		lblGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setEditable(false);
		txtGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGiaThanh.setColumns(10);
		GroupLayout gl_pnlCenTer = new GroupLayout(pnlCenTer);
		gl_pnlCenTer.setHorizontalGroup(
			gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenTer.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSoLuong, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDonGia)
								.addComponent(lblGiaThanh, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))))
					.addGap(10)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblTenNCC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblTenSanPham, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTenNCC, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
								.addComponent(txtTenSanPham, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTimSP))
						.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
					.addGap(4))
		);
		gl_pnlCenTer.setVerticalGroup(
			gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenTer.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblMaSanPham)
									.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblTenSanPham)
								.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlCenTer.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTenNCC)
										.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlCenTer.createSequentialGroup()
									.addGap(15)
									.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSoLuong)))))
						.addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGap(8)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDonGia))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGiaThanh, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnThem)
								.addComponent(btnXoa)
								.addComponent(btnXoaTrang))
							.addGap(2))
						.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenSanPham, lblTenSanPham});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {lblMaSanPham, txtMaSanPham});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenNCC, lblTenNCC});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {lblDonGia, txtDonGia});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {lblSoLuong, txtSoLuong});
		gl_pnlCenTer.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaSanPham, lblSoLuong, lblDonGia});
		
		tblSanPham = new JTable();
		tblSanPham.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		listSanPham = new DefaultTableModel(null,new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp", "Số lượng", "Đơn giá"});
		tblSanPham.setModel(listSanPham);
		scrCTHD.setViewportView(tblSanPham);
		pnlCenTer.setLayout(gl_pnlCenTer);
		setLayout(gl_contentPane);
	}
}
