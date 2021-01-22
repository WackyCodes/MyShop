package com.wackycodes.myshop.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.wackycodes.myshop.MainActivity;
import com.wackycodes.myshop.R;
import com.wackycodes.myshop.helper.FragmentListener;
import com.wackycodes.myshop.helper.StaticMethods;

/**
 * Created by Shailendra (WackyCodes) on 18/01/2021 22:07
 * ( To Know more, Click : https://linktr.ee/wackycodes )
 */
public class ActivityMain extends AppCompatActivity implements FragmentListener, NavigationView.OnNavigationItemSelectedListener{


    private FrameLayout frameLayoutMain;

    // Progress dialog..!
    private ProgressDialog dialog;



    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    public static TextView badgeCartCount;
    public static TextView badgeNotifyCount;
    // Drawer...User info
//    public static CircleImageView drawerImage;
    public static TextView drawerName;
    public static TextView drawerEmail;
    public static LinearLayout drawerCityLayout;
    public static TextView drawerCityTitle;
    public static TextView drawerCityName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        initView();




        // Nav Header...
        drawerName = navigationView.getHeaderView( 0 ).findViewById( R.id.drawer_UserName );
        drawerEmail = navigationView.getHeaderView( 0 ).findViewById( R.id.drawer_userEmail );
        drawerCityLayout = navigationView.getHeaderView( 0 ).findViewById( R.id.drawer_user_city_layout );
        drawerCityTitle = navigationView.getHeaderView( 0 ).findViewById( R.id.drawer_title_text );
        drawerCityName = navigationView.getHeaderView( 0 ).findViewById( R.id.drawer_user_city );

        // Set Drawer City Click listener...
        drawerCityLayout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawer.isDrawerOpen( GravityCompat.START )){
                    drawer.closeDrawer( GravityCompat.START );
                }
                // select city Dialog...
//                selectCityDialog();
            }
        } );

        // setNavigationItemSelectedListener()...
        navigationView.setNavigationItemSelectedListener( ActivityMain.this );
        navigationView.getMenu().getItem( 0 ).setChecked( true );

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle( this,drawer,toolbar,
                R.string.navigation_Drawer_Open,R.string.navigation_Drawer_close);
        drawer.addDrawerListener( toggle );
        toggle.syncState();

    }

    private void initView(){
        dialog = StaticMethods.getDialog( this, null );

        frameLayoutMain = findViewById( R.id.frame_layout_main );


        toolbar = findViewById( R.id.toolbar );
        drawer = findViewById( R.id.drawer_layout );
        navigationView = findViewById( R.id.nav_view );
        setSupportActionBar( toolbar );
        try {
            getSupportActionBar().setDisplayShowTitleEnabled( true );
        }catch (NullPointerException ignored){ }

    }


    // --------  Menu And Navigation....
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu_main_home_header, menu);

        // Check First whether any item in cart or not...
        // if any item has in cart...
//        MenuItem cartItem = menu.findItem( R.id.menu_cart_main );
//        cartItem.setActionView( R.layout.badge_cart_layout );
//        badgeCartCount = cartItem.getActionView().findViewById( R.id.badge_count_text );
//        if (UserDataQuery.cartItemModelList.size() > 0){
//            badgeCartCount.setVisibility( View.VISIBLE );
//            badgeCartCount.setText( String.valueOf( UserDataQuery.cartItemModelList.size() ) );
//        }else{
//            badgeCartCount.setVisibility( View.GONE );
//        }
//        cartItem.getActionView().setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // GOTO : My cart
////                if (currentUser == null){
////                    DialogsClass.signInUpDialog( MainActivity.this, MAIN_ACTIVITY );
////                }else{
////                    gotoCart();
////                }
//            }
//        } );

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
//            if (isFragmentIsMyCart){
////                setFragment( new HomeFragment(), M_HOME_FRAGMENT );
//                wCurrentFragment = M_HOME_FRAGMENT;
//                navigationView.getMenu().getItem( 0 ).setChecked( true );
//                mainActivityForCart.finish();
//            }
            return true;
        }
            return super.onOptionsItemSelected( item );
    }

    int mainNavItemId;
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        drawer.closeDrawer( GravityCompat.START );

        mainNavItemId = menuItem.getItemId();

        // ------- On Item Click...
        // Home Nav Option...
        if ( mainNavItemId == R.id.nav_home ){
            // index - 0
            invalidateOptionsMenu();
            getSupportActionBar().setTitle( R.string.app_name );
            return true;
        }

            // Bottom Options...
            if ( mainNavItemId == R.id.menu_log_out ){
                // index - 5

                return false;
            }else
            if ( mainNavItemId == R.id.menu_share ){
//                 index - 7
                Intent inviteIntent = new Intent( Intent.ACTION_SEND );
                inviteIntent.setType("text/plain");
                String body = "Hey,\n I am using \"4Ever Mall - Online Shopping App\" from last few weeks. I'm enjoying shopping from our nearest store through this app. " +
                        "\n I invite you to join \"4Ever Mall\" App. " +
                        " I'm sure this will help you to save time and get safe delivery of your order at your door. \n" +
                        "Download Now by click below link - \n https://play.google.com/store/apps/details?id=ean.ecom.eanmart \n Thank You"
                        ,subject = "4Ever Mall - Online Shopping App";
                inviteIntent.putExtra( Intent.EXTRA_SUBJECT,subject );
                inviteIntent.putExtra( Intent.EXTRA_TEXT, body );
                startActivity( Intent.createChooser( inviteIntent,"Share By..." ) );
                return false;
            }else
            if ( mainNavItemId == R.id.menu_rate_us ){
//                 index - 8
//                StaticMethods.gotoURL( this, "https://play.google.com/store/apps/details?id=ean.ecom.eanmart" );
                return false;
            }else
            if ( mainNavItemId == R.id.menu_help ){
//                 index - 9

                return false;
            }else
            if ( mainNavItemId == R.id.menu_about_us ){
                // index - 10
//                Intent comIntent =  new Intent(MainActivity.this, CommunicateActivity.class);
//                comIntent.putExtra( "FRAGMENT_CODE", FRAGMENT_ABOUT_US );
//
//                startActivity( comIntent );
                return false;
            }
        return false;
    }



    @Override
    public void showToast(String msg) {
        StaticMethods.customToast( this, msg );
    }

    @Override
    public void showDialog() {
        if (dialog!=null){
            dialog.show();
        }
    }

    @Override
    public void dismissDialog() {
        if (dialog!=null){
            dialog.dismiss();
        }
    }


}
