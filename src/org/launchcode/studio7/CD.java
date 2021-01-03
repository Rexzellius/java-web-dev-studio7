package org.launchcode.studio7;

import java.util.HashMap;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, String discType, double capacity, HashMap<Integer,String> contents) {
        super(name, "CD", 737, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeDisc() {
        System.out.println("A CD has a max data capacity of 737MB.");
    }

    @Override
    public HashMap readDisc() {

        return this.getContents();
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
