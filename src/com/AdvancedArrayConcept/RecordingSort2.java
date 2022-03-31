package com.AdvancedArrayConcept;

import java.util.Scanner;

public class RecordingSort2 {
    public static void main(String[] args) {
        Recording[] obj = new Recording[3];
        String title, artist;
        int playTime, count = 0;
        int selectSort;
        String temp;
        int comparisonToMake;
        comparisonToMake = obj.length - 1;
        Scanner input = new Scanner(System.in);
        while (count < 3) {
            obj[count]=new Recording();
            System.out.println("Enter the title of the song >>");
            title = input.next();
            obj[count].setTitle(title);
            System.out.println("Enter the artist >>");
            artist = input.next();
            obj[count].setArtist(artist);
            System.out.println("Enter the playtime >>");
            playTime = input.nextInt();
            obj[count].setPlayingTime(playTime);
            count++;
        }
        System.out.println("Which field do you want to " +
                "sort with?");
        System.out.println("1 for title\n2 for artist" +
                "\n3 for playtime");
        selectSort = input.nextInt();
        for (int i = 0; i < comparisonToMake; ++i) {
            if (selectSort == 1) {
                for (int j = 0; j < obj.length - 1; ++j) {
                    int getNun = obj[j].getTitle().compareTo(obj[j + 1].getTitle());
                    if (getNun > 0) {
                        temp = obj[j].getTitle();
                        obj[j].setArtist(obj[j + 1].getTitle());
                        obj[j + 1].setTitle(temp);
                    }
                }
            } else if (selectSort == 2) {
                for (int j = 0; j < obj.length - 1; ++j) {
                    int getNun = obj[j].getArtist().compareTo(obj[j + 1].getArtist());
                    if (getNun > 0) {
                        temp = obj[j].getArtist();
                        obj[j].setArtist(obj[j + 1].getArtist());
                        obj[j + 1].setArtist(temp);
                    }
                }
            } else if (selectSort == 3) {
                for (int j = 0; j < obj.length - 1; ++j) {
                    if (obj[j].getPlayingTime() > obj[j + 1].getPlayingTime()) {
                        int getTime = obj[j].getPlayingTime();
                        obj[j].setPlayingTime(obj[j + 1].getPlayingTime());
                        obj[j + 1].setPlayingTime(getTime);
                    }
                }
            }
            --comparisonToMake;

        }
        for (Recording objDis:obj){
            System.out.println(" "+objDis.getTitle());
            System.out.println(" "+objDis.getArtist());
            System.out.println(" "+objDis.getPlayingTime());
        }
    }
}
