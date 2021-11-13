package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.NhaCungCapDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.LoaiSanPham;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhaCungCap;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;

@Service
public class NhaCungCapController {
	
	@Autowired
	NhaCungCapDAO nhaCungCapDAO;
	
	public NhaCungCap getNCCByName(String name) {
		return nhaCungCapDAO.findNCCByName(name).get(0);
	}
	
	public void load(DefaultTableModel listNCC,JComboBox<String> cmbTimKiem) {
		listNCC.setRowCount(0);
		List<NhaCungCap> list = nhaCungCapDAO.findAll();
		cmbTimKiem.removeAllItems();
		cmbTimKiem.setModel(new DefaultComboBoxModel<String>(new String[] {"---Tìm theo tên,số điện thoại---"}));
		for (Iterator<NhaCungCap> iterator = list.iterator(); iterator.hasNext();) {
			NhaCungCap nhaCC = iterator.next();
			String[] row = {nhaCC.getMaNhaCungCap(),nhaCC.getTenNCC(),nhaCC.getDiaChi(),nhaCC.getSoDienThoai()};
			cmbTimKiem.addItem(nhaCC.getTenNCC());
			cmbTimKiem.addItem(nhaCC.getSoDienThoai());
			listNCC.addRow(row);
		}
	}
	public void searchNCC(DefaultTableModel listNhaCC, String sdt,String ten) {
		List<NhaCungCap> list = nhaCungCapDAO.searchNCCBySDTAndName(sdt, ten);
		listNhaCC.setRowCount(0);
		for (Iterator<NhaCungCap> iterator = list.iterator(); iterator.hasNext();) {
			NhaCungCap nhaCC = iterator.next();
			String[] row = { nhaCC.getMaNhaCungCap(), nhaCC.getTenNCC(), nhaCC.getDiaChi(), nhaCC.getSoDienThoai()};
			listNhaCC.addRow(row);
		}
	}

	public NhaCungCap save(NhaCungCap nhaCungCap) {
		try {
			nhaCungCap = nhaCungCapDAO.save(nhaCungCap);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tên nhà cung cấp lỗi: " + e.getMessage());
		}
		
		return nhaCungCap;
	}
	public NhaCungCap getNhaCCById(String id) {
		return nhaCungCapDAO.findById(id).get();
	}
}
