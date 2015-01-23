/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villager;

import java.util.Random;
import java.util.Scanner;
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
       // Family familyArray[] = new Family[families];
        Person dad = new Person(true, 10, firstNameList(), lastNameList(), "dad" );
        Person mom = new Person(true, 2, firstNameList(), lastNameList(), "dad" );
        Person kid = new Person(true, 3, firstNameList(), lastNameList(), "dad" );
        Person otherkid = new Person(true, 1, firstNameList(), lastNameList(), "dad" );
        Family [] famArray = new Family[families];
        Family james = new Family(dad, mom, famArray);
        Person nullKid = new Person(true, 1, null, null, null );

        for(int i = 0; i < families; i++)
        {
            dad(i);
            mom(i);
            Family jimmy = new Family(dad(i), mom(i), famArray);
            famArray[i] = jimmy;
            
            
        }   
        for (int i = 0; i < families; i++) {
            System.out.println("in this family you have");
            System.out.println(famArray[i]);
        }
    }

    private static Person dad(int i) {

        Random random = new Random();
        int randomCoin = random.nextInt(2);
        int randomAge = random.nextInt(80 -20 +1) +20;
        Person dad = new Person(true, randomAge, firstNameList(), lastNameList(), "dad" ); 
        return dad;
        
    }
    
    
    
    private static Person mom(int i) {
        int momsAge;
        Random random = new Random();
        int randomAge = random.nextInt(80 -20 +1) +20;
        Person mom = new Person(false, randomAge, firstNameList(), lastNameList(), "mom"); 
        return mom;
           
           
           
        }

}
