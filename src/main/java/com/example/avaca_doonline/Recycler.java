package com.example.avaca_doonline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity
{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        ArrayList<InterestItem> interestList = new ArrayList<>();
        interestList.add(new InterestItem(R.drawable.ic_big_smile, "Vampaerus", "Pagan"));
        interestList.add(new InterestItem(R.drawable.ic_smile, "Tiffany", "Walking"));
        interestList.add(new InterestItem(R.drawable.ic_x_eyes, "Scott Bravo", "Music"));
        interestList.add(new InterestItem(R.drawable.ic_frown, "FFDPMoody", "Heavy Metal"));
        interestList.add(new InterestItem(R.drawable.ic_smile, "AliensReadMyDiary", "Art"));
        interestList.add(new InterestItem(R.drawable.ic_x_eyes, "Hamstergeddon", "Computer"));
        interestList.add(new InterestItem(R.drawable.ic_big_smile, "Amyree", "Hard Rock"));
        interestList.add(new InterestItem(R.drawable.ic_neutral, "Ace", "Tea"));
        interestList.add(new InterestItem(R.drawable.ic_neutral, "2XBlackBelt", "Classical"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new InterestsAdapter(interestList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


    }
}
