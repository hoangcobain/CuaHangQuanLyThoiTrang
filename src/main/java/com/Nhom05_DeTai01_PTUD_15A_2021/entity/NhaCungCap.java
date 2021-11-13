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
public class NhaCungCap {
	@Id
	@Column(columnDefinition = "VARCHAR(10)")
	@GeneratedValue(generator = "NCCGenerator")
	@GenericGenerator(name = "NCCGenerator", strategy = "com.Nhom05_DeTai01_PTUD_15A_2021.generator.NhaCungCapGenerator")
	private String maNhaCungCap;
	
	@Column(nullable = false, columnDefinition = "NVARCHAR(30)", unique = true)
	private String tenNCC;
	@Column(nullable = false,columnDefinition = "NVARCHAR(30)")
	private String diaChi;
	@Column(nullable = false,columnDefinition = "VARCHAR(10)")
	private String soDienThoai;
	
	@OneToMany(mappedBy = "nhaCungCap", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<SanPham> listSanPham = new ArrayList<SanPham>();
	
	public String getTenNCC() {
		return tenNCC;
	}
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}
	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public NhaCungCap() {
		super();
	}
	
	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}
	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}
	
	public NhaCungCap(String maNhaCungCap, String tenNCC, String diaChi, String soDienThoai) {
		super();
		this.maNhaCungCap = maNhaCungCap;
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	@Override
	public String toString() {
		return "NhaCungCap [maNhaCungCap=" + maNhaCungCap + ", tenNCC=" + tenNCC + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + "]";
	}
	
	
	
}
