package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.Color;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.BorderLayout;

public class PieChart extends JPanel {
	private static final long serialVersionUID = 1L;

	public PieChart(DefaultPieDataset dataset) {
		JFreeChart pieChart = ChartFactory.createPieChart("Giới tính khách hàng sử dụng", dataset, false, true, false);
		PiePlot piePlot = (PiePlot) pieChart.getPlot();
		piePlot.setBackgroundPaint(Color.WHITE);
		removeAll();
		setLayout(new BorderLayout(0, 0));
		add(new ChartPanel(pieChart), BorderLayout.CENTER);
	}

}
