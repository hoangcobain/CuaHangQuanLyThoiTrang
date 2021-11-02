package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.SwingConstants;

public class MenuItem extends JPanel {
	private static final long serialVersionUID = 1L;

	private boolean selected;
	private JLabel lbIcon, lbName;
	private boolean over;
	/**
	 * Create the panel.
	 */
	public MenuItem(ModelMenu data) {
		setOpaque(false);
		
		lbIcon = new JLabel("");
		lbIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lbIcon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbIcon.setForeground(Color.WHITE);
		
		lbName = new JLabel("Menu name");
		lbName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbName.setForeground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbIcon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lbName, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lbName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lbIcon, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
					.addGap(8))
		);
		setLayout(groupLayout);

		if (data.getType()== ModelMenu.MenuType.MENU) {
			lbIcon.setIcon(data.toIcon());
			lbName.setText(data.getName());
		}else if (data.getType()== ModelMenu.MenuType.TITLE) {
			lbName.setFont(new java.awt.Font("sansserif", 1, 15));
			lbName.setText(data.getName());
			lbIcon.setVisible(false);
		}else {
			lbName.setText("");
		}
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
		repaint();
	}
	
	public void setOver(boolean over) {
		this.over = over;
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		if (selected || over) {
			Graphics2D graphics2d = (Graphics2D) g;
			graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			if(selected) {
				graphics2d.setColor(new Color(255, 255, 255, 90));
			}else {
				graphics2d.setColor(new Color(255, 255, 255, 50));
			}			
			graphics2d.fillRoundRect(0, 0, getWidth(), getHeight(), 5, 5);
			super.paintComponent(graphics2d);
		}
		super.paintComponent(g);
	}
}
