package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.SanPham;

public interface SanPhamDAO extends JpaRepository<SanPham, String>{

	@Query(value = "SELECT * FROM [dbo].[san_pham] WHERE CHARINDEX(?1,[ten_san_pham])>0 OR CHARINDEX(?2,[ten_nha_cung_cap])>0",
			nativeQuery = true)
	List<SanPham> searchByTenNCC(String ten, String ncc);
}
