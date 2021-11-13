package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.LoaiSanPhamDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.dao.NhaCungCapDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.dao.SanPhamDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.LoaiSanPham;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhaCungCap;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.SanPham;

@Service
public class SanPhamController {

	@Autowired
	private SanPhamDAO sanPhamDAO;
	@Autowired
	private LoaiSanPhamDAO loaiSanPhamDAO;
	@Autowired
	private NhaCungCapDAO nhaCungCapDAO;

	public void searchByTenNCC(DefaultTableModel listSanPham, String ten, String ncc, String size, String mauSac) {
		listSanPham.setRowCount(0);
		List<SanPham> list;
		if (ten.equals(ncc) && ten.equals("") && size.equals("") && mauSac.equals("")) 
			list = sanPhamDAO.findAll();
		else
			list = sanPhamDAO.searchByTenNCC(ten, ncc, size, mauSac);
		for (Iterator<SanPham> iterator = list.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String[] row = {sanPham.getMaSanPham(),sanPham.getTenSanPham(),sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong()+"",sanPham.getSize(),sanPham.getMauSac(),sanPham.getGiaThanh()+""};
			listSanPham.addRow(row);
		}
	}

	public SanPham getSanPham(String maSP) {
		return sanPhamDAO.getById(maSP);
	}

	public void load(JComboBox<String> cmbTenLoai,JComboBox<String> cmbTenNCC, DefaultTableModel listSanPham) {
		List<LoaiSanPham> listL = loaiSanPhamDAO.findAll();
		
		cmbTenLoai.removeAllItems();
		cmbTenNCC.removeAllItems();
		for (Iterator<LoaiSanPham> iterator = listL.iterator(); iterator.hasNext();) {
			LoaiSanPham loaiSanPham = iterator.next();
			cmbTenLoai.addItem(loaiSanPham.getTenLoaiSanPham());
		}
		List<NhaCungCap> listC = nhaCungCapDAO.findAll();
		for (Iterator<NhaCungCap> iterator = listC.iterator(); iterator.hasNext();) {
			NhaCungCap nhaCungCap = iterator.next();
			cmbTenNCC.addItem(nhaCungCap.getTenNCC());
		}
		List<SanPham> listSP = sanPhamDAO.findAll();
		listSanPham.setRowCount(0);
		for (Iterator<SanPham> iterator = listSP.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String row[] = {sanPham.getMaSanPham(),sanPham.getTenSanPham(),sanPham.getNhaCungCap().getTenNCC(),sanPham.getSoLuong()+"",
					sanPham.getSize(),sanPham.getMauSac(),sanPham.getLoaiSanPham().getTenLoaiSanPham(),sanPham.getGiaThanh()+""
			};
			listSanPham.addRow(row);
		}		
	}

	public SanPham saveSP(SanPham sanPham) {
		return sanPhamDAO.save(sanPham);		
	}

	public void xoaSanPham(String text) {
		sanPhamDAO.deleteById(text);
	}
}
