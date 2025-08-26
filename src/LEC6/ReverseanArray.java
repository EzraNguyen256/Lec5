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
public class ReverseanArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int length = array.length;

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < length / 2; i++) {
            int j = length - 1 - i;
            int temp = array[i];
            array[i] = array[j];

            array[j] = temp;
        }
        
        for(int i = 0;i<length;i++){
            System.out.print(array[i]+ " ");
        }

    }
}
