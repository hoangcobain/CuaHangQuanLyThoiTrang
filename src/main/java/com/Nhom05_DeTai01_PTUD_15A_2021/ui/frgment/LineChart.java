package com.Nhom05_DeTai01_PTUD_15A_2021.ui.frgment;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart extends JPanel {
	private static final long serialVersionUID = 1L;

	public LineChart(DefaultCategoryDataset dataset) {
		JFreeChart lineChart = ChartFactory.createLineChart("Title Name", "X Axis", "Y Axis",  dataset, PlotOrientation.VERTICAL, false, true, false);
		CategoryPlot categoryPlot = lineChart.getCategoryPlot();
		categoryPlot.setBackgroundPaint(Color.WHITE);
		
		LineAndShapeRenderer lineAndShapeRenderer = (LineAndShapeRenderer) categoryPlot.getRenderer();
		lineAndShapeRenderer.setSeriesPaint(0, new Color(212, 71, 255));
		categoryPlot.setRenderer(lineAndShapeRenderer);
		
		removeAll();
		setLayout(new BorderLayout(0, 0));
		add(new ChartPanel(lineChart), BorderLayout.CENTER);
		validate();
	}

}
