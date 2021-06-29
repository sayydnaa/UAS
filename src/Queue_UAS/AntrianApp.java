/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue_UAS;

/**
 *
 * @author Asus
 */
public class AntrianApp {
    public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(5);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Aqshal Sayyidina 20090115 ");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
