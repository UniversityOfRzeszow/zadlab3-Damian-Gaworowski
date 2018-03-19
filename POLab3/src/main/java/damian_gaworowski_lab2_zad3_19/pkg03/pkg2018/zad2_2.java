/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damian_gaworowski_lab2_zad3_19.pkg03.pkg2018;

/**
 *
 * @author HP
 */
public class zad2_2 {
     public static void main(String[] args){
       
        
         String sl1 = new String("Przykład jeden");
         String sl2 = new String("Przykład dwa dwa");
         String sl3 = new String("przykład trzy");
         String sl4 = new String("Przykład          cztery");
         
         System.out.println(sl1.toCharArray());//String zmienia na tablice z znaków
         System.out.println(sl1.getBytes());//
         System.out.println(sl1.equals(sl2));//porównanie dwóch
         System.out.println(sl1.equalsIgnoreCase(sl3));//porównanie pomijając wielokośc znaków
         System.out.println(sl1.compareTo(sl2));
         System.out.println(sl1.indexOf('k'));//index chhara
         System.out.println(sl1.lastIndexOf('a'));// wystąpienie ostatnie "a"
         System.out.println(sl1.substring(4));//dzili string zaczynajać od 4 indexu na substring
         System.out.println(sl1.substring(0,4));//dzieli string od 0 do 4 indexu na substing
         System.out.println(sl1.replace('a','b'));//zamienia litery
         System.out.println(sl4.trim());//przycina o poprzedzające i nadmiarowe spacy
         System.out.println(sl1.toLowerCase());//zmienia na male litery
         System.out.println(sl1.toUpperCase());//zmienia na duze litery
         
  
                 
     
     
     
     
     
     }}
