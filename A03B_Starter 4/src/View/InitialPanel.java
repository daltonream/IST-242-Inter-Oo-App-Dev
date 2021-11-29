/*
 * Dalton Ream 
 * Homework 4c
 * 4/15/20
 * dur225@psu.edu
 *
 * IntialFrame.java
 * Dalton Ream + Professor Bartell
 * Instantiates initial panel and adds it to display 
 */
package View;

//import Model.Student;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InitialPanel extends JPanel { 
    private CenterPanel Cp;


    public InitialPanel()
    {
        super();
        setSize(2000, 1000);
        setVisible(true);
       setBackground(Color.darkGray);
        Cp = new CenterPanel();
        add(Cp, "Center");
           
}

    /**
     * @return cp the cp to set
     */
    public CenterPanel getCp()
    {
        return Cp;
    }

    /**
     * @param ip the cp to set
     */
    public void setcp(CenterPanel Cp)
    {
        this.Cp = Cp;
    }
    


}
