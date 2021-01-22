package com.wackycodes.myshop.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import static com.wackycodes.myshop.helper.StaticMethods.alertDialog;
import static com.wackycodes.myshop.helper.StaticValues.IS_INTERNET_ON;

/**
 * Created by Shailendra (WackyCodes) on 18/01/2021 23:13
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class CheckInternetConnection extends BroadcastReceiver {

    private Listener.OnInternetConnectListener connectionListener;

    public static boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo;
        netinfo = cm.getActiveNetworkInfo();
        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo( ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo( ConnectivityManager.TYPE_MOBILE);
            return (mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting());
        } else
            return false;
    }

    public static boolean isInternetConnected(Context context){
        if(!IS_INTERNET_ON){
            alertDialog(context, "No Internet Connection !",
                    "Check Your Internet Connection.\nYou need to have Mobile Data or wifi..." ).show();
            return false;
        }
        return IS_INTERNET_ON;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        IS_INTERNET_ON = isConnected( context );
        if (connectionListener != null){
            connectionListener.onInternetResponse( IS_INTERNET_ON );
        }
    }


}

