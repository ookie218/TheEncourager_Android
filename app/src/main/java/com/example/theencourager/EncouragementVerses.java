package com.example.theencourager;

import com.example.theencourager.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by ookie on 3/19/2017.
 */

public class EncouragementVerses {


    public static String encouragementResponse() {


        //Creates Random Object
        Random random = new Random();


        ArrayList<String> encouragementVersesList = new ArrayList<>();
        encouragementVersesList.add("Isaiah 40:31: But they that wait upon the Lord \n" +
                "shall renew their strength; \n" +
                "they shall mount up with wings as eagles; \n" +
                "they shall run, and not be weary; \n" +
                "and they shall walk, and not faint.");

        encouragementVersesList.add("Joshua 1:9: Have not I commanded thee? "
                        + "Be strong and of a good courage; "
                        + "be not afraid, neither be thou dismayed: "
                        + "for the Lord thy God is with thee whithersoever thou goest.");

        encouragementVersesList.add("Matthew 11:28: Come unto me, all ye that labour and are heavy laden, "
                        + "and I will give you rest.");

        encouragementVersesList.add("1 Corinthians 15:58: Therefore, my beloved brethren, be ye stedfast, "
                        + "unmoveable, always abounding in the work of the Lord, "
                        + "forasmuch as ye know that your labour is not in vain in the Lord.");

        encouragementVersesList.add("Psalm 121:1-2: I will lift up mine eyes unto the hills, \n" +
                        "from whence cometh my help. \n" +
                        "My help cometh from the Lord,\n" +
                        "which made heaven and earth.");

        encouragementVersesList.add("Psalm 31:24: Be of good courage, and he shall strengthen your heart, "
                        + "all ye that hope in the Lord.");

        encouragementVersesList.add("Psalm 23:4: Yea, though I walk \n" +
                        "through the valley of the shadow of death, \n" +
                        "I will fear no evil: \n" +
                        "for thou art with me; \n" +
                        "thy rod and thy staff they comfort me.");

        encouragementVersesList.add("John 16:33: These things I have spoken unto you, "
                        + "that in me ye might have peace. "
                        + "In the world ye shall have tribulation: but be of good cheer; "
                        + "I have overcome the world.");

        encouragementVersesList.add("2 Corinthians 4:17: For our light affliction, which is but for a moment, "
                        + "worketh for us a far more exceeding and eternal weight of glory.");

        encouragementVersesList.add("Proverbs 14:23: In all labour there is profit: \n" +
                        "but the talk of the lips tendeth only to penury.");

        encouragementVersesList.add("Deuteronomy 31:8: And the Lord, he it is that doth go before thee; "
                        + "he will be with thee, he will not fail thee, "
                        + "neither forsake thee: fear not, neither be dismayed.");

        encouragementVersesList.add("John 14:27: Peace I leave with you, my peace I give unto you: "
                        + "not as the world giveth, give I unto you. "
                        + "Let not your heart be troubled, neither let it be afraid.");

        encouragementVersesList.add("Romans 8:31: What shall we then say to these things? If God be for us, "
                        + "who can be against us?");

        encouragementVersesList.add("Luke 12:6-7: Are not five sparrows sold for two farthings, "
                        + "and not one of them is forgotten before God? "
                        + "But even the very hairs of your head are all numbered. "
                        + "Fear not therefore: ye are of more value than many sparrows.");


        Collections.shuffle(encouragementVersesList);

        //Creates Index to hold index for Random
        String encIdx = encouragementVersesList.get(random.nextInt(encouragementVersesList.size()));

        //Return Random Index of Array after shuffle
        return encIdx;
    }


}
