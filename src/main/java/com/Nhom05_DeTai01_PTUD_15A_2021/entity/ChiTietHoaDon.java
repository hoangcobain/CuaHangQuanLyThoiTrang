/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:19/10/2021
 * Mô tả: Lớp thực thể chi tiết hóa đơn
 */
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

	@Column(nullable = true)
	private double khuyenMai;

	@Column(nullable = true)
	private double chietKhau;

	@Column(nullable = true)
	private double tienKhach;
	

	public ChiTietHoaDon() {
		// TODO Auto-generated constructor stub
	}


	
	





	public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, double donGia, int soLuong, double khuyenMai, double chietKhau,
			double tienKhach) {
		super();
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.khuyenMai = khuyenMai;
		this.chietKhau = chietKhau;
		this.tienKhach = tienKhach;
	}









	public ChiTietHoaDon(HoaDon hoaDon, SanPham sanPham, double donGia, int soLuong) {
		super();
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}



	public double getKhuyenMai() {
		return khuyenMai;
	}

	public void setKhuyenMai(double khuyenMai) {
		this.khuyenMai = khuyenMai;
	}

	public double getChietKhau() {
		return chietKhau;
	}

	public void setChietKhau(double chietKhau) {
		this.chietKhau = chietKhau;
	}

	public double getTienKhach() {
		return tienKhach;
	}

	public void setTienKhach(double tienKhach) {
		this.tienKhach = tienKhach;
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
				+ soLuong + ", khuyenMai=" + khuyenMai + ", chietKhau=" + chietKhau + ", tienKhach=" + tienKhach + "]";
	}



	

	

}
