package com.example.indonesianfood;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class FoodDetailActivity extends AppCompatActivity {

    public static String EXTRA_PHOTO = "extra_photo";
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_ORIGIN = "extra_origin";
    public static String EXTRA_DETAIL = "extra_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail_activity);

        CircleImageView imgDataReceived = findViewById(R.id.img_item_photo);
        TextView nameDataReceived = findViewById(R.id.tv_item_name);
        TextView originDataReceived = findViewById(R.id.tv_item_origin);
        TextView detailDataReceived = findViewById(R.id.tv_item_detail);

        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String origin = getIntent().getStringExtra(EXTRA_ORIGIN);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);

        imgDataReceived.setImageResource(photo);
        nameDataReceived.setText(name);
        originDataReceived.setText(origin);
        detailDataReceived.setText(detail);

        getSupportActionBar().setTitle(name);
    }
}
