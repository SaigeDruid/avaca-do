package com.example.avaca_doonline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserInfo extends AppCompatActivity
{
    private ArrayList<InterestItem> mInterestsList;

    private RecyclerView mRecyclerView;
    private InterestsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private TextView Welcome;
    private Button Settings;
    private Button SearchInterests;
    private String userName = "SaigeDruid";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        createInterestsList();
        buildRecyclerView();


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Welcome = findViewById(R.id.tvWelcome);
        Settings = findViewById(R.id.btnSettings);
        SearchInterests = findViewById(R.id.btnSearchInterests);


        Welcome.setText(String.format("Welcome, %s", userName));

        Settings.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(UserInfo.this, Settings.class);
                startActivity(intent);
            }
        });

        SearchInterests.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(UserInfo.this, SearchInterests.class);
                startActivity(intent);
            }
        });


    }
    public void createInterestsList()
    {
        mInterestsList = new ArrayList<>();
        mInterestsList.add(new InterestItem(R.drawable.ic_big_smile, "Vampaerus", "Pagan"));
        mInterestsList.add(new InterestItem(R.drawable.ic_smile, "Tiffany", "Walking"));
        mInterestsList.add(new InterestItem(R.drawable.ic_smile, "AliensReadMyDiary", "Art"));
        mInterestsList.add(new InterestItem(R.drawable.ic_x_eyes, "Hamstergeddon", "Computer"));
    }
    public void buildRecyclerView()
    {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new InterestsAdapter(mInterestsList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent = new Intent(UserInfo.this, UserInfo.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                Intent intent2 = new Intent(UserInfo.this, MainActivity.class);
                startActivity(intent2);
                return true;
            case R.id.item3:
                Intent intent3 = new Intent(UserInfo.this, Settings.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                Intent intent4 = new Intent(UserInfo.this, SearchInterests.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public String getUserName()
    {
        return userName;
    }
}
