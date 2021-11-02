package com.Nhom05_DeTai01_PTUD_15A_2021;

import java.awt.EventQueue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.NhanVienDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.dao.TaiKhoanDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.Email;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.Quyen;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.TaiKhoan;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.DangNhapUI;

@SpringBootApplication
public class Nhom05DeTai01Ptud15A2021Application {
	private static ConfigurableApplicationContext app;

	public static void main(String[] args) {
		app = new SpringApplicationBuilder(Nhom05DeTai01Ptud15A2021Application.class)
				.headless(false).run(args);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhapUI frame = app.getBean(DangNhapUI.class);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @return the app
	 */
	public static ConfigurableApplicationContext getApp() {
		return app;
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	public CommandLineRunner runner(NhanVienDAO nhanVienDAO, TaiKhoanDAO taiKhoanDAO, BCryptPasswordEncoder encoder) {
//		return (args ->{
//			
////			Nhan Vien
//			TaiKhoan taiKhoan = new TaiKhoan("taikhoan", encoder.encode("123"), Quyen.ROLE_QUANLY);			
//			Email email = new Email("abc@gmail.com");
//			NhanVien nhanVien = new NhanVien("Nguyen Van A", false, "Dia Chi A", "0123456", email, null);
//			nhanVien = nhanVienDAO.save(nhanVien);
//			
//			taiKhoan.setNhanVien(nhanVien);
//			taiKhoan = taiKhoanDAO.save(taiKhoan);
//			
//			nhanVien.setTaiKhoan(taiKhoan);
//			nhanVien = nhanVienDAO.save(nhanVien);
//		});
//	}
}
