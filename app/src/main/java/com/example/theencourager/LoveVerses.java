package com.example.theencourager;

import java.util.Random;

/**
 * Created by ookie on 3/19/2017.
 */

public class LoveVerses {

    private static String[] loveVerses = new String[] {

            "1 Corinthians 13:4-8: Charity suffereth long, [and] is kind; charity " +
                    "envieth not; charity vaunted not itself, is not puffed up, \n\n" +
                    "Doth not behave itself unseemly seeling not her own, is not easily " +
                    "provoked, thinketh no evil; \n\n" +
                    "Rejoiceth not in iniquity, but rejoiceth in the truth; \n\n" +
                    "Beareth all things, believeth all things, hopeth all things, " +
                    "endureth all things \n\n" +
                    "Charity never faileth; ut whether [there be] prophecies, they shall " +
                    "fail; whether [there be] tongues, they shall cease; whether [there be] " +
                    "knowledge, it shall vanish away",

            "John 13:34-35: A new commandment I give unto you, That ye love one " +
                    "another; as I have loved you, that ye also love one another. \n\n" +
                    "By this shall all [men] know that ye are my disciples, if ye have " +
                    "love one to another",

            "1 John 4:7-8: Beloved, let us love one another: for love is of God; " +
                    "and every one that loveth is born of God, and knoweth God \n\n" +
                    "He that loveth not knoweth not God; for God is love",

            "John 15:13: Greater love hath no man than this, that a man lay down " +
                    "his life for his friends",

            "1 John 4:18-19: There is no fear in love; but perfect love casteth out " +
                    "fear: because fear hath torment. He that feareth is not made " +
                    "perfect in love \n\n" +
                    "We love him, because he first loved us",

            "John 3:16: For God so loved the world, that he gave his only begotten " +
                    "Son, that whosoever believeth in him should not perish, but have " +
                    "everlastng life",

            "Luke 6:35: But love your enemies, and do good and lend, hoping for " +
                    "nothing again; and in your reward shall be great, and ye shall be " +
                    "the children of the Highest: for he is kind unto the unthankful and " +
                    "[to] the evil",

            "Ephesians 5:25: Husbands, love your wives, even as Christ also loved the " +
                    "church, and gave himself for it;"

    };
    private static Random random = new Random();
    private static int loveIdx = random.nextInt(loveVerses.length);

    public static String loveResponse() {

        //Iterate through the array
        for(int i = 0; i < loveVerses.length; i++) {

            //Create temp String to hold the position of array we're looping through
            String temp = loveVerses[i];

            //[i] will become equal to whatever is in Index
            loveVerses[i] = loveVerses[loveIdx];

            //Whatever is in temp will then be placed here (Spot where the random picked)
            loveVerses[loveIdx] = temp;

            //Therefore - swap complete at this point
        }

        //Return Random Index of Array after shuffle    
        return loveVerses[loveIdx];
    }

}

