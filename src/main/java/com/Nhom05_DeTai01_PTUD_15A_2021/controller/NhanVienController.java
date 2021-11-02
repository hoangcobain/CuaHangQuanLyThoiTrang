package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.NhanVienDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;

@Service
public class NhanVienController {
	@Autowired
	private NhanVienDAO nhanVienDAO;

	public void searchNhanVien(DefaultTableModel listNhanVien, String ten, String sdt, String email) {
		List<NhanVien> list;
		if(ten.equals(sdt) && ten.equals(email))
			list = nhanVienDAO.findAll();
		else
			list = nhanVienDAO.search(ten, sdt, email);
		listNhanVien.setRowCount(0);
		for (Iterator<NhanVien> iterator = list.iterator(); iterator.hasNext();) {
			NhanVien nhanVien = iterator.next();
			String[] row = {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getSoDienThoai(),nhanVien.getEmail().toString()};
			listNhanVien.addRow(row);
		}
	}

	public NhanVien getNhanVienById(String id) {
		return nhanVienDAO.findById(id).get();
	}

	public void loadNhanVien(DefaultTableModel listNhanVien) {
		listNhanVien.setRowCount(0);
		List<NhanVien> list = nhanVienDAO.findAll();
		for (Iterator<NhanVien> iterator = list.iterator(); iterator.hasNext();) {
			NhanVien nhanVien = iterator.next();
			String gioiTinh = "Nam";
			if(nhanVien.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getSoDienThoai(),nhanVien.getDiaChi(),
					nhanVien.getEmail().toString(),gioiTinh
			};
			listNhanVien.addRow(row);
		}
	}
	public void loadTKNVTheoSDT(JComboBox<String> cmbTimKiemKH) {
		List<NhanVien> listL = nhanVienDAO.findAll();
		cmbTimKiemKH.removeAllItems();
		for (Iterator<NhanVien> iterator  = listL.iterator(); iterator.hasNext();) {
			NhanVien nhanVien = iterator.next();
			cmbTimKiemKH.addItem(nhanVien.getSoDienThoai());
		}	
	}
	
	public void searchNhanVienBySDT(DefaultTableModel listNhanVien, String sdt) {
		List<NhanVien> list = nhanVienDAO.searchBySDTNV(sdt);
		listNhanVien.setRowCount(0);
		for (Iterator<NhanVien> iterator = list.iterator(); iterator.hasNext();) {
			NhanVien nhanVien = (NhanVien) iterator.next();
			String gioiTinh = "Nam";
			if(nhanVien.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getSoDienThoai(),nhanVien.getDiaChi(),
							nhanVien.getEmail().toString(),gioiTinh};
			listNhanVien.addRow(row);
		}
	}
	public NhanVien saveNhanVien(NhanVien nhanVien) {
		return nhanVienDAO.save(nhanVien);
	}

}
