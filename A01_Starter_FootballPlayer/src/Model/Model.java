/*
 * Dalton Ream 
 * Homework 1 
 * 1/30/20
 * dur225@gmail.com
 */

package Model;

/*
 * Model.java
 * Dalton Ream + Professor Bartell
 * Give the attributes to the football player class and compare their heights
 */

public class Model
{
    public Model()
    {
        Height footballplayer1Height = new Height(6,2); // football player one height 
        Height footballplayer2Height = new Height(6,0); // football player two height 
        Height footballplayer3Height = new Height(); // default football player height 
        
        FootballPlayer fb1 = new FootballPlayer("Dalton",190, footballplayer1Height, "York Pa","Northeastern", 55, "Middle Linebacker"); // football player one attributes
        FootballPlayer fb2 = new FootballPlayer("Noah",149, footballplayer2Height, "Hanover Pa","Hanover", 69, "Bench Warmer"); // football player two attributes 
        FootballPlayer fb3 = new FootballPlayer(); // default football player 

        
             if (fb1.getHeightCalculations() > fb2.getHeightCalculations()) { // if player 1 is taller go into decision 
            
                System.out.println(fb1.getName() + " who is " + fb1.getHeight().getProperHeightFormat() + " is taller "
                                 + "than " + fb2.getName() +  " who is " + fb2.getHeight().getProperHeightFormat());
              
            }
            else if (fb1.getHeightCalculations() < fb2.getHeightCalculations()) { // if player 2 is taller go into decision 
                
                 System.out.println(fb2.getName() + " who is " + fb2.getHeight().getProperHeightFormat() + " is taller "
                                   + "than " + fb1.getName() +   " who is " + fb1.getHeight().getProperHeightFormat());
            }
        
            else { // if player's are the same height 
              
              System.out.println(fb1.getName() + " and " + fb2.getName() + " are the same "
                          + "height which is " + fb1.getHeight().getProperHeightFormat());
        
                }

    }
}
