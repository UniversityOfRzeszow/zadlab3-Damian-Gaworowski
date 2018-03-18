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
public class zad3_3 {

   
     
    public static int rekurencja (int n)
    {
        if (n==1) 
        return 1;
        else return n * rekurencja (n-1);
    }
    public static int iteracja(int n)
    {
        int x=1;
        {
            for (int i=1;i<=n;i++)
             {
                 x = x * i;
             }
        }
        return x;
    } 
        public static void main(String[] args){
             Scanner odczyt = new Scanner(System.in);
             System.out.println("Podaj liczbe");
             int n = odczyt.nextInt();
             System.out.println("Chcesz wykonać: 1- Rekurencja 2-Iteracja");
             int wybor = odczyt.nextInt();
             switch(wybor){
                 case 1:
                      System.out.println("Obliczona rekurencyjnie "+rekurencja(n));
                      break;
                 case 2:
                      System.out.println("Obliczona iteracyjnie "+iteracja(n));
                      break;
             
    
}}}
