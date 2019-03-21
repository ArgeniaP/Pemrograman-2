/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uas.app;

import java.awt.Color;
import java.util.Arrays;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;

/**
 *
 * @author user
 */
public class ChartPengolah {
    
    public ChartPengolah(){
        
    }
    
    public static PieChart pieChartNA() {
        MainFrame mf = new MainFrame();
        PieChart pc = new PieChartBuilder().width(300).height(400)
                .title("Persebaran Nilai Akhir").build();

        Color[] bagian = new Color[]{new Color(0, 255, 0),
            new Color(0, 255, 191),
            new Color(0, 191, 255),
            new Color(0, 64, 255),
            new Color(64, 0, 255),
            new Color(191, 0, 255)
        };

        pc.getStyler().setSeriesColors(bagian);

        Integer[] seri = mf.dataNilaiAkhir();
        pc.addSeries("A", seri[0]);
        pc.addSeries("B", seri[1]);
        pc.addSeries("C", seri[2]);
        pc.addSeries("D", seri[3]);
        pc.addSeries("E", seri[4]);
        pc.addSeries("T", seri[5]);

        return pc;
    }
    
    public static CategoryChart catChartUas() {
        MainFrame mf = new MainFrame();
        CategoryChart cc = new CategoryChartBuilder().width(300).height(400)
                .title("Persebaran Nilai UAS").xAxisTitle("Nilai")
                .yAxisTitle("Jumlah").build();

        cc.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        cc.getStyler().setHasAnnotations(true);

        cc.addSeries("Nilai",
                Arrays.asList(new String[]{"<50", "50-60", "61-70", "71-80", "81-90", "91-100"}),
                Arrays.asList(mf.dataNilaiUas()));

        return cc;
    }
}
