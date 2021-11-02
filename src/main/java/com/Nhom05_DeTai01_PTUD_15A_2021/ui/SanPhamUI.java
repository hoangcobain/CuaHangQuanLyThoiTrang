package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.Color;
import java.awt.Font;

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
import javax.swing.ImageIcon;

public class SanPhamUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtMaSanPham;
	protected JTextField txtSoLuong;
	protected JTextField txtGiaThanh;
	protected JTextField txtTenSanPham;
	protected JTextField txtTenNCC;
	protected JComboBox<String> cmbTenLoai, cmbTimSanPham;
	protected JTextField txtTenThuocTinh;
	protected JTextField txtGiaTri;
	protected JTable tblSanPham;
	protected JTable tblThuocTinh;
	protected DefaultTableModel listSanPham, listThuocTinh;
	protected JButton btnThemSanPham, btnCapNhatSanPham, btnXoaSanPham, btnXoaTrangSanPham, 
	btnThemThuocTinh, btnXoaRong, btnXoaThuocTinh, btnXoaTrangThuocTinh,btnImage;
	protected JLabel lblImage;

	/**
	 * Create the panel.
	 */
	public SanPhamUI() {
		setBackground(Color.WHITE);
		JPanel pnlLeftSanPham = new JPanel();
		pnlLeftSanPham.setBackground(Color.decode("#FFB6F8"));
		
		JPanel pnlRightSanPham = new JPanel();
		pnlRightSanPham.setBackground(Color.decode("#FFB6F8"));
		
		btnThemSanPham = new JButton("Thêm mới");
		btnThemSanPham.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnCapNhatSanPham = new JButton("Cập nhật");
		btnCapNhatSanPham.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnXoaSanPham = new JButton("Xóa");
		btnXoaSanPham.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnXoaTrangSanPham = new JButton("Xóa trắng");
		btnXoaTrangSanPham.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		cmbTimSanPham = new JComboBox<String>();
		cmbTimSanPham.setEditable(true);
		cmbTimSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDanhSachSanPham = new JLabel("Danh sách sản phẩm");
		lblDanhSachSanPham.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JScrollPane scrSanPham = new JScrollPane();
		GroupLayout gl_pnlSanPham = new GroupLayout(this);
		gl_pnlSanPham.setHorizontalGroup(
			gl_pnlSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrSanPham, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
						.addGroup(gl_pnlSanPham.createSequentialGroup()
							.addComponent(lblDanhSachSanPham, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbTimSanPham, 0, 458, Short.MAX_VALUE))
						.addGroup(gl_pnlSanPham.createSequentialGroup()
							.addComponent(btnThemSanPham, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCapNhatSanPham, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaSanPham, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnXoaTrangSanPham, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
						.addComponent(pnlLeftSanPham, GroupLayout.PREFERRED_SIZE, 673, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlRightSanPham, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_pnlSanPham.setVerticalGroup(
			gl_pnlSanPham.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlSanPham.createSequentialGroup()
					.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlRightSanPham, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
						.addGroup(gl_pnlSanPham.createSequentialGroup()
							.addComponent(pnlLeftSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnXoaTrangSanPham, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btnXoaSanPham, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btnCapNhatSanPham, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
								.addComponent(btnThemSanPham, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlSanPham.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDanhSachSanPham)
								.addComponent(cmbTimSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrSanPham, 0, 0, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		tblSanPham = new JTable();
		listSanPham = new DefaultTableModel(null,new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "T\u00EAn NCC", "S\u1ED1 l\u01B0\u1EE3ng", "T\u00EAn lo\u1EA1i", "Gi\u00E1 th\u00E0nh"
			});
		tblSanPham.setModel(listSanPham);
		tblSanPham.setShowHorizontalLines(false);
		tblSanPham.setFont(new Font("Tahoma", Font.PLAIN, 13));
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
		
		btnXoaRong = new JButton("Xóa Rỗng");
		btnXoaRong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnXoaThuocTinh = new JButton("Xóa");
		btnXoaThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnXoaTrangThuocTinh = new JButton("Xóa trắng");
		btnXoaTrangThuocTinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JScrollPane scrThuocTinh = new JScrollPane();
		GroupLayout gl_pnlRightSanPham = new GroupLayout(pnlRightSanPham);
		gl_pnlRightSanPham.setHorizontalGroup(
			gl_pnlRightSanPham.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlRightSanPham.createSequentialGroup()
					.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlRightSanPham.createSequentialGroup()
							.addContainerGap(10, Short.MAX_VALUE)
							.addComponent(lblThuocTinh, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlRightSanPham.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlRightSanPham.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrThuocTinh, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnlRightSanPham.createSequentialGroup()
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
										.addComponent(btnXoaTrangThuocTinh, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))))
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
					.addComponent(scrThuocTinh, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_pnlRightSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {lblTenThuocTinh, lblGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenThuocTinh, txtGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblThuocTinh, scrThuocTinh});
		gl_pnlRightSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblTenThuocTinh, lblGiaTri});
		gl_pnlRightSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtTenThuocTinh, txtGiaTri});
		
		tblThuocTinh = new JTable();
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
		
		txtTenNCC = new JTextField();
		txtTenNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNCC.setColumns(10);
		
		cmbTenLoai = new JComboBox<String>();
		cmbTenLoai.setEditable(true);
		cmbTenLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setIcon(new ImageIcon(SanPhamUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_product_127px.png")));
		
		btnImage = new JButton("Mở hình");
		btnImage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_pnlLeftSanPham = new GroupLayout(pnlLeftSanPham);
		gl_pnlLeftSanPham.setHorizontalGroup(
			gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblMaSanPham, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGiạThanh, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtMaSanPham, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
						.addComponent(txtGiaThanh)
						.addComponent(txtTenSanPham))
					.addGap(54)
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSoLuong, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTenNCC, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTenLoai, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbTenLoai, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
							.addGap(59)
							.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(58))
						.addGroup(Alignment.TRAILING, gl_pnlLeftSanPham.createSequentialGroup()
							.addGap(145)
							.addComponent(btnImage, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
							.addGap(134))))
		);
		gl_pnlLeftSanPham.setVerticalGroup(
			gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
					.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMaSanPham)
								.addComponent(txtMaSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSoLuong, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSoLuong))
							.addGap(43)
							.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGiạThanh, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGiaThanh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenNCC, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenNCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(56)
							.addGroup(gl_pnlLeftSanPham.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTenSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbTenLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTenLoai, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlLeftSanPham.createSequentialGroup()
							.addGap(21)
							.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnImage)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_pnlLeftSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblSoLuong, lblTenNCC, lblTenLoai});
		gl_pnlLeftSanPham.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblMaSanPham, lblGiạThanh, lblTenSanPham});
		pnlLeftSanPham.setLayout(gl_pnlLeftSanPham);
		setLayout(gl_pnlSanPham);
	}
}
