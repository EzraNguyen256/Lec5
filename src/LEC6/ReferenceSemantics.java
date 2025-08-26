/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class ReferenceSemantics {

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;
        arr2[0] = 99;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
