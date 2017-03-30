package com.dglproject.tour.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Tortuvshin Byambaa on 3/9/2017.
 */
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "DGLTOUR";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    private static final String KEY_IS_LOGGED_IN = "isLoggedIn";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setLogin(boolean isLoggedIn) {
        editor.putBoolean(KEY_IS_LOGGED_IN, isLoggedIn);
        editor.commit();

    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public boolean isLoggedIn(){
        return pref.getBoolean(KEY_IS_LOGGED_IN, false);
    }

}