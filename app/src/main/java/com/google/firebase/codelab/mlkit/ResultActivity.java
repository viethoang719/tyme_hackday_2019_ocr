package com.google.firebase.codelab.mlkit;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public String SAID_RESULT = "SAID";
    Button reScanButton;
    TextView saIdTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        reScanButton = findViewById(R.id.reScanButton);
        saIdTv = findViewById(R.id.saIdTvResult);


        if (getIntent().getExtras()!=null) {
            String saId = getIntent().getExtras().getString(SAID_RESULT);
            saIdTv.setText(saId);
        }



    }
}
