package com.wackycodes.myshop.helper;

import android.view.MenuItem;

import androidx.annotation.NonNull;

/**
 * Created by Shailendra (WackyCodes) on 18/01/2021 22:22
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public interface FragmentListener {

    boolean onNavigationItemSelected(@NonNull MenuItem menuItem);

    void showToast(String msg);
    void showDialog();
    void dismissDialog();

}
