package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class KhachHang {
	@Id
	@Column(columnDefinition = "VARCHAR(10)")
	@GeneratedValue(generator = "khachHangGenerator")
	@GenericGenerator(name = "khachHangGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.KhachHangGenerator")
	private String maKhachHang;

	@Column(nullable = false, columnDefinition = "VARCHAR(30)")
	private String tenKhachHang;
	private boolean gioiTinh;
	@Column(nullable = false, columnDefinition = "VARCHAR(10)")
	private String soDienThoai;
	@Column(nullable = false, columnDefinition = "VARCHAR(50)")
	private String diaChi;
	
	@OneToMany(mappedBy = "khachHang")
	private List<HoaDon> listHoaDon = new ArrayList<HoaDon>();

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String tenKhachHang, boolean gioiTinh, String soDienThoai, String diaChi) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	/**
	 * @return the maKhachHang
	 */
	public String getMaKhachHang() {
		return maKhachHang;
	}

	/**
	 * @param maKhachHang the maKhachHang to set
	 */
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	/**
	 * @return the tenKhachHang
	 */
	public String getTenKhachHang() {
		return tenKhachHang;
	}

	/**
	 * @param tenKhachHang the tenKhachHang to set
	 */
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	/**
	 * @return the gioiTinh
	 */
	public boolean isGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}

	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	/**
	 * @return the listHoaDon
	 */
	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	/**
	 * @param listHoaDon the listHoaDon to set
	 */
	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", tenKhachHang=" + tenKhachHang + ", gioiTinh=" + gioiTinh
				+ ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + "]";
	}
	
}
