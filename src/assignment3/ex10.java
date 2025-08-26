/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 scanner.useDelimiter("##|\\n");

 System.out.println("Enter words separated by '##': ");

 while (scanner.hasNext()) {
 System.out.println(scanner.next());
 }

 scanner.close();
 }
}
