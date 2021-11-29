/*
 * Dalton Ream 
 * Homework 1 
 * 1/30/20
 * dur225@gmail.com
 */
package Model;
/*
 * FootballPlayer.java
 * Dalton Ream + Professor Bartell
 * Declare and intialize all atributes regarding football players
 */
public class FootballPlayer {
    private String name; // football player name as an int 
    private int weight; // football player weight as an int 
    private Height height;// football player  height in the Height class
    private String hometown; // football player  hometown as a string 
    private String highschool;  // football player high school as a strin g
    private int number; // football player number as an int 
    private String position; // football player posotion as a string 
    private int heightCalculations; 

     

    public FootballPlayer(String firstName, int weightInPounds, Height height1,
                String hometownLIT, String highschoolLIT, int numberCurrent, String positionCurrent){
        
        
        // all of these are setting equal to parameters in the constructor 
        name = firstName; 
        weight = weightInPounds; 
        height = height1;
        hometown = hometownLIT;
        highschool = highschoolLIT;
        number = numberCurrent;
        position = positionCurrent; 

    }
    
    public FootballPlayer() {
        this("Walter",290, null, "N/A","N/A", 00, "N/A");// defualt constructor 
     
    }
     
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


    /**
     * @return the highschool
     */
    public String getHighschool() {
        return highschool;
    }

    /**
     * @param highschool the highschool to set
     */
    public void setHighschool(String highschool) {
        this.highschool = highschool;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the height
     */
    public Height getHeight() {
        
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }
    
        /**
     * @return the heightCalculations
     */
    public int getHeightCalculations() {
        
        int feetToInches= height.getFeet() * 12;
        int combinedInches = feetToInches + height.getInches();
        
        return combinedInches; 
    }

    /**
     * @param heightCalculations the heightCalculations to set
     */
    public void setHeightCalculations(int heightCalculations) {
        this.heightCalculations = heightCalculations;
    }
        
}
