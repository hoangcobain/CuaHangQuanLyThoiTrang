package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class NhanVien {
	
	@Id
	@Column(columnDefinition = "VARCHAR(10)")
	@GeneratedValue(generator = "NVGenerator")
	@GenericGenerator(name = "NVGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.NhanVienGenerator")
	private String maNhanVien;
	
	@Column(nullable = false, columnDefinition = "VARCHAR(30)")
	private String tenNhanVien;
	private boolean gioiTinh;
	@Column(nullable = true, columnDefinition = "VARCHAR(50)")
	private String diaChi;
	@Column(nullable = false, columnDefinition = "VARCHAR(10)")
	private String soDienThoai;
	@Column(unique = true)
	private Email email;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ma_tai_khoan", referencedColumnName = "maTaiKhoan")
	private TaiKhoan taiKhoan;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<HoaDon> listHoaDon = new ArrayList<HoaDon>();
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String tenNhanVien, boolean gioiTinh, String diaChi, String soDienThoai, Email email,
			TaiKhoan taiKhoan) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.taiKhoan = taiKhoan;
	}
	
	/**
	 * @return the maNhanVien
	 */
	public String getMaNhanVien() {
		return maNhanVien;
	}

	/**
	 * @param maNhanVien the maNhanVien to set
	 */
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	/**
	 * @return the tenNhanVien
	 */
	public String getTenNhanVien() {
		return tenNhanVien;
	}

	/**
	 * @param tenNhanVien the tenNhanVien to set
	 */
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
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
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}

	/**
	 * @return the taiKhoan
	 */
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	/**
	 * @param taiKhoan the taiKhoan to set
	 */
	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
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
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh
				+ ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", email=" + email + "]";
	}
}
