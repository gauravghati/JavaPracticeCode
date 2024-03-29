package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static  Button btnPrint = new Button("Print");

    public static void main(String[] args) {
	// write your code here
        /*class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been called");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());*/
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("I've been called");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
