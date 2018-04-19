/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

//import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Luis G
 */
public class ticketView extends GridPane {

    /**
     * @return the permitNoTF
     */
    public TextField getPermitNoTF() {
        return permitNoTF;
    }

    /**
     * @param permitNoTF the permitNoTF to set
     */
    public void setPermitNoTF(TextField permitNoTF) {
        this.permitNoTF = permitNoTF;
    }

    /**
     * @return the vehicleMakeTF
     */
    public TextField getVehicleMakeTF() {
        return vehicleMakeTF;
    }

    /**
     * @param vehicleMakeTF the vehicleMakeTF to set
     */
    public void setVehicleMakeTF(TextField vehicleMakeTF) {
        this.vehicleMakeTF = vehicleMakeTF;
    }

    /**
     * @return the vehicleModelTF
     */
    public TextField getVehicleModelTF() {
        return vehicleModelTF;
    }

    /**
     * @param vehicleModelTF the vehicleModelTF to set
     */
    public void setVehicleModelTF(TextField vehicleModelTF) {
        this.vehicleModelTF = vehicleModelTF;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the reasonTF
     */
    public TextField getReasonTF() {
        return reasonTF;
    }

    /**
     * @param reasonTF the reasonTF to set
     */
    public void setReasonTF(TextField reasonTF) {
        this.reasonTF = reasonTF;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF() {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the issuedByTF
     */
    public TextField getIssuedByTF() {
        return issuedByTF;
    }

    /**
     * @param issuedByTF the issuedByTF to set
     */
    public void setIssuedByTF(TextField issuedByTF) {
        this.issuedByTF = issuedByTF;
    }

    /**
     * @return the violationTypeTF
     */
    public TextField getViolationTypeTF() {
        return violationTypeTF;
    }

    /**
     * @param violationTypeTF the violationTypeTF to set
     */
    public void setViolationTypeTF(TextField violationTypeTF) {
        this.violationTypeTF = violationTypeTF;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the liscenseNoTF
     */
    public TextField getLiscenseNoTF() {
        return liscenseNoTF;
    }

    /**
     * @param liscenseNoTF the liscenseNoTF to set
     */
    public void setLiscenseNoTF(TextField liscenseNoTF) {
        this.liscenseNoTF = liscenseNoTF;
    }

    /**
     * @return the tMod
     */
    public ticketModel gettMod() {
        return tMod;
    }

    /**
     * @param tMod the tMod to set
     */
    public void settMod(ticketModel tMod) {
        this.tMod = tMod;
    }

    /**
     * @return the tickInfo
     */
    public TextArea getTickInfo() {
        return tickInfo;
    }

    /**
     * @param tickInfo the tickInfo to set
     */
    public void setTickInfo(TextArea tickInfo) {
        this.tickInfo = tickInfo;
    }

    /**
     * @return the sCheck
     */
    public String getsCheck() {
        return sCheck;
    }

    /**
     * @param sCheck the sCheck to set
     */
    public void setsCheck(String sCheck) {
        this.sCheck = sCheck;
    }

    /**
     * @return the currentInt
     */
    public int getCurrentInt() {
        return currentInt;
    }

    /**
     * @param currentInt the currentInt to set
     */
    public void setCurrentInt(int currentInt) {
        this.currentInt = currentInt;
    }

    /**
     * @return the exit
     */
    public Button getExit() {
        return exit;
    }

    /**
     * @param exit the exit to set
     */
    public void setExit(Button exit) {
        this.exit = exit;
    }

    /**
     * @return the paid
     */
    public Button getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(Button paid) {
        this.paid = paid;
    }

    /**
     * @return the next
     */
    public Button getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Button next) {
        this.next = next;
    }

    /**
     * @return the add
     */
    public Button getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(Button add) {
        this.add = add;
    }

    /**
     * @return the back
     */
    public Button getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(Button back) {
        this.back = back;
    }

    /**
     * @return the description
     */
    public Label getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(Label description) {
        this.description = description;
    }

    /**
     * @return the violationType
     */
    public Label getViolationType() {
        return violationType;
    }

    /**
     * @param violationType the violationType to set
     */
    public void setViolationType(Label violationType) {
        this.violationType = violationType;
    }

    /**
     * @return the backInfo
     */
    public Label getBackInfo() {
        return backInfo;
    }

    /**
     * @param backInfo the backInfo to set
     */
    public void setBackInfo(Label backInfo) {
        this.backInfo = backInfo;
    }

    /**
     * @return the issuedBy
     */
    public Label getIssuedBy() {
        return issuedBy;
    }

    /**
     * @param issuedBy the issuedBy to set
     */
    public void setIssuedBy(Label issuedBy) {
        this.issuedBy = issuedBy;
    }

    /**
     * @return the time
     */
    public Label getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Label time) {
        this.time = time;
    }

    /**
     * @return the location
     */
    public Label getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Label location) {
        this.location = location;
    }

    /**
     * @return the date
     */
    public Label getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Label date) {
        this.date = date;
    }

    /**
     * @return the reason
     */
    public Label getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(Label reason) {
        this.reason = reason;
    }

    /**
     * @return the color
     */
    public Label getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Label color) {
        this.color = color;
    }

    /**
     * @return the vehicleModel
     */
    public Label getVehicleModel() {
        return vehicleModel;
    }

    /**
     * @param vehicleModel the vehicleModel to set
     */
    public void setVehicleModel(Label vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    /**
     * @return the vehicleMake
     */
    public Label getVehicleMake() {
        return vehicleMake;
    }

    /**
     * @param vehicleMake the vehicleMake to set
     */
    public void setVehicleMake(Label vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    /**
     * @return the permitNo
     */
    public Label getPermitNo() {
        return permitNo;
    }

    /**
     * @param permitNo the permitNo to set
     */
    public void setPermitNo(Label permitNo) {
        this.permitNo = permitNo;
    }

    /**
     * @return the state
     */
    public Label getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(Label state) {
        this.state = state;
    }

    /**
     * @return the liscenseNo
     */
    public Label getLiscenseNo() {
        return liscenseNo;
    }

    /**
     * @param liscenseNo the liscenseNo to set
     */
    public void setLiscenseNo(Label liscenseNo) {
        this.liscenseNo = liscenseNo;
    }

    /**
     * @return the title2
     */
    public Label getTitle2() {
        return title2;
    }

    /**
     * @param title2 the title2 to set
     */
    public void setTitle2(Label title2) {
        this.title2 = title2;
    }

    /**
     * @return the title
     */
    public Label getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Label title) {
        this.title = title;
    }

    private String desc = "PAYMENTS \n" + "Payments can be made at the following office\n" + "Business Office, Tandy 107\n"
            + "Monday thru Friday: 8:00 am - 5:00 pm\n" + "$25 per citation, other fees may apply\n" + "$100 for boot removal\n\n"
            + "Payment can be mailed to the following address: \n\n" + "TSC C/O Finance Dept\n" + "Attn: Parking Enforcement\n"
            + "80 Fort Brown\n" + "Brownsville, TX 78520\n\n" + "DO NOT MAIL CASH\n\n" + "For more information on parking citations please visit: \n"
            + "www.tsc.edu/parking";

    //labels
    private Label title = new Label("Parking Ticket Form");
    private Label title2 = new Label("Current Citation");
    private Label liscenseNo = new Label("-Liscense No.: ");
    private Label state = new Label("-State: ");
    private Label permitNo = new Label("-Permit No: ");
    private Label vehicleMake = new Label("-Vehicle Make: ");
    private Label vehicleModel = new Label("-Vehicle Model: ");
    private Label color = new Label("-Color: ");
    private Label reason = new Label();
    private Label date = new Label("-Date: ");
    private Label location = new Label("-Location: ");
    private Label time = new Label("-Time: ");
    private Label issuedBy = new Label("-Issued By: ");
    private Label backInfo = new Label();
    private Label violationType = new Label("-Violation Type:");
    private Label description = new Label(desc);
    //private Bool check;

    //textfields
    private TextField liscenseNoTF = new TextField();
    private TextField stateTF = new TextField();
    private TextField permitNoTF = new TextField();
    private TextField vehicleMakeTF = new TextField();
    private TextField vehicleModelTF = new TextField();
    private TextField colorTF = new TextField();
    private TextField reasonTF = new TextField();
    private TextField dateTF = new TextField();
    private TextField locationTF = new TextField();
    private TextField timeTF = new TextField();
    private TextField issuedByTF = new TextField();
    private TextField violationTypeTF = new TextField();

    //textarea variables
    private TextArea tickInfo = new TextArea();

    //button variables
    private Button back = new Button("<<");
    private Button add = new Button("Add");
    private Button next = new Button(">>");
    private Button paid = new Button("Paid/Unpaid");
    private Button print = new Button("Print to File");
    private Button exit = new Button("Exit");
    private Button display = new Button("Display Ticket");

    //Panes
    private GridPane grid = new GridPane();
    private BorderPane root = new BorderPane();

    //extra variables
    private int index = 0;
    private int currentInt;
    private String sCheck;

    private ticketModel tMod = new ticketModel();

    public void updateList(ArrayList<ticket> ticks) {

        ticket tick = (ticket) ticks.get(index);

        String getLiscenseNo = tick.getLicenseNo();
        String getState = tick.getState();
        String getPermitNo = tick.getPermitNo();
        String getVehicleMake = tick.getVehicleMake();
        String getVehicleModel = tick.getVehicleModel();
        String getColor = tick.getColor();
        String getViolationType = tick.getViolationType();
        String getDate = tick.getDate();
        String getTime = tick.getTime();
        String getLocation = tick.getLocation();
        String getIssuedBy = tick.getIssuedBy();
        String getCheck = tick.getCheck();

        String curr = "Liscense No: " + getLiscenseNo
                + "\nState: " + getState
                + "\nPermit No: " + getPermitNo
                + "\nVehicle Make/Model: " + getVehicleMake
                + "/"
                + getVehicleModel
                + "\nColor: " + getColor
                + "\nViolation: " + getViolationType
                + "\nDate: " + getDate
                + "\nTime: " + getTime
                + "\nLocation: " + getLocation
                + "\nIssued By: " + getIssuedBy
                + "\nPaid: " + getCheck;

        tickInfo.setText(curr);

    }

    public ticketView() {

        //initialize title fonts 
        getTitle().setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        getTitle2().setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));

        //setting up spaces 
        this.setHgap(10);
        this.setVgap(10);

        //set up h and v box variables
        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        VBox vbox1 = new VBox();
        VBox vbox2 = new VBox();
        VBox tbox1 = new VBox();
        VBox tbox2 = new VBox();
        VBox dbox = new VBox();

        //initializing the boxs for GUI setup
        this.getChildren().clear();
        tbox1.getChildren().add(getTitle());
        vbox1.getChildren().addAll(liscenseNo, liscenseNoTF,
                state, stateTF,
                permitNo, permitNoTF,
                vehicleMake, vehicleMakeTF,
                vehicleModel, vehicleModelTF,
                color, colorTF,
                violationType, violationTypeTF,
                date, dateTF,
                location, locationTF,
                time, timeTF,
                issuedBy, issuedByTF);
        tbox2.getChildren().add(title2);
        vbox2.getChildren().addAll(tickInfo, description);
        hbox1.getChildren().addAll(back, add, print, display, paid, next);
        hbox2.getChildren().add(exit);

        //outputting GUIs
        this.addRow(0, tbox1);
        this.add(vbox1, 0, 1);
        this.add(tbox2, 1, 0);
        this.add(vbox2, 1, 1);
        this.add(hbox1, 0, 2);
        this.add(hbox2, 0, 3);

    }

    public void clearFields() {

        getLiscenseNoTF().clear();
        getStateTF().clear();
        getPermitNoTF().clear();
        getVehicleMakeTF().clear();
        getVehicleModelTF().clear();
        getColorTF().clear();
        getReasonTF().clear();
        getDateTF().clear();
        getLocationTF().clear();
        getTimeTF().clear();
        getIssuedByTF().clear();
        getViolationTypeTF().clear();

    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the print
     */
    public Button getPrint() {
        return print;
    }

    /**
     * @param print the print to set
     */
    public void setPrint(Button print) {
        this.print = print;
    }

    /**
     * @return the display
     */
    public Button getDisplay() {
        return display;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(Button display) {
        this.display = display;
    }

}
