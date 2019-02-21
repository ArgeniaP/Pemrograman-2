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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0) {
                if ((i % 7) == 0) {
                    System.out.println(i + "\t: Belajar Java menyenangkan");
                } else {
                    System.out.println(i + "\t: Belajar");
                }
            } else if ((i % 7) == 0) {
                System.out.println(i + "\t: Java");
            } else {
                System.out.println(i + "\t: -");
            }
        }

    }

}
