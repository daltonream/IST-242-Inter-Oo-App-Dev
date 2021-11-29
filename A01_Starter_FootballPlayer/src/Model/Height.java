/*
 * Dalton Ream 
 * Homework 1 
 * 1/30/20
 * dur225@gmail.com
 */
package Model;

/*
 * Height.java
 * Dalton Ream
 * Declare calculate and display the heights of the football players
 */
public class Height { 
    private int feet; // feet of football player 
    private int inches;// inches of football player 
    private int heightCalculations; //used to convert heoght into inches for boolean 
    private String properHeightFormat;// used to format height as 6' 2"


    public Height (int feet1, int inches1) { // constructor 
        
        feet = feet1; // set feet1 to feet
        inches = inches1; // set inches1 to inches 
        
    }
    public Height(){ // empty constructor 
    
       this(0,0);
      
    }
    
    
    /** 
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }
    
    /**
     * @return the formatedHeight
     */
    public String getProperHeightFormat(){
        return getFeet() + "'" + getInches() + "\"";
    }

    /**
     * @param formatedHeight the formatedHeight to set
     */
    public void setFormatedHeight(String formatedHeight) {
        this.properHeightFormat = formatedHeight;
        //
    }

}

