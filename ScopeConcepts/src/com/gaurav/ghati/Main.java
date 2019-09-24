package com.gaurav.ghati;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please Enter Numeber :");
        Scanner scanner = new Scanner(System.in);
        X x = new X(scanner.nextInt());
        x.x();
    }
}
