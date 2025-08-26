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
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n>=2 && n <=9){
            for(int i =1;i<=10;i++){
                System.out.println(n + " x " + i + " = " + (n*i));
            } 
        } else {
            System.out.println("ko hop le");
        }
    }
}
