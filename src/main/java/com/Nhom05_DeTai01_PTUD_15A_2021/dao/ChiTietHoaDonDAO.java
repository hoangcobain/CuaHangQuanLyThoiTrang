package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.ChiTietHoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.ChiTietHoaDon_PK;

public interface ChiTietHoaDonDAO extends JpaRepository<ChiTietHoaDon, ChiTietHoaDon_PK>{

	@Query(value = "SELECT * FROM [dbo].[chi_tiet_hoa_don] WHERE ?1=[ma_hoa_don]",
			nativeQuery = true)
	List<ChiTietHoaDon> findByMaHoaDon(String id);
}
