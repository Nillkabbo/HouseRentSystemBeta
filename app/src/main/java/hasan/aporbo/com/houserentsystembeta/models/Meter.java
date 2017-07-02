package hasan.aporbo.com.houserentsystembeta.models;


public class Meter {
    private int meterId;
    private int meterSerial;
    private String meterType;
    private int meterReading;
    private int mterUnit;

    public Meter(int meterId, int meterSerial, String meterType, int meterReading, int mterUnit) {
        this.meterId = meterId;
        this.meterSerial = meterSerial;
        this.meterType = meterType;
        this.meterReading = meterReading;
        this.mterUnit = mterUnit;
    }

    public Meter(int meterSerial, String meterType, int meterReading, int mterUnit) {
        this.meterSerial = meterSerial;
        this.meterType = meterType;
        this.meterReading = meterReading;
        this.mterUnit = mterUnit;
    }

    public Meter() {
    }

    public int getMeterId() {
        return meterId;
    }

    public void setMeterId(int meterId) {
        this.meterId = meterId;
    }

    public int getMeterSerial() {
        return meterSerial;
    }

    public void setMeterSerial(int meterSerial) {
        this.meterSerial = meterSerial;
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    public int getMeterReading() {
        return meterReading;
    }

    public void setMeterReading(int meterReading) {
        this.meterReading = meterReading;
    }

    public int getMterUnit() {
        return mterUnit;
    }

    public void setMterUnit(int mterUnit) {
        this.mterUnit = mterUnit;
    }
}
