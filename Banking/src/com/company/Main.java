package com.company;

public class Main {

    public static void main(String[] args)
    {
        BankAccount SBI = new BankAccount();
        SBI.setBankaccountnumber(12345678);
        SBI.setcustomername("Gaurav");
        SBI.setBalance(50000);
        SBI.setEmail("gauravghati225@gmail.com");
        SBI.setPhonenumber(12335345);
        System.out.println("Your Account Number: "+SBI.getBankaccountnumber());
        System.out.println("Your name: "+SBI.getCustomername());
        System.out.println("Your Balance: "+SBI.getBalance());
        System.out.println("Your email: "+SBI.getemail());
        System.out.println("Your Phonenumber: "+SBI.getPhonenumber());
        System.out.println("After deposite of 10000 value is = "+SBI.depositfund(10000));
        System.out.println("After withdrawal od 5000 value is = "+SBI.withdrawal(5000));
    }
}
