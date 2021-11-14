package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.time.Month;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.HoaDon;

public interface HoaDonDAO extends JpaRepository<HoaDon, String>{
	
	@Query(value = "SELECT * FROM [dbo].[hoa_don] WHERE ?1=[ma_nhan_vien] OR ?2=[ma_khach_hang] "
			+ "OR (YEAR(ngay_lap_hoa_don)=?5 AND MONTH(ngay_lap_hoa_don) = ?4 AND DAY(ngay_lap_hoa_don) = ?3)",
			nativeQuery = true)
	List<HoaDon> searchHoaDonByNVKH(String maNV, String maKH, int day, int month, int year);
}
