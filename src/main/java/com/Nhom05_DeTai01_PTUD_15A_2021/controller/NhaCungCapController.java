/**
 * Tác giả: Nguyễn Viết Hoàng - mssv:19473871 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng Nha_Cung_Cap trong cơ sở dữ liệu
 */
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
	/**
	 * Lấy thông tin nhà cung cấp theo tên nhà cung cấp từ cơ sở dữ liệu
	 * 
	 * @param name
	 * @return NhaCungCap
	 */
	public NhaCungCap getNCCByName(String name) {
		return nhaCungCapDAO.findNCCByName(name).get(0);
	}
	/**
	 * Load thông tin nhà cung cấp từ cơ sở dữ liệu vào table nhà cung cấp
	 * 
	 * @param listNCC,cmbTimKiem
	 * @return 
	 */
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
	/**
	 * Lấy thông tin nhà cung cấp theo tên,số điện thoại nhà cung cấp từ cơ sở dữ liệu vào table nhà cung cấp
	 * 
	 * @param listNhaCC,sdt,ten
	 * @return 
	 */
	public void searchNCC(DefaultTableModel listNhaCC, String sdt,String ten) {
		List<NhaCungCap> list = nhaCungCapDAO.searchNCCBySDTAndName(sdt, ten);
		listNhaCC.setRowCount(0);
		for (Iterator<NhaCungCap> iterator = list.iterator(); iterator.hasNext();) {
			NhaCungCap nhaCC = iterator.next();
			String[] row = { nhaCC.getMaNhaCungCap(), nhaCC.getTenNCC(), nhaCC.getDiaChi(), nhaCC.getSoDienThoai()};
			listNhaCC.addRow(row);
		}
	}
	/**
	 * Hàm dùng để insert 1 nhà cung cấp vào cơ sở dữ liệu
	 * 
	 * @param nhaCungCap
	 * @return NhaCungCap
	 */
	public NhaCungCap save(NhaCungCap nhaCungCap) {
		try {
			nhaCungCap = nhaCungCapDAO.save(nhaCungCap);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tên nhà cung cấp lỗi: " + e.getMessage());
		}
		
		return nhaCungCap;
	}
	/**
	 * Lấy thông tin nhà cung cấp theo mã 
	 * 
	 * @param id
	 * @return NhaCungCap
	 */
	public NhaCungCap getNhaCCById(String id) {
		return nhaCungCapDAO.findById(id).get();
	}
}
