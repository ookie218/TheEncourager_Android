package com.example.theencourager;

import java.util.Random;

/**
 * Created by ookie on 3/19/2017.
 */

public class WisdomVerses {

    private static String[] wisdomVerses = new String[] {
            "Ephesians 5:15-17: See then that ye walk circumspectly, not as fools, " +
                    "but as wise \n\n" +
                    "Redeeming the time, because the days are evil \n\n" +
                    "Wherefore be ye not unwise, but understanding what the will of " +
                    "the Lord [is]",

            "James 1:5: If any of you lack wisdom, let him ask if God, that giveth " +
                    "to all [men] liberally, and upbraideth not; and it shall be given him",

            "James 3:17: But the wisdom that is from above is first pure, then " +
                    "peaceable, gentle, [and] easy to be intreated, full of mercy and " +
                    "good fruits, without partiality, and without hypocrisy",

            "Proverbs 18:15: The heart of the prudent getteth knowledge; and the " +
                    "ear of the wise seeketh knowledge",

            "Colossians 3:16: Let the word of Christ dwell in you richly in all " +
                    "wisdom; teaching and admonishing one another in psalms and hymns " +
                    "spiritual songs, singing with grace in your hearts to the Lord",

            "Proverbs 19:20: Hear consel, and receive instruction, that thou mayest " +
                    "be wise in thy latter end",

            "Ecclesiastes 8:1: Who [is] as the wise [man]? and who knoweth the " +
                    "interpretation of a thing? a man's wisdom maketh his face to shine, " +
                    "and the boldness of his face shall be changed"

    };

    private static Random random = new Random();
    private static int wiseIdx = random.nextInt(wisdomVerses.length);

    public static String wiseResponse() {


        //Iterate through the array
        for(int i = 0; i < wisdomVerses.length; i++) {

            //Create temp String to hold the position of array we're looping through
            String temp = wisdomVerses[i];

            //[i] will become equal to whatever is in Index
            wisdomVerses[i] = wisdomVerses[wiseIdx];

            //Whatever is in temp will then be placed here (Spot where the random picked)
            wisdomVerses[wiseIdx] = temp;

            //Therefore - swap complete at this point
        }

        //Return Random Index of Array after shuffle    
        return wisdomVerses[wiseIdx];
    }

}
