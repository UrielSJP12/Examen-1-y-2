/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;

import java.util.Scanner;
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner precio = new Scanner(System.in);
       
        System.out.println("ingrese el nombre del videojuego: ");
        String juego1 = precio.nextLine();
        System.out.println("ingrese el precio del producto: ");
        double pre1 = precio.nextDouble();
        precio.nextLine();
        
        System.out.println("ingrese el nombre del segundo videojuego: ");
        String juego2 = precio.nextLine();
        System.out.println("ingresa el precio del segundo videojuego: ");
        double pre2 = precio.nextDouble();
        precio.nextLine();
        
         System.out.println("ingrese el nombre del tercer videojuego: ");
        String juego3 = precio.nextLine();
        System.out.println("ingrese el precio del tercer  producto: ");
        double pre3 = precio.nextDouble();
        precio.nextLine();
        
        double p1 = pre1*.30;
        double p2 = pre2*.65;
        double p3 = pre3*.15;
        
        double precioF1 = pre1-p1;
        double precioF2 = pre2-p2;
        double precioF3 = pre3-p3;
        
       
        
        System.out.println("el precio del primer producto es: " + precioF1);
        System.out.println("el precio del segundo producto es: " + precioF2);
        System.out.println("el precio del tercer producto es: " + precioF3);
        
    }
    
}
