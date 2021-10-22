package edu.ib;

public class AccountTester {
    public static void main(String[] args) {

        Account a1= new Account();
        // a1 jest referencją
        // new - utworzenie obiektu
        // Account() konstruktor

        a1.setName("John");
        a1.setBalance(100.);

        Account a2= new Account("Jane", 5000);

        System.out.println(a1);
        System.out.println(a2);

        Account ref; // deklaracja referencji
        ref=a1; // przypisanie referencji
        System.out.println(a1.getName());
        System.out.println(ref.getName());

        ref=a2;


        System.out.println(Account.getId());



    }
}
