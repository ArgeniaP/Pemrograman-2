/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BukuAlamat;

import BukuAlamat.Source.Buku;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    static Buku d = new Buku();
    static Scanner s = new Scanner(System.in);
    static String[][] data = new String[100][4];
    
    private static void input(String nama, String alamat, String telepon, String email){
        d.setNama(nama);
        d.setAlamat(alamat);
        d.setTelepon(telepon);
        d.setEmail(email);
    }
    
    private static void insert(){
        int i = 0;
        do{
            if(data[i][0] == null){
                data[i][0] = d.getNama();
                data[i][1] = d.getAlamat();
                data[i][2] = d.getTelepon();
                data[i][3] = d.getEmail();
            }
            i++;
        } while(data[i][0] != null);
    }
    
    private static void update(int ind1, int ind2, String update){
        data[ind1-1][ind2-1] = update;
    }
    
    private static void delete(int ind1){
        data[ind1-1][0] = null;
        data[ind1-1][1] = null;
        data[ind1-1][2] = null;
        data[ind1-1][3] = null;
    }
    
    private static void show(){
        int i = 0;
        if(data[i][0] == null){
            System.out.println("Data masih kosong!");
        } else {
            System.out.println("Berikut data yang sudah terkumpul:");
            while(data[i][0] != null){
                System.out.println((i+1)+" =>\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        do{
            System.out.println("Selamat Datang!");
            System.out.println("Silahkan pilih salah satu opsi berikut:");
            System.out.println("1 => Insert Data\t3 => Update Data");
            System.out.println("2 => Delete Data\t4 => Show Data");
            System.out.println("Untuk menghentikan program masukan 0.");
            int opsi = s.nextInt();
        
            switch(opsi){
                case 1:
                    System.out.println("Silahkan masukan data:");
                    System.out.println("Dengan Format Nama>Alamat>No. Telepon>Email");
                    String masuk = s.next();
                    String[] raw = masuk.split(">");
                    input(raw[0], raw[1], raw[2], raw[3]);
                    System.out.println("Sedang memproses...");
                    insert();
                    System.out.println("Selesai...");
                    break;
                case 2:
                    System.out.println("Silahkan masukan no. urut data yang akan dirubah");
                    int j = s.nextInt();
                    System.out.println("Data diambil...");
                    
                    System.out.println("Masukan data mana yang akan dirubah:");
                    System.out.println("1. Nama\t2. Alamat\t3. No. Telepon\t4. Email");
                    int k = s.nextInt();
                    System.out.println("Data diambil...");
                    
                    System.out.println("Masukan data yang baru:");
                    String update = s.next();
                    System.out.println("Memproses....");
                    update(j, k, update);
                    System.out.println("Selesai...");
                    break;
                case 3:
                    break;
                case 4:
                    show();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak sesuai!");
            }
        } while(true);
    }
}
