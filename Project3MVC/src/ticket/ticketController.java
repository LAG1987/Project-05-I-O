/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Luis G
 */
public class ticketController {

    ticketModel tickModel;
    ticketView tickView;

    public ticketController(ticketModel tModel, ticketView tView) {
        this.tickModel = tModel;
        this.tickView = tView;
        attachHandlers();
    }

    public void attachHandlers() {

        //adds a citation to a ticket list
        tickView.getAdd().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String permitNo = tickView.getPermitNoTF().getText();
                String vehicleMake = tickView.getVehicleMakeTF().getText();
                String vehicleModel = tickView.getVehicleModelTF().getText();
                String color = tickView.getColorTF().getText();
                String violationType = tickView.getViolationTypeTF().getText();
                String date = tickView.getDateTF().getText();
                String location = tickView.getLocationTF().getText();
                String time = tickView.getTimeTF().getText();
                String issuedBy = tickView.getIssuedByTF().getText();
                String liscenseNo = tickView.getLiscenseNoTF().getText();
                String state = tickView.getStateTF().getText();
                String check = "No";

                ticket cit = new ticket(permitNo, vehicleMake, vehicleModel, color, violationType, date,
                        location, time, issuedBy, liscenseNo, state, check);
                tickView.clearFields();
                tickModel.setCurrentTicket(cit);
                //tickView.updateList(tickView.getIndex());
                

            }
        }
        );
        //goes back 1 index on the ticket list
        tickView.getBack().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<ticket> tick = tickModel.getCitations();
                if (event.getSource() == tickView.getBack()) {
                    if (!tickModel.getCitations().isEmpty()) {
                        if (tickView.getIndex() > 0) {
                            int temp = tickView.getIndex();
                            temp -= 1;
                            tickView.setIndex(temp);
                            tickView.updateList(tick);
                        }
                    }
                }
            }
        }
        );
        //changes the list of tickets to next
        tickView.getNext().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<ticket> tick = tickModel.getCitations();
                if (event.getSource() == tickView.getNext()) {
                    if (!tickModel.getCitations().isEmpty()) {
                        if (tickView.getIndex() < tickModel.getCitations().size() - 1) {
                            int temp = tickView.getIndex();
                            temp += 1;
                            tickView.setIndex(temp);
                            tickView.updateList(tick);
                        }
                    }
                }
            }
        }
        );
        //buttons changes the ticket to paid "Yes"/"No"
        tickView.getPaid().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<ticket> tick = tickModel.getCitations();
                if (event.getSource() == tickView.getPaid()) {
                    tickView.setsCheck(tickView.getsCheck());
                    if (tickView.getsCheck() == "No") {
                        //tickModel.getCitations().get(tickView.getIndex()).setCheck("Yes");
                        tick.get(tickView.getIndex()).setCheck("Yes");
                        tickView.updateList(tick);
                    } else {
                        //tickModel.getCitations().get(tickView.getIndex()).setCheck("No");
                        tick.get(tickView.getIndex()).setCheck("No");
                        tickView.updateList(tick);
                    }
                }
            }
        }
        );

        tickView.getPrint().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<ticket> tick = tickModel.getCitations();
                tickModel.storeTicketObject(tick);
            }
        }
        );
        
        tickView.getDisplay().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(tickView.getIndex());
                ArrayList<ticket> tick = tickModel.getCitations();
                tickView.updateList(tick);
            }
        }
        );
        
        //exits out of app
        tickView.getExit().setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (event.getSource() == tickView.getExit()) {
                    Platform.exit();
                    System.exit(0);
                }
            }
        }
        );

    }

}
