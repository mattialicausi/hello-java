package org.lessons.java;

public class StampaSaluto {
    public static String name = " Vito Mattia";
    public static String lastname = "Li Causi";
    public static String fullname = name + " " + lastname;


    public static void main(String[] args) {

        System.out.println("Ciao Java");

        System.out.println("Benvenuto" + fullname);
    }
}
