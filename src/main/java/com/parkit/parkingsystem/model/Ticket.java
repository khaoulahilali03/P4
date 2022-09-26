package com.parkit.parkingsystem.model;

import java.util.Date;

        // This class allows to define the different attributes of Ticket

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private String vehicleRegNumber;
    private double price;
    private Date inTime;

    private Date outTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        if (parkingSpot == null){
            return null;
        }else{
            ParkingSpot ps = new ParkingSpot(parkingSpot.getId(), parkingSpot.getParkingType(),parkingSpot.isAvailable());
            return ps;
        }
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        if (parkingSpot != null){
            this.parkingSpot = new ParkingSpot(parkingSpot.getId(), parkingSpot.getParkingType(),parkingSpot.isAvailable());
        }
    }

    public String getVehicleRegNumber() {
        return vehicleRegNumber;
    }

    public void setVehicleRegNumber(String vehicleRegNumber) {
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getInTime() {
        return new Date(this.inTime.getTime());
    }

    public void setInTime(Date inTime) {
        this.inTime = new Date(inTime.getTime());
    }

    public Date getOutTime() {
        if(outTime == null){
            return null;
        }
        return new Date(this.outTime.getTime());

    }

    public void setOutTime(Date outTime) {
        if (outTime == null){
            this.outTime = null;
        }else
        this.outTime = new Date(outTime.getTime());
    }
}
