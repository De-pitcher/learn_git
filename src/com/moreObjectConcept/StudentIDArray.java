package com.moreObjectConcept;

import javax.swing.*;

public class StudentIDArray {
    public static void main(String[] args) {
        final int NUM_ARRAYS = 10;
        int[] stuID = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
        String[] fNames = {"Ebele", "Sparkz", "David", "Kate", "Rita",
                "Seth", "Rwanda", "Chidera", "Kamsi", "Melvina"};
        double[] GPAvg = {61.0, 69.4, 69.0, 70.5, 73.9, 59.9, 80.8, 91.2,
                59.9, 89.9};
        String sIDNum;
        int j, no = 0;
        int IDNum;
        sIDNum = JOptionPane.showInputDialog(null,
                "Enter student's ID number");
        IDNum = Integer.parseInt(sIDNum);
        for (j = 0; j < NUM_ARRAYS; ++j) {
            if (IDNum == stuID[j]) {
                no = j;
            }
        }
        while (!(IDNum == stuID[no])) {
            JOptionPane.showMessageDialog(null,
                    "This ID " + sIDNum + " is" +
                            " not in the database");
            sIDNum = JOptionPane.showInputDialog(null,
                    "Enter a valid student's ID number");
            IDNum = Integer.parseInt(sIDNum);
        }
        if (IDNum == stuID[no]) {
            JOptionPane.showMessageDialog(null,
                    IDNum + " " + fNames[no] +
                            " " + GPAvg[no]);
        }
    }
}