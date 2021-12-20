/**
 * Tác giả: Nguyễn Viết Hoàng,Trương Nhật Long - mssv:19473871,18036331 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng Chi_Tiet_Hoa_Don trong cơ sở dữ liệu
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
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
	/**
	 * Load thông tin chi tiết hóa đơn từ cơ sở dữ liệu vào table chi tiết hóa đơn
	 * 
	 * @param listCTHD,id
	 */
	public void loadData(DefaultTableModel listCTHD, String id) {
		listCTHD.setRowCount(0);
		List<ChiTietHoaDon> list = chiTietHoaDonDAO.findByMaHoaDon(id);
		SanPham sanPham;
		for (Iterator<ChiTietHoaDon> iterator = list.iterator(); iterator.hasNext();) {
			ChiTietHoaDon chiTietHoaDon = iterator.next();
			sanPham = chiTietHoaDon.getSanPham();
			String[] row = {sanPham.getMaSanPham(),sanPham.getTenSanPham(),sanPham.getNhaCungCap().getTenNCC(),
					chiTietHoaDon.getSoLuong()+"",sanPham.getSize(),sanPham.getMauSac(),chiTietHoaDon.getDonGia()+""};
			listCTHD.addRow(row);
		}
	}
	/**
	 * Hàm dùng để delete 1 chi tiết hóa đơn trong cơ sở dữ liệu
	 * 
	 * @param maHD,maSP
	 * @return 
	 */
	public void xoaCTHD(String maHD, String maSP) {
		chiTietHoaDonDAO.deleteById(new ChiTietHoaDon_PK(maHD,maSP));
	}
	/**
	 * Hàm dùng lấy 1 thông tin chi tiết hóa đơn theo mã hóa đơn,mã sản phẩm trong cơ sở dữ liệu
	 * 
	 * @param maHD,maSP
	 * @return ChiTietHoaDon
	 */
	public ChiTietHoaDon getCTHDByHDSP(String maHD, String maSP) {
		return chiTietHoaDonDAO.getById(new ChiTietHoaDon_PK(maHD, maSP));
	}
	/**
	 * Hàm dùng lấy 1 thông tin chi tiết hóa đơn theo mã hóa đơn trong cơ sở dữ liệu
	 * 
	 * @param maHD
	 * @return ChiTietHoaDon
	 */
	public ChiTietHoaDon getCTHDByHD(String maHD) {
		return chiTietHoaDonDAO.findByMaHoaDon(maHD).get(0);
	}
	/**
	 * Hàm dùng update 1 thông tin chi tiết hóa đơn trong cơ sở dữ liệu
	 * 
	 * @param cthd,sl,gt
	 * @return
	 */
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
