/**
 * Tác giả: Nguyễn Viết Hoàng,Lê Hoàng Long - mssv:19473871,19439111 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng Loai_San_Pham trong cơ sở dữ liệu
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.LoaiSanPhamDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.LoaiSanPham;

@Service
public class LoaiSanPhamController {

	@Autowired
	LoaiSanPhamDAO loaiSanPhamDAO;
	/**
	 * Load thông tin loại sản phẩm từ cơ sở dữ liệu vào table loại sản phẩm
	 * 
	 * @param listLoaiSP
	 * @return 
	 */
	public void load(DefaultTableModel listLoaiSP) {
		listLoaiSP.setRowCount(0);
		List<LoaiSanPham> list = loaiSanPhamDAO.findAll();
		for (Iterator<LoaiSanPham> iterator = list.iterator(); iterator.hasNext();) {
			LoaiSanPham loaiSanPham = iterator.next();
			String[] row = {loaiSanPham.getMaLoaiSanPham(),loaiSanPham.getTenLoaiSanPham()};
			listLoaiSP.addRow(row);
		}
	}
	/**
	 * Hàm dùng để insert 1 loại sản phẩm vào cơ sở dữ liệu
	 * 
	 * @param loaiSanPham
	 * @return LoaiSanPham
	 */
	public LoaiSanPham save(LoaiSanPham loaiSanPham) {
		try {
			loaiSanPham = loaiSanPhamDAO.save(loaiSanPham);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tên Loại Sản Phẩm Lỗi: " + e.getMessage());
		}
		
		return loaiSanPham;
	}
	/**
	 * Hàm dùng để delete 1 loại sản phẩm trong cơ sở dữ liệu
	 * 
	 * @param text
	 * @return 
	 */
	public void xoaLSP(String text) {
		if(text.equals(""))
			return;
		loaiSanPhamDAO.deleteById(text);
	}
	/**
	 * Lấy 1 thông tin loại sản phẩm  theo tên loại
	 * 
	 * @param name
	 * @return LoaiSanPham
	 */
	public LoaiSanPham getLoaiSPByName(String name) {
		return loaiSanPhamDAO.findLoaiSPByName(name).get(0);
	}
	/**
	 * Lấy hết thông tin loại sản phảm
	 * 
	 * @return danh sách loại sản phẩm
	 */
	public List<LoaiSanPham> getAll() {
		return loaiSanPhamDAO.findAll();
	}
}
