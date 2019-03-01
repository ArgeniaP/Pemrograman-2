/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ilham
 */
public class Latihan1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try (FileOutputStream o = new FileOutputStream("latihan.dat");){
            System.out.println("Masukan Data yang akan disimpan pada latihan.dat:");
            o.write(s.nextLine().getBytes());
            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
