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
public class ex8 {

    public static int quadrant(double x , double y) {
        if (x > 0 && y > 0) {
            System.out.println("1nd");
            return 1;
        } else if (x < 0 && y > 0 ) {
            System.out.println("2nd");
            return 2;
        } else if (x < 0 && y < 0) {
            System.out.println("3nd");
        } else {
            System.out.println("the point is on an axis.");
            return 3;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int q = quadrant(x, y);
        System.out.println(q);
    }
}
