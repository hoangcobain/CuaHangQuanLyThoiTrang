package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ModelCard {
	private Icon icon;
	private String title, value, description;
	
	public ModelCard() {
	}
	
	public ModelCard(String icon, String title, String value, String description) {
		super();
		this.icon = new ImageIcon(getClass().getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/"+icon+".png"));
		this.title = title;
		this.value = value;
		this.description = description;
	}

	public Icon getIcon() {
		return icon;
	}
	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
