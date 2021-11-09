package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;

public interface NhanVienDAO extends JpaRepository<NhanVien, String>{
	
	@Query(value = "SELECT * FROM [dbo].[nhan_vien] WHERE CHARINDEX(:ten,[ten_nhan_vien])>0 OR CHARINDEX(:sdt,[so_dien_thoai])>0 OR CHARINDEX(:email,[email])>0",
			nativeQuery = true)
	List<NhanVien> search(String ten, String sdt, String email);
	
	@Query(value = "SELECT * FROM [dbo].[nhan_vien] WHERE ?1=[so_dien_thoai] OR ?2=[ten_nhan_vien]",
			nativeQuery = true)
	List<NhanVien> searchBySDTNV(String sdt,String ten);
	

	
}
