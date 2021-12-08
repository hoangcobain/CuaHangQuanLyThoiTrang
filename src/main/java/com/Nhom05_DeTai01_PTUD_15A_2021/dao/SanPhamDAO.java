package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.LoaiSanPham;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.SanPham;

public interface SanPhamDAO extends JpaRepository<SanPham, String>{

	@Query(value = "SELECT * FROM [dbo].[san_pham] SP JOIN [dbo].[nha_cung_cap] NCC ON SP.ma_nha_cung_cap = NCC.ma_nha_cung_cap "
			+ "WHERE CHARINDEX(?1,[ten_san_pham])>0 OR CHARINDEX(?2,[tenncc])>0 "
			+ "OR CHARINDEX(?3,[size])>0 OR CHARINDEX(?4,[mau_sac])>0 ",
			nativeQuery = true)
	List<SanPham> searchByTenNCC(String ten, String ncc, String size, String mauSac);
	
	@Query(value = "SELECT * FROM [dbo].[san_pham] WHERE ?1=[ten_san_pham]",
			nativeQuery = true)
	List<SanPham> searchSPByTen(String ten);
	
	@Query(value = "SELECT * FROM [dbo].[san_pham] WHERE ?1<=[gia_thanh]  AND ?2>=[gia_thanh]",
			nativeQuery = true)
	List<SanPham> searchSPByPrice(double giatu,double dentu);
	
	@Query(value = "SELECT * FROM [dbo].[san_pham] WHERE ?1=[size]",
			nativeQuery = true)
	List<SanPham> searchSPBySize(String size);
	
	long countByLoaiSanPham(LoaiSanPham loaiSanPham);
}
