/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_UAS;

/**
 *
 * @author Asus
 */
public class TumpukanApp {
     
public static void main(String[] args){
         Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(5);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai2=tumpukan.pop();
        long nilai3=tumpukan.peek();
        System.out.println("nilai top  = " +nilai2);
        System.out.println("Aqshal Sayyidina 20090115");
        
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
        
      
    }
}
