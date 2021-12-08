package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;

public interface KhachHangDAO extends JpaRepository<KhachHang, String> {

	@Query(value = "SELECT * FROM [dbo].[khach_hang] WHERE (CHARINDEX(?1,[ten_khach_hang])>0 OR CHARINDEX(?2,[so_dien_thoai])>0) AND [gioi_tinh]=?3", nativeQuery = true)
	List<KhachHang> search(String ten, String sdt, int gioiTinh);

	@Query(value = "SELECT * FROM [dbo].[khach_hang] WHERE ?1=[so_dien_thoai] OR ?2=[ten_khach_hang]", nativeQuery = true)
	List<KhachHang> searchHoaDonBySDT(String sdt, String ten);

	long countByGioiTinh(boolean gioiTinh);
}
