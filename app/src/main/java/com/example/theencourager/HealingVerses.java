package com.example.theencourager;

import java.util.Random;

/**
 * Created by ookie on 3/19/2017.
 */

public class HealingVerses {

    private static String[] healingVerses = new String[] {
            "Mark 9:23: Jesus said unto him, If thou canst believe, "
                    + "all things are possible to him that believeth.",

            "James 5:16: Confess your faults one to another, "
                    + "and pray one for another, that ye may be healed. "
                    + "The effectual fervent prayer of a righteous man availeth much.",

            "Isaiah 53:5: But he was wounded for our transgressions, \n" +
                    "he was bruised for our iniquities: \n" +
                    "the chastisement of our peace was upon him; \n" +
                    "and with his stripes we are healed.",

            "Mark 10:52: And Jesus said unto him, Go thy way; "
                    + "thy faith hath made thee whole. "
                    + "And immediately he received his sight, and followed Jesus in the way."

    };
    //Creates Random Object
    private static Random random = new Random();

    //Creates Index to hold index for Random
    private static int healIdx = random.nextInt(healingVerses.length);

    //Function for the response
    public static String healingResponse() {
        System.out.println("I understand. Well maybe this will help you out...\n");

        //Iterate through the array
        for(int i = 0; i < healingVerses.length; i++) {

            //Create temp String to hold the position of array we're looping through
            String temp = healingVerses[i];

            //[i] will become equal to whatever is in Index
            healingVerses[i] = healingVerses[healIdx];

            //Whatever is in temp will then be placed here (Spot where the random picked)
            healingVerses[healIdx] = temp;

            //Therefore - swap complete at this point
        }

        //Return Random Index of Array after shuffle
        return healingVerses[healIdx];
    }

}
