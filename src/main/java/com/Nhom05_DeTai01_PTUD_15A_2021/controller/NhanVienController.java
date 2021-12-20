/**
 * Tác giả: Đoàn Thế Long,Trương Nhật Long - mssv:19473871,18036331 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng Nhan_Vien trong cơ sở dữ liệu
 */
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
	/**
	 * Lấy 1 nhân viên theo mã
	 * 
	 * @param id
	 * @return NhanVien
	 */
	public NhanVien getNhanVienById(String id) {
		return nhanVienDAO.findById(id).get();
	}

	/**
	 * Load thông tin nhân viên từ cơ sở dữ liệu vào table nhân viên
	 * 
	 * @param listNhanVien,cmbTimKiemKH
	 * @return 
	 */
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
	/**
	 * Lấy nhân viên theo sdt, tên từ cơ sở dữ liệu và load lên table
	 * 
	 * @param sdt,ten
	 * @return 
	 */
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
	/**
	 * Hàm dùng để insert 1 nhân viên vào cơ sở dữ liệu
	 * 
	 * @param nv tham số truyền vào là NhanVien
	 * @return NhanVien
	 */
	public NhanVien saveNhanVien(NhanVien nhanVien) {
		return nhanVienDAO.save(nhanVien);
	}
	/**
	 * Lấy 1 nhân viên theo email từ cơ sở dữ liệu 
	 * 
	 * @param email
	 * @return NhanVien
	 */
	public NhanVien getNhanVienByEmail(String email) {
		List<NhanVien> list = nhanVienDAO.findByEmail(email);
		nhanVien = null;
		if (list.size()!=0) {
			nhanVien = list.get(0);
		}		
		return nhanVien;
	}
	/**
	 * lấy tất cả nhân viên hiện có trong csdl
	 * 
	 * @return danh sách nhân viên
	 */
	public List<NhanVien> getAll() {
		return nhanVienDAO.findAll();
	}

}
