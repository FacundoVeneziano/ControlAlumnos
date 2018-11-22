package com.example.facuveneziano.controlalumnos;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import com.example.facuveneziano.controlalumnos.domain.DaoMaster;
import com.example.facuveneziano.controlalumnos.domain.DaoSession;

import org.greenrobot.greendao.database.Database;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.Map;
import java.util.UUID;

public class App extends Application {
    private Database db;
    private DaoSession daoSession;
    private String uniqueID = null;

    @Override public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, Constants.DB.NAME + "-encrypted");
        db = helper.getEncryptedWritableDb(Constants.DB.SALT);
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
        setUniqueId();
    }

    //maneja db
    public void ResetDB() {
        DaoMaster.dropAllTables(db, true);
        DaoMaster.createAllTables(db, true);
    }
    public void TruncateTable(Class<?> cls) {
        this.daoSession.getDao(cls).deleteAll();
    }
    //maneja preferences
    public SharedPreferences GetPreferences(){
        return getApplicationContext().getSharedPreferences(Constants.PREFERENCES.NAME, Context.MODE_PRIVATE);
    }
    public SharedPreferences.Editor GetEditor(){
        return GetPreferences().edit();
    }
    public void ResetPreferences() {
        SharedPreferences.Editor editor = GetEditor();
        for(Map.Entry<String, ?> entry: GetPreferences().getAll().entrySet()){
            editor.remove(entry.getKey());
        }
        editor.commit();
    }
    public void setUniqueId() {
        if (this.uniqueID == null) {
            uniqueID = GetPreferences().getString(Constants.PREFERENCES.PREF_UNIQUE_ID, null);
            if (uniqueID == null) {
                uniqueID = UUID.randomUUID().toString();
                SharedPreferences.Editor editor = GetEditor();
                editor.putString(Constants.PREFERENCES.PREF_UNIQUE_ID, uniqueID);
                editor.commit();
            }
        }
    }
    public String getUniqueID() {
        return uniqueID;
    }
}
