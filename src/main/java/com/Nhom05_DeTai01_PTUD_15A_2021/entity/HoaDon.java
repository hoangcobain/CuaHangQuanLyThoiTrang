package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class HoaDon {
	
	@Id
	@Column(columnDefinition = "VARCHAR(10)")
	@GeneratedValue(generator = "HDGenerator")
	@GenericGenerator(name = "HDGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.HoaDonGenerator")
	private String maHoaDon;
	
	@Column(nullable = false)
	private Date ngayLapHoaDon;
	private double tongTien;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "ma_nhan_vien")
	private NhanVien nhanVien;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "ma_khach_hang")
	private KhachHang khachHang;
	
	@OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL)
	private Set<ChiTietHoaDon> listChiTietHoaDon = new HashSet<ChiTietHoaDon>();
	
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

	public HoaDon(Date ngayLapHoaDon, double tongTien, NhanVien nhanVien, KhachHang khachHang) {
		super();
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.tongTien = tongTien;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
	}

	/**
	 * @return the maHoaDon
	 */
	public String getMaHoaDon() {
		return maHoaDon;
	}

	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	/**
	 * @return the ngayLapHoaDon
	 */
	public Date getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	/**
	 * @param ngayLapHoaDon the ngayLapHoaDon to set
	 */
	public void setNgayLapHoaDon(Date ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	/**
	 * @return the tongTien
	 */
	public double getTongTien() {
		return tongTien;
	}

	/**
	 * @param tongTien the tongTien to set
	 */
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	/**
	 * @return the nhanVien
	 */
	public NhanVien getNhanVien() {
		return nhanVien;
	}

	/**
	 * @param nhanVien the nhanVien to set
	 */
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	/**
	 * @return the khachHang
	 */
	public KhachHang getKhachHang() {
		return khachHang;
	}

	/**
	 * @param khachHang the khachHang to set
	 */
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	/**
	 * @return the listChiTietHoaDon
	 */
	public Set<ChiTietHoaDon> getListChiTietHoaDon() {
		return listChiTietHoaDon;
	}

	/**
	 * @param listChiTietHoaDon the listChiTietHoaDon to set
	 */
	public void setListChiTietHoaDon(Set<ChiTietHoaDon> listChiTietHoaDon) {
		this.listChiTietHoaDon = listChiTietHoaDon;
	}

	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", ngayLapHoaDon=" + ngayLapHoaDon + ", tongTien=" + tongTien
				+ ", nhanVien=" + nhanVien + ", khachHang=" + khachHang + "]";
	}
	
}
