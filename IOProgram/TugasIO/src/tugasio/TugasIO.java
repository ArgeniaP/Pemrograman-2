/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ilham
 */
public class TugasIO {

    public static void tambahData() {
        try (FileOutputStream o = new FileOutputStream("addressbook.dat", true)) {
            Scanner s = new Scanner(System.in);

            System.out.print("Masukan Nama: ");
            String nama = s.nextLine() + "\t";

            System.out.print("Masukan alamat: ");
            String alamat = s.nextLine() + "\t";

            System.out.println("Masukan telepon: ");
            String hp = s.nextLine() + "\t";

            System.out.println("Masukan email: ");
            String email = s.nextLine() + "\n";

            o.write(nama.getBytes());
            o.write(alamat.getBytes());
            o.write(hp.getBytes());
            o.write(email.getBytes());

            o.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openFile() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("Belum ada Buku Alamat");
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("===== Selamat Datang di Buku Alamat =====");
            System.out.println("Apa yang hendak anda lakukan?");
            System.out.println("1 => Menambah Data pada Buku Alamat\n"
                    + "2 => Menampilkan Data pada Buku Alamat\n"
                    + "3 => Keluar");
            System.out.print("Pilihan anda: ");
            int opsi = s.nextInt();
            switch(opsi){
                case 1:
                    tambahData();
                    break;
                case 2:
                    openFile();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukan anda salah!");
                    break;
            }
            System.out.println();
            System.out.println();
        } while (true);
    }

}
