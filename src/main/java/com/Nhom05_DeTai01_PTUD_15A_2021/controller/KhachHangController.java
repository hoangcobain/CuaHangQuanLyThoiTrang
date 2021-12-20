/**
 * Tác giả: Nguyễn Viết Hoàng,Đoàn Thế Long - mssv:19473871,19475471 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng Khach_Hang trong cơ sở dữ liệu
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import org.jfree.data.general.DefaultPieDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.KhachHangDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;

@Service
public class KhachHangController {
	@Autowired
	private KhachHangDAO khachHangDAO;
	
	/**
	 * Lấy nhân viên theo sdt, tên,giới tính từ cơ sở dữ liệu và load lên table
	 * 
	 * @param sdt,ten,gioiTinh
	 * @return 
	 */
	public void searchKhachHang(DefaultTableModel listKhachHang, String ten, String sdt, int gioiTinh) {

		List<KhachHang> list;
		if (ten.equals("") && sdt.equals(""))
			list = khachHangDAO.findAll();
		else
			list = khachHangDAO.search(ten, sdt, gioiTinh);
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String[] row = { khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getSoDienThoai(),
					khachHang.getDiaChi() };
			listKhachHang.addRow(row);
		}
	}
	/**
	 * Lấy thông tin 1 khách hàng theo mã khách hàng trong cơ sở dữ liệu
	 * 
	 * @param id
	 * @return KhachHang
	 */
	public KhachHang getKhachHang(String id) {
		return khachHangDAO.findById(id).get();
	}
	/**
	 * Lấy thông tin tất cả khách hàng trong cơ sở dữ liệu
	 * 
	 * @return danh sách khách hàng
	 */
	public List<KhachHang> getKhachHangs() {
		return khachHangDAO.findAll();
	}
	/**
	 * Load thông tin khách hàng từ cơ sở dữ liệu vào table loại sản phẩm
	 * 
	 * @param listKhachHang,cmbTimKiemKH
	 */
	public void loadKhachHang(DefaultTableModel listKhachHang, JComboBox<String> cmbTimKiemKH) {
		List<KhachHang> list = khachHangDAO.findAll();
		listKhachHang.setRowCount(0);
		cmbTimKiemKH.removeAllItems();
		cmbTimKiemKH.setModel(new DefaultComboBoxModel<String>(new String[] { "---Tìm theo tên,số điện thoại---" }));
		cmbTimKiemKH.setEditable(true);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String gioiTinh = "Nam";
			if (khachHang.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = { khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getSoDienThoai(),
					khachHang.getDiaChi(), gioiTinh };
			cmbTimKiemKH.addItem(khachHang.getSoDienThoai());
			cmbTimKiemKH.addItem(khachHang.getTenKhachHang());
			listKhachHang.addRow(row);
		}
	}
	/**
	 * Lấy thông tin khách hàng theo tên,số điện thoại khách hàng từ cơ sở dữ liệu và load lên table
	 * 
	 * @param listKhachHang,ten,sdt
	 * @return 
	 */
	public void searchKhachHangBySDT(DefaultTableModel listKhachHang, String sdt, String ten) {
		List<KhachHang> list = khachHangDAO.searchHoaDonBySDT(sdt, ten);
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String gioiTinh = "Nam";
			if (khachHang.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = { khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getSoDienThoai(),
					khachHang.getDiaChi(), gioiTinh };
			listKhachHang.addRow(row);
		}
	}
	/**
	 * Hàm dùng để insert 1 khách hàng vào cơ sở dữ liệu
	 * 
	 * @param khachHang
	 * @return KhachHang
	 */
	public KhachHang themKhachHang(KhachHang khachHang) {
		return khachHangDAO.save(khachHang);
	}
	/**
	 * Hàm dùng để đếm số lượng khách hàng có trong cơ sở dữ liệu
	 * 
	 * @return long
	 */
	public long soLuongKhachHang() {
		return khachHangDAO.count();
	}

	public void loadThongKe(DefaultTableModel listKhachHang, DefaultPieDataset dataset) {
		List<KhachHang> list = khachHangDAO.findAll();
		listKhachHang.setRowCount(0);
		for (Iterator<KhachHang> iterator = list.iterator(); iterator.hasNext();) {
			KhachHang khachHang = (KhachHang) iterator.next();
			String gioiTinh = "Nam";
			if (khachHang.isGioiTinh())
				gioiTinh = "Nữ";
			String[] row = { khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getSoDienThoai(),
					khachHang.getDiaChi(), gioiTinh };
			listKhachHang.addRow(row);
		}
		dataset.clear();
		dataset.setValue("Nam", khachHangDAO.countByGioiTinh(false));
		dataset.setValue("Nữ", khachHangDAO.countByGioiTinh(true));
	}

}
