package hasan.aporbo.com.houserentsystembeta.models;

/**
 * Created by RAKIB on 7/2/2017.
 */

public class Flat {
    private int flatId;
    private String flatPosition;
    private int numberOfRooms;
    private double electricityBill;
    private double gassBill;
    private double waterBill;
    private double initialRent;
    private double totalRent;
    private double dueRent;
    private boolean paidStatus;

    public Flat(int flatId, String flatPosition,
                int numberOfRooms,
                double electricityBill,
                double gassBill,
                double waterBill,
                double initialRent,
                double totalRent,
                double dueRent,
                boolean paidStatus) {
        this.flatId = flatId;
        this.flatPosition = flatPosition;
        this.numberOfRooms = numberOfRooms;
        this.electricityBill = electricityBill;
        this.gassBill = gassBill;
        this.waterBill = waterBill;
        this.initialRent = initialRent;
        this.totalRent = totalRent;
        this.dueRent = dueRent;
        this.paidStatus = paidStatus;
    }

    public Flat(String flatPosition,
                int numberOfRooms,
                double electricityBill,
                double gassBill,
                double waterBill,
                double initialRent,
                double totalRent,
                double dueRent,
                boolean paidStatus) {
        this.flatPosition = flatPosition;
        this.numberOfRooms = numberOfRooms;
        this.electricityBill = electricityBill;
        this.gassBill = gassBill;
        this.waterBill = waterBill;
        this.initialRent = initialRent;
        this.totalRent = totalRent;
        this.dueRent = dueRent;
        this.paidStatus = paidStatus;
    }

    public Flat() {

    }

    public int getFlatId() {
        return flatId;
    }

    public void setFlatId(int flatId) {
        this.flatId = flatId;
    }

    public String getFlatPosition() {
        return flatPosition;
    }

    public void setFlatPosition(String flatPosition) {
        this.flatPosition = flatPosition;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(double electricityBill) {
        this.electricityBill = electricityBill;
    }

    public double getGassBill() {
        return gassBill;
    }

    public void setGassBill(double gassBill) {
        this.gassBill = gassBill;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public double getInitialRent() {
        return initialRent;
    }

    public void setInitialRent(double initialRent) {
        this.initialRent = initialRent;
    }

    public double getTotalRent() {
        return totalRent;
    }

    public void setTotalRent(double totalRent) {
        this.totalRent = totalRent;
    }

    public double getDueRent() {
        return dueRent;
    }

    public void setDueRent(double dueRent) {
        this.dueRent = dueRent;
    }

    public boolean isPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(boolean paidStatus) {
        this.paidStatus = paidStatus;
    }
}
