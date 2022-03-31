package com.AdvancedArrayConcept;

import com.Array.Salesperson;
import java.util.Scanner;

public class SalesPersonDatabase {
    public static void main(String[] args) {
        Salesperson[] database = new Salesperson[4];
        database[0]=new Salesperson();
        database[0].setID(100);
        database[0].setAnnualSal(55.5);
        database[1]=new Salesperson();
        database[1].setID(101);
        database[1].setAnnualSal(75.9);
        database[2]=new Salesperson();
        database[2].setID(102);
        database[2].setAnnualSal(45.7);
        final int QUIT = 999;
        int select;
        int Id, storeId;
        double salary;
        boolean check = false,check1=false,check2=false,check3=false;
        Scanner input = new Scanner(System.in);
        System.out.println("If you quit type "
                + QUIT + " or any other thing to continue");
        select = input.nextInt();
        while (select != QUIT) {
            System.out.println("Type \n1 to add a record in the database" +
                    " \n2 to delete a record " +
                    "\n3 to change a record in the database"
            +" or "+QUIT+" to quit");
            select=input.nextInt();
            if (select == 1) {
                int count1=0;
                while (count1 < database.length) {
                    for (Salesperson value : database) {
                        if (value == null) {
                            check1 = true;
                            break;
                        }
                    }
                    if (!check1) {
                        System.out.println("The database is full!");
                    }else {
                        System.out.println("Enter an ID >>");
                        Id = input.nextInt();
                        for (Salesperson salesperson : database) {
                            storeId=salesperson.getID();
                            if (String.valueOf(storeId).equals(""))
                                check=false;
                            if (storeId == salesperson.getID()) {
                                check = true;
                                break;
                            }else if (String.valueOf(storeId).equals(""))
                                check=false;
                        }
                        if (!check) {
                            database[count1].setID(Id);
                            System.out.println("Enter salary >>");
                            salary = input.nextDouble();
                            database[count1].setAnnualSal(salary);
                        } else
                            System.out.println("The number already exist!");
                    }
                    count1= database.length-1;
                    count1++;
                }

            } else if (select == 2) {
                int count2 = 0;
                while (count2 < database.length) {
                    for (Salesperson value : database) {
                        if (value == null) {
                            check2 = true;
                            break;
                        }
                    }
                    if (!check2) {
                        System.out.println("Input an ID >>");
                        Id = input.nextInt();
                        for (Salesperson salesperson : database) {
                            if (salesperson.getID() == Id) {
                                check = true;
                                break;
                            }
                        }
                        if (!check)
                            System.out.println("The ID does not exist!");
                    } else{
                        System.out.println("The database is empty!");
                    }
                    count2=database.length-1;
                    count2++;
                }
            } else if (select == 3) {
                int count3 = 0;
                while (count3 < database.length) {
                    for (Salesperson value : database) {
                        if (value == null) {
                            check3 = true;
                            break;
                        }
                    }
                    if (check3)
                        System.out.println("The database is empty!");
                    else {
                        System.out.println("Enter a ID >>");
                        Id = input.nextInt();
                        for (Salesperson salesperson : database) {
                            storeId = salesperson.getID();
                            if (storeId == Id) {
                                check = true;
                            }
                        }
                        if (!check)
                            System.out.println("The ID does not exist!");
                        else {
                            System.out.println("Enter a new sales value >>");
                            salary = input.nextDouble();
                            database[count3].setAnnualSal(salary);
                            count3=database.length-1;
                        }
                    }
                    count3++;
                }
            }
        }
            for (Salesperson salesperson:database) {
            System.out.println(" "+salesperson.getID());
            System.out.println(" "+salesperson.getAnnualSal());
        }
    }
}