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
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Fn = sc.nextInt();
        int Sn = sc.nextInt();
        String Op = sc.next();
        int kq;
        switch(Op) {
            case "+":
                kq = Fn + Sn;
                System.out.println(kq);
                break;
            case "-":
                kq = Fn - Sn;
                System.out.println(kq);
                break;
            case "*":
                kq = Fn * Sn;
                System.out.println(kq);
                break;
            case "/":
                kq = Fn / Sn;
                System.out.println(kq);
        }
    }
}
