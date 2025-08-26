/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ToDoListManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 0:
                    break;
                case 1:
                    String todo = sc.nextLine();
                    list.add(todo);
                    break;
                case 2:
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("Nhap phan tu muon xoa: ");
                    int xoa = sc.nextInt();
                    if (xoa >= 0 && xoa <= list.size()) {
                        sc.nextLine();
                        list.remove(xoa);
                        System.out.println("da xoa");
                    } else {
                        System.out.println("vi tri ko hop le");
                    }
            }
        }
    }
}
