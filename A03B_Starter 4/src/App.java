/*
 * Dalton Ream 
 * Homework 4c
 * 4/15/20
 * dur225@gmail.com

 * App.java
 * Dalton Ream 
 * Instantiates model, view, and controller
 */

import Controller.Controller;
import Model.Model;
import View.View;

class App
{

    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}
