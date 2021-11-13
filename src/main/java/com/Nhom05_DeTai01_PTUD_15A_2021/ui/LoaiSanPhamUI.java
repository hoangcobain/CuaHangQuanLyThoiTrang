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

public class LoaiSanPhamUI extends JPanel {
	protected static final long serialVersionUID = 1L;
	protected JTextField txtMaLoai;
	protected JTextField txtTenLoai;
	protected JScrollPane scrLoaiSanPham;
	protected JTable tblLoaiSanPham;
	protected JButton btnThemMoi, btnCapNhat, btnXoa, btnXoaTrang;
	protected DefaultTableModel listLoaiSP;

	/**
	 * Create the panel.
	 */
	public LoaiSanPhamUI() {
		setBackground(Color.WHITE);
		JPanel pnlLeftLoaiSanPham = new JPanel();
		pnlLeftLoaiSanPham.setBackground(new Color(255, 105, 180));
		
		JPanel pnlRightLoaiSanPham = new JPanel();
		pnlRightLoaiSanPham.setBackground(new Color(255, 105, 180));
		
		scrLoaiSanPham = new JScrollPane();
		GroupLayout gl_pnlLoaiSanPham = new GroupLayout(this);
		gl_pnlLoaiSanPham.setHorizontalGroup(
			gl_pnlLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLoaiSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlLoaiSanPham.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlLoaiSanPham.createSequentialGroup()
							.addComponent(scrLoaiSanPham, GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_pnlLoaiSanPham.createSequentialGroup()
							.addComponent(pnlLeftLoaiSanPham, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlRightLoaiSanPham, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
							.addGap(3))))
		);
		gl_pnlLoaiSanPham.setVerticalGroup(
			gl_pnlLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLoaiSanPham.createSequentialGroup()
					.addGroup(gl_pnlLoaiSanPham.createParallelGroup(Alignment.LEADING, false)
						.addComponent(pnlRightLoaiSanPham, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pnlLeftLoaiSanPham, GroupLayout.PREFERRED_SIZE, 142, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(scrLoaiSanPham, GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tblLoaiSanPham = new JTable();
		tblLoaiSanPham.setShowHorizontalLines(false);
		tblLoaiSanPham.setFont(new Font("Tahoma", Font.PLAIN, 18));
		listLoaiSP = new DefaultTableModel(null, new String[] {"M\u00E3 lo\u1EA1i", "T\u00EAn lo\u1EA1i"});
		tblLoaiSanPham.setModel(listLoaiSP);
		scrLoaiSanPham.setViewportView(tblLoaiSanPham);
		
		btnThemMoi = new JButton("Thêm mới");
		btnThemMoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnXoa = new JButton("Xóa bỏ");
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_pnlRightLoaiSanPham = new GroupLayout(pnlRightLoaiSanPham);
		gl_pnlRightLoaiSanPham.setHorizontalGroup(
			gl_pnlRightLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightLoaiSanPham.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlRightLoaiSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXoa, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
						.addComponent(btnThemMoi, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlRightLoaiSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(btnXoaTrang, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
						.addComponent(btnCapNhat, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_pnlRightLoaiSanPham.setVerticalGroup(
			gl_pnlRightLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightLoaiSanPham.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_pnlRightLoaiSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnThemMoi)
						.addComponent(btnCapNhat))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(gl_pnlRightLoaiSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnXoaTrang)
						.addComponent(btnXoa))
					.addGap(33))
		);
		pnlRightLoaiSanPham.setLayout(gl_pnlRightLoaiSanPham);
		
		JLabel lblMaLoai = new JLabel("Mã loại");
		lblMaLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtMaLoai = new JTextField();
		txtMaLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaLoai.setEditable(false);
		txtMaLoai.setColumns(10);
		
		JLabel lblTenLoai = new JLabel("Tên loại");
		lblTenLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTenLoai = new JTextField();
		txtTenLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenLoai.setColumns(10);
		GroupLayout gl_pnlLeftLoaiSanPham = new GroupLayout(pnlLeftLoaiSanPham);
		gl_pnlLeftLoaiSanPham.setHorizontalGroup(
			gl_pnlLeftLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLeftLoaiSanPham.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_pnlLeftLoaiSanPham.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTenLoai, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMaLoai, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlLeftLoaiSanPham.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtTenLoai, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
						.addGroup(gl_pnlLeftLoaiSanPham.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMaLoai, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pnlLeftLoaiSanPham.setVerticalGroup(
			gl_pnlLeftLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlLeftLoaiSanPham.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_pnlLeftLoaiSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMaLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMaLoai))
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_pnlLeftLoaiSanPham.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTenLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTenLoai, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(30))
		);
		pnlLeftLoaiSanPham.setLayout(gl_pnlLeftLoaiSanPham);
		setLayout(gl_pnlLoaiSanPham);
	}

}
