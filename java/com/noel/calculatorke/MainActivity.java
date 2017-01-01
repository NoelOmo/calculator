package com.noel.calculatorke;

import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.noel.calculatorke.Adapters.MainPageAdapter;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupTransparentStatusBar();
        setupMenuItems();

    }


//Setup main page menu items

    public void setupMenuItems(){

         MenuItem[] items = {
                new MenuItem(R.string.menu_item_one, R.drawable.paye_icon),
                new MenuItem(R.string.menu_item_two, R.drawable.mortgage_icon),
                new MenuItem(R.string.menu_item_three, R.drawable.mortgage_icon),
                new MenuItem(R.string.menu_item_four, R.drawable.mortgage_icon),
                new MenuItem(R.string.menu_item_five, R.drawable.mortgage_icon),
                new MenuItem(R.string.menu_item_six, R.drawable.mortgage_icon)
        };

        GridView menuGrid = (GridView) findViewById(R.id.menu_grid);
        MainPageAdapter mainPageAdapter = new MainPageAdapter(this, items);
        menuGrid.setAdapter(mainPageAdapter);

        menuGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch(position) {
                    case 0:
                        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new PayeFragment()).addToBackStack(null).commit();
                        break;
                }

            }
        });
    }


    //Setup transparent statusbar if build version > lollipop
    public void setupTransparentStatusBar(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }

    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().getBackStackEntryCount() == 0){
            this.finish();
        }else{
            getSupportFragmentManager().popBackStack();
        }
    }
}
