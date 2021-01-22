package com.wackycodes.myshop.helper;

/**
 * Created by Shailendra (WackyCodes) on 17/01/2021 16:31
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public interface Listener {

    interface CheckDatabaseListener{
        void onCheckResponse( boolean isSuccess, boolean isSetDatabase );
    }


    interface OnInternetConnectListener {

        void onInternetResponse( boolean isConnected );

    }

}
