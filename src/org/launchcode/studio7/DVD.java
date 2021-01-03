package org.launchcode.studio7;

import java.util.HashMap;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, String discType, double capacity, HashMap<Integer,String> contents) {
        super(name, "DVD", 4.7, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeDisc() {
        System.out.println("A DVD has a max data capacity of 4.7GB.");
    }

    @Override
    public HashMap readDisc() {
        return this.getContents();
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
