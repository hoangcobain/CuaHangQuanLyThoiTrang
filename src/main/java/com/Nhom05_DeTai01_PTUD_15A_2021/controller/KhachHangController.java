package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
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
	

	public void loadKhachHang(DefaultTableModel listKhachHang,JComboBox<String> cmbTimKiemKH) {
		List<KhachHang> list = khachHangDAO.findAll();
		listKhachHang.setRowCount(0);
		cmbTimKiemKH.removeAllItems();
		cmbTimKiemKH.setModel(new DefaultComboBoxModel<String>(new String[] {"---Tìm theo tên,số điện thoại---"}));
		cmbTimKiemKH.setEditable(true);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String gioiTinh = "Nam";
			if(khachHang.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = {khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.getSoDienThoai()
					,khachHang.getDiaChi(),gioiTinh};
				cmbTimKiemKH.addItem(khachHang.getSoDienThoai());
				cmbTimKiemKH.addItem(khachHang.getTenKhachHang());
				listKhachHang.addRow(row);			
		}
	}
	
	
	public void searchKhachHangBySDT(DefaultTableModel listKhachHang, String sdt,String ten) {
		List<KhachHang> list = khachHangDAO.searchHoaDonBySDT(sdt,ten);
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String gioiTinh = "Nam";
			if(khachHang.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = {khachHang.getMaKhachHang(),khachHang.getTenKhachHang(),khachHang.getSoDienThoai(),khachHang.getDiaChi(),gioiTinh};
			listKhachHang.addRow(row);
		}
	}
	
	
	
	public KhachHang themKhachHang(KhachHang khachHang) {
		return khachHangDAO.save(khachHang);
	}



}
