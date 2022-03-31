package com.moreObjectConcept;

import javax.swing.*;
import java.util.GregorianCalendar;

public class NextYear {
    public static void main(String[] args) {
        int dayOfTheYear;
        int calDaysLeft;
        GregorianCalendar now =new GregorianCalendar();
        dayOfTheYear=now.get(GregorianCalendar.DAY_OF_YEAR);
        calDaysLeft=365-dayOfTheYear;
        JOptionPane.showMessageDialog(null,"The numbers of day left in the year is "+calDaysLeft);
    }
}
