package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String Str = in.nextLine();
        String[] StrParts = Str.split(" ");

        int i;
        String NewStr = new String();
        for (i=0; i<StrParts.length; ++i){
           NewStr = NewStr.concat(StrParts[i]);
        }
        System.out.println("Строка без пробелов: " + NewStr);
    }
}
