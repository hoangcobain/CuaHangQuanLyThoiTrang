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

	public void load(DefaultTableModel listLoaiSP) {
		listLoaiSP.setRowCount(0);
		List<LoaiSanPham> list = loaiSanPhamDAO.findAll();
		for (Iterator<LoaiSanPham> iterator = list.iterator(); iterator.hasNext();) {
			LoaiSanPham loaiSanPham = iterator.next();
			String[] row = {loaiSanPham.getMaLoaiSanPham(),loaiSanPham.getTenLoaiSanPham()};
			listLoaiSP.addRow(row);
		}
	}

	public LoaiSanPham save(LoaiSanPham loaiSanPham) {
		try {
			loaiSanPham = loaiSanPhamDAO.save(loaiSanPham);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tên Loại Sản Phẩm Lỗi: " + e.getMessage());
		}
		
		return loaiSanPham;
	}

	public void xoaLSP(String text) {
		if(text.equals(""))
			return;
		loaiSanPhamDAO.deleteById(text);
	}

	public LoaiSanPham getLoaiSPByName(String name) {
		return loaiSanPhamDAO.findLoaiSPByName(name).get(0);
	}
}
