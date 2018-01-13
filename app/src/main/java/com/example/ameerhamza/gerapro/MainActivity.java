package com.example.ameerhamza.gerapro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ameerhamza.gerapro.activitys.viewAllItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mQRcodeScan;
    private Button mViewAllName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQRcodeScan = findViewById(R.id.button_qr_code);
        mViewAllName = findViewById(R.id.View_All_titla);
        mViewAllName.setOnClickListener(this);
        mQRcodeScan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_qr_code:

                break;
            case R.id.View_All_titla:
                startActivity(new Intent(MainActivity.this,viewAllItem.class));
                break;
        }
    }
}
