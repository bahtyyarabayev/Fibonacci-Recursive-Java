/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorel_recursive;

/**
 *
 * @author Bahtyyar
 */
public class Faktorel_Recursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int sayi;
       sayi=recursiveFaktorial(4);
       System.out.println(sayi);
    }
     private static int recursiveFaktorial(int i) {
         if(i==1){
             return 1;
         }
         else {
             return i*(recursiveFaktorial(i-1));
         }
     }
}
