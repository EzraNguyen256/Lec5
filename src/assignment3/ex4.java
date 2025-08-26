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
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter float 1: ");
        float fl1 = scanner.nextFloat();
        System.out.print("enter float 2: ");
        float fl2 = scanner.nextFloat();
        
        float avg = (fl1 + fl2)/2;
        
        System.out.println("avg: " + avg);
                
        scanner.close();
    }
}
