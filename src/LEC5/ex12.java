/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter integer: ");
        int N = sc.nextInt();
        
        boolean isPrime = true;
        
        for(int i = 2 ;i <= (Math.sqrt(N));i++){
            if(N%i==0){
                isPrime = false;
                break;
            }
    }
        if(isPrime) {
            System.out.println(N + " la so nguyen to");
        } else {
            System.out.println(N + " khong phai la so nguyen to");
        }
    }
}