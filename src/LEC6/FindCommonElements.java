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
public class FindCommonElements {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Orange", "Mango"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Grape", "Orange", "Pineapple", "Apple"));

        ArrayList<String> common = new ArrayList<>();
        for (String s : list1) {
            if (list2.contains(s)) {
                common.add(s);
            }
        }
        System.out.println(common);

    }
}
