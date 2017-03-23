package com.example.theencourager;

import java.util.Random;

/**
 * Created by ookie on 3/19/2017.
 */

public class FinancialVerses {

    private static String[] financialVerses = new String[] {
            "Proverbs 10:4:He becometh poor that dealeth with a slack hand, \n" +
                    "but the hand of the diligent maketh rich",

            "2 Chronicles 1:11-12: And God said to Solomon, \n" +
                    "Because this was in thine heart, and thou \n" +
                    "has not asked for riches, wealth, or honour, \n" +
                    "nor the life of thine enemies, neither yet hast \n" +
                    "asked long life; but hast asked wisdom and knowledge \n" +
                    "for thyself, that thou mayest judge my people, over whom I \n" +
                    "have made thee king: \n\n" +

                    "Wisdom and knowledge is granted unto thee; and I will give \n" +
                    "thee riches, and wealth, and honour, such as none of the kings \n" +
                    "have had that have been before thee, neither shall there any after \n" +
                    "thee have the like",

            "Deuteronomy 28:12: The Lord shall open unto thee his good \n" +
                    "treasure, the heaven to give the rain unto thy land \n" +
                    "in his season, and to bless all the work of thine hand: \n" +
                    "and thou shalt lend unto many nations, and thou shalt not \n" +
                    "borrow",

            "1 Samuel 2:7: The Lord maketh poor, and maketh rich: \n" +
                    "he bringeth low, and lifteth up",

            "Proverbs 3:9-10: Honour the Lord with thy substance, and with the \n" +
                    "firstfruits of all thine increase: \n\n" +
                    "So shall thy barns be filled with plenty,and thy presses shall \n" +
                    "burst out with new wine"

    };

    //Creates Random Object
    private static Random random = new Random();

    //Creates Index to hold index for Random
    private static int finIdx = random.nextInt(financialVerses.length);

    //Function for the response
    //Static STRING so it can be referenced and placed in jtextarea instead of void
    //since void doesn't return anything.
    public static String financialResponse() {
        System.out.println("I understand. Well maybe this will help you out...\n");

        //Iterate through the array
        for(int i = 0; i < financialVerses.length; i++) {

            //Create temp String to hold the position of array we're looping through
            String temp = financialVerses[i];

            //[i] will become equal to whatever is in Index
            financialVerses[i] = financialVerses[finIdx];

            //Whatever is in temp will then be placed here (Spot where the random picked)
            financialVerses[finIdx] = temp;

            //Therefore - swap complete at this point
        }

        //Return Random Index of Array after shuffle
        return financialVerses[finIdx];
    }

}
