package com.hafiizh.simplesharedpreference;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by HAFIIZH on 10/27/2017.
 * Author Havea Crenata
 * Email havea.crenata@gmail.com
 * Github https://github.com/crenata
 */

public class SharedPref {
    private static SharedPreferences getPref() {
        return PreferenceManager.getDefaultSharedPreferences(App.getContext());
    }

    public static void setTitle(String key, String value) {
        getPref().edit().putString(key, value).apply();
    }

    public static String getTitle(String key) {
        return getPref().getString(key, "Default Title");
    }
}
