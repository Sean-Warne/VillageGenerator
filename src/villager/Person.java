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
public class Person {
    private boolean male;
    private int age;
    private String firstName;
    private String lastName;
    private String dadMomKid;
              

    
    public Person()
    {
        male = true;
        age = 0;
        firstName = "faggot";
        lastName = "Faggot";
    }
    
    public Person(boolean startGender, int startAge, String startFirst, String startLast, String newDMK)
    {
        male = startGender;
        age = startAge;
        firstName = startFirst;
        lastName = startLast;
        dadMomKid = newDMK;
    }
    
   //Accessor methods
    public String getDadMomKid()
    {
            return dadMomKid;
    }
    public boolean getGender()
    {
            return male;
    }
    public int getAge()
    {
        return age;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
  
    //Mutator methods
    public void setDadMomKid(String newDMK)
    {
        dadMomKid = newDMK;
    }
    public void setMale(boolean newGender)
    {
        male = newGender;
    }
      public void setAge(int newAge)
    {
        age = newAge;
    }
       public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }
        public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }
        
        
    public String toString()
    {
        return ("Person" + "  " + male + "  " + firstName  + "  " + lastName + "  " + dadMomKid + "  " + age  );
    }
        

}
