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
public class Bola extends BangunRuang{
    
    double r;

    public Bola(double r) {
        this.r = r;
    }

    public Bola() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luas = 4 * Math.PI * Math.pow(getR(), 2);
        return luas;
    }

    @Override
    public double hitungVolume() {
        double volume = (4/3) * Math.PI * Math.pow(getR(), 3);
        return volume;
    }
    
}
