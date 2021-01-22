package com.wackycodes.myshop.helper;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by Shailendra (WackyCodes) on 18/01/2021 22:23
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class StaticMethods {

    // Toast...
    public static void customToast(Context context, String msg){
        if (context!=null){
            Toast.makeText( context, msg, Toast.LENGTH_SHORT ).show();
        }
    }

    // Progress...
    public static ProgressDialog getDialog(Context context,@Nullable String title){
        ProgressDialog dialog = new ProgressDialog( context );
        dialog.setTitle( title!=null ? title : "Please wait..!" );
        dialog.setCancelable( false );
        return dialog;
    }


    public static AlertDialog.Builder alertDialog(Context c, @Nullable String title, @NonNull String body) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(c);
        if (title!=null)
            builder.setTitle(title);
        builder.setMessage(body);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        return builder;
    }

}
