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
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        
        if(i1 > i2 && i1 > 3){
            System.out.println(i1 + " Max");
        } else if(i2 > i1 && i2 > i3) {
            System.out.println(i2 + " Max");
        }
        else {
            System.out.println(i3 + " Max");
        }
    }
}
