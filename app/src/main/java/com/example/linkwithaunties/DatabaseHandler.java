package com.example.linkwithaunties;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHandler extends SQLiteOpenHelper {

    //database information
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "vendorDB.db";
    public static final String TABLE_NAME = "Vendors";

    public static final String COLUMN_VENDOR_ID = "VendorID";
    public static final String COLUMN_VENDOR_NAME = "Vendor_Name";
    public static final String COLUMN_VENDOR_STATE = "Vendor_State";
    public static final String COLUMN_VENDOR_CITY = "Vendor_City";
    public static final String COLUMN_VENDOR_STREET_ADDRESS = "Vendor_Street_Address";
    //initialize the database


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private SQLiteDatabase Vendor_Data;


    public void InitializeDataBase(){

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_VENDOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_VENDOR_NAME + " TEXT,"
                + COLUMN_VENDOR_STATE + " TEXT,"
                + COLUMN_VENDOR_CITY + " TEXT,"
                + COLUMN_VENDOR_STREET_ADDRESS + " TEXT)";

        // at last we are calling a exec sql
        // method to execute above sql query
        sqLiteDatabase.execSQL(query);
    }

    public void addVendor(int Vendor_ID, String Vendor_Name, String State, String City, String Street_Address){

        // creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();

        // creating a variable for content values.

        ContentValues values = new ContentValues();

       //ADD VALUES TO DATABASE
        values.put(COLUMN_VENDOR_ID, Vendor_ID);
        values.put(COLUMN_VENDOR_NAME, Vendor_Name);
        values.put(COLUMN_VENDOR_STATE, State);
        values.put(COLUMN_VENDOR_CITY, City);
        values.put(COLUMN_VENDOR_STREET_ADDRESS, Street_Address );

        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our
        // database after adding database.
        db.close();

    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int old_version, int new_version) {
        // this method is called to check if the table exists already.

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
