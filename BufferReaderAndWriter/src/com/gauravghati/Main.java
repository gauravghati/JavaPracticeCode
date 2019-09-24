package com.gauravghati;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("outPutOfWriter.out");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("34");
            bufferedWriter.newLine();
            bufferedWriter.append("hey");
            bufferedWriter.newLine();
            bufferedWriter.write("45");
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }


          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the Dates(In format dd/MM/yyyy  HH:mm):");
            String stringDateTime = bufferedReader.readLine();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            LocalDateTime date = LocalDateTime.parse(stringDateTime, df);

            DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MMMM d,yyyy HH:mm");
            System.out.println("" + date.format(df2));
        }catch (DateTimeParseException e){
            System.out.println("String Not Valid.");
        }
        System.out.println("Enter the String Value");
        System.out.println("Your String Value :"+bufferedReader.readLine());

        System.out.println("\nEnter Integer Value:");
        int intValue = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Your Integer Value :"+intValue);

        System.out.println("\nEnter Float Value:");
        float floatValue = Float.parseFloat(bufferedReader.readLine());
        System.out.println("Your float Value :"+floatValue);

        System.out.println("Type The Name Of The owner :");
        String input = bufferedReader.readLine();
        String value = (input.equals("Gaurav")) ? "Right Name":"Wrong NAme";
        System.out.println(value);

    }
}
