/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ilham
 */
public class Latihan2 {

    /**
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try (FileInputStream i = new FileInputStream("lirik.txt")) {
            int lirik;
            while ((lirik = i.read()) != -1) {
                if (((char) lirik) == ' ') {
                    System.out.print('_');
                } else {
                    System.out.print((char) lirik);
                }
            }
            System.out.println();
            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Tidak Ada!");
        }
    }

}
