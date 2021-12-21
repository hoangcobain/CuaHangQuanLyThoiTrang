/**
 * Tác giả: Nguyễn Viết Hoàng,Lê Hoàng Long - mssv:19473871,19439111 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng San_Pham trong cơ sở dữ liệu
 */
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
	
	/**
	 * Lấy sản phẩm theo tên,nhà cung cấp,kích cỡ,màu sắc từ cơ sở dữ liệu và load lên table
	 * 
	 * @param listSanPham,ten,ncc,size,mauSac
	 * @return 
	 */
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
	/**
	 * Lấy sản phẩm theo tên sản phẩm từ cơ sở dữ liệu và load lên table
	 * 
	 * @param listSanPham,ten
	 * @return 
	 */
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
	/**
	 * Tìm sản phẩm theo giá từ cơ sở dữ liệu và load lên table
	 * 
	 * @param giatu,dentu
	 * @return 
	 */
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
	/**
	 * Tìm sản phẩm theo kích cỗ từ cơ sở dữ liệu và load lên table
	 * 
	 * @param giatu,dentu
	 * @return 
	 */
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
	/**
	 * Lấy 1 sản phẩm theo mã từ cơ sở dữ liệu
	 * 
	 * @param maSP
	 * @return SanPham
	 */
	public SanPham getSanPham(String maSP) {
		return sanPhamDAO.findById(maSP).orElse(null);
	}
	/**
	 * Load thông tin sản phẩm từ cơ sở dữ liệu vào table sản phẩm
	 * 
	 * @param cmbTenLoai,cmbTenNCC,listSanPham
	 * @return 
	 */
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
	/**
	 * Lấy sản phẩm theo tên bằng combobox trong cơ sở dữ liệu và load lên table
	 * 
	 * @param cmbTen,listSanPham
	 * @return 
	 */
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
	/**
	 * Lấy sản phẩm theo kích cỡ bằng combobox trong cơ sở dữ liệu và load lên table
	 * 
	 * @param cmbTen,listSanPham
	 * @return 
	 */
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
	/**
	 * Hàm dùng để insert 1 sản phẩm vào cơ sở dữ liệu
	 * 
	 * @param sanPham
	 * @return SanPham
	 */
	public SanPham saveSP(SanPham sanPham) {
		return sanPhamDAO.save(sanPham);
	}
	/**
	 * Hàm dùng để delete 1 sản phẩm trong cơ sở dữ liệu
	 * 
	 * @param text
	 * @return 
	 */
	public void xoaSanPham(String text) {
		sanPhamDAO.deleteById(text);
	}
	/**
	 * Hàm dùng để đếm số lượng sản phẩm có trong cơ sở dữ liệu
	 * 
	 * @return long
	 */
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
