/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villager;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import static villager.names.firstNameList;
import static villager.names.lastNameList;

/**
 *
 * @author kyle
 */
public class Villager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int villagers;
        int kids;
        int families;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello. Its time to make a village.");
        System.out.println("First, how many people do you want in your village?\n");
        //Make this print safe or whatever its called. it will crash when you do invalid input.
        villagers = scan.nextInt();
        
        System.out.println("How many kids to you want in the family?\n ");
        kids = scan.nextInt();
        
        families = villagers / (kids +2);
        System.out.println("you have " + families + " families");
        ArrayList<Person> famArray = new ArrayList<>();
        
        
        for(int i = 0; i < families; i++)
        {
            String lastName = lastNameList();
            famArray.add(dad(i, lastName));
            famArray.add(mom(i, lastName));
            for (int j = 0; j < kids; j++) {
                famArray.add(kid(i, lastName)); 

            }
            // Family jimmy = new Family(dad(i), mom(i), famArray);
            
            
        }   
        System.out.println("in this family you have");
        
            
        
        for (Person famArray1 : famArray) {
            System.out.println(famArray1);
        }
    }

    public static Person dad(int i,  String lastName) {

        Random random = new Random();
        int randomAge = random.nextInt(80 -20 +1) +20;
        Person dad = new Person(true, randomAge, firstNameList(), lastName, "dad" ); 
        return dad;
        
    }

    public static Person mom(int i, String lastName) {
        int momsAge;
        Random random = new Random();
        int randomAge = random.nextInt(80 -20 +1) +20;
        Person mom = new Person(false, randomAge, firstNameList(), lastName, "mom"); 
        return mom;
    }
           
    public static Person kid(int i,String lastName) 
     {
        Boolean male= true;
         Random random = new Random();
        int randomCoin = random.nextInt(2);
        int randomAge = random.nextInt(20);
        if(randomCoin == 1)
            male = false;
        Person kid = new Person(male, randomAge, firstNameList(), lastName, "kid");
        return kid;
     }
        
        
           
        }

