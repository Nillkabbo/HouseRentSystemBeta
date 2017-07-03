package hasan.aporbo.com.houserentsystembeta.control;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class RenterDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "house rent";
    public static final int DATABSE_VERSION = 1;

    public static final String TABLE_RENTER = "renter";
    public static final String TABLE_FLAT = "flat";
    public static final String TABLE_METER = "renter";

    public static final String CREATE_RENTER_TABLE = "";
    public static final String CREATE_FLAT_TABLE = "";
    public static final String CREATE_METER_TABLE = "";


    public RenterDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_RENTER_TABLE);
        sqLiteDatabase.execSQL(CREATE_FLAT_TABLE);
        sqLiteDatabase.execSQL(CREATE_METER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("Drop table if exist " + TABLE_RENTER);
        sqLiteDatabase.execSQL("Drop table if exist " + TABLE_FLAT);
        sqLiteDatabase.execSQL("Drop table if exist " + TABLE_METER);
        onCreate(sqLiteDatabase);
    }
}
