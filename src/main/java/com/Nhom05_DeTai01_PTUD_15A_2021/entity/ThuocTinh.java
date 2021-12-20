/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: Lớp thuộc tính
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ThuocTinh {	
	@Column(columnDefinition = "NVARCHAR(30)")
	private String tenThuocTinh;
	@Column(columnDefinition = "NVARCHAR(30)")
	private String giaTri;

	public ThuocTinh() {
		// TODO Auto-generated constructor stub
	}

	public ThuocTinh(String tenThuocTinh, String giaTri) {
		super();
		this.tenThuocTinh = tenThuocTinh;
		this.giaTri = giaTri;
	}

	/**
	 * @return the tenThuocTinh
	 */
	public String getTenThuocTinh() {
		return tenThuocTinh;
	}

	/**
	 * @param tenThuocTinh the tenThuocTinh to set
	 */
	public void setTenThuocTinh(String tenThuocTinh) {
		this.tenThuocTinh = tenThuocTinh;
	}

	/**
	 * @return the giaTri
	 */
	public String getGiaTri() {
		return giaTri;
	}

	/**
	 * @param giaTri the giaTri to set
	 */
	public void setGiaTri(String giaTri) {
		this.giaTri = giaTri;
	}

	@Override
	public String toString() {
		return "ThuocTinh [tenThuocTinh=" + tenThuocTinh + ", giaTri=" + giaTri + "]";
	}
	
}
