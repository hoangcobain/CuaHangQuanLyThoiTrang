package com.Nhom05_DeTai01_PTUD_15A_2021.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class LoaiSanPham {

	@Id
	@Column(columnDefinition = "VARCHAR(10)")
	@GeneratedValue(generator = "LSPGenerator")
	@GenericGenerator(name = "LSPGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.LoaiSanPhamGenerator")
	private String maLoaiSanPham;

	@Column(nullable = false, columnDefinition = "NVARCHAR(30)", unique = true)
	private String tenLoaiSanPham;

	@OneToMany(mappedBy = "loaiSanPham", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<SanPham> listSanPham = new ArrayList<SanPham>();
	
	public LoaiSanPham() {
		// TODO Auto-generated constructor stub
	}
	
	public LoaiSanPham(String tenLoaiSanPham) {
		super();
		this.tenLoaiSanPham = tenLoaiSanPham;
	}

	/**
	 * @return the maLoaiSanPham
	 */
	public String getMaLoaiSanPham() {
		return maLoaiSanPham;
	}

	/**
	 * @param maLoaiSanPham the maLoaiSanPham to set
	 */
	public void setMaLoaiSanPham(String maLoaiSanPham) {
		this.maLoaiSanPham = maLoaiSanPham;
	}

	/**
	 * @return the tenLoaiSanPham
	 */
	public String getTenLoaiSanPham() {
		return tenLoaiSanPham;
	}

	/**
	 * @param tenLoaiSanPham the tenLoaiSanPham to set
	 */
	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		this.tenLoaiSanPham = tenLoaiSanPham;
	}

	/**
	 * @return the listSanPham
	 */
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	/**
	 * @param listSanPham the listSanPham to set
	 */
	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	@Override
	public String toString() {
		return "LoaiSanPham [maLoaiSanPham=" + maLoaiSanPham + ", tenLoaiSanPham=" + tenLoaiSanPham + "]";
	}
	
}
