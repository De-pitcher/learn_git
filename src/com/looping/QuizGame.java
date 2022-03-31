package com.looping;

import java.util.Scanner;

public class QuizGame {
    String hobby,popMusic,astronomy,personalInt;
    String opt1,opt2,opt3,opt4;
    final int a=1,b=2,c=3,d=4;

    public static void main(String[] args) {
        QuizGame game=new QuizGame();
        int ans1,ans2,ans3,ans4;
        Scanner input=new Scanner(System.in);
        System.out.println("Answer the questions correctly");
        System.out.println("Note! option (a) for 1, option (b) for 2, option (c) for 3, option (d) for 4");
        game.hobby();
        System.out.println("\n>>");
        ans1=input.nextInt();
        if(ans1== game.a) {
            System.out.println("Correct!");
            System.out.println("Answer the question correctly");
        }else {
            System.out.println("Wrong! " + game.opt1 + " is the answer");
        }
        System.out.println("Note! option (a) for 1, option (b) for 2, option (c) for 3, option (d) for 4");
        game.popMusic();
        System.out.println("\n>>");
        ans2=input.nextInt();
        if(ans2==game.d){
            System.out.println("Correct!");
            System.out.println("Answer the question correctly");
        }else {
            System.out.println("Wrong! " + game.opt4 + " is the answer");
        }
        System.out.println("Note! option (a) for 1, option (b) for 2, option (c) for 3, option (d) for 4");
        game.astronomy();
        System.out.println("\n>>");
        ans3=input.nextInt();
        if(ans3==game.a){
            System.out.println("Correct!");
            System.out.println("Answer the question correctly");
        }else {
            System.out.println("Wrong! " + game.opt1 + " is the answer");
        }
        System.out.println("Note! option (a) for 1, option (b) for 2, option (c) for 3, option (d) for 4");
        game.personalInt();
        System.out.println("\n>>");
        ans4=input.nextInt();
        if(ans4==game.b){
            System.out.println("Correct!");
            System.out.println("Answer the question correctly");
        }else {
            System.out.println("Wrong! " + game.opt2 + " is the answer");
        }
        if(ans1==game.a&&ans2==game.d&&ans3==game.a&&ans4==game.b){
            System.out.println("You scored 100%");
        }else if ((ans1==game.a&&ans2==game.d&&ans3==game.a&&ans4!=game.b)
                ||(ans1==game.a&&ans2==game.d&&ans3!=game.a&&ans4==game.b)
                ||(ans1==game.a&&ans2!=game.d&&ans3==game.a&&ans4==game.b)||(ans1!=game.a&&ans2==game.d&&ans3==game.a&&ans4==game.b)){
            System.out.println("You scored 75%");
        }else if ((ans1==game.a&&ans2==game.d&&ans3!=game.a&&ans4!=game.b)
                ||(ans1==game.a&&ans2!=game.d&&ans3!=game.a&&ans4==game.b)
                ||(ans1!=game.a&&ans2!=game.d&&ans3==game.a&&ans4==game.b)
                ||(ans1!=game.a&&ans2==game.d&&ans3==game.a&&ans4!=game.b)
                ||(ans1==game.a&&ans2!=game.d&&ans3==game.a&&ans4!=game.b)
                ||(ans1!=game.a&&ans2==game.d&&ans3!=game.a&&ans4==game.b)){
            System.out.println("You scored 50%");
        }else if (ans1==game.a||ans2==game.d||ans3==game.a||ans4==game.b){
            System.out.println("You scored 25%");
        }else
            System.out.println("You scored 0%. You failed the quiz");
    }
    public void hobby(){
        hobby="1. What is the most lucrative hobby?";
        opt1="(a). Football.";opt2="(b). Gaming.";opt3="(c). Programming.";
        opt4="(d). Plating the piano.";
        System.out.print(hobby);
        System.out.print("\n"+opt1+"         "+opt2);
        System.out.print("\n"+opt3+"         "+opt4);
    }
    public void popMusic(){
        popMusic="What is the most popular type of music?";
        opt1="(a). Blues";opt2="(b). Rock.";opt3="(c). Gospel.";
        opt4="(d). Classical.";
        System.out.print(popMusic);
        System.out.print("\n"+opt1+"         "+opt2);
        System.out.print("\n"+opt3+"         "+opt4);
    }
    public void astronomy(){
        astronomy="When was the first time a travel to the moon was made?";
        opt1="(a). 1999.";opt2="(b). 2000.";opt3="(c). 2001.";
        opt4="(d). 1998";
        System.out.print(astronomy);
        System.out.print("\n"+opt1+"         "+opt2);
        System.out.print("\n"+opt3+"         "+opt4);
    }
    public void personalInt(){
        personalInt="Who is the greatest of all time G.O.A.T?";
        opt1="(a). Messi.";opt2="(b). Ronaldo.";opt3="(c). Mbappe.";
        opt4="(d). Ronaldinho.";
        System.out.print(personalInt);
        System.out.print("\n"+opt1+"         "+opt2);
        System.out.print("\n"+opt3+"         "+opt4);
    }
}
