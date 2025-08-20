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
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double point = sc.nextDouble();
        
        if(point >= 9 && point <= 10){
            System.out.println("Excellent");
        } else if(point >= 8.0 && point <= 8.9){
            System.out.println("Good");
        } else if(point >= 6.5 && point <= 7.9){
            System.out.println("Fair");
        } else if(point >= 5.0 && point <= 6.4){
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }
    }
}
