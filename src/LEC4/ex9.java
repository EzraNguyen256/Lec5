/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double number = sc.nextDouble();
       double ab = number < 0 ? -number : number;
        System.out.println(ab);
    }
}
