/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmik.amik;

/**
 *
 * @author ilham
 */
public class Kubus extends BangunRuang {

    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Kubus() {
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luas = 6 * Math.pow(getSisi(), 2);
        return luas;
    }

    @Override
    public double hitungVolume() {
        double volume = Math.pow(getSisi(), 3);
        return volume;
    }

}
