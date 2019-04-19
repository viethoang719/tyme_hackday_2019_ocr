package com.google.firebase.codelab.mlkit;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public String SAID_RESULT = "SAID";
    Button reScanButton;
    TextView saIdTv;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        title = findViewById(R.id.titleResult);
        reScanButton = findViewById(R.id.reScanButton);
        reScanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        saIdTv = findViewById(R.id.saIdTvResult);


        if (getIntent().getExtras() != null) {
            String saId = getIntent().getExtras().getString(SAID_RESULT);
            if (saId == "")
            {
                title.setText("Sorry, we can not detect your SAID");
            }
            saIdTv.setText(saId);
        }
    }
}
