/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villager;

/**
 *
 * @author kyle
 */
import java.util.ArrayList;

public class Family {
   private int numOfFamily;
   private Person dad;
   private Person mom;
   private ArrayList<Person> kidsArray;
   
   
   public Family()
   {
       dad = null;
       mom = null;
       kidsArray = new ArrayList<>( );
   }
    
   public Family(Person startDad, Person startMom, ArrayList<Person> startKidsArray)
   {
       dad = startDad;
       mom = startMom;
       kidsArray = startKidsArray;

   }
   
   public void addKid( boolean startGender, int startAge, String startFirst, String startLast, String newDMK )
   {
       Person newKid = new Person( startGender, startAge, startFirst, startLast, newDMK );
       
       kidsArray.add( newKid );
   }
   
   public Person getDad()
   {
       return dad;
   }
   public Person getMom()
   {
       return mom;
   }   
  public String listKids()
  {
      String s = "";
      
      for (int i = 0; i < kidsArray.size( ); i++) {
          s += kidsArray.get( i );
      }
      
      return s;
  }
   
   public String toString()
   {
       return (dad + "\n" + mom + "\n" + listKids( ) );
   }  
}
