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
public class Family {
   Person nullKid = new Person(true, 1, null, null, null );
   private int numOfFamily;
   private Person dad;
   private Person mom;
   private Person [] kidsArray = new Person[10];
   
   public Family()
   {
       dad = null;
       mom = null;

   }
    
   public Family(Person startDad, Person startMom, Person[] startKidsArray)
   {
       dad = startDad;
       mom = startMom;
       kidsArray = startKidsArray;

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
      for (int i = 0; i < 10; i++) {
          
      }
  }
   
   public String toString()
   {
       if(kid1.equals(nullKid))
              return (dad + "\n" + mom + "\n" +  );

           
       
       return (dad + "\n" + mom + "\n" + kid1 + "\n" + kid2 + "\n" + kid3 + "\n" +kid4 );
   }
   
   
   
}
