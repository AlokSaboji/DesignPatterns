package com.company;



public class ProxyImage implements Image{

    private RealImage realImage;
    private  String fileName;

    ProxyImage(String name){
        this.fileName = name;
    }

    @Override
    public void display(){
        if(realImage==null){
            realImage =  new RealImage(this.fileName);
        }
        realImage.display();
    }
}
