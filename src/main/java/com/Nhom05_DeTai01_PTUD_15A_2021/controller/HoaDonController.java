package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.HoaDonDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.HoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;

@Service
public class HoaDonController {

	@Autowired
	private HoaDonDAO hoaDonDAO;

	public void loadHoaDon(DefaultTableModel listHoaDon){
		List<HoaDon> list = hoaDonDAO.findAll();
		listHoaDon.setRowCount(0);
		HoaDon hoaDon;		
		for (int i = 0; i < list.size(); i++) {
			hoaDon = list.get(i);
			Object[] row = {hoaDon.getMaHoaDon(),hoaDon.getNgayLapHoaDon(),hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(),hoaDon.getTongTien()};
			listHoaDon.addRow(row);
		}
	}

	public HoaDon getHoaDonById(String id) {
		return hoaDonDAO.findById(id).get();
	}

	public void search(DefaultTableModel listHoaDon, String maNV, String maKH) {
		listHoaDon.setRowCount(0);
		List<HoaDon> list;
		if(maNV.equals(maKH))
			list = hoaDonDAO.findAll();
		else
			list = hoaDonDAO.searchHoaDonByNVKH(maNV, maKH);
		for (Iterator<HoaDon> iterator = list.iterator(); iterator.hasNext();) {
			HoaDon hoaDon = iterator.next();
			Object[] row = {hoaDon.getMaHoaDon(),hoaDon.getNgayLapHoaDon(),hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(),hoaDon.getTongTien()};
			listHoaDon.addRow(row);
		}
	}

	public void xoaHoaDon(String id) {
		hoaDonDAO.deleteById(id);
	}

	public void capNhanHoaDon(String maHD, KhachHang khachHang, NhanVien nhanVienById, Date date) {
		HoaDon hoaDon = getHoaDonById(maHD);
		hoaDon.setKhachHang(khachHang);
		hoaDon.setNhanVien(nhanVienById);
		hoaDon.setNgayLapHoaDon(date);
		hoaDonDAO.save(hoaDon);
	}

	public HoaDon lapHoaDon(HoaDon hoaDon) {
		return hoaDonDAO.save(hoaDon);
	}
}
