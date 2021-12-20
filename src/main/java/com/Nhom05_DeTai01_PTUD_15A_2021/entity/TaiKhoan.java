/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:19/10/2021
 * Mô tả: Lớp thực thể tài khoản
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TaiKhoan {
	
	@Id
	@Column(columnDefinition = "VARCHAR(10)")
//    @GeneratedValue(generator = "TKGenerator")
//	@GenericGenerator(name = "TKGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.TaiKhoanGenerator")
    private String maNhanVien;
	
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "maNhanVien", columnDefinition = "VARCHAR(10)")
	private NhanVien nhanVien;
	
	@Column(nullable = false, columnDefinition = "VARCHAR(30)", unique = true)
	private String taiKhoan;
	@Column(nullable = false)
	private String matKhau;
	@Column(nullable = false, columnDefinition = "VARCHAR(15)")
	private String quyen;
	
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(String taiKhoan, String matKhau, Quyen role) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.quyen = role.name();
	}
	
	/**
	 * @return the maTaiKhoan
	 */
//	public String getMaTaiKhoan() {
//		return maTaiKhoan;
//	}
//
//	/**
//	 * @param maTaiKhoan the maTaiKhoan to set
//	 */
//	public void setMaTaiKhoan(String maTaiKhoan) {
//		this.maTaiKhoan = maTaiKhoan;
//	}

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
	 * @return the taiKhoan
	 */
	public String getTaiKhoan() {
		return taiKhoan;
	}

	/**
	 * @param taiKhoan the taiKhoan to set
	 */
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}

	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	/**
	 * @return the quyen
	 */
	public String getQuyen() {
		return quyen;
	}

	/**
	 * @param quyen the quyen to set
	 */
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maNhanVien=" + maNhanVien + ", nhanVien=" + nhanVien + ", taiKhoan=" + taiKhoan + ", matKhau="
				+ matKhau + ", quyen=" + quyen + "]";
	}

	
	
}
