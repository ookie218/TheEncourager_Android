package com.example.theencourager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class WisdomVerses {

    public static String wiseResponse() {

        Random random = new Random();


        ArrayList<String> wisdomVersesList = new ArrayList<>();
        wisdomVersesList.add("Ephesians 5:15-17: See then that ye walk circumspectly, not as fools, " +
                "but as wise \n\n" +
                "Redeeming the time, because the days are evil \n\n" +
                "Wherefore be ye not unwise, but understanding what the will of " +
                "the Lord [is]");

        wisdomVersesList.add("James 1:5: If any of you lack wisdom, let him ask if God, that giveth " +
                "to all [men] liberally, and upbraideth not; and it shall be given him");

        wisdomVersesList.add("James 3:17: But the wisdom that is from above is first pure, then " +
                "peaceable, gentle, [and] easy to be intreated, full of mercy and " +
                "good fruits, without partiality, and without hypocrisy");

        wisdomVersesList.add("Proverbs 18:15: The heart of the prudent getteth knowledge; and the " +
                "ear of the wise seeketh knowledge");

        wisdomVersesList.add("Colossians 3:16: Let the word of Christ dwell in you richly in all " +
                "wisdom; teaching and admonishing one another in psalms and hymns " +
                "spiritual songs, singing with grace in your hearts to the Lord");

        wisdomVersesList.add("Proverbs 19:20: Hear consel, and receive instruction, that thou mayest " +
                "be wise in thy latter end");

        wisdomVersesList.add("Ecclesiastes 8:1: Who [is] as the wise [man]? and who knoweth the " +
                "interpretation of a thing? a man's wisdom maketh his face to shine, " +
                "and the boldness of his face shall be changed");


        Collections.shuffle(wisdomVersesList);

        String wiseIdx = wisdomVersesList.get(random.nextInt(wisdomVersesList.size()));

        //Return Random Index of Array after shuffle    
        return wiseIdx;
    }

}
