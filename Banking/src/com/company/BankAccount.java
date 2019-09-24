package com.company;

public class BankAccount
{
    private int bankaccountnumber;
    private int balance;
    private String customername;
    private String email;
    private int phonenumber;

    public BankAccount()
    {
        System.out.println("Constructor called");
    }

    public void setBankaccountnumber(int bankaccountnumber)
    {
        this.bankaccountnumber = bankaccountnumber;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    public void setcustomername(String customername)
    {
        this.customername = customername;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhonenumber(int phonenumber)
    {
        this.phonenumber = phonenumber;
    }
    /*8888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888*/
    public int getBankaccountnumber()
    {
        return bankaccountnumber;
    }
    public int getBalance()
    {
        return balance;
    }
    public String getCustomername()
    {
        return customername;
    }
    public String getemail()
    {
        return email;
    }
    public int getPhonenumber()
    {
        return phonenumber;
    }

    public int depositfund(int amount)
    {
        balance= balance+amount;
        return balance;
    }
    public int withdrawal(int amount)
    {
        balance=balance-amount;
        return balance;
    }
}
