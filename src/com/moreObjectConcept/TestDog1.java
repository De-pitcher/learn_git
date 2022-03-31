package com.moreObjectConcept;

public class TestDog1 {
    public static void main(String[] args) {
        DogTrialParticipant1 dog1=new DogTrialParticipant1("Browser",2,85,89,0);
        dog1.display();
        DogTrialParticipant1 dog2 =
                new DogTrialParticipant1("Rush", 3, 78, 72, 80);
        dog2.display();
        DogTrialParticipant1 dog3 =
                new DogTrialParticipant1("Ginger", 3, 90, 86, 72);
        dog3.display();

    }
}
