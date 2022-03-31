package com.moreObjectConcept;

import javax.swing.*;
import java.util.GregorianCalendar;

public class DialogTimer {
    public static void main(String[] args) {
        int time1, time2,  milli1, milli2, sec1,
                sec2, min1, min2,  timeDifference;
        final int MILLISECS_IN_SECOND = 1000;
        GregorianCalendar before = new GregorianCalendar();
        milli1 = before.get(GregorianCalendar.MILLISECOND);
        sec1 = before.get(GregorianCalendar.SECOND);
        min1=before.get(GregorianCalendar.MINUTE);
        time1 = MILLISECS_IN_SECOND * sec1 + milli1+min1;
        JOptionPane.showConfirmDialog
                (null, "Is stealing ever justified? ");
        GregorianCalendar after = new GregorianCalendar();
        milli2 = after.get(GregorianCalendar.MILLISECOND);
        sec2 = after.get(GregorianCalendar.SECOND);
        min2= after.get(GregorianCalendar.MINUTE);
        time2 = MILLISECS_IN_SECOND * sec2 + milli2+min2;
        timeDifference = time2 - time1;

        JOptionPane.showMessageDialog(null, "It took " +
                timeDifference + " milliseconds for you to answer");
    }
}