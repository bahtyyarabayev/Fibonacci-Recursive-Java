/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccı_recursive;

/**
 *
 * @author Bahtyyar
 */
public class Fibonaccı_recursive {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) 
    {
        for(int i=1;i<10;i++)
       System.out.print(fibonaci(i)+",");
    }
    public static int fibonaci(int a){
        if(a==0)
            return 0;
        else if(a==1)
            return 1;
        else return fibonaci(a-1)+fibonaci(a-2);
    }
}
