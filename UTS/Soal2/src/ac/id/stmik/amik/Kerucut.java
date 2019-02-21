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
public class Kerucut extends BangunRuang {

    private double t;
    private double r;

    public Kerucut() {
    }

    public Kerucut(double t, double r) {
        this.t = t;
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungLuasPermukaan() {
        double s = Math.sqrt(Math.pow(getR(), 2) + Math.pow(getT(), 2));
        double luas = Math.PI * getR() * (getR() + s);
        return luas;
    }

    @Override
    public double hitungVolume() {
        double volume = (1 / 3) * Math.PI * Math.pow(getR(), 2) * getT();
        return volume;
    }

}
