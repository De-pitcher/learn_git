package com.AdvancedArrayConcept;


import java.util.Arrays;
import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Recording[] obj = new Recording[3];
        String title, artist;
        int playTime, count = 0;
        int selectSort;
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


            if (selectSort == 1) {
                Arrays.sort(obj,Recording.titleComparator);
            } else if (selectSort == 2) {
                Arrays.sort(obj,Recording.artistComparator);
            } else if (selectSort == 3) {
                Arrays.sort(obj);
        }
        for (Recording objDis:obj){
            System.out.println(" "+objDis.getTitle());
            System.out.println(" "+objDis.getArtist());
            System.out.println(" "+objDis.getPlayingTime());
        }
    }
}
