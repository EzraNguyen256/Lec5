/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3_Scanner;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class ScannerExample {
    public static void main(String args[]) {
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter a float :: ");
float f = keyboard.nextFloat();
System.out.println(f);
System.out.print("Enter a double number :: ");
double d = keyboard.nextDouble();
System.out.println(d);
}
}
