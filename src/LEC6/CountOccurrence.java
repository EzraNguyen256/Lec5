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
public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int length = array.length;
        System.out.println("nhap cac phan tu: ");
        for(int i = 0;i < length;i++){
            array[i] = sc.nextInt();
        }
        int count = 0;
        int x = sc.nextInt();
        
        for(int i =0;i<length;i++){
            if(array[i]==x){
                count++;
            }
        }
        System.out.println("The number " + x + " appears " + count + " times");
    }
}
