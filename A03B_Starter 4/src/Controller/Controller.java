/*
 * Dalton Ream 
 * Homework 4c
 * 4/15/20
 * dur225@gmail.com

 * Controller.java
 * Dalton Ream
 * passes the rows and colmns to create the grid to methods in CenterPanel
 * also passes the attribute ArrayList and attributeName Arraylist to populate the gird
 */

package Controller;

import Model.Model;
import View.View; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
                                                                    // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ
 // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ
 // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ
 // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ // COMMENTS
                                                                    //DFJSIOFJWE IOFJEIOWJ


public class Controller 
{
  Model model;
  View view;

public Controller(Model m, View v)
{
  model = m;
  view = v;
  view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size()); // first one returns the columns or number of FBPlayers
                                                                                                            // second returns the headers or the attribute names
  
                                                                                                            
  
  view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); // first returns the arraylist of footballPlayers
   addScrolling();                                                                                                                                                      // second returns the arraylist of Headers 

  
}

private void addScrolling()
{
    view.getIf().getIp().getCp().addMouseWheelListener(
            new MouseWheelListener()
       {    
            @Override
            public void mouseWheelMoved(MouseWheelEvent e)
            {
                int units = e.getUnitsToScroll();
                
                
                model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + units);
                
               view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders()); 
                          System.out.println(model.getFpData().getFirstLineToDisplay());
                
                
            }
            
    
    }
    );
    
    for(int i = 0; i< model.getFpData().getHeaders().size(); i++){
        int k = i;
        view.getIf().getIp().getCp().getHeaderButton().get(i).addActionListener(
        new ActionListener()
        {
        
            @Override
            public void actionPerformed(ActionEvent event)
            {
            
            if (event.getSource() == view.getIf().getIp().getCp().getHeaderButton().get(k)){
            
                // this is going through and resetting the color of the Jbuttons and at the end
                // highlighting the one that is selected.
                view.getIf().getIp().getCp().getHeaderButton().get(0).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(1).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(2).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(3).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(4).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(5).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(6).setBackground(Color.gray);
                view.getIf().getIp().getCp().getHeaderButton().get(k).setBackground(Color.yellow);
            }
            
            }
        
        
        
        }
        
        );
        
        
    }
}



}