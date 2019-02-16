/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terbesar.data;

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
        int[] data = new int[args.length];
        for(int i = 0; i < args.length; i++){
            data[i] = Integer.parseInt(args[i]);
        }
        
        for(int i = 1; i < data.length; i++){
            int key = data[i];
            int j = i-1;
            while(j >= 0 && data[j] > key){
                data[j+1] = data[j];
                j = j-1;
            }
            data[j+1] = key;
        }
        
        for(int i = 7; i > 5; i--){
            System.out.print(data[i] + " ");
        }
    }
    
}
