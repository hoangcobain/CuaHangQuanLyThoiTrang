package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.time.Month;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.HoaDonDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.HoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.HomePageUI;

@Service
public class HoaDonController {

	@Autowired
	private HoaDonDAO hoaDonDAO;

	private Logger logger = LoggerFactory.getLogger(getClass());

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

	public void search(DefaultTableModel listHoaDon, String maNV, String maKH, int day, int month, int year) {
		listHoaDon.setRowCount(0);
		List<HoaDon> list;
		logger.warn(day+" "+month+" "+year);
		list = hoaDonDAO.searchHoaDonByNVKH(maNV, maKH, day, month, year);
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
