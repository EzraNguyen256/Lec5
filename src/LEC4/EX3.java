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
public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year %4 ==0 && year %100!=0) || year % 400 ==0){
            System.out.println("Nam nhuan!");
        } else {
            System.out.println("Nam le");
        }
    }
}
