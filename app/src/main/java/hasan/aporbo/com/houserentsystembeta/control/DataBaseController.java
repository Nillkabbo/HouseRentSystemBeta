package hasan.aporbo.com.houserentsystembeta.control;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseController extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "house rent";
    public static final int DATABSE_VERSION = 1;

    public DataBaseController(Context context) {
        super(context, DATABASE_NAME, null, DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
