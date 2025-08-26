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
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        
        for(int i = 1;i<=h;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
