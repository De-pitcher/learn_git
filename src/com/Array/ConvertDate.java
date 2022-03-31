package com.Array;

import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        String[] month= {"January","February","March","April","May",
        "June","July","August","September","October","November",
                "December"};
        String dateInp;
        String mnt1,mnt2;
         int mntI;
         int length;
        String day;
        String year;
        int[] MONTH_LENGTH={31,28,31,30,31,30,31,31,30,31,30,31};
        int i,j,monthCal=0,iMonthCal=0;
        int dTH=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a date to analyze >>");
        dateInp=input.next();
        length=dateInp.length();
        mnt1 = String.valueOf(dateInp.charAt(0) + String.valueOf(dateInp.charAt(1)));
        mnt2 = String.valueOf(dateInp.charAt(0));
        for (i=0;i<dateInp.length();++i) {
            if (i == 0 && dateInp.charAt(1) != '/') {
                mntI = Integer.parseInt(mnt1);
                if (mntI < 1 || mntI > 12)
                    dateInp = input.next();
            }
            else if (i == 0 && dateInp.charAt(1) == '/') {
                mntI = Integer.parseInt(mnt2);
                if (mntI < 1 || mntI > 12)
                    dateInp = input.next();
            }
        }
        for (i=0;i<dateInp.length();++i){
            if (i==0&&dateInp.charAt(1)=='/')
                mnt1 = String.valueOf(dateInp.charAt(0));
                    if (mnt1.equals("1") || mnt1.equals("01"))
                        mnt1 = month[0];
                    else if (mnt1.equals("2") || mnt1.equals("02"))
                        mnt1 = month[1];
                    else if (mnt1.equals("3") || mnt1.equals("03"))
                        mnt1 = month[2];
                    else if (mnt1.equals("4") || mnt1.equals("04"))
                        mnt1 = month[3];
                    else if (mnt1.equals("5") || mnt1.equals("05"))
                        mnt1 = month[4];
                    else if (mnt1.equals("6") || mnt1.equals("06"))
                        mnt1 = month[5];
                    else if (mnt1.equals("7") || mnt1.equals("07"))
                        mnt1 = month[6];
                    else if (mnt1.equals("8") || mnt1.equals("08"))
                        mnt1 = month[7];
                    else if (mnt1.equals("9") || mnt1.equals("09"))
                        mnt1 = month[8];
                    else if (mnt1.equals("10"))
                        mnt1 = month[9];
                    else if (mnt1.equals("11"))
                        mnt1 = month[10];
                    else if (mnt1.equals("12"))
                        mnt1 = month[11];

                    if (dateInp.charAt(i)=='/') {
                        ++i;
                        day = dateInp.charAt(i) + String.
                                valueOf(dateInp.charAt(i + 1));
                        if (mnt1.equals(month[0])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[0]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[0]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[0];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[1])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[1]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[1]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[1];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[2])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[2]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[2]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[2];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[3])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[3]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[3]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[3];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[4])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[4]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[4]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[4];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[5])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[5]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[5]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[5];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[6])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[6]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[6]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[6];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[7])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[7]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[7]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[7];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[8])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[8]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[8]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[8];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[9])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[9]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[9]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[9];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[10])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[10]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[10]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[10];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        } else if (mnt1.equals(month[11])) {
                            dTH = Integer.parseInt(String.valueOf(MONTH_LENGTH[11]));
                            for (j=0;j< MONTH_LENGTH.length;++j) {
                                if (MONTH_LENGTH[11]==MONTH_LENGTH[j]) {
                                    //j++;
                                    iMonthCal = MONTH_LENGTH[11];
                                }
                                monthCal+=MONTH_LENGTH[j];
                                //j= MONTH_LENGTH.length;
                            }
                            monthCal=monthCal-iMonthCal;
                            dTH = dTH - Integer.parseInt(String.valueOf(day));
                            dTH = monthCal+dTH;
                        }
                        i=length;
                        year=dateInp.substring(length-4,length);
                        System.out.println(mnt1 + " " + day + ", " + year);
                        System.out.println(dateInp+" is the " + dTH + "th day of the year");
            }
        }
    }
}