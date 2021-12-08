package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import org.jfree.data.category.DefaultCategoryDataset;
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
			String[] row = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(), sanPham.getGiaThanh() + "" };
			listSanPham.addRow(row);
		}
	}

	public void searchByTenSP(DefaultTableModel listSanPham, String ten) {
		listSanPham.setRowCount(0);
		List<SanPham> list = sanPhamDAO.searchSPByTen(ten);
		for (Iterator<SanPham> iterator = list.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String[] row = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			listSanPham.addRow(row);
		}
	}

	public void searchByGiaThanh(DefaultTableModel listSanPham, double giatu, double dentu) {
		listSanPham.setRowCount(0);
		List<SanPham> list = sanPhamDAO.searchSPByPrice(giatu, dentu);
		for (Iterator<SanPham> iterator = list.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String[] row = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			listSanPham.addRow(row);
		}
	}

	public void searchBySize(DefaultTableModel listSanPham, String size) {
		listSanPham.setRowCount(0);
		List<SanPham> list = sanPhamDAO.searchSPBySize(size);
		for (Iterator<SanPham> iterator = list.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String[] row = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			listSanPham.addRow(row);
		}
	}

	public SanPham getSanPham(String maSP) {
		return sanPhamDAO.getById(maSP);
	}

	public void load(JComboBox<String> cmbTenLoai, JComboBox<String> cmbTenNCC, DefaultTableModel listSanPham) {
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
			String row[] = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			listSanPham.addRow(row);
		}
		cmbTenLoai.setSelectedIndex(0);
		cmbTenNCC.setSelectedIndex(0);
	}

	public void TimKiemTheoTen(JComboBox<String> cmbTen, DefaultTableModel listSanPham) {
		List<SanPham> listSP = sanPhamDAO.findAll();
		cmbTen.removeAllItems();
		listSanPham.setRowCount(0);
		cmbTen.setModel(new DefaultComboBoxModel<String>(new String[] { "---Tìm theo tên---" }));
		for (Iterator<SanPham> iterator = listSP.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String row[] = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			cmbTen.addItem(sanPham.getTenSanPham());
			listSanPham.addRow(row);
		}
	}

	public void TimKiemTheoSize(JComboBox<String> cmbTen, DefaultTableModel listSanPham) {
		List<SanPham> listSP = sanPhamDAO.findAll();
		cmbTen.removeAllItems();
		listSanPham.setRowCount(0);
		cmbTen.setModel(new DefaultComboBoxModel<String>(new String[] { "---Tìm theo size---" }));
		for (Iterator<SanPham> iterator = listSP.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String row[] = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			cmbTen.addItem(sanPham.getSize());
			listSanPham.addRow(row);
		}
	}

	public SanPham saveSP(SanPham sanPham) {
		return sanPhamDAO.save(sanPham);
	}

	public void xoaSanPham(String text) {
		sanPhamDAO.deleteById(text);
	}

	public long soLuongSanPham() {
		return sanPhamDAO.count();
	}

	public void loadThongKe(DefaultTableModel listSanPham, DefaultCategoryDataset defaultCategoryDataset,
			List<LoaiSanPham> list) {
		List<SanPham> listSP = sanPhamDAO.findAll();
		listSanPham.setRowCount(0);
		for (Iterator<SanPham> iterator = listSP.iterator(); iterator.hasNext();) {
			SanPham sanPham = iterator.next();
			String row[] = { sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getNhaCungCap().getTenNCC(),
					sanPham.getSoLuong() + "", sanPham.getSize(), sanPham.getMauSac(),
					sanPham.getLoaiSanPham().getTenLoaiSanPham(), sanPham.getGiaThanh() + "" };
			listSanPham.addRow(row);
		}

		defaultCategoryDataset.clear();
		list.forEach(LoaiSanPham -> {
			defaultCategoryDataset.addValue(sanPhamDAO.countByLoaiSanPham(LoaiSanPham), "SAN PHAM",
					LoaiSanPham.getTenLoaiSanPham());
		});

	}
}
