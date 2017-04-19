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
import android.widget.Toast;

public class seller extends AppCompatActivity {

    Toolbar toolbar2;
    DrawerLayout drawerLayout2;
    ActionBarDrawerToggle actionBarDrawerToggle2;
    NavigationView navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        drawerLayout2 = (DrawerLayout) findViewById(R.id.drawer_2);
        actionBarDrawerToggle2 = new ActionBarDrawerToggle(this, drawerLayout2, toolbar2, R.string.drawer_open, R.string.drawer_close);
        drawerLayout2.setDrawerListener(actionBarDrawerToggle2);
        init();
    }

    private void init(){
        navigation = (NavigationView) findViewById(R.id.navigation2);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home2:
                        Intent intent = new Intent(seller.this, profile_seller.class);
                        startActivity(intent);
                        break;

                    case R.id.home3:
                        Intent intent1 = new Intent(seller.this, msg_seller.class);
                        startActivity(intent1);
                        break;

                    case R.id.home4:
                        Intent intent2 = new Intent(seller.this, order.class);
                        startActivity(intent2);
                        break;
                    case R.id.home5:
                        Intent intent3 = new Intent(seller.this, inventory.class);
                        startActivity(intent3);
                        break;
                    case R.id.home6:
                        Intent intent4 = new Intent(seller.this, MainActivity.class);
                        startActivity(intent4);
                        Toast.makeText(seller.this,"Logged Out !!!", Toast.LENGTH_LONG).show();
                        break;


                }
                    return false;
                }

        });
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle2.syncState();
    }
}
