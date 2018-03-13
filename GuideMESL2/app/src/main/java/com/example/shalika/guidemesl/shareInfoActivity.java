package com.example.shalika.guidemesl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class shareInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_info);
    }
    public void openAccommodationActivity(View view){
        Intent intent = new Intent(this, AddAccomActivity.class);
        startActivity(intent);
    }
    public void openTravePlacesActivity(View view){
        Intent intent = new Intent(this, AddTravelPlaceActivity.class);
        startActivity(intent);
    }
    public void openRouteActivity(View view){
        Intent intent = new Intent(this, AddRouteActivity.class);
        startActivity(intent);
    }
}
