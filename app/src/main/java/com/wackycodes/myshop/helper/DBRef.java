package com.wackycodes.myshop.helper;

import android.annotation.SuppressLint;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Created by Shailendra (WackyCodes) on 17/01/2021 09:42
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class DBRef {

    // Firebase Fire store...
    private static FirebaseFirestore firebaseFirestore;

    public static FirebaseFirestore getFireStore(){
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.getInstance();
        }
        return firebaseFirestore;
    }

    // Firebase Auth
    private static FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    public static FirebaseAuth getFirebaseAuth(){
        if (firebaseAuth == null) {
            firebaseAuth = FirebaseAuth.getInstance();
        }
        return firebaseAuth;
    }

    // Get Collection Ref...
    public static CollectionReference getCollection( String collection){
        return getFireStore().collection( collection );
    }

    // Get Document Ref...
    public static DocumentReference getDocument( String collection, String document ){
        return getFireStore().collection( collection ).document( document );
    }

}
