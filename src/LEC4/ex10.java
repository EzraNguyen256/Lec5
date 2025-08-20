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
public class ex10 {
    public static boolean isTriangle(double a,double b ,double c) {
       return (a+b > c && a + c > b && c + b > a);
    }
    public static void Triangle(double a, double b, double c) {
        if(isTriangle(a,b,c)){
            if(a==b&&b==c){
                System.out.println("Tam giac deu");
            } else if(a!=b&&a!=c&&b!=c){
                System.out.println("Khong canh nao bang nhau");
            } else if(a==b||a==c||b==c){
                System.out.println("Tam giac can");
            } else {
                System.out.println("Khong co tam giac nao");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        Triangle(a,b,c);
    }
}
