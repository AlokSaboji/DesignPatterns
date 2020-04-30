package com.company;

public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("Alok.png");
        image.display();
        System.out.println("\n");
        image.display();

    }
}
