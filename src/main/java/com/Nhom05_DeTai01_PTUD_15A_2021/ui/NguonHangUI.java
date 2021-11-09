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
	protected JTextField txtDiaChi;
	protected JScrollPane scrLoaiSanPham;
	protected JTable tblLoaiSanPham;
	protected JButton btnThemMoi, btnCapNhat, btnXoa, btnXoaTrang;
	protected DefaultTableModel listLoaiSP;
	protected JComboBox cmbTimKiem;
	private JTextField txtSDT;
	private JLabel lblTim;
	

	/**
	 * Create the panel.
	 */
	public NguonHangUI() {
		setBackground(Color.WHITE);
		JPanel pnlRightNguonHang = new JPanel();
		pnlRightNguonHang.setBackground(new Color(255, 105, 180));
		
		scrLoaiSanPham = new JScrollPane();
		GroupLayout gl_pnlLoaiSanPham = new GroupLayout(this);
		gl_pnlLoaiSanPham.setHorizontalGroup(
			gl_pnlLoaiSanPham.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlLoaiSanPham.createSequentialGroup()
					.addComponent(scrLoaiSanPham, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlRightNguonHang, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE))
		);
		gl_pnlLoaiSanPham.setVerticalGroup(
			gl_pnlLoaiSanPham.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlLoaiSanPham.createSequentialGroup()
					.addGroup(gl_pnlLoaiSanPham.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrLoaiSanPham, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
						.addComponent(pnlRightNguonHang, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(0))
		);
		
		tblLoaiSanPham = new JTable();
		tblLoaiSanPham.setShowHorizontalLines(false);
		tblLoaiSanPham.setFont(new Font("Tahoma", Font.PLAIN, 13));
		listLoaiSP = new DefaultTableModel(null, new String[] {"Tên nguồn hàng", "Địa chỉ","Số điện thoại"});
		tblLoaiSanPham.setModel(listLoaiSP);
		scrLoaiSanPham.setViewportView(tblLoaiSanPham);
		
		JLabel lblTen = new JLabel("Tên");
		lblTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		txtTen = new JTextField();
		txtTen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTen.setEditable(false);
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
		
		btnXoa = new JButton("Xóa bỏ");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
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
		cmbTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnTim = new JButton("");
		btnTim.setIcon(new ImageIcon(NguonHangUI.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/searchNV.png")));
		GroupLayout gl_pnlRightNguonHang = new GroupLayout(pnlRightNguonHang);
		gl_pnlRightNguonHang.setHorizontalGroup(
			gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTen, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSDT, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
							.addGap(7))
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addComponent(lblTim)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_pnlRightNguonHang.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cmbTimKiem, 0, 331, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnTim, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(41))
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtSDT, Alignment.LEADING, 404, 404, 404)
								.addComponent(txtDiaChi, Alignment.LEADING, 404, 404, 404)
								.addComponent(txtTen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
							.addGap(42))))
				.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnThemMoi, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnXoaTrang, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCapNhat, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
					.addGap(58))
		);
		gl_pnlRightNguonHang.setVerticalGroup(
			gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTen)
						.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblDiaChi, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlRightNguonHang.createSequentialGroup()
							.addGap(49)
							.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblSDT, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(59)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCapNhat)
						.addComponent(btnThemMoi))
					.addGap(54)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnXoaTrang)
						.addComponent(btnXoa))
					.addGap(83)
					.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlRightNguonHang.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTim)
							.addComponent(cmbTimKiem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnTim))
					.addContainerGap(415, Short.MAX_VALUE))
		);
		pnlRightNguonHang.setLayout(gl_pnlRightNguonHang);
		setLayout(gl_pnlLoaiSanPham);
	}
}
