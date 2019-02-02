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
    
    private void input(String nama, String alamat, String telepon, String email){
        d.setNama(nama);
        d.setAlamat(alamat);
        d.setTelepon(telepon);
        d.setEmail(email);
    }
    
    private void insert(int ind1){
        data[ind1-1][0] = d.getNama();
        data[ind1-1][1] = d.getAlamat();
        data[ind1-1][2] = d.getTelepon();
        data[ind1-1][3] = d.getEmail();
    }
    
    private void update(int ind1, int ind2, String update){
        data[ind1-1][ind2-1] = update;
    }
    
    private void delete(int ind1){
        data[ind1-1][0] = null;
        data[ind1-1][1] = null;
        data[ind1-1][2] = null;
        data[ind1-1][3] = null;
    }
    
    private void show(){
        for(int i = 0; i < 100; i++){
            System.out.println((i+1)+" => "+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
