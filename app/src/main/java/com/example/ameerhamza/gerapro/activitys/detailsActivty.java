package com.example.ameerhamza.gerapro.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ameerhamza.gerapro.R;
import com.example.ameerhamza.gerapro.model.item;

public class detailsActivty extends AppCompatActivity {
    private TextView TextViewItemDescription;
    private TextView ItemName;
    private TextView ItemID;
    private TextView ItemWebsite;
    public static final String DETAIL_INTENT_KEY = "DETAIL_INTENT_KEY";
   private item mItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_activty);
       mItem = (item) getIntent().getSerializableExtra(DETAIL_INTENT_KEY);
        findViews();
    }

    private void findViews() {
        TextViewItemDescription = findViewById(R.id.textViewdescription);
        ItemName = findViewById(R.id.textViewuserName);
        ItemID = findViewById(R.id.textViewuserID);
        ItemWebsite = findViewById(R.id.textViewWebsite);
        if (mItem!=null){
            TextViewItemDescription.setText(mItem.getDescription());
            ItemWebsite.setText(mItem.getWebsite());
            ItemID.setText(""+mItem.getId());
            ItemName.setText(mItem.getName());
        }
    }
}
