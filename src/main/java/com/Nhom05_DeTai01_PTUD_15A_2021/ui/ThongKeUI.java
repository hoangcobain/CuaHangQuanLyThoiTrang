package com.Nhom05_DeTai01_PTUD_15A_2021.ui;

import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.Card;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ModelCard;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ThongKeHoaDon;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ThongKeKhachHang;
import com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment.ThongKeSanPham;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class ThongKeUI extends JPanel {
	private static final long serialVersionUID = 1L;
	ThongKeSanPham thongKeSanPham = new ThongKeSanPham();
	ThongKeHoaDon thongKeHoaDon = new ThongKeHoaDon();
	ThongKeKhachHang thongKeKhachHang = new ThongKeKhachHang();
	private JScrollPane panelContent = new JScrollPane();
	public ThongKeUI() {
		setBorder(null);
		setBackground(Color.WHITE);
		
		Card card1 = new Card();
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelContent.setViewportView(thongKeHoaDon);
			}
		});
		
		card1.setColor1(new Color(188, 87, 255));
		card1.setColor2(new Color(238, 212, 255));
		card1.setDataCard(new ModelCard("money", "Hóa đơn", "1000$", "Doanh thu của cửa hàng"));
		
		Card card2 = new Card();
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelContent.setViewportView(thongKeSanPham);
			}
		});
		card2.setColor1(new Color(94, 139, 255));
		card2.setColor2(new Color(212, 224, 255));
		card2.setDataCard(new ModelCard("money", "Sản Phẩm", "200", "Các sản phầm còn trong kho"));
		
		Card card3 = new Card();
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelContent.setViewportView(thongKeKhachHang);
			}
		});
		card3.setColor1(new Color(255, 82, 111));
		card3.setColor2(new Color(255, 168, 183));
		card3.setDataCard(new ModelCard("money", "Khách Hàng", "300", "Số lượng khách hàng đã sử dụng"));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(card1, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(card2, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(card3, GroupLayout.PREFERRED_SIZE, 329, Short.MAX_VALUE)
							.addGap(8))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(card3, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addComponent(card1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addComponent(card2, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelContent, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
}
