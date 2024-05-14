package com.ironhack.buckets;

public class Kombucha {

    private String name;
    private String flavor;


    @Override
    public String toString() {
        return "Kombucha{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    public Kombucha(String name, String flavor) {
        this.name = name;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
