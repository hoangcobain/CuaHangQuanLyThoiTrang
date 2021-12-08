package com.Nhom05_DeTai01_PTUD_15A_2021.controller;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.jfree.data.category.DefaultCategoryDataset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nhom05_DeTai01_PTUD_15A_2021.dao.HoaDonDAO;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.HoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhanVien;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.HomePageUI;

import net.sourceforge.jdatepicker.impl.JDatePickerImpl;

@Service
public class HoaDonController {

	final Calendar calendar = Calendar.getInstance();

	@Autowired
	private HoaDonDAO hoaDonDAO;

	private Logger logger = LoggerFactory.getLogger(getClass());

	private List<HoaDon> list;

	public void loadHoaDonTheoMaNV(DefaultTableModel listHoaDon, String ma) {
		List<HoaDon> list = hoaDonDAO.searchHDByMaNhanVien(ma);
		listHoaDon.setRowCount(0);
		HoaDon hoaDon;
		for (int i = 0; i < list.size(); i++) {
			hoaDon = list.get(i);
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNgayLapHoaDon(), hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(), hoaDon.getTongTien() };
			listHoaDon.addRow(row);
		}
	}

	public void loadHoaDon(DefaultTableModel listHoaDon) {
		List<HoaDon> list = hoaDonDAO.findAll();
		listHoaDon.setRowCount(0);
		HoaDon hoaDon;
		for (int i = 0; i < list.size(); i++) {
			hoaDon = list.get(i);
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNgayLapHoaDon(), hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(), hoaDon.getTongTien() };
			listHoaDon.addRow(row);
		}
	}

	public HoaDon getHoaDonById(String id) {
		return hoaDonDAO.findById(id).get();
	}

	public void searchRoleQuanLy(DefaultTableModel listHoaDon, String maNV, String maKH, int day, int month, int year) {
		listHoaDon.setRowCount(0);
		List<HoaDon> list;
		logger.warn(day + " " + month + " " + year);
		list = hoaDonDAO.searchHoaDonByNVKH(maNV, maKH, day, month, year);
		for (Iterator<HoaDon> iterator = list.iterator(); iterator.hasNext();) {
			HoaDon hoaDon = iterator.next();
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNgayLapHoaDon(), hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(), hoaDon.getTongTien() };
			listHoaDon.addRow(row);
		}
	}

	public void searchRoleNhanVien(DefaultTableModel listHoaDon, String maNV, String maKH, int day, int month,
			int year) {
		listHoaDon.setRowCount(0);
		List<HoaDon> list;
		logger.warn(day + " " + month + " " + year);
		list = hoaDonDAO.searchHoaDonByKH(maNV, maKH, day, month, year);
		for (Iterator<HoaDon> iterator = list.iterator(); iterator.hasNext();) {
			HoaDon hoaDon = iterator.next();
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNgayLapHoaDon(), hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(), hoaDon.getTongTien() };
			listHoaDon.addRow(row);
		}
	}

	public void xoaHoaDon(String id) {
		hoaDonDAO.deleteById(id);
	}

	public void capNhanHoaDon(String maHD, KhachHang khachHang, NhanVien nhanVienById, Date date) {
		HoaDon hoaDon = getHoaDonById(maHD);
		hoaDon.setKhachHang(khachHang);
		hoaDon.setNhanVien(nhanVienById);
		hoaDon.setNgayLapHoaDon(date);
		hoaDonDAO.save(hoaDon);
	}

	public HoaDon lapHoaDon(HoaDon hoaDon) {
		return hoaDonDAO.save(hoaDon);
	}

	public long soLuongHoaDon() {
		return hoaDonDAO.count();
	}

	public void loadThongKe(DefaultTableModel listHoaDon, DefaultCategoryDataset dataset2, List<NhanVien> list2) {
		List<HoaDon> list = hoaDonDAO.findAll();
		listHoaDon.setRowCount(0);
		HoaDon hoaDon;
		for (int i = 0; i < list.size(); i++) {
			hoaDon = list.get(i);
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNgayLapHoaDon(), hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(), hoaDon.getTongTien() };
			listHoaDon.addRow(row);
		}
		dataset2.clear();
		list2.forEach(nhanVien -> {
			long sl = hoaDonDAO.countByNhanVien(nhanVien);
			if (sl > 0) {
				dataset2.setValue(sl, "NhanVien", nhanVien.getMaNhanVien());
			}
		});
	}

	public void thongKe(DefaultTableModel listHoaDon, DefaultCategoryDataset dataset2, JComboBox comboBox,
			JDatePickerImpl txtNgayThongKe) {
		int loai = comboBox.getSelectedIndex();
		LocalDate date = null;
		try {
			date = ((Date) txtNgayThongKe.getModel().getValue()).toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Chưa chọn ngày");
			return;
		}

		switch (loai) {
		case 0:
			thongKeTheoTuan(listHoaDon, dataset2, date);
			break;
		case 1:
			thongKeTheoThang(listHoaDon, dataset2, date);
			break;
		case 2:
			thongKeTheoNam(listHoaDon, dataset2, date);
			break;

		default:
			break;
		}

	}

	private void thongKeTheoNam(DefaultTableModel listHoaDon, DefaultCategoryDataset dataset2, LocalDate date) {
		listHoaDon.setRowCount(0);
		dataset2.clear();
		int month, year;
		for (int i = 0; i < 12; i++) {
			month = date.getMonthValue();
			year = date.getYear();
			list = hoaDonDAO.countTheoThang(month, year);
			dataset2.setValue(list.size(), "Ngay", date.getMonth());
			themVaoTable(list, listHoaDon);
			date = date.plusMonths(1);
		}
	}

	private void thongKeTheoThang(DefaultTableModel listHoaDon, DefaultCategoryDataset dataset2, LocalDate date) {
		listHoaDon.setRowCount(0);
		dataset2.clear();
		int day, month, year;
		day = date.getDayOfMonth();
		month = date.getMonthValue();
		year = date.getYear();

		int soDay;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			soDay = 30;
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			soDay = 31;
		else if (year % 4 == 0 && month == 2)
			soDay = 29;
		else
			soDay = 28;

		for (int i = 0; i < soDay; i++) {
			day = date.getDayOfMonth();
			month = date.getMonthValue();
			year = date.getYear();
			list = hoaDonDAO.countTheoNgay(day, month, year);
			dataset2.setValue(list.size(), "Ngay", date.getDayOfMonth()+"");
			themVaoTable(list, listHoaDon);
			date = date.plusDays(1);
		}
	}

	private void themVaoTable(List<HoaDon> list2, DefaultTableModel listHoaDon) {
		for (Iterator<HoaDon> iterator = list.iterator(); iterator.hasNext();) {
			HoaDon hoaDon = iterator.next();
			Object[] row = { hoaDon.getMaHoaDon(), hoaDon.getNgayLapHoaDon(), hoaDon.getKhachHang().getTenKhachHang(),
					hoaDon.getNhanVien().getTenNhanVien(), hoaDon.getTongTien() };
			listHoaDon.addRow(row);
		}
	}

	private void thongKeTheoTuan(DefaultTableModel listHoaDon, DefaultCategoryDataset dataset2, LocalDate date) {
		listHoaDon.setRowCount(0);
		dataset2.clear();
		int day, month, year;
		for (int i = 2; i < 9; i++) {
			day = date.getDayOfMonth();
			month = date.getMonthValue();
			year = date.getYear();
			list = hoaDonDAO.countTheoNgay(day, month, year);
			dataset2.setValue(list.size(), "Ngay", date.getDayOfWeek());
			themVaoTable(list, listHoaDon);
			date = date.plusDays(1);
		}
	}

}
