/*
 * Dalton Ream 
 * Homework 4D
 * 4/20/20
 * dur225@gmail.com

 * Controller.java
 * Dalton Ream
 * passes the rows and colmns to create the grid to methods in CenterPanel
 * also passes the attribute ArrayList and attributeName Arraylist to populate the gird
 * Allows the user to scroll and also highlight the headers. 
 */

package Controller;

import Model.Model;
import View.View; 
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;



public class Controller 
{
  Model model;
  View view;

public Controller(Model m, View v)
{
  model = m;
  view = v;
  //view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size()); // first one returns the columns or number of FBPlayers
                                                                                          // second returns the headers or the attribute names
   view.CenterInitialSetup();

}

}