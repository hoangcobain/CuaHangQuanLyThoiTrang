package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class MenuList<E extends Object> extends JList<E>{
	private static final long serialVersionUID = 1L;

	private final DefaultListModel listModel;
	private int selectedIndex = -1;
	private int overIndex = -1;
	private EventMenuSelected event;

	public void addEventMenuSelected(EventMenuSelected event) {
		this.event = event;
	}

	public MenuList() {
		setOpaque(false);
		setAutoscrolls(true);
		listModel = new DefaultListModel();
		setModel(listModel);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (SwingUtilities.isLeftMouseButton(e)) {
					int index = locationToIndex(e.getPoint());
					Object o = listModel.getElementAt(index);
					if (o instanceof ModelMenu) {
						ModelMenu menu = (ModelMenu) o;
						if (menu.getType() == ModelMenu.MenuType.MENU) {
							selectedIndex = index;
							if (event!=null) {
								event.selected(index);
							}
						}
					} else {
						selectedIndex = index;
					}
					repaint();
				}				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				overIndex = -1;
				repaint();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int index = locationToIndex(e.getPoint());
				if (index != overIndex) {
					Object o = listModel.getElementAt(index);
					if (o instanceof ModelMenu) {
						ModelMenu menu = (ModelMenu) o;
						if (menu.getType() == ModelMenu.MenuType.MENU) {
							overIndex = index;
						} else {
							overIndex = -1;
						}
						repaint();
					}
				}
			}
		});
	}

	//	ADD ITEM
	public void addItem(ModelMenu data) {
		listModel.addElement(data);
	}

	@Override
	public ListCellRenderer<? super E> getCellRenderer() {
		return new DefaultListCellRenderer() {
			private static final long serialVersionUID = 1L;

			@Override
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean selected,
					boolean focus) {
				ModelMenu data;
				if (value instanceof ModelMenu) {
					data = (ModelMenu) value;
				}else {
					data = new ModelMenu("",value+"", ModelMenu.MenuType.EMPTY);
				}
				MenuItem item = new MenuItem(data);
				item.setSelected(selectedIndex == index);
				item.setOver(overIndex == index);
				return item;
			}
		};
	}
}
