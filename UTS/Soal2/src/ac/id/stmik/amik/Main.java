/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmik.amik;

import java.util.Scanner;

/**
 *
 * @author ilham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Program Menghitung Luas Permukaan dan Volume Bangun Ruang");
        System.out.println("=========================================================");
        do {
            System.out.println("Pilih (pilih 0 untuk keluar):");
            System.out.println("1 -> Kubus");
            System.out.println("2 -> Bola");
            System.out.println("3 -> Kerucut");
            System.out.print("Pilihan anda? (1/2/3/0): ");
            int m = s.nextInt();
            switch (m) {
                case 1:
                    Kubus kubus = new Kubus();
                    
                    System.out.print("Masukan nilai sisi Kubus: ");
                    kubus.setSisi(s.nextDouble());
                    
                    System.out.println("Nilai luas permukaan dan volume Kubus dengan sisi "+kubus.getSisi()+" cm adalah:");
                    System.out.println("Luas Permukaan Kubus: "+kubus.hitungLuasPermukaan()+" cm persegi");
                    System.out.println("Volume Kubus: "+kubus.hitungVolume()+" cm kubik");
                    break;
                case 2:
                    Bola bola =  new Bola();
                    
                    System.out.print("Masukan nilai jari-jari Bola: ");
                    bola.setR(s.nextDouble());
                    
                    System.out.println("Nilai Luas Permukaan dan Volume Bola dengan jari-jari "+bola.getR()+" cm adalah:");
                    System.out.println("Luas Permukaan Bola: "+bola.hitungLuasPermukaan()+" cm persegi");
                    System.out.println("Luas Volume: "+bola.hitungVolume()+" cm kubik");
                    break;
                case 3:
                    Kerucut kerucut = new Kerucut();
                    
                    System.out.print("Masukan nilai jari-jari Kerucut: ");
                    kerucut.setR(s.nextDouble());
                    System.out.print("Masukan nilai tinggi Kerucut: ");
                    kerucut.setT(s.nextDouble());
                    
                    System.out.println("Nilai Luas Permukaan dan Volume Kerucut dengan jari-jari "+kerucut.getR()+" cm dan tinggi "+kerucut.getT()+" cm adalah:");
                    System.out.println("Luas Permukaan Kerucut: "+kerucut.hitungLuasPermukaan()+" cm persegi");
                    System.out.println("Luas Volume: "+kerucut.hitungVolume()+" cm kubik");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Pilihanmu tidak valid!");
            }
            System.out.println();
        } while (true);
    
    }

}
