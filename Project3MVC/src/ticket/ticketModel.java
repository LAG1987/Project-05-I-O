/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 *
 * @author Luis G
 */
public class ticketModel {

    ArrayList<ticket> ticketDB = new ArrayList<ticket>();
    ticket currentTicket = new ticket();

    OutputStreamWriter out;

    public ticketModel() {

        try {
            out = new OutputStreamWriter(new BufferedOutputStream(
                    new FileOutputStream("TicketList.dat", true)));
        } catch (Exception e) {

        }

    }

    public void setCurrentTicket(ticket currTicket) {
        currentTicket = currTicket;
        ticketDB.add(currentTicket);
    }

    public ticket getCurrentTicket() {
        return currentTicket;
    }

    public void storeTicketObject(ArrayList<ticket> tick) {

        tick = getCitations();
        
        try {
            for (int i = 0; i < tick.size(); i++) {
                out.write("Licesnse No.: ");
                out.write(currentTicket.getLicenseNo());
                out.write("\n");
                out.write("State: ");
                out.write(currentTicket.getState());
                out.write("\n");
                out.write("Permit No.: ");
                out.write(currentTicket.getPermitNo());
                out.write("\n");
                out.write("Vehicle Make/Model: ");
                out.write(currentTicket.getVehicleMake() + "/" + currentTicket.getVehicleModel());
                out.write("\n");
                out.write("Color: ");
                out.write(currentTicket.getColor());
                out.write("\n");
                out.write("Violation Type: ");
                out.write(currentTicket.getViolationType());
                out.write("\n");
                out.write("Date: ");
                out.write(currentTicket.getDate());
                out.write("\r\n");
                out.write("Time: ");
                out.write(currentTicket.getTime());
                out.write("\n");
                out.write("Location: ");
                out.write(currentTicket.getLocation());
                out.write("\n");
                out.write("Issued By: ");
                out.write(currentTicket.getIssuedBy());
                out.write("\n");
                out.write("\n");
            }
            out.close();
            System.out.println("Print Succesfull!!!");
        } catch (Exception e) {
            System.out.println("Print not successfull");
        }
    }

    public ArrayList<ticket> getCitations() {
        return ticketDB;
    }

}
