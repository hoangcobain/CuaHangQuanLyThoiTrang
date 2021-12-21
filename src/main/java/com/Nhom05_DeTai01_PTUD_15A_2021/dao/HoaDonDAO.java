/**
 * Tác giả: Nguyễn Viết Hoàng - mssv:19473871 - Nhóm 5
 * 
 * Ngày tạo:23/10/2021
 * Mô tả: Câu truy vấn cơ sở dữ liệu hóa đơn
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.HoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;

public interface HoaDonDAO extends JpaRepository<HoaDon, String> {

	@Query(value = "SELECT * FROM [dbo].[hoa_don] WHERE (?1=[ma_nhan_vien] OR ?2=[ma_khach_hang]) "
			+ "AND (YEAR(ngay_lap_hoa_don)=?5 AND MONTH(ngay_lap_hoa_don) = ?4 AND DAY(ngay_lap_hoa_don) = ?3)", nativeQuery = true)
	List<HoaDon> searchHoaDonByNVKH(String maNV, String maKH, int day, int month, int year);

	@Query(value = "SELECT * FROM [dbo].[hoa_don] WHERE ?1=[ma_nhan_vien]", nativeQuery = true)
	List<HoaDon> searchHDByMaNhanVien(String ma);

	long countByNhanVien(NhanVien nhanVien);

	@Query(value = "SELECT * FROM [dbo].[hoa_don] "
			+ "WHERE DAY([ngay_lap_hoa_don]) = ?1 AND MONTH([ngay_lap_hoa_don]) = ?2 AND YEAR([ngay_lap_hoa_don]) = ?3", nativeQuery = true)
	List<HoaDon> countTheoNgay(int day, int month, int year);

	@Query(value = "SELECT * FROM [dbo].[hoa_don] "
			+ "WHERE MONTH([ngay_lap_hoa_don])=?1 AND YEAR([ngay_lap_hoa_don])=?2", nativeQuery = true)
	List<HoaDon> countTheoThang(int month, int year);
}
