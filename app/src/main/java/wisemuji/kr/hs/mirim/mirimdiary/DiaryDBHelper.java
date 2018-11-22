package wisemuji.kr.hs.mirim.mirimdiary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aristata on 2016-07-20.
 */
public class DiaryDBHelper extends SQLiteOpenHelper {


    public DiaryDBHelper(Context context) {
        super(context, "Diary", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE diary (" +
                "'code' INTEGER PRIMARY KEY AUTOINCREMENT," +
                "`title` TEXT," +
                "`date` TEXT," +
                "`contents` TEXT);";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "drop table if exists diary";
        db.execSQL(sql);

        onCreate(db);
    }
}
 
