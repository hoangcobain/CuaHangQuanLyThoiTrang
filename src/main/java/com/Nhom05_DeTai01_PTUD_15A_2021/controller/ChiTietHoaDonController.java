package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.ChiTietHoaDonDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.ChiTietHoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.ChiTietHoaDon_PK;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.SanPham;

@Service
public class ChiTietHoaDonController {
	@Autowired
	private ChiTietHoaDonDAO chiTietHoaDonDAO;

	public void loadData(DefaultTableModel listCTHD, String id) {
		listCTHD.setRowCount(0);
		List<ChiTietHoaDon> list = chiTietHoaDonDAO.findByMaHoaDon(id);
		SanPham sanPham;
		for (Iterator<ChiTietHoaDon> iterator = list.iterator(); iterator.hasNext();) {
			ChiTietHoaDon chiTietHoaDon = iterator.next();
			sanPham = chiTietHoaDon.getSanPham();
			String[] row = {sanPham.getMaSanPham(),sanPham.getTenSanPham(),sanPham.getNhaCungCap().getTenNCC(),
					chiTietHoaDon.getSoLuong()+"",chiTietHoaDon.getDonGia()+""};
			listCTHD.addRow(row);
		}
	}

	public void xoaCTHD(String maHD, String maSP) {
		chiTietHoaDonDAO.deleteById(new ChiTietHoaDon_PK(maHD,maSP));
	}
	
	public ChiTietHoaDon getCTHDByHDSP(String maHD, String maSP) {
		return chiTietHoaDonDAO.getById(new ChiTietHoaDon_PK(maHD, maSP));
	}

	public void capNhatCTHD(ChiTietHoaDon cthd, int sl, double gt) {
		int slc = cthd.getSanPham().getSoLuong();
		int slm = cthd.getSoLuong()+slc-sl;
		if (slm<0) {
			return;
		}
		cthd.getSanPham().setSoLuong(slm);
		cthd.setSoLuong(sl);
		cthd.setDonGia(gt);
		chiTietHoaDonDAO.save(cthd);
	}	
}
