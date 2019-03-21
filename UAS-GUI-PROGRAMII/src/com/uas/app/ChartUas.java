/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uas.app;

import java.util.Arrays;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.demo.charts.ExampleChart;

/**
 *
 * @author user
 */
public class ChartUas implements ExampleChart<CategoryChart>{
    MainFrame mf = new MainFrame();
    public static void main(String[] args){
        ExampleChart<CategoryChart> cChart = new ChartUas();
        CategoryChart chart = cChart.getChart();
        new SwingWrapper<>(chart).displayChart();
    }

    @Override
    public CategoryChart getChart() {
        CategoryChart chart = new CategoryChartBuilder()
                .width(200).height(150).xAxisTitle("Nilai")
                .yAxisTitle("Jumlah").title("Sebaran Nilai UAS").build();
        chart.addSeries("Nilai", 
                Arrays.asList(new String[] {"<50","50-60","61-70","71-80","81-90","91-100"}), 
                Arrays.asList(mf.dataNilaiUas()));
        return chart;
    }
}
