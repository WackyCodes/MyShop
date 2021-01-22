package com.wackycodes.myshop.query;


import com.wackycodes.myshop.helper.DBRef;
import com.wackycodes.myshop.helper.Listener;

import static com.wackycodes.myshop.helper.DBConstant.APP_DATABASE;
import static com.wackycodes.myshop.helper.DBConstant.IS_DATABASE_SET;
import static com.wackycodes.myshop.helper.DBConstant.PERMISSION;

/**
 * Created by Shailendra (WackyCodes) on 17/01/2021 09:36
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class DBQuery {


    //--- Check Whether Database is Created Or Not ? -----------------------------------------------
    public static void queryToCheck(Listener.CheckDatabaseListener listener ){
        DBRef.getFireStore()
                .collection( PERMISSION )
                .document( APP_DATABASE )
                .get()
                .addOnCompleteListener( task -> {
                    //  Check whether Database set Or Not..?
                    if (task.isSuccessful()){
                        if (task.getResult().get( IS_DATABASE_SET )!=null){
                            listener.onCheckResponse( task.getResult().getBoolean( IS_DATABASE_SET ) , false  );
                        }else{
                            listener.onCheckResponse( false, false  );
                        }
                    }else{
                        listener.onCheckResponse( false, false  );
                    }
                } );
    }





}
