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
public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter sentence: ");
        String sen = scanner.nextLine();
        
        System.out.print("enter int: ");
        int integer = scanner.nextInt();
        
        System.out.println("sen and int: " + sen + " " + integer);
    }
}
 