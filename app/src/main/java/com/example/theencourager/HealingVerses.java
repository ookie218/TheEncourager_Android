package com.example.theencourager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class HealingVerses {


    //Function for the response
    public static String healingResponse() {

        //Creates Random Object
        Random random = new Random();


        ArrayList<String> healingVersesList = new ArrayList<>();
        healingVersesList.add("Mark 9:23: Jesus said unto him, If thou canst believe, "
                + "all things are possible to him that believeth.");

        healingVersesList.add("James 5:16: Confess your faults one to another, "
                + "and pray one for another, that ye may be healed. "
                + "The effectual fervent prayer of a righteous man availeth much.");

        healingVersesList.add("Isaiah 53:5: But he was wounded for our transgressions, \n" +
                "he was bruised for our iniquities: \n" +
                "the chastisement of our peace was upon him; \n" +
                "and with his stripes we are healed.");

        healingVersesList.add("Mark 10:52: And Jesus said unto him, Go thy way; "
                + "thy faith hath made thee whole. "
                + "And immediately he received his sight, and followed Jesus in the way."
        );

        Collections.shuffle(healingVersesList);

        //Creates Index to hold index for Random
        String healIdx = healingVersesList.get(random.nextInt(healingVersesList.size()));

        return healIdx;
    }
}
