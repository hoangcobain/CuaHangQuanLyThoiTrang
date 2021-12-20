/**
 * Tác giả: Trương Nhật Long - mssv:18036331 - Nhóm 5
 * 
 * Ngày tạo:27/10/2021
 * Mô tả: lớp controller dùng để thao tác với bảng Tai_Khoan trong cơ sở dữ liệu
 */
package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.TaiKhoanDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.Quyen;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.TaiKhoan;

@Service
public class TaiKhoanController {

	@Autowired
	private TaiKhoanDAO taiKhoanDAO;
	private TaiKhoan taiKhoan;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	/**
	 * Hàm dùng để kiểm tra đăng nhập tài khoản nhân viên
	 * 
	 * @param username,password
	 * @return trả về true nếu đăng nhập thành công trả về false nếu đăng nhập thất bại
	 */
	public boolean Login(String username, String password) {
		try {
			List<TaiKhoan> list = taiKhoanDAO.LayTaiKhoan(username);
			if (list.size()!=0) {
				taiKhoan = list.get(0);
				if (!encoder.matches(password, taiKhoan.getMatKhau())) {
					JOptionPane.showMessageDialog(null, "Mât Khẩu Không Đúng");
					return false;
				}
			}else {
				JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
				return false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Lỗi không lấy được tài khoản");
			return false;
		}
		return true;
	}
	
	public void logout() {
		System.out.println("DANG XUAT");
		taiKhoan = null;
	}
	/**
	 * Hàm dùng để đổi mật khẩu tài khoản nhân viên
	 * 
	 * @param password.password2
	 * @return trả về true nếu đổi mật khẩu thành công trả về false nếu đổi mật khẩu thất bại
	 */
	public boolean doiMatKhau(char[] password, char[] password2) {
		System.out.println("DOI MAT KHAU: "+taiKhoan.getMatKhau());
		String matKhauCu = String.valueOf(password);
		String matKhauMoi = String.valueOf(password2);
		if(encoder.matches(matKhauCu, taiKhoan.getMatKhau())) {
			taiKhoan.setMatKhau(encoder.encode(matKhauMoi));
			taiKhoanDAO.save(taiKhoan);
			return true;
		}
		return false;
	}
	public void xacthucMatKhau(String password) {
			taiKhoan.setMatKhau(encoder.encode(password));
			taiKhoanDAO.save(taiKhoan);
	}
	/**
	 * Hàm trả về mật khẩu đang đăng nhập
	 * 
	 * @return String
	 */
	public String layMatKhau() {	
		return taiKhoan.getMatKhau();
	}
	/**
	 * Hàm khởi tạo tài khoản nhân viên
	 * 
	 * @param sdt,string,nhanVien
	 * @return TaiKhoan
	 */
	public TaiKhoan taoTaiKhoan(String sdt, String string, NhanVien nhanVien) {
		TaiKhoan taiKhoan = new TaiKhoan(sdt, encoder.encode(string), Quyen.ROLE_NHANVIEN);
		taiKhoan.setNhanVien(nhanVien);
		return taiKhoanDAO.save(taiKhoan);
	}
	/**
	 * Hàm insert tài khoản nhân viên vào cơ sở dữ liệu
	 * 
	 * @param taiKhoan2
	 * @return TaiKhoan
	 */
	public TaiKhoan save(TaiKhoan taiKhoan2) {
		return taiKhoanDAO.save(taiKhoan2);
	}
}
