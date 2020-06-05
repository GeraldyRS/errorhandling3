/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no3;

/**
 *
 * @author ACER
 */
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat");
        try{ System.in.read(b);
        } 
        catch(java.io.IOException e){
        System.out.println(e.getMessage());
        }
        String N = new String(b);
        System.out.println("Hasil : "+ (N+2));
    }
    
}
