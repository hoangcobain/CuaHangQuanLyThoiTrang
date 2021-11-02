package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class SanPham {

	@Id
	@Column(columnDefinition = "VARCHAR(10)")
	@GeneratedValue(generator = "SPGenerator")
	@GenericGenerator(name = "SPGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.SanPhamGenerator")
	private String maSanPham;
	
	@Column(nullable = false, columnDefinition = "VARCHAR(30)")
	private String tenSanPham;
	private double giaThanh;
	@Column(nullable = true, columnDefinition = "VARCHAR(30)")
	private String tenNhaCungCap;
	private int soLuong;
	
	
	
	@ElementCollection
	@CollectionTable(name = "thuoc_tinh", joinColumns = @JoinColumn(name = "ma_san_pham"))
	private Set<ThuocTinh> listThuocTinh = new HashSet<ThuocTinh>();
	
	@ManyToOne
	@JoinColumn(name = "maLoaiSanPham", nullable = false)
	private LoaiSanPham loaiSanPham;
	
	@OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL)
	private List<ChiTietHoaDon> listChiTietHoaDons = new ArrayList<ChiTietHoaDon>();
	
	@Column(columnDefinition = "varbinary(MAX)")
	private byte[] hinh;

	public SanPham() {
		// TODO Auto-generated constructor stub
	}

//	public SanPham(String tenSanPham, double giaThanh, String tenNhaCungCap, int soLuong, Set<ThuocTinh> listThuocTinh,
//			LoaiSanPham loaiSanPham) {
//		super();
//		this.tenSanPham = tenSanPham;
//		this.giaThanh = giaThanh;
//		this.tenNhaCungCap = tenNhaCungCap;
//		this.soLuong = soLuong;
//		this.listThuocTinh = listThuocTinh;
//		this.loaiSanPham = loaiSanPham;
//	}
	
	public SanPham(String tenSanPham, double giaThanh, String tenNhaCungCap, int soLuong, Set<ThuocTinh> listThuocTinh,
			LoaiSanPham loaiSanPham, byte[] hinh) {
		super();
		this.tenSanPham = tenSanPham;
		this.giaThanh = giaThanh;
		this.tenNhaCungCap = tenNhaCungCap;
		this.soLuong = soLuong;
		this.listThuocTinh = listThuocTinh;
		this.loaiSanPham = loaiSanPham;
		this.hinh = hinh;
	}
	

	
	
	public byte[] getHinh() {
		return hinh;
	}




	public void setHinh(byte[] hinh) {
		this.hinh = hinh;
	}

	/**
	 * @return the maSanPham
	 */
	public String getMaSanPham() {
		return maSanPham;
	}



	/**
	 * @param maSanPham the maSanPham to set
	 */
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	/**
	 * @return the tenSanPham
	 */
	public String getTenSanPham() {
		return tenSanPham;
	}

	/**
	 * @param tenSanPham the tenSanPham to set
	 */
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	/**
	 * @return the giaThanh
	 */
	public double getGiaThanh() {
		return giaThanh;
	}

	/**
	 * @param giaThanh the giaThanh to set
	 */
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	/**
	 * @return the tenNhaCungCap
	 */
	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}

	/**
	 * @param tenNhaCungCap the tenNhaCungCap to set
	 */
	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}

	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}

	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	/**
	 * @return the listThuocTinh
	 */
	public Set<ThuocTinh> getListThuocTinh() {
		return listThuocTinh;
	}

	/**
	 * @param listThuocTinh the listThuocTinh to set
	 */
	public void setListThuocTinh(Set<ThuocTinh> listThuocTinh) {
		this.listThuocTinh = listThuocTinh;
	}

	/**
	 * @return the loaiSanPham
	 */
	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}

	/**
	 * @param loaiSanPham the loaiSanPham to set
	 */
	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	/**
	 * @return the listChiTietHoaDons
	 */
	public List<ChiTietHoaDon> getListChiTietHoaDons() {
		return listChiTietHoaDons;
	}

	/**
	 * @param listChiTietHoaDons the listChiTietHoaDons to set
	 */
	public void setListChiTietHoaDons(List<ChiTietHoaDon> listChiTietHoaDons) {
		this.listChiTietHoaDons = listChiTietHoaDons;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", giaThanh=" + giaThanh
				+ ", tenNhaCungCap=" + tenNhaCungCap + ", soLuong=" + soLuong + ", listThuocTinh=" + listThuocTinh
				+ ", loaiSanPham=" + loaiSanPham + "]";
	}
	
	
}
