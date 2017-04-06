package com.example.theencourager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class FinancialVerses {


    public static String financialResponse() {

        //Creates Random Object
        Random random = new Random();

        ArrayList<String> financialVersesList = new ArrayList<>();
        financialVersesList.add("Proverbs 10:4:He becometh poor that dealeth with a slack hand, \n" +
                "but the hand of the diligent maketh rich");

        financialVersesList.add("2 Chronicles 1:11-12: And God said to Solomon, \n" +
                "Because this was in thine heart, and thou \n" +
                "has not asked for riches, wealth, or honour, \n" +
                "nor the life of thine enemies, neither yet hast \n" +
                "asked long life; but hast asked wisdom and knowledge \n" +
                "for thyself, that thou mayest judge my people, over whom I \n" +
                "have made thee king: \n\n" +

                "Wisdom and knowledge is granted unto thee; and I will give \n" +
                "thee riches, and wealth, and honour, such as none of the kings \n" +
                "have had that have been before thee, neither shall there any after \n" +
                "thee have the like");

        financialVersesList.add("Deuteronomy 28:12: The Lord shall open unto thee his good \n" +
                "treasure, the heaven to give the rain unto thy land \n" +
                "in his season, and to bless all the work of thine hand: \n" +
                "and thou shalt lend unto many nations, and thou shalt not \n" +
                "borrow");

        financialVersesList.add("1 Samuel 2:7: The Lord maketh poor, and maketh rich: \n" +
                "he bringeth low, and lifteth up");

        financialVersesList.add("Proverbs 3:9-10: Honour the Lord with thy substance, and with the \n" +
                "firstfruits of all thine increase: \n\n" +
                "So shall thy barns be filled with plenty,and thy presses shall \n" +
                "burst out with new wine");


        Collections.shuffle(financialVersesList);

        //Creates Index to hold index for Random
        String finIdx = financialVersesList.get(random.nextInt(financialVersesList.size()));

        //Return Random Index of Array after shuffle
        return finIdx;
    }

}
