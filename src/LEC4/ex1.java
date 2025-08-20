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

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int intInput = sc.nextInt();
        
        if(intInput%2==0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd!");
        }
    }
}
