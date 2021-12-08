package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class Card extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JLabel lbIcon;
	private JLabel lbTitle, lbValue, lbDescrip;
	private Color color1, color2;
	
	public void setDataCard(ModelCard data) {
		lbIcon.setIcon(data.getIcon());
		lbTitle.setText(data.getTitle());
		lbValue.setText(data.getValue());
		lbDescrip.setText(data.getDescription());
	}

	public Card() {
		
		color1 = Color.BLACK;
		color2 = Color.WHITE;
		
		lbIcon = new JLabel("");
		lbIcon.setIcon(new ImageIcon(Card.class.getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/money.png")));
		
		lbTitle = new JLabel("Title");
		lbTitle.setForeground(Color.WHITE);
		lbTitle.setFont(new Font("Tahoma", Font.BOLD, 35));
		lbTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		
		lbValue = new JLabel("Value");
		lbValue.setForeground(Color.WHITE);
		lbValue.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbValue.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbDescrip = new JLabel("Description");
		lbDescrip.setForeground(Color.WHITE);
		lbDescrip.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbDescrip.setVerticalAlignment(SwingConstants.TOP);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lbDescrip, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
						.addComponent(lbValue, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lbIcon, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(lbTitle, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lbTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
						.addComponent(lbIcon, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbValue)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbDescrip, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(17))
		);
		setLayout(groupLayout);

	}

	public Color getColor1() {
		return color1;
	}

	public void setColor1(Color color1) {
		this.color1 = color1;
	}

	public Color getColor2() {
		return color2;
	}

	public void setColor2(Color color2) {
		this.color2 = color2;
	}	
	
	public JLabel getLbValue() {
		return lbValue;
	}

	public void setLbValue(JLabel lbValue) {
		this.lbValue = lbValue;
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
		graphics2d.setPaint(gradientPaint);
		graphics2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		graphics2d.setColor(new Color(255,255,255,50));
		graphics2d.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
		graphics2d.fillOval(getWidth()-(getHeight()/2)-20, getHeight()/2+20, getHeight(), getHeight());
		super.paintChildren(graphics2d);
	}
}
