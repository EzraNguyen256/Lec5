/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter: ");
        while(true){
            String w = scanner.next();
            
            if(w.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println(w);
        }
        scanner.close();
    }   
}
