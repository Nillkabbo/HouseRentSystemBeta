package hasan.aporbo.com.houserentsystembeta.models;

import java.util.ArrayList;

public class Renter {
    private int renterId;
    private String renterName;
    private String renterAddress;
    private String renterPhoneNumber;
    private String renterNationalId;
    private String currentDate;
    private String renterEntryDate;
    private String renterStatus;
    private String renterLeavingDate;
    private Flat flat;
    private Meter meter;

    public Renter() {
    }

    public Renter(String renterName, String renterAddress, String renterPhoneNumber, String renterNationalId, String currentDate, String renterEntryDate, String renterStatus, String renterLeavingDate, Flat flat, Meter meter) {
        this.renterName = renterName;
        this.renterAddress = renterAddress;
        this.renterPhoneNumber = renterPhoneNumber;
        this.renterNationalId = renterNationalId;
        this.currentDate = currentDate;
        this.renterEntryDate = renterEntryDate;
        this.renterStatus = renterStatus;
        this.renterLeavingDate = renterLeavingDate;
        this.flat = flat;
        this.meter = meter;
    }

    public Renter(int renterId, String renterName, String renterAddress, String renterPhoneNumber, String renterNationalId, String currentDate, String renterEntryDate, String renterStatus, String renterLeavingDate, Flat flat, Meter meter) {
        this.renterId = renterId;
        this.renterName = renterName;
        this.renterAddress = renterAddress;
        this.renterPhoneNumber = renterPhoneNumber;
        this.renterNationalId = renterNationalId;
        this.currentDate = currentDate;
        this.renterEntryDate = renterEntryDate;
        this.renterStatus = renterStatus;
        this.renterLeavingDate = renterLeavingDate;
        this.flat = flat;
        this.meter = meter;
    }

    public int getRenterId() {
        return renterId;
    }

    public void setRenterId(int renterId) {
        this.renterId = renterId;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getRenterAddress() {
        return renterAddress;
    }

    public void setRenterAddress(String renterAddress) {
        this.renterAddress = renterAddress;
    }

    public String getRenterPhoneNumber() {
        return renterPhoneNumber;
    }

    public void setRenterPhoneNumber(String renterPhoneNumber) {
        this.renterPhoneNumber = renterPhoneNumber;
    }

    public String getRenterNationalId() {
        return renterNationalId;
    }

    public void setRenterNationalId(String renterNationalId) {
        this.renterNationalId = renterNationalId;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getRenterEntryDate() {
        return renterEntryDate;
    }

    public void setRenterEntryDate(String renterEntryDate) {
        this.renterEntryDate = renterEntryDate;
    }

    public String isRenterStatus() {
        return renterStatus;
    }

    public void setRenterStatus(String renterStatus) {
        this.renterStatus = renterStatus;
    }

    public String getRenterLeavingDate() {
        return renterLeavingDate;
    }

    public void setRenterLeavingDate(String renterLeavingDate) {
        this.renterLeavingDate = renterLeavingDate;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public ArrayList<Renter> Allrenterrenters() {
        ArrayList<Renter> renters = new ArrayList<Renter>();

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        renters.add(new Renter("Shafiq", "Noakhali shodor", "23472342342", "12132424242424", "3-7-2017", "23-4-2008", "Active", "8-2-2018", flat, meter));

        return renters;
    }
}
