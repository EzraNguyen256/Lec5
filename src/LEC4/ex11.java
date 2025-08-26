/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ex11 {

    public static void Quadratic(double a, double b, double c) {
        if (a == 0) {   
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Chuong trinh co vo so nghiem");
                } else if (c != 0) {
                    System.out.println("Chuong trinh vo nghiem");
                }
            } else if (b != 0) {
                double x = -(c / b);
                System.out.println("x = " + x);
            }
        } else if (a != 0) {
            double denta = (b * b) - (4 * a * c);
            if (denta < 0) {
                System.out.println("Chuong trinh vo nghiem ");
            } else if (denta == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Chuong trinh co nghiem kep x1 = x2 = " + x);
            } else if (denta > 0) {
                double x1 = (-b + Math.sqrt(denta)) / 2 * a;
                double x2 = (-b - Math.sqrt(denta)) / 2 * a;
                System.out.println("Chuong trinh co hai nghiem thuc phan biet x1 = " + x1 + " x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Quadratic(a, b, c);
    }
}
