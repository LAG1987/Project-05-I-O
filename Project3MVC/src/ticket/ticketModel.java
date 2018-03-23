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
    
    public ticketModel(){
        
        try{
                out = new OutputStreamWriter(new BufferedOutputStream(
                        new FileOutputStream("TicketList.txt",true)));
            }catch (Exception e){
                
            }
        
    }
    
    public void setCurrentTicket(ticket currTicket){
        currentTicket = currTicket;
        ticketDB.add(currentTicket);
    }
    
    public ticket getCurrentTicket(){
        return currentTicket;
    }
    
    public void storeTicketObject(ticket currentTicket){
        
        
        try
        {
            
            out.write(currentTicket.getLicenseNo());
            out.write("\r\n");
            out.write(currentTicket.getState());
            out.write("\r\n");
            out.write(currentTicket.getPermitNo());
            out.write("\r\n");
            out.write(currentTicket.getVehicleMake() + " " + currentTicket.getVehicleModel());
            out.write("\r\n");
            out.write(currentTicket.getColor());
            out.write("\r\n");
            out.write(currentTicket.getViolationType());
            out.write("\r\n");
            out.write(currentTicket.getDate());
            out.write("\r\n");
            out.write(currentTicket.getTime());
            out.write("\r\n");
            out.write(currentTicket.getLocation());
            out.write("\r\n");
            out.write(currentTicket.getIssuedBy());
            out.write("\r\n");
            out.close();
            System.out.println("Print Succesfull!!!");
        }catch (Exception e){
            System.out.println("Print not successfull");
        }
    }
    
    public ArrayList<ticket> getCitations(){
        return ticketDB;
    }
    
}
