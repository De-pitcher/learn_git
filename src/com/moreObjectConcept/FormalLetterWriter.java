package com.moreObjectConcept;

public class FormalLetterWriter {
    public static void main(String[] args) {
        FormalLetterWriter obj=new FormalLetterWriter();
        obj.displaySalutation("Emeka");
        obj.displaySalutation("Chiamak","Obi");
    }
    public void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Mrs. "+lastName);
    }
    public void displaySalutation(String firstName,String lastName){
        System.out.println("Dear "+firstName+" "+lastName);
    }
}
