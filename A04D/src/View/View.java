/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * View.java
 * Dalton Ream 
 * Instantiates intial panel, and passes info from controller to methods in Center Panel
 */
package View;

import java.util.ArrayList;

public class View
{
    private IntialFrame IntialF;

    public View()
    {
        IntialF = new IntialFrame();
        
    }

    /**
     * @return the mf
     */
    public IntialFrame getIf()
    {
        return IntialF;
    }

    /**
     * @param mf the mf to set
     */
    public void setIf(IntialFrame iF)
    {
        this.IntialF = iF;
    } 
    


public void CenterInitialSetup(){ 
    
    IntialF.getIp().getCp().createDisplay();
    System.out.println("view class");
          
}


public void CenterUpdate (ArrayList<ArrayList<String>> footballPlayers, ArrayList<String>  headers){ 
    
   
}
}
