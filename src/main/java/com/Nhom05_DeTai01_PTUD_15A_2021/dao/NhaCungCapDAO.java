/**
 * Tác giả: Nguyễn Viết Hoàng - mssv:19473871 - Nhóm 5
 * 
 * Ngày tạo:23/10/2021
 * Mô tả: Câu truy vấn cơ sở dữ liệu nhà cung cấp
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhaCungCap;

public interface NhaCungCapDAO extends JpaRepository<NhaCungCap, String> {
	@Query(value = "SELECT * FROM [dbo].[nha_cung_cap] WHERE CHARINDEX(?1,[tenncc])>0",
			nativeQuery = true)
	List<NhaCungCap> findNCCByName(String name);
	
	@Query(value = "SELECT * FROM [dbo].[nha_cung_cap] WHERE ?1=[so_dien_thoai] OR ?2=[tenncc]",
			nativeQuery = true)
	List<NhaCungCap> searchNCCBySDTAndName(String sdt, String ten);

}
