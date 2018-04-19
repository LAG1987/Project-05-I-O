/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ticket.ticketController;
import ticket.ticketModel;
import ticket.ticketView;

/**
 *
 * @author Luis G
 */
public class Project3MVC extends Application {
    
    @Override
	public void start(Stage primaryStage) {
            
        ticketView tickView = new ticketView();
        ticketModel tickModel = new ticketModel();
        ticketController tickCont = new ticketController(tickModel, tickView);
        
        
        Scene scene = new Scene(tickView, 900, 700);
        
        primaryStage.setTitle("Ticket MVC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
