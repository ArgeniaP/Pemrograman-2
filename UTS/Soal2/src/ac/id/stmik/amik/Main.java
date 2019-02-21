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
        System.out.println("Pilih (pilih 0 untuk keluar):");
        System.out.println("1 -> Kubus");
        System.out.println("2 -> Bola");
        System.out.println("3 -> Kerucut");
        System.out.println("Pilihan anda? (1/2/3/0)");
        System.out.print("Masukan anda:");
        int m = s.nextInt();
        switch (m) {
            case 1:
                System.out.println("Kubus");
                break;
            case 2:
                System.out.println("Bola");
                break;
            case 3:
                System.out.println("Kerucut");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Pilihanmu tidak valid!");
        }
    }

}
