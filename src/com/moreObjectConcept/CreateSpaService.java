package com.moreObjectConcept;

import java.util.Scanner;

public class CreateSpaService {
    public static void main(String[] args) {
        SpaService firstService=new SpaService();
        SpaService secondService=new SpaService();
        firstService=getData(firstService);
        secondService=getData(secondService);
        /*String service;
        double price;
        Scanner keyboard=new Scanner(System.in);
        System.out.println(" Enter service >> ");
        service=keyboard.nextLine();
        // first service
        System.out.println(" Enter price >> ");
        price=keyboard.nextDouble();
        firstService.setServiceDescription(service);
        firstService.setPrice(price);*/
        // print first service
        System.out.println(" First service details is: ");
        System.out.println(firstService.getServiceDescription()
                +" $"+ firstService.getPrice());
        // second service
        /*keyboard.nextLine();
        System.out.println(" Enter service >> ");
        service=keyboard.nextLine();
        System.out.println(" Enter price >> ");
        price=keyboard.nextDouble();
        secondService.setServiceDescription(service);
        secondService.setPrice(price);*/
        // print second service
        System.out.println(" Second service detail is: ");
        System.out.println(secondService.getServiceDescription()
                +" $"+secondService.getPrice());
    }
    public static SpaService getData(SpaService s){
        String service;
        double price;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter Service >> ");
        service=keyboard.nextLine();
        System.out.println("Enter Price>> ");
        price= keyboard.nextDouble();
        s.setServiceDescription(service);
        s.setPrice(price);
        return s;
    }
}
