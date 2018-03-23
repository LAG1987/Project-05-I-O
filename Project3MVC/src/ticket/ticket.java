/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author Luis G
 */
public class ticket {

    /**
     * @return the licenseNo
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo the licenseNo to set
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the permitNo
     */
    public String getPermitNo() {
        return permitNo;
    }

    /**
     * @param permitNo the permitNo to set
     */
    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }

    /**
     * @return the vehicleMake
     */
    public String getVehicleMake() {
        return vehicleMake;
    }

    /**
     * @param vehicleMake the vehicleMake to set
     */
    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    /**
     * @return the vehicleModel
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * @param vehicleModel the vehicleModel to set
     */
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the issuedBy
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * @param issuedBy the issuedBy to set
     */
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    /**
     * @return the backInfo
     */
    public String getBackInfo() {
        return backInfo;
    }

    /**
     * @param backInfo the backInfo to set
     */
    public void setBackInfo(String backInfo) {
        this.backInfo = backInfo;
    }

    /**
     * @return the violationType
     */
    public String getViolationType() {
        return violationType;
    }

    /**
     * @param violationType the violationType to set
     */
    public void setViolationType(String violationType) {
        this.violationType = violationType;
    }

    /**
     * @return the check
     */
    public String getCheck() {
        return check;
    }

    /**
     * @param check the check to set
     */
    public void setCheck(String check) {
        this.check = check;
    }
    
    public ticket()
    {
        
    }
    public ticket(String permitNo, String vehicleMake, String vehicleModel, String color, String violationType,
                  String date, String location, String time, String issuedBy, String licenseNo, String state, String check) {
        this.permitNo = permitNo;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.color = color;
        this.violationType = violationType;
        this.date = date;
        this.location = location;
        this.time = time;
        this.issuedBy = issuedBy;
        this.licenseNo = licenseNo;
        this.state = state;
        this.check = check;
    }
    
    private String licenseNo;
    private String state;
    private String permitNo;
    private String vehicleMake;
    private String vehicleModel;
    private String color;
    private String reason;
    private String date;
    private String location;
    private String time;
    private String issuedBy;
    private String backInfo;
    private String violationType;
    private String check;
}
