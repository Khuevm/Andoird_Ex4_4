package com.example.ex4_4.model;

public class Cat {
    private int imageName;
    private String name;

    public Cat(int imageName, String name) {
        this.imageName = imageName;
        this.name = name;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
