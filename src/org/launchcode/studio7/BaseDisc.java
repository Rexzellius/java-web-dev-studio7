package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
    private String name;
    private String discType;
    private double capacity;
    private HashMap<Integer,String> contents;

    public BaseDisc (String name, String discType, double capacity, HashMap<Integer,String> contents){
        this.name = name;
        this.discType = discType;
        this.capacity = capacity;
        this.contents = contents;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDiscType() { return discType; }

    public double getCapacity() { return capacity; }

    public HashMap getContents() { return contents; }

}
