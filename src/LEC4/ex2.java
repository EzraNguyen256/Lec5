/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        
        if(age <= 12 && age > 0){
            System.out.println("Child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager!");
        } else if (age >= 20 && age <= 59){
            System.out.println("Adult!");
        } else {
            System.out.println("Senior!");
        }
    }
}
