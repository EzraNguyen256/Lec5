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
public class MaximumandMinimumValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int length = array.length;
        for(int i = 0;i<length;i++){
            System.out.print("Nhap phan tu " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        
        for(int i = 1;i<length;i++){
            if(array[i]>max){
                max = array[i];
            } if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("The maximum value is: " + max + ", " + "The minimum value is: " + min);
    }

}
