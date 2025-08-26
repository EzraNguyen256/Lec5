/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class ConvertArrayArrayList {

    public static void main(String[] args) {

        String[] arr = {"Ann", "Bob"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));


        String[] arr2 = list.toArray(new String[0]);
        
        System.out.println(Arrays.toString(arr2));


    }
}
