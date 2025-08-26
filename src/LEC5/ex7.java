/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int rd = random.nextInt(100) + 1;
        while (true) {
            int guess = sc.nextInt();
            
                if (rd > guess) {
                    System.out.println("Cao hon");
                } else if (rd < guess) {
                    System.out.println("Thap hon");
                } else {
                    System.out.println("Dung roii");
                    break;
                }
            }
        }

    }
