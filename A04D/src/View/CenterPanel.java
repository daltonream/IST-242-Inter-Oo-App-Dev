/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@psu.edu
 *
 * IntialFrame.java
 * Dalton Ream + Professor Bartell
 * Instantiates center panel and adds it to display 
 */
package View;


import java.awt.*;
import javax.swing.*;


public class CenterPanel extends JPanel
{
  
    
    public CenterPanel()
    {
        super();
        
        setBackground(Color.blue);
        
      GridLayout panel = new GridLayout(1,1);
      JButton button = new JButton();
      button.setText("Okay");
      add(button);     
      setLayout(panel);
      
    }

    
public void createDisplay(){       
       GridLayout panel = new GridLayout(1,1);
      JButton button = new JButton();
      button.setText("Okay1");
      add(button);     
      setLayout(panel);


}


    

}  
