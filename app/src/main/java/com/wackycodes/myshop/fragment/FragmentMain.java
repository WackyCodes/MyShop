package com.wackycodes.myshop.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;
import com.wackycodes.myshop.R;
import com.wackycodes.myshop.helper.FragmentListener;

/**
 * Created by Shailendra (WackyCodes) on 18/01/2021 22:17
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class FragmentMain extends Fragment {

    private FragmentListener fragmentListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_main, container, false );


        return view;
    }


}
