package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Nhom05_DeTai01_PTUD_15A_2021.Nhom05DeTai01Ptud15A2021Application;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.ChiTietHoaDonController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.HoaDonController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.KhachHangController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.LoaiSanPhamController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.NhaCungCapController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.NhanVienController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.SanPhamController;
import com.Nhom05_DeTai01_PTUD_15A_2021.controller.TaiKhoanController;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.ChiTietHoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.HoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.KhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.LoaiSanPham;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.NhaCungCap;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.Quyen;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.SanPham;
import com.Nhom05_DeTai01_PTUD_15A_2021.entity.ThuocTinh;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.EventMenuSelected;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.Menu;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.MenuList;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ModelMenu;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ModelMenu.MenuType;

@SpringBootApplication
public class HomePageNhanVienUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected Menu panelMenu;
	private JScrollPane paneContent = new JScrollPane();
	private HoaDonUI pnlhoaDon = new HoaDonUI();
	private LapHoaDonUI pnlLapHoaDon = new LapHoaDonUI();
	private SanPhamUI pnlSanPham = new SanPhamUI();
	private LoaiSanPhamUI pnlLoaiSanPham = new LoaiSanPhamUI();
	private KhachHangUI pnlKhachHang = new KhachHangUI();
	private ChiTietHoaDonUI pnlChiTietHoaDon = new ChiTietHoaDonUI();
	private GioiThieuUI pnlGioiThieuUI = new GioiThieuUI();
	private NguonHangUI pnlNguonHang = new NguonHangUI();
	private byte[] personalImage;
	SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

	@Autowired
	private TaiKhoanController taiKhoanController;
	@Autowired
	private NhanVienController nhanVienController;
	@Autowired
	private HoaDonController hoaDonController;
	@Autowired
	private KhachHangController khachHangController;
	@Autowired
	private ChiTietHoaDonController chiTietHoaDonController;
	@Autowired
	private SanPhamController sanPhamController;
	@Autowired
	private LoaiSanPhamController loaiSanPhamController;
	@Autowired
	private NhaCungCapController nhaCungCapController;
	private MenuList<Object> lstMenu;

	/**
	 * Create the frame.
	 */
	public HomePageNhanVienUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1550, 720);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		lstMenu = new MenuList<Object>();
		lstMenu.addItem(new ModelMenu("", " S???n Ph???m", MenuType.TITLE));
		lstMenu.addItem(new ModelMenu("gift", "S???n Ph???m", MenuType.MENU));
		lstMenu.addItem(new ModelMenu("product", "Lo???i S???n Ph???m", MenuType.MENU));
		lstMenu.addItem(new ModelMenu("supplier", "Ngu???n H??ng", MenuType.MENU));

		lstMenu.addItem(new ModelMenu("", "", MenuType.EMPTY));
		lstMenu.addItem(new ModelMenu("", " Th??ng Tin", MenuType.TITLE));
		lstMenu.addItem(new ModelMenu("customer", "Kh??ch H??ng", MenuType.MENU));

		lstMenu.addItem(new ModelMenu("", "", MenuType.EMPTY));
		lstMenu.addItem(new ModelMenu("", " C???a H??ng", MenuType.TITLE));
		lstMenu.addItem(new ModelMenu("bill", "Qu???n L?? H??a ????n", MenuType.MENU));
		lstMenu.addItem(new ModelMenu("page", "L???p H??a ????n", MenuType.MENU));

		panelMenu = new Menu(lstMenu);
		panelMenu.btnDangXuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dangXuat();
			}
		});
		panelMenu.btnMatKhau.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				doiMatKhau();
			}
		});
		JScrollPane paneWest = new JScrollPane(panelMenu);
		paneWest.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		paneWest.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(paneWest, BorderLayout.WEST);

		paneContent.setBorder(null);
		contentPane.add(paneContent, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		paneContent.setViewportView(pnlGioiThieuUI);

		panelMenu.addEventMenuSelected(new EventMenuSelected() {

			@Override
			public void selected(int index) {
				switch (index) {
				case 1:
					paneContent.setViewportView(pnlSanPham);
					loadSanPham();
					break;
				case 2:
					paneContent.setViewportView(pnlLoaiSanPham);
					loadLoaiSanPham();
					break;
				case 3:
					paneContent.setViewportView(pnlNguonHang);
					loadNhaCungCap();
					break;
				case 6:
					paneContent.setViewportView(pnlKhachHang);
					loadKhachHang();
					break;
				case 9:
					pnlhoaDon.btnCapNhat.setEnabled(false);
					pnlhoaDon.btnXoa.setEnabled(false);
					loadThongTinNhanVienTheoRoleNhanVien();
					String ma = taiKhoanController.getTaiKhoan().getNhanVien().getMaNhanVien();
					paneContent.setViewportView(pnlhoaDon);
					hoaDonController.loadHoaDonTheoMaNV(pnlhoaDon.listHoaDon,ma);
					break;
				case 10:
					paneContent.setViewportView(pnlLapHoaDon);
					loadHoaDon();
					break;
				default:
					break;
				}
			}
		});
		// X??? L?? HO?? ????N
		pnlhoaDon.btnTimNhanVien.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten, sdt, email;
				ten = pnlhoaDon.txttenNhanVien.getText();
				sdt = pnlhoaDon.txtsoDT.getText();
				email = pnlhoaDon.txtemail.getText();
				nhanVienController.searchNhanVien(pnlhoaDon.listNhanVien, ten, sdt, email);
			}
		});
		pnlhoaDon.btnTimKhachHang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten, sdt;
				int gioiTinh;
				ten = pnlhoaDon.txttenKhachHang.getText();
				sdt = pnlhoaDon.txtsoDTKH.getText();
				gioiTinh = pnlhoaDon.cmbgioiTinh.getSelectedIndex();
				khachHangController.searchKhachHang(pnlhoaDon.listKhachHang, ten, sdt, gioiTinh);
			}
		});
		pnlhoaDon.tableNhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = pnlhoaDon.tableNhanVien.getModel().getValueAt(pnlhoaDon.tableNhanVien.getSelectedRow(), 0)
						.toString();
				pnlhoaDon.txtMaNhanVien.setText(id);
			}
		});
		pnlhoaDon.tableKhachHang.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = pnlhoaDon.tableKhachHang.getModel().getValueAt(pnlhoaDon.tableKhachHang.getSelectedRow(), 0)
						.toString();
				pnlhoaDon.txtMaKhachHang.setText(id);
			}
		});
		pnlhoaDon.tblHoaDon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = pnlhoaDon.tblHoaDon.getModel().getValueAt(pnlhoaDon.tblHoaDon.getSelectedRow(), 0)
						.toString();
				HoaDon hoaDon = hoaDonController.getHoaDonById(id);
				pnlhoaDon.txtMaHoaDon.setText(hoaDon.getMaHoaDon());
				LocalDate date = hoaDon.getNgayLapHoaDon().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				pnlhoaDon.txtNgayLap.getModel().setDate(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
				pnlhoaDon.txtNgayLap.getModel().setSelected(true);
				pnlhoaDon.txtTongTien.setText(hoaDon.getTongTien() + "");
				pnlhoaDon.txtMaKhachHang.setText(hoaDon.getKhachHang().getMaKhachHang());
				pnlhoaDon.txtMaNhanVien.setText(hoaDon.getNhanVien().getMaNhanVien());
				pnlhoaDon.btnCTHD.setEnabled(true);
				pnlhoaDon.btnXemPhiu.setEnabled(true);
			}
		});
		pnlhoaDon.btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaTrangHoaDon(pnlhoaDon.btnCTHD);
			}
		});
		pnlhoaDon.btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maNV, maKH;
				maNV = pnlhoaDon.txtMaNhanVien.getText();
				maKH = pnlhoaDon.txtMaKhachHang.getText();
				LocalDate date = null;
				if (taiKhoanController.getTaiKhoan().getQuyen().equals(Quyen.ROLE_QUANLY.toString())) {
					if (maNV.equals("") && maKH.equals(""))
						hoaDonController.loadHoaDon(pnlhoaDon.listHoaDon);
					else {
						try {
							date = ((Date) pnlhoaDon.txtNgayLap.getModel().getValue()).toInstant()
									.atZone(ZoneId.systemDefault()).toLocalDate();
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Ch??a ch???n ng??y");
							return;
						}
						hoaDonController.searchRoleQuanLy(pnlhoaDon.listHoaDon, maNV, maKH, date.getDayOfMonth(),
								date.getMonthValue(), date.getYear());
					}
				} else {
					try {
						date = ((Date) pnlhoaDon.txtNgayLap.getModel().getValue()).toInstant()
								.atZone(ZoneId.systemDefault()).toLocalDate();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Ch??a ch???n ng??y");
						return;
					}
					hoaDonController.searchRoleNhanVien(pnlhoaDon.listHoaDon, maNV, maKH, date.getDayOfMonth(),
							date.getMonthValue(), date.getYear());
				}
			}
		});
		pnlhoaDon.btnXoa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = pnlhoaDon.txtMaHoaDon.getText();
				if (!id.equals("")) {
					hoaDonController.xoaHoaDon(id);
					xoaTrangHoaDon(pnlhoaDon.btnCTHD);
					hoaDonController.loadHoaDon(pnlhoaDon.listHoaDon);
				}
			}
		});
		pnlhoaDon.btnCapNhat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String maNV, maKH, maHD;
				Date date;
				maHD = pnlhoaDon.txtMaHoaDon.getText();
				maNV = pnlhoaDon.txtMaNhanVien.getText();
				maKH = pnlhoaDon.txtMaKhachHang.getText();
				date = (Date) pnlhoaDon.txtNgayLap.getModel().getValue();
				hoaDonController.capNhanHoaDon(maHD, khachHangController.getKhachHang(maKH),
						nhanVienController.getNhanVienById(maNV), date);
				hoaDonController.loadHoaDon(pnlhoaDon.listHoaDon);
			}
		});
		pnlhoaDon.btnCTHD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paneContent.setViewportView(pnlChiTietHoaDon);
				loadCTHD();
			}
		});
		pnlhoaDon.btnXemPhiu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = pnlhoaDon.tblHoaDon.getModel().getValueAt(pnlhoaDon.tblHoaDon.getSelectedRow(), 0)
						.toString();
				Runtime run = Runtime.getRuntime();
				try {
					run.exec("notepad History//" + id + ".txt");

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "H??a ????n ???? b??? x??a trong l???ch s??? l??u h??a ????n");
				}
			}
		});
		// X??? L?? CHI TIET H??A ????N
		pnlChiTietHoaDon.btnTimSP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sanPhamController.searchByTenNCC(pnlChiTietHoaDon.listSanPham, pnlChiTietHoaDon.txtTenSanPham.getText(),
						pnlChiTietHoaDon.txtTenNCC.getText(), pnlChiTietHoaDon.txtKichCo.getText(),
						pnlChiTietHoaDon.txtMauSac.getText());

			}
		});
		pnlChiTietHoaDon.btnInHD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String maKH, maNV, tenKH;
				String maHD = pnlhoaDon.tblHoaDon.getModel().getValueAt(pnlhoaDon.tblHoaDon.getSelectedRow(), 0)
						.toString();
				String ngayLap = pnlChiTietHoaDon.txtNgayLap.getText();
				DefaultTableModel model = (DefaultTableModel) pnlChiTietHoaDon.tblCTHD.getModel();
				tenKH = pnlChiTietHoaDon.txtTenKhachHang.getText();
				maKH = pnlChiTietHoaDon.txtMaKhachHang.getText();
				maNV = taiKhoanController.getTaiKhoan().getNhanVien().getMaNhanVien();
				if (maHD.equals("")) {
					JOptionPane.showMessageDialog(null, "In h??a ????n kh??ng th??nh c??ng");
					return;
				}
				ChiTietHoaDon chiTietHoaDon = chiTietHoaDonController.getCTHDByHD(maHD);
				int value = JOptionPane.showConfirmDialog(null, "B???n c?? mu???n in l???i h??a ????n kh??ng ?", "X??c nh???n",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (value == JOptionPane.YES_OPTION) {
					try {

						Writer bw = new BufferedWriter(
								new OutputStreamWriter(new FileOutputStream("History//" + maHD + ".txt"), "UTF8"));
						bw.write("\t\t\tTHE H&L SHOP\r\n\r\n");
						bw.write("\t\t590 CMT8, P.11, Q.3, TPHCM\r\n");
						bw.write("\t\t\tS??T: 01212692802\r\n\r\n");
						bw.write("\t\t\tH??A ????N B??N H??NG\r\n\r\n");
						bw.write("M?? h??a ????n: " + maHD + "\r\n");
						bw.write("Th???i gian: " + ngayLap + "\r\n");
						bw.write("NH??N VI??N: " + maNV + "\r\n");
						bw.write("KH??CH H??NG: " + maKH + "\r\n");
						bw.write("T??N KH??CH H??NG: " + tenKH + "\r\n");
						bw.write("------------------------------------------------------------\r\n");
						bw.write("M??\t\tT??n nh?? cung c???p\tS??? l?????ng\tTh??nh ti???n\r\n");
						bw.write("-----------------------------------------------------------\r\n");
						// Ghi s???n ph???m
						int quantotal = 0;
						double tonggia = 0;

						for (int i = 0; i < model.getRowCount(); i++) {
							String id = (String) model.getValueAt(i, 0);
							String tenSP = (String) model.getValueAt(i, 1);
							String tenNCC = (String) model.getValueAt(i, 2);
							String quantity = String.valueOf(model.getValueAt(i, 3));
							String intomoney = String.valueOf(model.getValueAt(i, 6));
							bw.write((i + 1) + ". " + tenSP + "\r\n");
							bw.write(id + "\t\t" + tenNCC + "\t\t\t   " + quantity + "\t\t  " + intomoney
									+ "VN??\r\n\r\n");
							quantotal += Integer.parseInt(quantity);
							tonggia += Double.parseDouble(intomoney);
						}
						bw.write("------------------------------------------------------------\r\n");
						bw.write("T???ng c???ng:\t\t\t\t   " + quantotal + "\t\t  " + tonggia + " VN??\r\n");
						bw.write("------------------------------------------------------------\r\n");
						bw.write("\t\tKhuy???n m??i:\t\t" + "\t-" + chiTietHoaDon.getKhuyenMai() + " VN??\r\n");
						bw.write("\t\tChi???t kh???u:\t\t" + "\t-" + chiTietHoaDon.getChietKhau() + " VN??\r\n");
						bw.write("\t\t--------------------------------------------\r\n");
						bw.write("\t\tTh??nh ti???n:\t\t\t"
								+ (tonggia - chiTietHoaDon.getChietKhau() - chiTietHoaDon.getKhuyenMai()) + " VN??\r\n");
						bw.write("\t\t--------------------------------------------\r\n");
						bw.write("\t\tTi???n kh??ch ????a:\t\t\t" + chiTietHoaDon.getTienKhach() + " VN??\r\n");
						bw.write("\t\tTi???n tr??? l???i:\t\t\t"
								+ Double.valueOf(chiTietHoaDon.getTienKhach()
										- (tonggia - chiTietHoaDon.getChietKhau() - chiTietHoaDon.getKhuyenMai()))
								+ " VN??\r\n");
						bw.write("------------------------------------------------------------\r\n");
						bw.write("Ch????ng tr??nh ??u ????i: ");
						bw.write("Kh??ng c??.\r\n");
						bw.write("------------------------------------------------------------\r\n");
						bw.write("M???t kh???u Wifi: HandL\r\n");
						bw.write("---------------------C??M ??N QU?? KH??CH!----------------------");
						bw.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "In h??a ????n th??nh c??ng");
				} else {
					return;
				}
			}
		});
		pnlChiTietHoaDon.tblCTHD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = pnlChiTietHoaDon.tblCTHD.getSelectedRow();
				String id = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 0).toString();
				String ten = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 1).toString();
				String tenNCC = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 2).toString();
				String soLuong = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 3).toString();
				String kichCo = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 4).toString();
				String mauSac = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 5).toString();
				String giaThanh = pnlChiTietHoaDon.tblCTHD.getModel().getValueAt(index, 6).toString();
				pnlChiTietHoaDon.txtMaSanPham.setText(id);
				pnlChiTietHoaDon.txtSoLuong.setText(soLuong);
				pnlChiTietHoaDon.txtTenSanPham.setText(ten);
				pnlChiTietHoaDon.txtTenNCC.setText(tenNCC);
				pnlChiTietHoaDon.txtGiaThanh.setText(giaThanh);
				pnlChiTietHoaDon.txtKichCo.setText(kichCo);
				pnlChiTietHoaDon.txtMauSac.setText(mauSac);
				try {
					int soLuong1 = Integer.parseInt(pnlChiTietHoaDon.txtSoLuong.getText());
					double gt = Double.parseDouble(giaThanh);
					pnlChiTietHoaDon.txtDonGia.setText(gt / soLuong1 + "");
				} catch (Exception e2) {
					pnlChiTietHoaDon.txtDonGia.setText("L???i s??? l?????ng ho???c ????n gi??");
				}
			}
		});
		pnlChiTietHoaDon.tblSanPham.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = pnlChiTietHoaDon.tblSanPham.getSelectedRow();
				String id = pnlChiTietHoaDon.tblSanPham.getModel().getValueAt(index, 0).toString();
				String ten = pnlChiTietHoaDon.tblSanPham.getModel().getValueAt(index, 1).toString();
				String tenNCC = pnlChiTietHoaDon.tblSanPham.getModel().getValueAt(index, 2).toString();
				String kichCo = pnlChiTietHoaDon.tblSanPham.getModel().getValueAt(index, 4).toString();
				String mauSac = pnlChiTietHoaDon.tblSanPham.getModel().getValueAt(index, 5).toString();
				String donGia = pnlChiTietHoaDon.tblSanPham.getModel().getValueAt(index, 6).toString();
				pnlChiTietHoaDon.txtMaSanPham.setText(id);
				pnlChiTietHoaDon.txtTenSanPham.setText(ten);
				pnlChiTietHoaDon.txtTenNCC.setText(tenNCC);
				pnlChiTietHoaDon.txtKichCo.setText(kichCo);
				pnlChiTietHoaDon.txtMauSac.setText(mauSac);
				pnlChiTietHoaDon.txtDonGia.setText(donGia);
				try {
					int soLuong = Integer.parseInt(pnlChiTietHoaDon.txtSoLuong.getText());
					double dg = Double.parseDouble(donGia);
					pnlChiTietHoaDon.txtGiaThanh.setText(soLuong * dg + "");
				} catch (Exception e2) {
					pnlChiTietHoaDon.txtGiaThanh.setText("L???i s??? l?????ng ho???c ????n gi??");
				}
			}
		});
		pnlChiTietHoaDon.txtSoLuong.getDocument().addDocumentListener(new DocumentListener() {
			private void nhapSoLuong() {
				String donGia = pnlChiTietHoaDon.txtDonGia.getText();
				try {
					int soLuong = Integer.parseInt(pnlChiTietHoaDon.txtSoLuong.getText());
					double dg = Double.parseDouble(donGia);
					pnlChiTietHoaDon.txtGiaThanh.setText(soLuong * dg + "");
				} catch (Exception e2) {
					pnlChiTietHoaDon.txtGiaThanh.setText("L???i s??? l?????ng ho???c ????n gi??");
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				nhapSoLuong();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				nhapSoLuong();
			}
		});
		pnlChiTietHoaDon.btnXoaTrang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xoaTrangCTHD();
			}
		});
		pnlChiTietHoaDon.btnXoa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String maSP = pnlChiTietHoaDon.txtMaSanPham.getText();
				String maHD = pnlChiTietHoaDon.txtMaHoaDon.getText();
				chiTietHoaDonController.xoaCTHD(maHD, maSP);
				xoaTrangCTHD();
				loadCTHD();
			}
		});
		pnlChiTietHoaDon.btnCapNhat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String maSP = pnlChiTietHoaDon.txtMaSanPham.getText();
				String maHD = pnlChiTietHoaDon.txtMaHoaDon.getText();
				String soLuong = pnlChiTietHoaDon.txtSoLuong.getText();
				String giaThanh = pnlChiTietHoaDon.txtGiaThanh.getText();
				try {
					int sl = Integer.parseInt(soLuong);
					double gt = Double.parseDouble(giaThanh);
					try {
						ChiTietHoaDon cthd = chiTietHoaDonController.getCTHDByHDSP(maHD, maSP);
						chiTietHoaDonController.capNhatCTHD(cthd, sl, gt);
					} catch (Exception e2) {
						int kq = JOptionPane.showConfirmDialog(null, "B???n mu???n th??m San Ph???m M???i", "C???nh b??o",
								JOptionPane.YES_NO_OPTION);
						if (kq == JOptionPane.YES_OPTION) {
							SanPham sp = sanPhamController.getSanPham(maSP);
							HoaDon hd = hoaDonController.getHoaDonById(maHD);
							hd.getListChiTietHoaDon().add(new ChiTietHoaDon(hd, sp, gt, sl));
							hoaDonController.lapHoaDon(hd);
						}
					}
					xoaTrangCTHD();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "C???p Nh???t kh??ng th??nh c??ng: " + e2.getMessage());
					e2.printStackTrace();
				}
				loadCTHD();
			}
		});
		// X??? L?? L???P H??A ????N
		pnlLapHoaDon.btnTimSP.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paneContent.setViewportView(pnlSanPham);
				loadSanPham();
			}
		});
		pnlLapHoaDon.btnXoaTrang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xoaTrangLapHoaDon();
			}
		});
		pnlLapHoaDon.txtSoLuong.getDocument().addDocumentListener(new DocumentListener() {
			private void nhapSoLuong() {
				try {
					int soLuong = Integer.parseInt(pnlLapHoaDon.txtSoLuong.getText());
					double dg = Double.parseDouble(pnlLapHoaDon.txtDonGia.getText());
					pnlLapHoaDon.txtGiaThanh.setText(soLuong * dg + "");
				} catch (Exception e2) {
					pnlLapHoaDon.txtGiaThanh.setText("L???i s??? l?????ng ho???c ????n gi??");
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				nhapSoLuong();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				nhapSoLuong();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				nhapSoLuong();
			}
		});
		pnlLapHoaDon.btnXoa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				removeRowCTHD(pnlLapHoaDon.txtMaSanPham.getText());
				loadTongTien();
			}
		});
		pnlLapHoaDon.btnThem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String maSP = pnlLapHoaDon.txtMaSanPham.getText();
				if (maSP.equals("")) {
					return;
				}
				String soLuong = pnlLapHoaDon.txtSoLuong.getText();
				String donGia = pnlLapHoaDon.txtDonGia.getText();
				SanPham sanPham = sanPhamController.getSanPham(maSP);
				String tenSP = sanPham.getTenSanPham();
				String tenNCC = sanPham.getNhaCungCap().getTenNCC();
				String size = sanPham.getSize();
				String mauSac = sanPham.getMauSac();
				int slSP = sanPham.getSoLuong();
				try {
					int sl = Integer.parseInt(soLuong);
					double dg = Double.parseDouble(donGia);
					if (sl <= 0 || sl > slSP) {
						JOptionPane.showMessageDialog(null,
								"Nh???p s??? l?????ng sai: 0 < S??? L?????NG <= " + slSP + "(S???n ph???m trong kho)");
						pnlLapHoaDon.txtSoLuong.selectAll();
						pnlLapHoaDon.txtSoLuong.requestFocus();
					} else {
						int luu = sl + removeRowCTHD(maSP);
						String[] row = { maSP.toUpperCase(), tenSP, tenNCC, size, mauSac, luu + "", dg*luu + "" };
						pnlLapHoaDon.listCTHD.addRow(row);
						loadTongTien();
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Y??u c???u nh???p s??? l?????ng");
					e2.printStackTrace();
				}
			}
		});

		pnlLapHoaDon.cmbKhuyenMai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadTongTien();
			}
		});
		pnlLapHoaDon.btnThanhToan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pnlLapHoaDon.tblCTHD.getRowCount() > 0 && !pnlLapHoaDon.txtMaKhachHang.getText().equals("")) {
					if (pnlLapHoaDon.txtTienKhachDua.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Ti???n kh??ch tr??? kh??ng ???????c ????? tr???ng");
					} else {
						try {
							double tt = Double.parseDouble(pnlLapHoaDon.txtTongTien.getText());
							double tk = Double.parseDouble(pnlLapHoaDon.txtTienKhachDua.getText());
							double chietKhau = Double.parseDouble(pnlLapHoaDon.txtChietKhau.getText());
							if (tk + chietKhau < tt) {
								JOptionPane.showMessageDialog(null, "Ti???n kh??ch tr??? kh??ng ?????");
								return;
							}
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Ti???n kh??ch tr??? ho???c chi???t kh???u kh??ng ph???i s???");
							return;
						}
						thanhToan();
						pnlLapHoaDon.txtTongTien.setText("");
						pnlLapHoaDon.txtTienKhachDua.setText("0");
						pnlLapHoaDon.cmbKhuyenMai.setSelectedIndex(0);
						pnlLapHoaDon.txtChietKhau.setText("0");
						pnlLapHoaDon.txtDonGia.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(null, "H??a ????n ch??a c?? s???n ph???m ho???c kh??ch h??ng");
					sanPhamController.searchByTenNCC(pnlLapHoaDon.listSanPham, pnlLapHoaDon.txtTenSanPham.getText(),
							pnlLapHoaDon.txtTenNCC.getText(), pnlLapHoaDon.txtSize.getText(),
							pnlLapHoaDon.txtMauSac.getText());
					loadHoaDon();
				}
			}
		});
		pnlLapHoaDon.btnTim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paneContent.setViewportView(pnlKhachHang);
				loadKhachHang();
			}
		});
		pnlLapHoaDon.btnTimTheoMa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ma = pnlLapHoaDon.txtMaSanPham.getText().trim();
				if(pnlLapHoaDon.txtMaSanPham.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "B???n c???n ph???i nh???p m?? s???n ph???m");
					return ;
				}
				SanPham sp = sanPhamController.getSanPham(ma);
				if(sp == null) {
					JOptionPane.showMessageDialog(null, " M?? s???n ph???m kh??ng ????ng");
					return ;
				}
				pnlLapHoaDon.txtTenSanPham.setText(sp.getTenSanPham());
				pnlLapHoaDon.txtDonGia.setText(sp.getGiaThanh()+"");
				pnlLapHoaDon.txtMauSac.setText(sp.getMauSac());
				pnlLapHoaDon.txtSize.setText(sp.getSize());
				pnlLapHoaDon.txtTenNCC.setText(sp.getNhaCungCap().getTenNCC());
				
			}
		});
		// X??? L?? KH??CH H??NG
		pnlKhachHang.btnThem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten = pnlKhachHang.txtTenNhanVien.getText().trim();
				String sodt = pnlKhachHang.txtSoDienThoai.getText().trim();
				String diaChi = pnlKhachHang.txtDiaChi.getText().trim();
				boolean gioiTinh = true;
				if (pnlKhachHang.radNam.isSelected()) {
					gioiTinh = false;
				}
				if (!(ten.length() > 0)) {
					JOptionPane.showMessageDialog(null, "T??n kh??ng ???????c ????? tr???ng");
					pnlKhachHang.txtTenNhanVien.requestFocus();
					pnlKhachHang.txtTenNhanVien.selectAll();
				} else if (ten.matches("[0-9]*")) {
					JOptionPane.showMessageDialog(null, "T??n kh??ch h??ng kh??ng ???????c c?? s???");
					pnlKhachHang.txtTenNhanVien.requestFocus();
					pnlKhachHang.txtTenNhanVien.selectAll();
				} else if (!(sodt.length() > 0 && sodt.matches("[0-9]{10}"))) {
					JOptionPane.showMessageDialog(null, "S??? ??i???n tho???i ph???i ????? 10 s??? v?? kh??ng ???????c ????? tr???ng");
					pnlKhachHang.txtSoDienThoai.requestFocus();
					pnlKhachHang.txtSoDienThoai.selectAll();
				}else if (diaChi.matches("[0-9]*") && !diaChi.equals("")) {
					JOptionPane.showMessageDialog(null, "?????a ch??? ph???i c?? ch???");
					pnlKhachHang.txtDiaChi.requestFocus();
					pnlKhachHang.txtDiaChi.selectAll();
				} else {
					KhachHang khachHang = new KhachHang(ten, gioiTinh, sodt, diaChi);
					khachHang = khachHangController.themKhachHang(khachHang);
					if (khachHang.getMaKhachHang().equals(""))
						JOptionPane.showMessageDialog(null, "Th??m kh??ng th??nh c??ng :((");
					else
						pnlKhachHang.txtMaKhachHang.setText(khachHang.getMaKhachHang());

					loadKhachHang();
				}

			}
		});
		pnlKhachHang.btnSua.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten = pnlKhachHang.txtTenNhanVien.getText().trim();
				String sodt = pnlKhachHang.txtSoDienThoai.getText().trim();
				String diaChi = pnlKhachHang.txtDiaChi.getText().trim();
				boolean gioiTinh = true;
				if (pnlKhachHang.radNam.isSelected()) {
					gioiTinh = false;
				}
				KhachHang khachHang = new KhachHang(ten, gioiTinh, sodt, diaChi);
				khachHang.setMaKhachHang(pnlKhachHang.txtMaKhachHang.getText());
				khachHang = khachHangController.themKhachHang(khachHang);
				JOptionPane.showMessageDialog(null, "C???p nh???t th??nh c??ng :))");
				loadKhachHang();
			}
		});
		pnlKhachHang.btnTimKH.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(pnlKhachHang.btnTimKH)) {
					String id = pnlKhachHang.cmbTimKiem.getSelectedItem().toString();
					String ten = pnlKhachHang.cmbTimKiem.getSelectedItem().toString();
					khachHangController.searchKhachHangBySDT(pnlKhachHang.listKhachHang, id, ten);
					pnlKhachHang.cmbTimKiem.setSelectedIndex(0);
				}
			}
		});
		pnlKhachHang.btnLamMoi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadKhachHang();
			}
		});
		pnlKhachHang.btnXoaTrang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlKhachHang.txtMaKhachHang.setText("");
				pnlKhachHang.txtTenNhanVien.setText("");
				pnlKhachHang.txtSoDienThoai.setText("");
				pnlKhachHang.txtDiaChi.setText("");
				pnlKhachHang.btnLapHoaDon.setEnabled(false);
			}
		});
		pnlKhachHang.tblDSNhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = pnlKhachHang.tblDSNhanVien.getSelectedRow();
				if (index != -1) {
					pnlKhachHang.txtMaKhachHang
							.setText(pnlKhachHang.tblDSNhanVien.getModel().getValueAt(index, 0).toString());
					pnlKhachHang.txtTenNhanVien
							.setText(pnlKhachHang.tblDSNhanVien.getModel().getValueAt(index, 1).toString());
					pnlKhachHang.txtSoDienThoai
							.setText(pnlKhachHang.tblDSNhanVien.getModel().getValueAt(index, 2).toString());
					pnlKhachHang.txtDiaChi
							.setText(pnlKhachHang.tblDSNhanVien.getModel().getValueAt(index, 3).toString());
					String gioiTinh = pnlKhachHang.tblDSNhanVien.getModel().getValueAt(index, 4).toString();
					if (gioiTinh.equals("Nam")) {
						pnlKhachHang.radNam.setSelected(true);
					} else {
						pnlKhachHang.radNu.setSelected(true);
					}
					pnlKhachHang.btnLapHoaDon.setEnabled(true);
				}
			}
		});
		pnlKhachHang.btnLapHoaDon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paneContent.setViewportView(pnlLapHoaDon);
				loadHoaDon();
			}
		});

		// X??? L?? LO???I S???N PH???M

		pnlLoaiSanPham.btnThemMoi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten = pnlLoaiSanPham.txtTenLoai.getText().trim();
				if (!(ten.length() > 0)) {
					JOptionPane.showMessageDialog(null, "T??n lo???i s???n ph???m kh??ng ???????c ????? tr???ng");
					pnlLoaiSanPham.txtTenLoai.requestFocus();
					pnlLoaiSanPham.txtTenLoai.selectAll();
					;
				} else if (ten.matches("[0-9]")) {
					JOptionPane.showMessageDialog(null, "T??n lo???i s???n ph???m kh??ng ???????c c?? s???");
					pnlLoaiSanPham.txtTenLoai.requestFocus();
					pnlLoaiSanPham.txtTenLoai.selectAll();
					;
				} else {
					LoaiSanPham lsp = loaiSanPhamController.save(new LoaiSanPham(ten));
					pnlLoaiSanPham.txtMaLoai.setText(lsp.getMaLoaiSanPham());
					loadLoaiSanPham();
				}

			}
		});
		pnlLoaiSanPham.btnCapNhat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten = pnlLoaiSanPham.txtTenLoai.getText().trim();
				LoaiSanPham loaiSanPham = new LoaiSanPham(ten);
				loaiSanPham.setMaLoaiSanPham(pnlLoaiSanPham.txtMaLoai.getText());
				loaiSanPhamController.save(loaiSanPham);
				loadLoaiSanPham();
			}
		});
		pnlLoaiSanPham.btnXoa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pnlLoaiSanPham.txtMaLoai.getText().equals("")) {
					loaiSanPhamController.xoaLSP(pnlLoaiSanPham.txtMaLoai.getText());
					loadLoaiSanPham();
					xoaTrangLoaiSanPham();
				} else
					JOptionPane.showMessageDialog(null, "B???n c???n ch???n s???n ph???m b??n d?????i ????? x??a");

			}
		});
		pnlLoaiSanPham.tblLoaiSanPham.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = pnlLoaiSanPham.tblLoaiSanPham.getSelectedRow();
				pnlLoaiSanPham.txtMaLoai
						.setText(pnlLoaiSanPham.tblLoaiSanPham.getModel().getValueAt(index, 0).toString());
				pnlLoaiSanPham.txtTenLoai
						.setText(pnlLoaiSanPham.tblLoaiSanPham.getModel().getValueAt(index, 1).toString());
			}
		});
		pnlLoaiSanPham.btnXoaTrang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xoaTrangLoaiSanPham();

			}
		});

		// X??? L?? S???N PH???M
		// Thu???c t??nh
		pnlSanPham.btnThemThuocTinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name, value;
				name = pnlSanPham.txtTenThuocTinh.getText().trim();
				value = pnlSanPham.txtGiaTri.getText().trim();
				if (name.equals("") || value.equals("")) {
					JOptionPane.showMessageDialog(null, "T??n v?? gi?? tr??? kh??ng ???????c r???ng");
					return;
				}
				String[] row = { name, value };
				pnlSanPham.listThuocTinh.addRow(row);
			}
		});
		pnlSanPham.btnXoaRong.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlSanPham.listThuocTinh.setRowCount(0);
			}
		});
		pnlSanPham.btnXoaThuocTinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) pnlSanPham.tblThuocTinh.getModel();
				int[] rows = pnlSanPham.tblThuocTinh.getSelectedRows();
				for (int i = 0; i < rows.length; i++) {
					model.removeRow(rows[i] - i);
				}
				xoaTrangThuocTinh();
			}
		});
		pnlSanPham.btnXoaTrangThuocTinh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xoaTrangThuocTinh();
			}
		});
		// San ph???m
		pnlSanPham.btnThemSanPham.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten, name, value, kichco, mausac;
				int soLuong = 0;
				double gia = 0;
				LoaiSanPham loai = null;
				NhaCungCap tenNCC = null;
				if (pnlSanPham.cmbTenLoai.getSelectedIndex() == -1)
					JOptionPane.showMessageDialog(null, "Ph???i ch???n t??n lo???i");
				else if (pnlSanPham.cmbTenNCC.getSelectedIndex() == -1)
					JOptionPane.showMessageDialog(null, "Ph???i ch???n t??n nh?? cung c???p");
				try {
					loai = loaiSanPhamController.getLoaiSPByName(pnlSanPham.cmbTenLoai.getSelectedItem().toString());
					tenNCC = nhaCungCapController.getNCCByName(pnlSanPham.cmbTenNCC.getSelectedItem().toString());
				} catch (Exception e2) {
					return;
				}

				Set<ThuocTinh> listTT = new HashSet<ThuocTinh>();
				ten = pnlSanPham.txtTenSanPham.getText().trim();
				kichco = pnlSanPham.txtKichCo.getText().trim();
				mausac = pnlSanPham.txtMauSac.getText().trim();
				try {
					soLuong = Integer.parseInt(pnlSanPham.txtSoLuong.getText().trim());
					gia = Double.parseDouble(pnlSanPham.txtGiaThanh.getText().trim());
				} catch (Exception e2) {

				}
				TableModel model = pnlSanPham.tblThuocTinh.getModel();
				for (int count = 0; count < model.getRowCount(); count++) {
					name = model.getValueAt(count, 0).toString();
					value = model.getValueAt(count, 1).toString();
					listTT.add(new ThuocTinh(name, value));
				}

				if (!(ten.length() > 0)) {
					JOptionPane.showMessageDialog(null, "T??n s???n ph???m kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtTenSanPham.requestFocus();
					pnlSanPham.txtTenSanPham.selectAll();
				} else if ((pnlSanPham.txtSoLuong.getText().toString().equals("")) || soLuong < 0) {
					JOptionPane.showMessageDialog(null, "S??? l?????ng ph???i l???n h??n 0 v?? kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtSoLuong.requestFocus();
					pnlSanPham.txtSoLuong.selectAll();
				} else if (!(pnlSanPham.txtSoLuong.getText().toString().matches("[0-9.]*"))) {
					JOptionPane.showMessageDialog(null, "S??? l?????ng ph???i l?? s???");
					pnlSanPham.txtSoLuong.requestFocus();
					pnlSanPham.txtSoLuong.selectAll();
				} else if ((pnlSanPham.txtGiaThanh.getText().toString().equals("")) || soLuong < 0) {
					JOptionPane.showMessageDialog(null, "Gi?? th??nh ph???i l???n h??n 0 v?? kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtGiaThanh.requestFocus();
					pnlSanPham.txtGiaThanh.selectAll();
				} else if (!(pnlSanPham.txtGiaThanh.getText().toString().matches("[0-9.]*"))) {
					JOptionPane.showMessageDialog(null, "Gi?? th??nh ph???i l?? s???");
					pnlSanPham.txtGiaThanh.requestFocus();
					pnlSanPham.txtGiaThanh.selectAll();
				} else if (!(kichco.length() > 0)) {
					JOptionPane.showMessageDialog(null, "K??ch c??? kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtKichCo.requestFocus();
					pnlSanPham.txtKichCo.selectAll();
				} else if (!(mausac.length() > 0)) {
					JOptionPane.showMessageDialog(null, "M??u s???c kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtKichCo.requestFocus();
					pnlSanPham.txtKichCo.selectAll();
				} else {
					SanPham sanPham = sanPhamController.saveSP(
							new SanPham(ten, gia, tenNCC, soLuong, kichco, mausac, listTT, loai, personalImage));
					if (sanPham.getMaSanPham().equals("")) {
						JOptionPane.showMessageDialog(null, "Th??m kh??ng th??nh c??ng");
						return;
					} else {
						JOptionPane.showMessageDialog(null,
								"Th??m S???n Ph???m th??nh c??ng [MaSP: " + sanPham.getMaSanPham() + "]");
						pnlSanPham.txtMaSanPham.setText(sanPham.getMaSanPham());
						loadSanPham();
					}
				}
			}
		});
		pnlSanPham.btnCapNhatSanPham.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pnlSanPham.txtMaSanPham.getText().equals(""))
					return;
				String ten, name, value, kichco, mausac;
				int soLuong = 0;
				double gia = 0;
				LoaiSanPham loai = loaiSanPhamController
						.getLoaiSPByName(pnlSanPham.cmbTenLoai.getSelectedItem().toString());
				NhaCungCap tenNCC = nhaCungCapController
						.getNCCByName(pnlSanPham.cmbTenNCC.getSelectedItem().toString());
				Set<ThuocTinh> listTT = new HashSet<ThuocTinh>();
				ten = pnlSanPham.txtTenSanPham.getText().trim();
				kichco = pnlSanPham.txtKichCo.getText().trim();
				mausac = pnlSanPham.txtMauSac.getText().trim();
				try {
					soLuong = Integer.parseInt(pnlSanPham.txtSoLuong.getText().trim());
					gia = Double.parseDouble(pnlSanPham.txtGiaThanh.getText().trim());
				} catch (Exception e2) {
					return;
				}
				TableModel model = pnlSanPham.tblThuocTinh.getModel();
				for (int count = 0; count < model.getRowCount(); count++) {
					name = model.getValueAt(count, 0).toString();
					value = model.getValueAt(count, 1).toString();
					listTT.add(new ThuocTinh(name, value));
				}
				SanPham sanPham = new SanPham(ten, gia, tenNCC, soLuong, kichco, mausac, listTT, loai, personalImage);
				sanPham.setMaSanPham(pnlSanPham.txtMaSanPham.getText());
				sanPham = sanPhamController.saveSP(sanPham);

				if (sanPham.getMaSanPham().equals("")) {
					JOptionPane.showMessageDialog(null, "C???p nh???t kh??ng th??nh c??ng");
					return;
				}
				JOptionPane.showMessageDialog(null,
						"C???p nh???t S???n Ph???m th??nh c??ng [MaSP: " + sanPham.getMaSanPham() + "]");
				pnlSanPham.txtMaSanPham.setText(sanPham.getMaSanPham());
				loadSanPham();
			}
		});
		pnlSanPham.btnXoaSanPham.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!pnlSanPham.txtMaSanPham.getText().equals("")) {
					sanPhamController.xoaSanPham(pnlSanPham.txtMaSanPham.getText());
					loadSanPham();
					xoaTrangSanPham();
				} else
					JOptionPane.showMessageDialog(null, "B???n c???n ch???n s???n ph???m b??n d?????i ????? x??a");
			}
		});
		pnlSanPham.btnXoaTrangSanPham.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xoaTrangSanPham();
			}
		});
		pnlSanPham.tblSanPham.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = pnlSanPham.tblSanPham.getSelectedRow();
				if (index == -1)
					return;
				String maSP = pnlSanPham.tblSanPham.getValueAt(index, 0).toString();
				SanPham sanPham = sanPhamController.getSanPham(maSP);
				if (sanPham.getHinh() != null) {
					try {
						Image img = ImageHelper.createImageFromByteArray(sanPham.getHinh(), "jpg");
						pnlSanPham.lblImage.setIcon(new ImageIcon(img));
						personalImage = sanPham.getHinh();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					personalImage = sanPham.getHinh();
					ImageIcon icon = new ImageIcon(
							getClass().getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_product_127px.png"));
					pnlSanPham.lblImage.setIcon(icon);
				}
				pnlSanPham.txtMaSanPham.setText(maSP);
				pnlSanPham.txtTenSanPham.setText(sanPham.getTenSanPham());
				pnlSanPham.cmbTenNCC.setSelectedItem(sanPham.getNhaCungCap().getTenNCC());
				pnlSanPham.txtSoLuong.setText(sanPham.getSoLuong() + "");
				pnlSanPham.cmbTenLoai.setSelectedItem(sanPham.getLoaiSanPham().getTenLoaiSanPham());
				pnlSanPham.txtGiaThanh.setText(sanPham.getGiaThanh() + "");
				pnlSanPham.txtKichCo.setText(sanPham.getSize());
				pnlSanPham.txtMauSac.setText(sanPham.getMauSac());
				Set<ThuocTinh> list = sanPham.getListThuocTinh();
				pnlSanPham.listThuocTinh.setRowCount(0);
				for (Iterator<ThuocTinh> iterator = list.iterator(); iterator.hasNext();) {
					ThuocTinh thuocTinh = iterator.next();
					String[] row = { thuocTinh.getTenThuocTinh(), thuocTinh.getGiaTri() };
					pnlSanPham.listThuocTinh.addRow(row);
				}
				pnlSanPham.btnLHD.setEnabled(true);
			}
		});
		pnlSanPham.btnLHD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				paneContent.setViewportView(pnlLapHoaDon);
				loadSanPhamVaoHoaDon();
			}
		});
		pnlSanPham.cmbChonTimKiem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cmbChonTimKiemActionPerformed(e);

			}
		});
		pnlSanPham.btnTim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnChonTimKiemActionPerformed(e);

			}
		});
		pnlSanPham.btnLamMoi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadSanPham();
				pnlSanPham.cmbChonTimKiem.setSelectedIndex(0);
				xoaTrangSanPham();
			}
		});
		// Xu ly hinh anh trong san pham
		pnlSanPham.btnImage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setFileFilter(new FileFilter() {
					@Override
					public String getDescription() {
						return "Image File (*.jpg)";
					}

					@Override
					public boolean accept(File f) {
						if (f.isDirectory())
							return true;
						else {
							return f.getName().toLowerCase().endsWith(".jpg");
						}
					}
				});
				if (chooser.showOpenDialog(paneContent) == JFileChooser.CANCEL_OPTION) {
					return;
				}
				File file = chooser.getSelectedFile();
				try {
					ImageIcon icon = new ImageIcon(file.getPath());
					Image img = ImageHelper.resize(icon.getImage(), 300, 160);
					ImageIcon resizedIcon = new ImageIcon(img);
					pnlSanPham.lblImage.setIcon(resizedIcon);
					personalImage = ImageHelper.toByteArray(img, "jpg");
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(paneContent, "Loi");
				}
			}
		});
		// XU LY NHA CUNG CAP
		pnlNguonHang.btnThemMoi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ten = pnlNguonHang.txtTen.getText().trim();
				String diachi = pnlNguonHang.txtDiaChi.getText().trim();
				String sdt = pnlNguonHang.txtSDT.getText().trim();
				if (!(ten.length() > 0 && ten.matches("[a-zA-Z0-9]*"))) {
					JOptionPane.showMessageDialog(null, "T??n nh?? cung c???p ph???i l?? k?? t??? v?? kh??ng ???????c ????? tr???ng");
					pnlNguonHang.txtTen.requestFocus();
					pnlNguonHang.txtTen.selectAll();
					;
				}
				else if (ten.matches("[0-9]*")) {
					JOptionPane.showMessageDialog(null, "T??n ph???i c?? ch???");
					pnlNguonHang.txtTen.requestFocus();
					pnlNguonHang.txtTen.selectAll();
				}else if (!(sdt.length() > 0 && sdt.matches("[0-9]{10}"))) {
					JOptionPane.showMessageDialog(null, "S??? ??i???n tho???i ph???i ????? 10 s??? v?? kh??ng ???????c ????? tr???ng");
					pnlNguonHang.txtSDT.requestFocus();
					pnlNguonHang.txtSDT.selectAll();
					;
				}else if (diachi.matches("[0-9]*") && !diachi.equals("")) {
					JOptionPane.showMessageDialog(null, "?????a ch??? ph???i c?? ch???");
					pnlNguonHang.txtDiaChi.requestFocus();
					pnlNguonHang.txtDiaChi.selectAll();
				} else {
					NhaCungCap nhaCungCap = new NhaCungCap(ten, diachi, sdt);
					nhaCungCapController.save(nhaCungCap);
					pnlNguonHang.txtMaNCC.setText(nhaCungCap.getMaNhaCungCap());
					loadNhaCungCap();
				}
			}
		});
		pnlNguonHang.tblNhaCungCap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = pnlNguonHang.tblNhaCungCap.getSelectedRow();
				pnlNguonHang.txtMaNCC.setText(pnlNguonHang.tblNhaCungCap.getModel().getValueAt(index, 0).toString());
				pnlNguonHang.txtTen.setText(pnlNguonHang.tblNhaCungCap.getModel().getValueAt(index, 1).toString());
				pnlNguonHang.txtDiaChi.setText(pnlNguonHang.tblNhaCungCap.getModel().getValueAt(index, 2).toString());
				pnlNguonHang.txtSDT.setText(pnlNguonHang.tblNhaCungCap.getModel().getValueAt(index, 3).toString());
			}
		});
		pnlNguonHang.btnXoaTrang.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xoaTrangNhaCungCap();
			}
		});
		pnlNguonHang.btnCapNhat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					NhaCungCap nhaCungCap = new NhaCungCap();

					nhaCungCap.setTenNCC(pnlNguonHang.txtTen.getText().trim());
					nhaCungCap.setDiaChi(pnlNguonHang.txtDiaChi.getText().trim());
					nhaCungCap.setSoDienThoai(pnlNguonHang.txtSDT.getText().trim());
					nhaCungCap.setMaNhaCungCap(pnlNguonHang.txtMaNCC.getText().trim());
					nhaCungCapController.save(nhaCungCap);
					loadNhaCungCap();
					JOptionPane.showMessageDialog(null, "C???p nh???t th??nh c??ng");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "C???p nh???t kh??ng th??nh c??ng");
				}
			}
		});
		pnlNguonHang.btnTim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String sdt = pnlNguonHang.cmbTimKiem.getSelectedItem().toString();
				String ten = pnlNguonHang.cmbTimKiem.getSelectedItem().toString();
				nhaCungCapController.searchNCC(pnlNguonHang.listNhaCC, sdt, ten);
				pnlNguonHang.cmbTimKiem.setSelectedIndex(0);
			}
		});
		pnlNguonHang.btnLamMoi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadNhaCungCap();
			}
		});
	}

	protected void xoaTrangSanPham() {
		pnlSanPham.txtMaSanPham.setText("");
		pnlSanPham.txtSoLuong.setText("");
		pnlSanPham.txtGiaThanh.setText("");
		pnlSanPham.txtTenSanPham.setText("");
		pnlSanPham.txtKichCo.setText("");
		pnlSanPham.txtMauSac.setText("");
		pnlSanPham.cmbTenNCC.setSelectedIndex(-1);
		pnlSanPham.cmbTenLoai.setSelectedIndex(-1);
		personalImage = null;
		ImageIcon icon = new ImageIcon(
				getClass().getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/icons8_product_127px.png"));
		pnlSanPham.lblImage.setIcon(icon);
		pnlSanPham.btnLHD.setEnabled(false);
	}

	protected void xoaTrangThuocTinh() {
		pnlSanPham.txtTenThuocTinh.setText("");
		pnlSanPham.txtGiaTri.setText("");
	}

	protected void loadSanPham() {
		sanPhamController.load(pnlSanPham.cmbTenLoai, pnlSanPham.cmbTenNCC, pnlSanPham.listSanPham);
		AutoCompleteDecorator.decorate(pnlSanPham.cmbTenLoai);
		AutoCompleteDecorator.decorate(pnlSanPham.cmbTenNCC);
	}

	protected void xoaTrangLoaiSanPham() {
		pnlLoaiSanPham.txtMaLoai.setText("");
		pnlLoaiSanPham.txtTenLoai.setText("");
	}

	protected void loadLoaiSanPham() {
		loaiSanPhamController.load(pnlLoaiSanPham.listLoaiSP);
	}

	protected void thanhToan() {
		String maKH, maNV, maSP, tenKH;
		double giaThanh = 0, tongTien, tienKhachTra = 0, chietKhau = 0, khuyenmai = 0;
		int soLuong;
		SanPham sanPham;
		Set<ChiTietHoaDon> listCTHD = new HashSet<ChiTietHoaDon>();
		ChiTietHoaDon chiTietHoaDon;
		DefaultTableModel model = (DefaultTableModel) pnlLapHoaDon.tblCTHD.getModel();
		tenKH = pnlLapHoaDon.txtTenKhachHang.getText();
		maKH = pnlLapHoaDon.txtMaKhachHang.getText();
		maNV = taiKhoanController.getTaiKhoan().getNhanVien().getMaNhanVien();
		try {
			tongTien = Double.parseDouble(pnlLapHoaDon.txtTongTien.getText());
			tienKhachTra = Double.parseDouble(pnlLapHoaDon.txtTienKhachDua.getText());
			chietKhau = Double.parseDouble(pnlLapHoaDon.txtChietKhau.getText());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ti???n kh??ch tr??? ho???c chi???t kh???u kh??ng ph???i s???");
			return;
		}
		HoaDon hoaDon = hoaDonController.lapHoaDon(new HoaDon(new Date(), tongTien,
				nhanVienController.getNhanVienById(maNV), khachHangController.getKhachHang(maKH)));
		if (hoaDon.getMaHoaDon().equals("")) {
			JOptionPane.showMessageDialog(null, "L???p h??a ????n kh??ng th??nh c??ng");
			return;
		}
		for (int i = 0; i < model.getRowCount(); i++) {
			try {
				maSP = model.getValueAt(i, 0).toString();
				soLuong = Integer.parseInt(model.getValueAt(i, 5).toString());
				giaThanh = Double.parseDouble(model.getValueAt(i, 6).toString());
				khuyenmai += Double.parseDouble(model.getValueAt(i, 6).toString())
						- (Double.parseDouble(model.getValueAt(i, 6).toString())
								* (1 - (pnlLapHoaDon.cmbKhuyenMai.getSelectedIndex() * 0.05)));
				sanPham = sanPhamController.getSanPham(maSP);
				sanPham.setSoLuong(sanPham.getSoLuong() - soLuong);
				chiTietHoaDon = new ChiTietHoaDon(hoaDon, sanPham, giaThanh, soLuong, khuyenmai, chietKhau,
						tienKhachTra);
				listCTHD.add(chiTietHoaDon);
				xoaTrangLapHoaDon();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		hoaDon.setListChiTietHoaDon(listCTHD);
		hoaDon = hoaDonController.lapHoaDon(hoaDon);
		try {
			Date now = new Date();
			Writer bw = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream("History//" + hoaDon.getMaHoaDon() + ".txt"), "UTF8"));
			bw.write("\t\t\tTHE H&L SHOP\r\n\r\n");
			bw.write("\t\t590 CMT8, P.11, Q.3, TPHCM\r\n");
			bw.write("\t\t\tS??T: 01212692802\r\n\r\n");
			bw.write("\t\t\tH??A ????N B??N H??NG\r\n\r\n");
			bw.write("M?? h??a ????n: " + hoaDon.getMaHoaDon() + "\r\n");
			bw.write("Th???i gian: " + ft.format(now) + "\r\n");
			bw.write("NH??N VI??N: " + maNV + "\r\n");
			bw.write("KH??CH H??NG: " + maKH + "\r\n");
			bw.write("T??N KH??CH H??NG: " + tenKH + "\r\n");
			bw.write("------------------------------------------------------------\r\n");
			bw.write("M??\t\tT??n nh?? cung c???p\tS??? l?????ng\tTh??nh ti???n\r\n");
			bw.write("-----------------------------------------------------------\r\n");
			// Ghi s???n ph???m
			int quantotal = 0;
			double tonggia = 0;

			for (int i = 0; i < model.getRowCount(); i++) {
				String id = (String) model.getValueAt(i, 0);
				String tenSP = (String) model.getValueAt(i, 1);
				String tenNCC = (String) model.getValueAt(i, 2);
				String quantity = String.valueOf(model.getValueAt(i, 5));
				String intomoney = String.valueOf(model.getValueAt(i, 6));
				bw.write((i + 1) + ". " + tenSP + "\r\n");
				bw.write(id + "\t\t" + tenNCC + "\t\t\t   " + quantity + "\t\t  " + intomoney + "VN??\r\n\r\n");
				quantotal += Integer.parseInt(quantity);
				tonggia += Double.parseDouble(intomoney);
			}
			bw.write("------------------------------------------------------------\r\n");
			bw.write("T???ng c???ng:\t\t\t\t   " + quantotal + "\t\t  " + tonggia + " VN??\r\n");
			bw.write("------------------------------------------------------------\r\n");
			bw.write("\t\tKhuy???n m??i:\t\t" + "\t-" + khuyenmai + " VN??\r\n");
			bw.write("\t\tChi???t kh???u:\t\t" + "\t-" + chietKhau + " VN??\r\n");
			bw.write("\t\t--------------------------------------------\r\n");
			bw.write("\t\tTh??nh ti???n:\t\t\t" + (tongTien - chietKhau) + " VN??\r\n");
			bw.write("\t\t--------------------------------------------\r\n");
			bw.write("\t\tTi???n kh??ch ????a:\t\t\t" + tienKhachTra + " VN??\r\n");
			bw.write("\t\tTi???n tr??? l???i:\t\t\t" + Double.valueOf(tienKhachTra - (tongTien - chietKhau)) + " VN??\r\n");
			bw.write("------------------------------------------------------------\r\n");
			bw.write("Ch????ng tr??nh ??u ????i: ");
			bw.write("Kh??ng c??.\r\n");
			bw.write("------------------------------------------------------------\r\n");
			bw.write("M???t kh???u Wifi: HandL\r\n");
			bw.write("---------------------C??M ??N QU?? KH??CH!----------------------");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// M??? file txt
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad History//" + hoaDon.getMaHoaDon() + ".txt");
		} catch (IOException e) {
		}
		pnlLapHoaDon.listCTHD.setRowCount(0);
		JOptionPane.showMessageDialog(null, "L???p h??a ????n th??nh c??ng");
	}

	protected void loadKhachHang() {
		pnlKhachHang.cmbTimKiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		khachHangController.loadKhachHang(pnlKhachHang.listKhachHang, pnlKhachHang.cmbTimKiem);
		AutoCompleteDecorator.decorate(pnlKhachHang.cmbTimKiem);
	}

	protected void loadTongTien() {
		DefaultTableModel model = (DefaultTableModel) pnlLapHoaDon.tblCTHD.getModel();
		double tongTien = 0;
		for (int i = 0; i < model.getRowCount(); ++i) {
			try {
				tongTien += Double.parseDouble(model.getValueAt(i, 6).toString())
						* (1 - (pnlLapHoaDon.cmbKhuyenMai.getSelectedIndex() * 0.05));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		pnlLapHoaDon.txtTongTien.setText(tongTien + "");
	}

	protected int removeRowCTHD(String maSP) {
		DefaultTableModel model = (DefaultTableModel) pnlLapHoaDon.tblCTHD.getModel();
		for (int i = 0; i < model.getRowCount(); ++i) {
			if (model.getValueAt(i, 0).equals(maSP.toUpperCase())) {
				int a = Integer.parseInt(model.getValueAt(i, 5).toString());
				model.removeRow(i);
				return a;
			}
		}
		return 0;
	}

	protected void xoaTrangLapHoaDon() {
		pnlLapHoaDon.txtMaSanPham.setText("");
		pnlLapHoaDon.txtSoLuong.setText("0");
		pnlLapHoaDon.txtGiaThanh.setText("");
		pnlLapHoaDon.txtTienKhachDua.setText("");
		pnlLapHoaDon.txtTenSanPham.setText("");
		pnlLapHoaDon.txtTenNCC.setText("");
		pnlLapHoaDon.txtSize.setText("");
		pnlLapHoaDon.txtMauSac.setText("");
		pnlLapHoaDon.tblCTHD.clearSelection();

	}

	private void loadHoaDon() {
		pnlLapHoaDon.txtMaKhachHang.setText(pnlKhachHang.txtMaKhachHang.getText());
		pnlLapHoaDon.txtTenKhachHang.setText(pnlKhachHang.txtTenNhanVien.getText());
		pnlLapHoaDon.txtSDTKH.setText(pnlKhachHang.txtSoDienThoai.getText());

		pnlLapHoaDon.txtMaNhanVien.setText(taiKhoanController.getTaiKhoan().getNhanVien().getMaNhanVien());
		pnlLapHoaDon.txtTenNhanVien.setText(taiKhoanController.getTaiKhoan().getNhanVien().getTenNhanVien());
		pnlLapHoaDon.txtSoDTNV.setText(taiKhoanController.getTaiKhoan().getNhanVien().getSoDienThoai());
	}

	private void loadSanPhamVaoHoaDon() {
		pnlLapHoaDon.txtMaSanPham.setText(pnlSanPham.txtMaSanPham.getText());
		pnlLapHoaDon.txtTenSanPham.setText(pnlSanPham.txtTenSanPham.getText());
		pnlLapHoaDon.txtMauSac.setText(pnlSanPham.txtMauSac.getText());
		pnlLapHoaDon.txtSize.setText(pnlSanPham.txtKichCo.getText());
		pnlLapHoaDon.txtTenNCC.setText(pnlSanPham.cmbTenNCC.getSelectedItem().toString());
		pnlLapHoaDon.txtDonGia.setText(pnlSanPham.txtGiaThanh.getText());
		pnlSanPham.btnLHD.setEnabled(false);
		
		pnlLapHoaDon.txtMaNhanVien.setText(taiKhoanController.getTaiKhoan().getNhanVien().getMaNhanVien());
		pnlLapHoaDon.txtTenNhanVien.setText(taiKhoanController.getTaiKhoan().getNhanVien().getTenNhanVien());
		pnlLapHoaDon.txtSoDTNV.setText(taiKhoanController.getTaiKhoan().getNhanVien().getSoDienThoai());
	}

	protected void xoaTrangCTHD() {
		pnlChiTietHoaDon.txtDonGia.setText("0.0");
		pnlChiTietHoaDon.txtSoLuong.setText("0");
		pnlChiTietHoaDon.txtMaSanPham.setText("0.0");
		pnlChiTietHoaDon.txtGiaThanh.setText("");
		pnlChiTietHoaDon.txtTenSanPham.setText("");
		pnlChiTietHoaDon.txtTenNCC.setText("");
		pnlChiTietHoaDon.txtKichCo.setText("");
		pnlChiTietHoaDon.txtMauSac.setText("");
		pnlChiTietHoaDon.tblCTHD.clearSelection();
	}

	private void loadCTHD() {
		String id = pnlhoaDon.txtMaHoaDon.getText();
		HoaDon hoaDon = hoaDonController.getHoaDonById(id);
		chiTietHoaDonController.loadData(pnlChiTietHoaDon.listCTHD, id);
		pnlChiTietHoaDon.txtMaHoaDon.setText(hoaDon.getMaHoaDon());
		pnlChiTietHoaDon.txtMaKhachHang.setText(hoaDon.getKhachHang().getMaKhachHang());
		pnlChiTietHoaDon.txtMaNhanVien.setText(hoaDon.getNhanVien().getMaNhanVien());
		pnlChiTietHoaDon.txtNgayLap.setText(hoaDon.getNgayLapHoaDon().toString());
		pnlChiTietHoaDon.txtTenKhachHang.setText(hoaDon.getKhachHang().getTenKhachHang());
		pnlChiTietHoaDon.txtTenNhanVien.setText(hoaDon.getNhanVien().getTenNhanVien());
		pnlChiTietHoaDon.btnCapNhat.setEnabled(false);
		pnlChiTietHoaDon.btnXoa.setEnabled(false);
		
	}

	protected void xoaTrangHoaDon(JButton btnCTHD) {
		pnlhoaDon.txtMaKhachHang.setText("");
		pnlhoaDon.txtNgayLap.getModel().setValue(null);
		pnlhoaDon.txtTongTien.setText("");
		btnCTHD.setEnabled(false);
		pnlhoaDon.btnXemPhiu.setEnabled(false);
		pnlhoaDon.tblHoaDon.clearSelection();
	}

	protected void loadNhaCungCap() {
		pnlNguonHang.cmbTimKiem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		nhaCungCapController.load(pnlNguonHang.listNhaCC, pnlNguonHang.cmbTimKiem);
		AutoCompleteDecorator.decorate(pnlNguonHang.cmbTimKiem);
	}

	protected void xoaTrangNhaCungCap() {
		pnlNguonHang.txtMaNCC.setText("");
		pnlNguonHang.txtTen.setText("");
		pnlNguonHang.txtDiaChi.setText("");
		pnlNguonHang.txtSDT.setText("");
		pnlNguonHang.tblNhaCungCap.clearSelection();
	}

	private void cmbChonTimKiemActionPerformed(ActionEvent evt) {
		if (pnlSanPham.cmbChonTimKiem.getSelectedIndex() == 0) {
			pnlSanPham.lblGiaTu.setVisible(false);
			pnlSanPham.txtGiaTu.setVisible(false);
			pnlSanPham.lblDen.setVisible(false);
			pnlSanPham.txtDen.setVisible(false);
			pnlSanPham.cmbTimTheoTen.setVisible(false);
			pnlSanPham.btnTim.setVisible(false);

		} else if (pnlSanPham.cmbChonTimKiem.getSelectedItem().equals("T??n")) {
			pnlSanPham.cmbTimTheoTen.setVisible(true);
			pnlSanPham.btnTim.setVisible(true);
			pnlSanPham.lblGiaTu.setVisible(false);
			pnlSanPham.txtGiaTu.setVisible(false);
			pnlSanPham.lblDen.setVisible(false);
			pnlSanPham.txtDen.setVisible(false);
			sanPhamController.TimKiemTheoTen(pnlSanPham.cmbTimTheoTen, pnlSanPham.listSanPham);
			AutoCompleteDecorator.decorate(pnlSanPham.cmbTimTheoTen);
		} else if (pnlSanPham.cmbChonTimKiem.getSelectedItem().equals("K??ch th?????c")) {
			pnlSanPham.cmbTimTheoTen.setVisible(true);
			pnlSanPham.btnTim.setVisible(true);
			pnlSanPham.lblGiaTu.setVisible(false);
			pnlSanPham.txtGiaTu.setVisible(false);
			pnlSanPham.lblDen.setVisible(false);
			pnlSanPham.txtDen.setVisible(false);
			sanPhamController.TimKiemTheoSize(pnlSanPham.cmbTimTheoTen, pnlSanPham.listSanPham);
			AutoCompleteDecorator.decorate(pnlSanPham.cmbTimTheoTen);
		} else if (pnlSanPham.cmbChonTimKiem.getSelectedItem().equals("Gi??")) {
			pnlSanPham.lblGiaTu.setVisible(true);
			pnlSanPham.txtGiaTu.setVisible(true);
			pnlSanPham.lblDen.setVisible(true);
			pnlSanPham.txtDen.setVisible(true);
			pnlSanPham.btnTim.setVisible(true);
			pnlSanPham.cmbTimTheoTen.setVisible(false);
		}
	}

	private void btnChonTimKiemActionPerformed(ActionEvent evt) {
		if (pnlSanPham.cmbChonTimKiem.getSelectedItem().equals("T??n")) {
			sanPhamController.searchByTenSP(pnlSanPham.listSanPham,
					pnlSanPham.cmbTimTheoTen.getSelectedItem().toString());
		}
		if (pnlSanPham.cmbChonTimKiem.getSelectedItem().equals("Gi??")) {
			while (true) {
				if (pnlSanPham.txtGiaTu.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(this, "Gi?? kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtGiaTu.grabFocus();
					return;
				} else if ((!pnlSanPham.txtGiaTu.getText().trim().matches("[0-9]+"))
						|| (Double.parseDouble(pnlSanPham.txtGiaTu.getText()) <= 0)) {
					JOptionPane.showMessageDialog(this, "Gi?? ph???i l?? s??? v?? l???n h??n 0");
					pnlSanPham.txtGiaTu.grabFocus();
					return;
				} else {
					break;
				}
			}
			while (true) {
				if (pnlSanPham.txtDen.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(this, "Gi?? kh??ng ???????c ????? tr???ng");
					pnlSanPham.txtDen.grabFocus();
					return;
				} else if ((!pnlSanPham.txtDen.getText().trim().matches("[0-9]+"))
						|| (Double.parseDouble(pnlSanPham.txtDen.getText()) <= 0)) {
					JOptionPane.showMessageDialog(this, "Gi?? ph???i l?? s??? v?? l???n h??n 0");
					pnlSanPham.txtDen.grabFocus();
					return;
				} else {
					break;
				}
			}
			if ((Double.parseDouble(pnlSanPham.txtGiaTu.getText().trim())) >= Double
					.parseDouble(pnlSanPham.txtDen.getText().trim())) {
				JOptionPane.showMessageDialog(this, "Gi?? ph???i t??? nh??? ?????n l???n");
				pnlSanPham.txtGiaTu.grabFocus();
			} else {
				sanPhamController.searchByGiaThanh(pnlSanPham.listSanPham,
						Double.parseDouble(pnlSanPham.txtGiaTu.getText()),
						Double.parseDouble(pnlSanPham.txtDen.getText()));
			}
		}
		if (pnlSanPham.cmbChonTimKiem.getSelectedItem().equals("K??ch th?????c")) {
			sanPhamController.searchBySize(pnlSanPham.listSanPham,
					pnlSanPham.cmbTimTheoTen.getSelectedItem().toString());
		}
	}

	protected void doiMatKhau() {
		try {
			DoiMatKhauUI frame = Nhom05DeTai01Ptud15A2021Application.getApp().getBean(DoiMatKhauUI.class);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void dangXuat() {
		try {
			paneContent.setViewportView(pnlGioiThieuUI);
			taiKhoanController.logout();
			DangNhapUI frame = Nhom05DeTai01Ptud15A2021Application.getApp().getBean(DangNhapUI.class);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dispose();
	}

	private void loadThongTinNhanVienTheoRoleNhanVien() {
		pnlhoaDon.txttenNhanVien.setEditable(false);
		pnlhoaDon.txtemail.setEditable(false);
		pnlhoaDon.txtsoDT.setEditable(false);
		pnlhoaDon.txtMaNhanVien.setText(taiKhoanController.getTaiKhoan().getNhanVien().getMaNhanVien());
		pnlhoaDon.txttenNhanVien.setText(taiKhoanController.getTaiKhoan().getNhanVien().getTenNhanVien());
		pnlhoaDon.txtemail.setText(taiKhoanController.getTaiKhoan().getNhanVien().getEmail().toString());
		pnlhoaDon.txtsoDT.setText(taiKhoanController.getTaiKhoan().getNhanVien().getSoDienThoai());
		pnlhoaDon.btnTimNhanVien.setVisible(false);
		pnlhoaDon.listHoaDon.setRowCount(0);
		pnlhoaDon.listKhachHang.setRowCount(0);
		pnlhoaDon.listNhanVien.setRowCount(0);
	}
}
