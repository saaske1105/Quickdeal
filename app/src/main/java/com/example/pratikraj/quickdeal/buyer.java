package com.example.pratikraj.quickdeal;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static com.example.pratikraj.quickdeal.R.id.navigation;

public class buyer extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_1);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        inits();
    }

    private void inits(){

        navigation = (NavigationView) findViewById(R.id.navigation);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home2:
                        Intent intent = new Intent(buyer.this, Profile_buyer.class);
                       startActivity(intent);
                        break;

                    case R.id.home6:
                        Intent intent1 = new Intent(buyer.this, MainActivity.class);
                        startActivity(intent1);
                        Toast.makeText(buyer.this,"Logged Out !!!", Toast.LENGTH_LONG).show();
                        break;

                    case R.id.add:
                        Intent intent2 = new Intent(buyer.this, Electronics.class);
                        startActivity(intent2);
                        break;

                    case R.id.add1:
                        Intent intent3 = new Intent(buyer.this, Clothing.class);
                        startActivity(intent3);
                        break;
                    case R.id.home4:
                        Intent intent4 = new Intent(buyer.this, coupons.class);
                        startActivity(intent4);
                        break;
                    case R.id.home5:
                        Intent intent5 = new Intent(buyer.this, help.class);
                        startActivity(intent5);
                        break;
                    case R.id.home3:
                        Intent intent6 = new Intent(buyer.this, message.class);
                        startActivity(intent6);
                        break;
                    case R.id.add3:
                        Intent intent7 = new Intent(buyer.this, automobile.class);
                        startActivity(intent7);
                        break;
                }
                return false;
            }
        });

    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }


}
