package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ChiTietHoaDon_PK.class)
public class ChiTietHoaDon {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ma_hoa_don", columnDefinition = "VARCHAR(10)")
	private HoaDon hoaDon;
	
	@Id
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "ma_san_pham", columnDefinition = "VARCHAR(10)")
	private SanPham sanPham;
	
	private double donGia;
	@Column(nullable = false)
	private int soLuong;
	
	public ChiTietHoaDon() {
		// TODO Auto-generated constructor stub
	}

	public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, double donGia, int soLuong) {
		super();
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	/**
	 * @return the hoaDon
	 */
	public HoaDon getHoaDon() {
		return hoaDon;
	}

	/**
	 * @param hoaDon the hoaDon to set
	 */
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	/**
	 * @return the sanPham
	 */
	public SanPham getSanPham() {
		return sanPham;
	}

	/**
	 * @param sanPham the sanPham to set
	 */
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
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

	@Override
	public String toString() {
		return "ChiTietHoaDon [hoaDon=" + hoaDon + ", sanPham=" + sanPham + ", donGia=" + donGia + ", soLuong="
				+ soLuong + "]";
	}	
}
