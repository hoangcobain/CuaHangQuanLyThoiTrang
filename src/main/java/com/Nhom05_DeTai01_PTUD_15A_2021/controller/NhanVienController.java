package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
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
	private NhanVien nhanVien;
	public NhanVien getNhanVien() {
		return nhanVien;
	}

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


	public void loadNhanVien(DefaultTableModel listNhanVien,JComboBox<String> cmbTimKiemKH) {
		listNhanVien.setRowCount(0);
		List<NhanVien> list = nhanVienDAO.findAll();
		cmbTimKiemKH.removeAllItems();
		cmbTimKiemKH.setModel(new DefaultComboBoxModel<String>(new String[] {"---Tìm theo tên,số điện thoại---"}));
		cmbTimKiemKH.setEditable(true);
		for (Iterator<NhanVien> iterator = list.iterator(); iterator.hasNext();) {
			NhanVien nhanVien = iterator.next();
			String gioiTinh = "Nam";
			if(nhanVien.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getSoDienThoai(),nhanVien.getDiaChi(),
					nhanVien.getEmail().toString(),gioiTinh
			};
			cmbTimKiemKH.addItem(nhanVien.getSoDienThoai());
			cmbTimKiemKH.addItem(nhanVien.getTenNhanVien());
			listNhanVien.addRow(row);
		}
	}
	public void searchNhanVienBySDT(DefaultTableModel listNhanVien, String sdt,String ten) {
		List<NhanVien> list = nhanVienDAO.searchBySDTNV(sdt, ten);
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

	public NhanVien getNhanVienByEmail(String email) {
		List<NhanVien> list = nhanVienDAO.findByEmail(email);
		nhanVien = null;
		if (list.size()!=0) {
			nhanVien = list.get(0);
		}		
		return nhanVien;
	}

}
