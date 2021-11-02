package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistoChart extends JLabel{
	private static final long serialVersionUID = 1L;

	public HistoChart(DefaultCategoryDataset dataset) {
		JFreeChart barChart = ChartFactory.createBarChart("Title Name", "X Axis", "Y Axis",  dataset, PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot categoryPlot = barChart.getCategoryPlot();
		categoryPlot.setBackgroundPaint(Color.WHITE);
		
		BarRenderer barRenderer = (BarRenderer) categoryPlot.getRenderer();
		barRenderer.setSeriesPaint(0, new Color(212, 71, 255));
		removeAll();
		setLayout(new BorderLayout(0, 0));
		add(new ChartPanel(barChart), BorderLayout.CENTER);
		validate();
	}
}
