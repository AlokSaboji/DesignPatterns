package com.company;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String name) {
        this.fileName= name;
        System.out.println("Loading from disk");
    }

    @Override
    public void display() {
        System.out.println("Display "+ this.fileName);
    }
}
