package com.AdvancedArrayConcept;

import java.util.Comparator;
import java.util.Locale;

public class Recording implements Comparable<Recording>{
    String title;
    String artist;
    int playingTime;

    public void setTitle(String title) {

        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int compareTo(Recording compPlayingTime) {
        int compPlayTime=((Recording) compPlayingTime).getPlayingTime();
        return this.playingTime-compPlayTime;
    }
    public static Comparator<Recording> titleComparator=new Comparator<Recording>() {
        @Override
        public int compare(Recording title1, Recording title2) {
            String titleC1=title1.getTitle().toUpperCase();
            String titleC2=title2.getTitle().toUpperCase();
            return titleC1.compareTo(titleC2);
        }
    };
    public static Comparator<Recording> artistComparator=new Comparator<Recording>() {
        @Override
        public int compare(Recording artist1, Recording artist2) {
            String artistC1=artist1.getTitle().toUpperCase();
            String artistC2=artist2.getTitle().toUpperCase();
            return artistC1.compareTo(artistC2);
        }
    };
}
