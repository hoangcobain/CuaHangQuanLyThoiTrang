package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDon_PK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String hoaDon;
	private String sanPham;
	
	public ChiTietHoaDon_PK() {
		// TODO Auto-generated constructor stub
	}	

	public ChiTietHoaDon_PK(String hoaDon, String sanPham) {
		super();
		this.hoaDon = hoaDon;
		this.sanPham = sanPham;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hoaDon, sanPham);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDon_PK other = (ChiTietHoaDon_PK) obj;
		return Objects.equals(hoaDon, other.hoaDon) && Objects.equals(sanPham, other.sanPham);
	}	
	
}
