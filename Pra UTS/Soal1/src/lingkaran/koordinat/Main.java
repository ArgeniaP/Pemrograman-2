/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran.koordinat;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran c1 = new Lingkaran();
        Lingkaran c2 = new Lingkaran();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Silahkan masukan data dari lingkaran C1, dengan format (x,y,r):");
        String[] raw1 = s.next().split(",", 3);
        c1.setX(Integer.parseInt(raw1[0]));
        c1.setY(Integer.parseInt(raw1[1]));
        c1.setR(Integer.parseInt(raw1[2]));
        
        System.out.println("Silahkan masukan data dari Lingkaran C2, dengan format (x,y,r):");
        String[] raw2 = s.next().split(",", 3);
        c2.setX(Integer.parseInt(raw2[0]));
        c2.setY(Integer.parseInt(raw2[1]));
        c2.setR(Integer.parseInt(raw2[2]));
        
        int jarak = (int) Math.sqrt(Math.pow((c1.getX() - c2.getX()), 2) + Math.pow((c1.getY()-c2.getY()), 2));
        
        if(jarak >= (c1.getR()+c2.getR())){
            System.out.println("C1 dan C2 Saling Lepas");
        } else if(jarak < (c1.getR()+c2.getR())){
            if((c1.getR() < c2.getR()) && (((c1.getX()+c1.getR()<c2.getX()+c2.getR())&&(c1.getX()-c1.getR()>c2.getX()-c2.getR()) && (c1.getY()+c1.getR()<c2.getY()+c2.getR())&&(c1.getY()-c1.getR()>c2.getY()-c2.getR())))){
                System.out.println("C1 ada di dalam C2");
            } else if((c1.getR() > c2.getR()) && (((c1.getX()+c1.getR()>c2.getX()+c2.getR())&&(c1.getX()-c1.getR()<c2.getX()-c2.getR()) && (c1.getY()+c1.getR()>c2.getY()+c2.getR())&&(c1.getY()-c1.getR()<c2.getY()-c2.getR())))){
                System.out.println("C2 ada di dalam C1");
            } else {
                System.out.println("C1 dan C2 saling beririsan");
            }
        }
    }
}
