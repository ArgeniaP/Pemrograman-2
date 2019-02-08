/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamik;

import ac.id.stmikamik.base.Circle;
import ac.id.stmikamik.base.Rectangle;

/**
 *
 * @author user
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle c = new Circle(100, "Bola");
        
        System.out.println("Nama lingkaran ini adalah: " + c.getName());
        System.out.println("Dengan radius: " + c.getRadius());
        System.out.println("Luasnya: " + c.getArea());
        
        Rectangle r = new Rectangle("Papan", 14, 43);
        
        System.out.println("Nama persegi panjang ini adalah: " + r.getName());
        System.out.println("Dengan panjang: " + r.getLength());
        System.out.println("Dengan lebar: " + r.getWidth());
        System.out.println("Luasnya: " + r.getArea());
    }
    
}
