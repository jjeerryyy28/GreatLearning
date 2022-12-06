package com.greatLearning.java.inheritance;

class Account

{
    String customerName;
    int accountNo;
    Account(String a, int b)

    {
        a = customerName;
        b = accountNo;
    }

    void display()

    {
        System.out.println(customerName+"\n"+accountNo);
    }

}

class CurrentAccount extends Account

{

    int currentBalance;

    CurrentAccount(String a, int b, int c)

    {

        super(a,b);

        currentBalance=c;

    }

    void display()

    {

        super.display();

        System.out.println ("Current Balance: "+currentBalance);

    }

}

class AccountDetails extends CurrentAccount

{
    int depositAmount;
    int withdrawalAmount;
    AccountDetails(String a, int b, int c, int d, int e)

    {
        super(a,b,c);
        d = depositAmount;
        e = withdrawalAmount;

    }

    void display()

    {
        System.out.println(customerName+" "+accountNo+" "+currentBalance);
    }

}

class DriverClass

{

    public static void main(String args[])

    {

        AccountDetails A = new AccountDetails("Prajwal",11111,10000,5000,500);

        A.display();

    }

}