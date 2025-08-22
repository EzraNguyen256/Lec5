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
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chieu cao: ");
        int h = sc.nextInt();
        
        for(int i = 1; i<=h;i++){
            for(int j = 1;j<=(h-i);j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
