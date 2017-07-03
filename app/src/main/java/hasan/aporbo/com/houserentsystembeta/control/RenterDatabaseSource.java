package hasan.aporbo.com.houserentsystembeta.control;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import hasan.aporbo.com.houserentsystembeta.models.Renter;

public class RenterDatabaseSource {
    RenterDatabaseHelper renterDatabaseHelper;
    SQLiteDatabase database;

    public RenterDatabaseSource(Context context) {
        renterDatabaseHelper = new RenterDatabaseHelper(context);
    }

    public void openDatabse() {
        database = renterDatabaseHelper.getWritableDatabase();
    }

    public void closeDatabse() {
        database.close();
    }

    public long addRenter(Renter renter) {
        return 1;

    }

    public long updateRenter(Renter renter) {
        return 1;
    }

    public long deleteRenter(Renter renter) {
        return 1;
    }


}
