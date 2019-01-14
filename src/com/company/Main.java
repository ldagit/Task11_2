package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String Str = in.nextLine();
        System.out.println("Строка без пробелов: " + Str.replace(" ", ""));
    }
}
