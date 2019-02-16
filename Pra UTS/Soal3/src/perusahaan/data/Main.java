/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan.data;

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
        Employee boss = new Manajer(250000, "Bayu Pamungkas", "Meleber", 3000000);
        Employee staff1 = new Staff("Kiki Permata", "Cibeunying Kidul", 2750000);
        Employee staff2 = new Staff("Panji Sandi", "Kiaracondong", 2700000);
        
        System.out.println("Nama Manajer: " + boss.getName());
        System.out.println("Alamat Manajer: " + boss.getAddress());
        System.out.println("Salary Manajer: " + boss.getSalary());
        System.out.println("===================================");
        
        System.out.println("Nama Staff: " + staff1.getName());
        System.out.println("Alamat Staff: " + staff1.getAddress());
        System.out.println("Salary Staff: " + staff1.getSalary());
        System.out.println("===================================");
        
        System.out.println("Nama Staff: " + staff2.getName());
        System.out.println("Alamat Staff: " + staff2.getAddress());
        System.out.println("Salary Staff: " + staff2.getSalary());
    }
    
}
