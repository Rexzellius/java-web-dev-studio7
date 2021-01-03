package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<Integer,String> songs = new HashMap<>();
        songs.put(1, "Feast for the Worms");
        songs.put(2, "American Gothic");
        songs.put(3, "Grim Grinning Ghouls");
        songs.put(4, "Bury a Friend (cover)");

//        HashMap<Integer,String> songs2 = new HashMap<>();
//        songs.put(1, "Ingenious Forms of Torture");
//        songs.put(2, "Worlds In-Between");
//        songs.put(3, "Buckets of Blood");
//        songs.put(4, "Body in Revolt");

        HashMap<Integer,String> scenes = new HashMap<>();
        scenes.put(1, "The worm that destroys you is the temptation to agree with your critics, to get their approval.");
        scenes.put(2, "The world will not be this way within the reach of my arm.");
        scenes.put(3, "If I saw you everyday forever, I would remember this time.");
        scenes.put(4, "We can only learn so much and live.");

        // TODO: Declare and initialize a CD and a DVD object.
        CD creatureFeature = new CD("Creature Feature", "CD", 27, songs);
//        CD rufusRex = new CD("Rufus Rex", "CD", 10, songs2);
        DVD netflixHannibal = new DVD("HANNIBAL", "DVD", 4.7, scenes);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        creatureFeature.spinDisc();
        creatureFeature.writeDisc();
        System.out.println("==========");
        System.out.println("CD name: " + creatureFeature.getName());
        System.out.println("CD type: " + creatureFeature.getDiscType());
        System.out.println("CD capacity: " + creatureFeature.getCapacity());
        System.out.println("\n" + "Printing out the following: " + "\n" + creatureFeature.readDisc());
        System.out.println("==========" + "\n");
//
//        rufusRex.spinDisc();
//        rufusRex.writeDisc();
//        System.out.println("==========");
//        System.out.println("CD type: " + rufusRex.getName());
//        System.out.println("CD type: " + rufusRex.getDiscType());
//        System.out.println("CD capacity: " + rufusRex.getCapacity());
//        System.out.println("Printing out the following: " + "\n" + rufusRex.readDisc());

        netflixHannibal.spinDisc();
        netflixHannibal.writeDisc();
        System.out.println("==========");
        System.out.println("DVD name: "+ netflixHannibal.getName());
        System.out.println("DVD type: "+ netflixHannibal.getDiscType());
        System.out.println("DVD capacity: "+ netflixHannibal.getCapacity());
        System.out.println("\n" + "Printing out the following: " + "\n" + netflixHannibal.readDisc());
        System.out.println("==========");

    }
}
