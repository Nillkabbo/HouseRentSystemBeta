package hasan.aporbo.com.houserentsystembeta.models;

public class Renter {
    private int renterId;
    private String renterName;
    private String renterAddress;
    private String renterPhoneNumber;
    private String renterNationalId;
    private String renterEntryDate;
    private boolean renterStatus;
    private String renterLeavingDate;

    public Renter(int renterId,
                  String renterName,
                  String renterAddress,
                  String renterPhoneNumber,
                  String renterNationalId,
                  String renterEntryDate,
                  boolean renterStatus,
                  String renterLeavingDate) {
        this.renterId = renterId;
        this.renterName = renterName;
        this.renterAddress = renterAddress;
        this.renterPhoneNumber = renterPhoneNumber;
        this.renterNationalId = renterNationalId;
        this.renterEntryDate = renterEntryDate;
        this.renterStatus = renterStatus;
        this.renterLeavingDate = renterLeavingDate;
    }

    public Renter(String renterName,
                  String renterAddress,
                  String renterPhoneNumber,
                  String renterNationalId,
                  String renterEntryDate,
                  boolean renterStatus,
                  String renterLeavingDate) {
        this.renterName = renterName;
        this.renterAddress = renterAddress;
        this.renterPhoneNumber = renterPhoneNumber;
        this.renterNationalId = renterNationalId;
        this.renterEntryDate = renterEntryDate;
        this.renterStatus = renterStatus;
        this.renterLeavingDate = renterLeavingDate;
    }

    public Renter() {
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

    public String getRenterEntryDate() {
        return renterEntryDate;
    }

    public void setRenterEntryDate(String renterEntryDate) {
        this.renterEntryDate = renterEntryDate;
    }

    public boolean isRenterStatus() {
        return renterStatus;
    }

    public void setRenterStatus(boolean renterStatus) {
        this.renterStatus = renterStatus;
    }

    public String getRenterLeavingDate() {
        return renterLeavingDate;
    }

    public void setRenterLeavingDate(String renterLeavingDate) {
        this.renterLeavingDate = renterLeavingDate;
    }
}
