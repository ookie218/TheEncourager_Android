package com.example.theencourager;

import java.util.Random;

/**
 * Created by ookie on 3/19/2017.
 */

public class PrayerVerses {

    private static String[] prayerVerses = new String[] {

            "Philippians 4:6: Be careful for nothing; but in everything \n" +
                    "but in everything by prayer and supplication with \n" +
                    "thanksgiving let your requests be made known unto God",

            "Mark 11:24: Therefore I say unto you, What things soever ye \n" +
                    "desire, when ye pray, believe that ye recieve[them], and \n" +
                    "ye shall have [them]",

            "Matthew 6:7: But when ye pray, use not vain repititions, \n" +
                    "as the heathen [do]: for they think that they shall be \n" +
                    "heard for their much speaking",

            "Romans 8:26: Likewise the Spirit also helpeth our infirmities: \n" +
                    "for we know not what we should pray for as we ought: but \n" +
                    "the Spirit itself maketh intercession for us with groanings \n" +
                    "which cannot be uttered",

            "Matthew 6:6: But thou, when thou prayest, enter into thy closet, \n" +
                    "and when thou hast shut thy door, pray to thy Father which \n" +
                    "is in secret; and thy Father which seeth in secret shall \n" +
                    "reward thee openly",

            "John 15:7: If ye abide in me, and my words abide in you, ye " +
                    "shall ask what ye will, an it shall be done unto you",

            "Luke 11:9: And I say unto you, Ask, and it shall be given you; " +
                    "seek, and ye shall find; knock, and it shall be opened unto you",

            "James 5:16: Confss [your] faults one to another, and pray one for " +
                    "another, that ye may be healed. The effectual fervent prayer of " +
                    "a righteous man availeth much",

            "Ephesians 6:18: Praying always with all prayer and supplication in " +
                    "the Spirit, and watching thereunto with all perseverence and " +
                    "supplication for all saints",

            "Jeremiah 33:3: Call unto me, and I will answer thee, and shew thee " +
                    "great and mighty things, which thou knowest not",

            "Psalms 34:17: [The righteous] cry, and the LORD heareth, and " +
                    "delivereth them out of all their troubles",

            "Colossians 4:2: Continue in prayer, and watch in the same with " +
                    "thanksgiving",

    };

    private static Random random = new Random();
    private static int prayIdx = random.nextInt(prayerVerses.length);

    public static String prayResponse() {

        //Iterate through the array
        for(int i = 0; i < prayerVerses.length; i++) {

            //Create temp String to hold the position of array we're looping through
            String temp = prayerVerses[i];

            //[i] will become equal to whatever is in Index
            prayerVerses[i] = prayerVerses[prayIdx];

            //Whatever is in temp will then be placed here (Spot where the random picked)
            prayerVerses[prayIdx] = temp;

            //Therefore - swap complete at this point
        }

        //Return Random Index of Array after shuffle
        return prayerVerses[prayIdx];
    }

}
