/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = sc.nextInt();
        int[] array = new int[days];
        int sum = 0;
        for(int i =0;i<days;i++){
            System.out.print("Day " + (i+1) + "'s" + " high temp: ");
            array[i] = sc.nextInt();
            sum += array[i];
        }
        double avg = (double) sum / days;
        
        int count = 0;
        
        for(int i = 0 ;i<days;i++){
            if(array[i] > avg){
                count++;
            }
    }
        System.out.println("Average temp = " + avg);
        System.out.println(count + " days were above average" );
}
}
