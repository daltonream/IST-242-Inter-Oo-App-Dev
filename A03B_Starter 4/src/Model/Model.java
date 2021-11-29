/*
 * Dalton Ream 
 * Homework 3b
 * 4/15/20
 * dur225@gmail.com

 * Model.java
 * Dalton Ream
 * takes in the number of lines to be displayed, and where to start
 */
package Model;


import java.util.ArrayList;

public class Model
{ 
    protected FootballPlayerData fpData = new FootballPlayerData(); // Instantiates FootballPlayer Data object
   
    public static ArrayList<ArrayList<String>> lines;

    public Model()
    { 
//        
//        System.out.println("=============================================================");
//        System.out.println(fpData.getHeaders().toString()); // returns the headers (AKA: the arrtibueNames)
//        System.out.println("=============================================================");
//        System.out.println(fpData.getLine(50).toString()); // returns the player of the selected line 
//        System.out.println("=============================================================");
//         lines = fpData.getLines(0,22); // returns the selected lines 
//        for (int i = 0; i < lines.size(); i++)
//        {
//            System.out.println(lines.get(i).toString()); 
//        }
//        System.out.println("=============================================================");

        
        fpData.setLinesBeingDisplayed(30);
        fpData.setFirstLineToDisplay(5);
    }
    
public FootballPlayerData getFpData(){
return fpData;
}

}

