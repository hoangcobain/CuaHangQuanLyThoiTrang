package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;


import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.KhachHangDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;

@Service
public class KhachHangController {
	@Autowired
	private KhachHangDAO khachHangDAO;
	

	public void searchKhachHang(DefaultTableModel listKhachHang, String ten, String sdt, int gioiTinh) {
		List<KhachHang> list = khachHangDAO.search(ten, sdt, gioiTinh);
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String[] row = {khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.getSoDienThoai(),khachHang.getDiaChi()};
			listKhachHang.addRow(row);
		}
	}
	
	public KhachHang getKhachHang(String id) {
		return khachHangDAO.findById(id).get();
	}

	public List<KhachHang> getKhachHangs() {
		return khachHangDAO.findAll();
	}
	
	public void loadTKKH(JComboBox<String> cmbTimKiemKH) {
		List<KhachHang> listL = khachHangDAO.findAll();
		cmbTimKiemKH.removeAllItems();
		for (Iterator<KhachHang> iterator = listL.iterator(); iterator.hasNext();) {
			KhachHang khachHang = iterator.next();
			cmbTimKiemKH.addItem(khachHang.getMaKhachHang());
		}	
	}
	public void loadTKKHTheoSDT(JComboBox<String> cmbTimKiemKH) {
		List<KhachHang> listL = khachHangDAO.findAll();
		cmbTimKiemKH.removeAllItems();
		for (Iterator<KhachHang> iterator = listL.iterator(); iterator.hasNext();) {
			KhachHang khachHang = iterator.next();
			cmbTimKiemKH.addItem(khachHang.getSoDienThoai());
		}	
	}

	public void loadKhachHang(DefaultTableModel listKhachHang) {
		List<KhachHang> list = khachHangDAO.findAll();
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String gioiTinh = "Nam";
			if(khachHang.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = {khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.getSoDienThoai()
					,khachHang.getDiaChi(),gioiTinh};
			listKhachHang.addRow(row);
		}
	}
	
//	public void searchKhachHangById(DefaultTableModel listKhachHang, String id) {
//		List<KhachHang> list = khachHangDAO.searchHoaDonByKH(id);
//		listKhachHang.setRowCount(0);
//		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
//			KhachHang khachHang = (KhachHang) iterator.next();
//			String[] row = {khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.getSoDienThoai(),khachHang.getDiaChi()};
//			listKhachHang.addRow(row);
//		}
//	}
	public void searchKhachHangBySDT(DefaultTableModel listKhachHang, String sdt) {
		List<KhachHang> list = khachHangDAO.searchHoaDonBySDT(sdt);
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String[] row = {khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.getSoDienThoai(),khachHang.getDiaChi()};
			listKhachHang.addRow(row);
		}
	}
	
	
	
	public KhachHang themKhachHang(KhachHang khachHang) {
		return khachHangDAO.save(khachHang);
	}



}
