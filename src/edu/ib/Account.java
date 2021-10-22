package edu.ib;

public class Account {


    // zmienne instancji plus zmienne klasowe = pola
    private String name;
    private double balance;

    private static int id=0; // zmiennej klasowej (statycznej)

    public Account() {
    }

    // konstruktor z parametrami
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // metoda pobierająca (getter)
    public String getName() {
        return name;
    }
    // metoda ustawiająca (setter)
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getId() {
        return id;
    }
}
