package com.wackycodes.myshop.database;

import android.content.SharedPreferences;

import androidx.annotation.Nullable;

import java.util.Map;
import java.util.Set;

/**
 * Created by Shailendra (WackyCodes) on 17/01/2021 16:15
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class SharedRef implements SharedPreferences {

    private static final String IS_FIRST_OPEN  = "IS_FIRST_OPEN";


    @Override
    public Map <String, ?> getAll() {
        return null;
    }

    @Nullable
    @Override
    public String getString(String key, @Nullable String defValue) {
        return null;
    }

    @Nullable
    @Override
    public Set <String> getStringSet(String key, @Nullable Set <String> defValues) {
        return null;
    }

    @Override
    public int getInt(String key, int defValue) {
        return 0;
    }

    @Override
    public long getLong(String key, long defValue) {
        return 0;
    }

    @Override
    public float getFloat(String key, float defValue) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key, boolean defValue) {
        return false;
    }

    @Override
    public boolean contains(String key) {
        return false;
    }

    @Override
    public Editor edit() {
        return null;
    }

    @Override
    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {

    }

    @Override
    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {

    }


}
