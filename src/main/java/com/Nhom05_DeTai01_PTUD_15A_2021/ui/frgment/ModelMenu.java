package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ModelMenu {

	private String name, icon;
	private MenuType type; 
	
	public static enum MenuType {
		TITLE, MENU, EMPTY
	}
	
	public ModelMenu() {
	}

	public ModelMenu(String icon, String name,  MenuType type) {
		super();
		this.icon = icon;
		this.name = name;
		this.type = type;
	}

//	GET Image Icon
	public Icon toIcon() {
		return new ImageIcon(getClass().getResource("/com/Nhom05_DeTai01_PTUD_15A_2021/icon/"+icon+".png"));
	}
	
//	GET - SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public MenuType getType() {
		return type;
	}

	public void setType(MenuType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Item_Menu [name=" + name + ", icon=" + icon + ", type=" + type + "]";
	}
	
	
}
