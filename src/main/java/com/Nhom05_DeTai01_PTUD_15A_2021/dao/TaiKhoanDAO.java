/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:23/10/2021
 * Mô tả: Câu truy vấn cơ sở dữ liệu tài khoản
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.TaiKhoan;

public interface TaiKhoanDAO extends JpaRepository<TaiKhoan, String>{
	
	@Query(value = "SELECT * FROM [dbo].[tai_khoan] WHERE [tai_khoan] = ?1",
			nativeQuery = true)
	List<TaiKhoan> LayTaiKhoan(String username);
	
	
}
