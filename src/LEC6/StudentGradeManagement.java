/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class StudentGradeManagement {

    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>(Arrays.asList(7.5, 9.0, 5.5, 8.0));
        Collections.sort(scores);
        Collections.reverse(scores);
        System.out.println("Sorted: " + scores);

        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        System.out.println("Average: " + sum / scores.size());
        System.out.println("Max: " + scores.get(0));

    }
}
