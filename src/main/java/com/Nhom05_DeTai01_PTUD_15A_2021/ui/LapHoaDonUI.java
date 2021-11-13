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
	protected JTextField txtThuocTinh;
	protected JTextField txtTenKhachHang;
	protected JLabel lblChietKhau;
	protected JTextField textField;
	protected JLabel lblGiaThanh;
	protected JTextField txtGiaThanh;

	public LapHoaDonUI() {
		setBackground(Color.WHITE);
		
		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaKhachHang.setEnabled(false);
		txtMaKhachHang.setEditable(false);
		txtMaKhachHang.setColumns(10);
		
		txtTongTien = new JTextField();
		txtTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTongTien.setEnabled(false);
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
		txtTenKhachHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenKhachHang.setColumns(10);
		
		lblChietKhau = new JLabel("Chiết khấu");
		lblChietKhau.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblChietKhau)
							.addGap(18)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(lblTongTien, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtTongTien, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblTienKhach)
									.addGap(18)
									.addComponent(txtTienKhachDua, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnThanhToan)))
							.addGap(20))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(lblMaKhachHang, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMaKhachHang, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblTenKhachHang, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtTenKhachHang, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
							.addGap(21)))
					.addGap(3))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addComponent(pnlCenTer, GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
					.addGap(3))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtMaKhachHang, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTenKhachHang, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(pnlCenTer, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrSanPham, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblChietKhau))
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblTienKhach)
									.addGap(23))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtTienKhachDua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnThanhToan))
									.addGap(18))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 655, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTongTien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTongTien))
							.addGap(58))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(lblTenKhachHang)
					.addGap(765))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(btnTim)
					.addGap(764))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblMaKhachHang)
					.addGap(764))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {lblTenKhachHang, txtTenKhachHang});
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {txtMaKhachHang, lblMaKhachHang, lblTongTien, btnTim});
		
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
		
		txtTenNCC = new JTextField();
		txtTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNCC.setColumns(10);
		
		JLabel lblTenNCC = new JLabel("Tên NCC");
		lblTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrCTHD = new JScrollPane();
		
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
		
		JLabel lblTenSanPham = new JLabel("Tên SP");
		lblTenSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblNewLabel = new JLabel("Thuộc tính");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtThuocTinh = new JTextField();
		txtThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtThuocTinh.setColumns(10);
		
		btnTimSP = new JButton("Tìm");
		btnTimSP.setBackground(Color.decode("#E2A6FF"));
		btnTimSP.setIcon(new ImageIcon(LapHoaDonUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchSP.png")));
		btnTimSP.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		lblGiaThanh = new JLabel("Giá thành");
		lblGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGiaThanh.setColumns(10);
		GroupLayout gl_pnlCenTer = new GroupLayout(pnlCenTer);
		gl_pnlCenTer.setHorizontalGroup(
			gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenTer.createSequentialGroup()
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnlCenTer.createSequentialGroup()
									.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTenNCC, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtTenNCC)
										.addComponent(txtThuocTinh, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)))
								.addGroup(gl_pnlCenTer.createSequentialGroup()
									.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSoLuong, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pnlCenTer.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
										.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtSoLuong, Alignment.LEADING)
											.addComponent(txtTenSanPham, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))))))
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnTimSP))
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblGiaThanh)
							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
							.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(scrCTHD, GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
		);
		gl_pnlCenTer.setVerticalGroup(
			gl_pnlCenTer.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCenTer.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMaSanPham)
						.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTenSanPham)
						.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addGap(18)
							.addComponent(lblSoLuong))
						.addGroup(gl_pnlCenTer.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGiaThanh)
						.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTenNCC))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtThuocTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(12)
					.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnThem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_pnlCenTer.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnXoaTrang, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnTimSP, 0, 0, Short.MAX_VALUE)))
					.addContainerGap())
				.addComponent(scrCTHD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
		);
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenSanPham, lblTenSanPham});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {lblMaSanPham, txtMaSanPham});
		gl_pnlCenTer.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenNCC, lblTenNCC});
		gl_pnlCenTer.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtTenSanPham, txtTenNCC, txtMaSanPham, txtSoLuong, txtThuocTinh, txtGiaThanh});
		
		tblSanPham = new JTable();
		tblSanPham.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 15));
		listSanPham = new DefaultTableModel(null,new String[] {"Mã sản phẩm", "Tên sản phẩm", "Tên nhà cung cấp", "Số lượng","Kích cỡ","Màu sắc","Đơn giá","Thuộc tính"});
		tblSanPham.setModel(listSanPham);
		scrCTHD.setViewportView(tblSanPham);
		pnlCenTer.setLayout(gl_pnlCenTer);
		setLayout(gl_contentPane);
	}
}
