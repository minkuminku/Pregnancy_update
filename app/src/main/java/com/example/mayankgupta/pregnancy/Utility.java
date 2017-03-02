package com.example.mayankgupta.pregnancy;

import java.util.HashMap;

/**
 * Created by mayankgupta on 02/03/17.
 */

public class Utility {

    public static HashMap<String, Week> weekSummary;
    public static final String WEEK_INTENT_KEY = "weekName";

    static {

        weekSummary = new HashMap<>();

        Week week1 = new Week("During the first week of pregnancy there’s no major development of the baby," +
                " other than the egg leaving the ovary and traveling to the fallopian tubes. " +
                "You’re not actually pregnant at this time, since conception itself doesn’t " +
                "happen until about two weeks after your period ends.",R.drawable.week_1_image);

        Week week2 = new Week("During this time of transformation," +
                " the embryo simply floats within the uterus, protected " +
                "by the secretions of the uterus lining. The baby is still very, " +
                "very small — only .1 to .2 mm long.",R.drawable.week2);

        weekSummary.put("Week 1",week1);
        weekSummary.put("Week 2",week2);


    }




}
