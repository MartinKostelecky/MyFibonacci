/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cz.martinkostelecky.myfibonacci;

import java.util.Scanner;
/**
 *
 * @author Martin Kostelecký
 */
public class MyFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("First number: ");
        long i = Long.parseLong(sc.nextLine());
        System.out.println("Second number: ");
        long j = Long.parseLong(sc.nextLine());
        long temp;

        System.out.print("Fibonacci sequence of given numbers is: " + i + ", " + j + ", ");

        while(i < Integer.MAX_VALUE || j < Integer.MAX_VALUE) {
            temp = i + j;
            System.out.print(temp + ", ");
            i = j + temp;
            System.out.print(i + ", ");
            j = temp + i;
            System.out.print(j + ", ");
        }
    }
}
