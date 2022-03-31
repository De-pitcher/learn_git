package com.moreObjectConcept;

import javax.swing.*;
import java.util.GregorianCalendar;

public class NextMonth {
    public static void main(String[] args) {
        int dayOfTheMonth;
        int putDayOfTheMonth;
        int calDaysLeft;
        GregorianCalendar now=new GregorianCalendar();
        dayOfTheMonth=now.get(GregorianCalendar.DAY_OF_MONTH);
        calDaysLeft=31-dayOfTheMonth;
        JOptionPane.showMessageDialog(null,"The days remaining in this month is "
                +calDaysLeft);

    }
}
