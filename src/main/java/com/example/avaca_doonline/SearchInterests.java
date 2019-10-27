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

import java.util.ArrayList;

public class SearchInterests extends AppCompatActivity
{
    private ArrayList<InterestItem> mInterestsList;

    private RecyclerView mRecyclerView;
    private InterestsAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_interests);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        createInterestsList();
        buildRecyclerView();
    }
    public void createInterestsList() {
        mInterestsList = new ArrayList<>();
        mInterestsList.add(new InterestItem(R.drawable.ic_x_eyes, "Scott Bravo", "Music"));
        mInterestsList.add(new InterestItem(R.drawable.ic_frown, "FFDPMoody", "Heavy Metal"));
        mInterestsList.add(new InterestItem(R.drawable.ic_big_smile, "Amyree", "Hard Rock"));
        mInterestsList.add(new InterestItem(R.drawable.ic_neutral, "Ace", "Tea"));
        mInterestsList.add(new InterestItem(R.drawable.ic_neutral, "2XBlackBelt", "Classical"));
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
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent = new Intent(SearchInterests.this, UserInfo.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                Intent intent2 = new Intent(SearchInterests.this, MainActivity.class);
                startActivity(intent2);
                return true;
            case R.id.item3:
                Intent intent3 = new Intent(SearchInterests.this, Settings.class);
                startActivity(intent3);
                return true;
            case R.id.item4:
                Intent intent4 = new Intent(SearchInterests.this, SearchInterests.class);
                startActivity(intent4);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
