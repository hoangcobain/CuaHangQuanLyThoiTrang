package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.LoaiSanPham;

public interface LoaiSanPhamDAO extends JpaRepository<LoaiSanPham, String>{
	@Query(value = "SELECT * FROM [dbo].[loai_san_pham] WHERE CHARINDEX(?1,[ten_loai_san_pham])>0",
			nativeQuery = true)
	List<LoaiSanPham> findLoaiSPByName(String name);
}
