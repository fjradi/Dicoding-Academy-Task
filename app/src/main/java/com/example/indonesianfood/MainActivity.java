package com.example.indonesianfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvFoods;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProfile = findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(this);

        rvFoods = findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFoods.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                Intent foodDetailIntent = new Intent(MainActivity.this, FoodDetailActivity.class);
                foodDetailIntent.putExtra(FoodDetailActivity.EXTRA_PHOTO, data.getPhoto());
                foodDetailIntent.putExtra(FoodDetailActivity.EXTRA_NAME, data.getName());
                foodDetailIntent.putExtra(FoodDetailActivity.EXTRA_ORIGIN, data.getOrigin());
                foodDetailIntent.putExtra(FoodDetailActivity.EXTRA_DETAIL, data.getDetail());
                startActivity(foodDetailIntent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(profileIntent);
    }
}
