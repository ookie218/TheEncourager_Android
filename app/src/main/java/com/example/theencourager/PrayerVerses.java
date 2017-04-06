package com.example.theencourager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PrayerVerses {

    public static String prayResponse() {

        Random random = new Random();


        ArrayList<String> prayerVersesList = new ArrayList<>();
        prayerVersesList.add("Philippians 4:6: Be careful for nothing; but in everything \n" +
                        "but in everything by prayer and supplication with \n" +
                        "thanksgiving let your requests be made known unto God");

        prayerVersesList.add("Mark 11:24: Therefore I say unto you, What things soever ye \n" +
                "desire, when ye pray, believe that ye recieve[them], and \n" +
                "ye shall have [them]");

        prayerVersesList.add("Matthew 6:7: But when ye pray, use not vain repititions, \n" +
                "as the heathen [do]: for they think that they shall be \n" +
                "heard for their much speaking");

        prayerVersesList.add("Romans 8:26: Likewise the Spirit also helpeth our infirmities: \n" +
                        "for we know not what we should pray for as we ought: but \n" +
                        "the Spirit itself maketh intercession for us with groanings \n" +
                        "which cannot be uttered");

        prayerVersesList.add("Matthew 6:6: But thou, when thou prayest, enter into thy closet, \n" +
                        "and when thou hast shut thy door, pray to thy Father which \n" +
                        "is in secret; and thy Father which seeth in secret shall \n" +
                        "reward thee openly");

        prayerVersesList.add("John 15:7: If ye abide in me, and my words abide in you, ye " +
                        "shall ask what ye will, an it shall be done unto you");

        prayerVersesList.add("Luke 11:9: And I say unto you, Ask, and it shall be given you; " +
                "seek, and ye shall find; knock, and it shall be opened unto you");

        prayerVersesList.add("James 5:16: Confss [your] faults one to another, and pray one for " +
                "another, that ye may be healed. The effectual fervent prayer of " +
                "a righteous man availeth much");

        prayerVersesList.add("Ephesians 6:18: Praying always with all prayer and supplication in " +
                "the Spirit, and watching thereunto with all perseverence and " +
                "supplication for all saints");

        prayerVersesList.add("Jeremiah 33:3: Call unto me, and I will answer thee, and shew thee " +
                "great and mighty things, which thou knowest not");

        prayerVersesList.add("Psalms 34:17: [The righteous] cry, and the LORD heareth, and " +
                "delivereth them out of all their troubles");

        prayerVersesList.add("Colossians 4:2: Continue in prayer, and watch in the same with " +
                "thanksgiving");


        Collections.shuffle(prayerVersesList);

        String prayIdx = prayerVersesList.get(random.nextInt(prayerVersesList.size()));

        //Return Random Index of Array after shuffle
        return prayIdx;
    }

}
