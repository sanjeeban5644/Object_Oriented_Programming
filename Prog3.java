import java.util.Scanner;

class Prog3{
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount("Sanjeeban",9989,"Savings",5644.56,1);
        BankAccount p2 = new BankAccount("Kumar", 9988,"Current",9099.99,987.89,2);
        p1.deposit(1000.00);
        p1.withdraw(10000);
        p1.checkBalance();
        p2.deposit(2000);
        p2.withdraw(3000.88);
        p2.checkBalance();
    }
}

class BankAccount{
    String name;
    int accno;
    String type;
    double balance;
    double overdraft;
    int person;

    BankAccount(String name,int accno,String type,double balance,int person){
        this.name = name;
        this.accno = accno;
        this.type = type;
        this.balance = balance;
        this.person = person;
    }

    BankAccount(String name,int accno,String type,double balance,double overdraft,int person){
        this.name = name;
        this.accno = accno;
        this.type = type;
        this.balance = balance;
        this.overdraft = overdraft;
        this.person = person;
    }

    void withdraw(double cash){
        System.out.print("\n<Account no : "+this.accno+"> ");
        if(this.balance-cash < 2000){
            System.out.println("Cannot Withdraw Cash");
        }else{
            this.balance-=cash;
            System.out.println("Cash Withdrawed Successfully");
        }
    }

    void deposit(double cash){
        System.out.print("\n<Account no : "+this.accno+"> ");
        balance+=cash;
        System.out.println("Rs."+cash+" deposited");
    }

    void checkBalance(){
        System.out.print("\n<Account no : "+this.accno+"> ");
        System.out.println("Balance is : Rs."+this.balance);
    }

}

/*
 *   OUTPUT 
 * 
 * <Account no : 9989> Rs.1000.0 deposited

<Account no : 9989> Cannot Withdraw Cash   

<Account no : 9989> Balance is : Rs.6644.56

<Account no : 9988> Rs.2000.0 deposited    

<Account no : 9988> Cash Withdrawed Successfully

<Account no : 9988> Balance is : Rs.8099.11

 */