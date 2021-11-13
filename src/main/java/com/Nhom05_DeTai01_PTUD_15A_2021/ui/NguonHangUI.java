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
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class NguonHangUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtTen;
	protected JTextField txtDiaChi,txtMaNCC;
	protected JScrollPane scrNhaCungCap;
	protected JTable tblNhaCungCap;
	protected JButton btnThemMoi, btnCapNhat, btnLamMoi, btnXoaTrang, btnTim;
	protected DefaultTableModel listNhaCC;
	protected JComboBox cmbTimKiem;
	protected JTextField txtSDT;
	private JLabel lblTim;
	

	/**
	 * Create the panel.
	 */
	public NguonHangUI() {
		setBackground(Color.WHITE);
		JPanel pnlRightNguonHang = new JPanel();
		pnlRightNguonHang.setBackground(new Color(255, 105, 180));
		
		scrNhaCungCap = new JScrollPane();
		GroupLayout gl_pnlLoaiSanPham = new GroupLayout(this);
		gl_pnlLoaiSanPham.setHorizontalGroup(
			gl_pnlLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlLoaiSanPham.createSequentialGroup()
					.addComponent(scrNhaCungCap, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlRightNguonHang, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE))
		);
		gl_pnlLoaiSanPham.setVerticalGroup(
			gl_pnlLoaiSanPham.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlLoaiSanPham.createSequentialGroup()
					.addGroup(gl_pnlLoaiSanPham.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrNhaCungCap, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
						.addComponent(pnlRightNguonHang, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(0))
		);
		
		tblNhaCungCap = new JTable();
		tblNhaCungCap.setShowHorizontalLines(false);
		tblNhaCungCap.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listNhaCC = new DefaultTableModel(null, new String[] {"Mã nhà cung cấp","Tên NCC", "Địa chỉ","Số điện thoại"});
		tblNhaCungCap.setModel(listNhaCC);
		scrNhaCungCap.setViewportView(tblNhaCungCap);
		
		JLabel lblTen = new JLabel("Tên");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTen = new JTextField();
		txtTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTen.setColumns(10);
		
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtDiaChi = new JTextField();
		txtDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDiaChi.setColumns(10);
		
		btnThemMoi = new JButton("Thêm mới");
		btnThemMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnLamMoi = new JButton("Làm mới");
		btnLamMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLamMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblSDT = new JLabel("SĐT");
		lblSDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSDT.setColumns(10);
		
		lblTim = new JLabel("Tìm kiếm");
		lblTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		cmbTimKiem = new JComboBox();
		cmbTimKiem.setEditable(true);
		cmbTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnTim = new JButton("");
		btnTim.setIcon(new ImageIcon(NguonHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchNV.png")));
		
		JLabel lblNewLabel = new JLabel("Mã NCC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMaNCC = new JTextField();
		txtMaNCC.setEditable(false);
		txtMaNCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaNCC.setColumns(10);
		GroupLayout gl_pnlRightNguonHang = new GroupLayout(pnlRightNguonHang);
		gl_pnlRightNguonHang.setHorizontalGroup(
			gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTim)
							.addGap(18)
							.addComponent(cmbTimKiem, 0, 325, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(37))
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSDT, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
							.addGap(13)
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
								.addComponent(txtDiaChi, 404, 404, 404)
								.addComponent(txtSDT, 404, 404, 404))
							.addGap(13))
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTen, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMaNCC, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
							.addGap(43))))
				.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLamMoi, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThemMoi, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addGap(70))
		);
		gl_pnlRightNguonHang.setVerticalGroup(
			gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(txtMaNCC, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTen)
						.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblSDT, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(58)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnThemMoi)
						.addComponent(btnCapNhat))
					.addGap(55)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLamMoi)
						.addComponent(btnXoaTrang))
					.addGap(39)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
							.addComponent(cmbTimKiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTim))
						.addComponent(btnTim, Alignment.TRAILING))
					.addContainerGap(380, Short.MAX_VALUE))
		);
		pnlRightNguonHang.setLayout(gl_pnlRightNguonHang);
		setLayout(gl_pnlLoaiSanPham);
	}
}
