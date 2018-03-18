/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damian_gaworowski_lab2_zad3_19.pkg03.pkg2018;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class zad3_4 {
    public static int fibonaci(int f){
        if (f == 1) 
            return 1;
       if (f == 2) 
        return 1;
        else return fibonaci(f-2)+fibonaci(f-1);
       
    }
    public static void main (String[] args){
     int f;
       
       Scanner odczyt = new Scanner(System.in);
       System.out.println("Podaj element ciagu");
       f = odczyt.nextInt();
       System.out.println("Wynik to"+fibonaci(f));
       
    
    
    
    
}}
