/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villager;

import java.util.Random;

/**
 *
 * @author kyle
 */
public class names {
    
    public static String firstNameList()
    {
    Random random = new Random();
    String [] nameList = new String [10];
    nameList[0] = "bob";
    nameList[1] = "jeff";
    nameList[2] = "john";
    nameList[3] = "kyle";
    nameList[4] = "luke";
    nameList[5] = "oscar";
    nameList[6] = "lefsa";
    nameList[7] = "pizza";
    nameList[8] = "name01";
    nameList[9] = "darkness";
    int randNum = random.nextInt(10);
    return nameList[randNum];
    }
    public static String lastNameList()
    {
    Random random = new Random();
    String [] nameList = new String [10]; 
    nameList[0] = "0";
    nameList[1] = "1";
    nameList[2] = "2";
    nameList[3] = "3";
    nameList[4] = "4";
    nameList[5] = "5";
    nameList[6] = "6";
    nameList[7] = "7";
    nameList[8] = "8";
    nameList[9] = "9";
    int randNum = random.nextInt(10);
    return nameList[randNum];
    

    }
}
