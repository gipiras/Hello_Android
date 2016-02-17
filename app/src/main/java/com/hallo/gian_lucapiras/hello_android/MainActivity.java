package com.hallo.gian_lucapiras.hello_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nachricht;
    private Button weiter_fertig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nachricht = (TextView) findViewById(R.id.nachricht);
        weiter_fertig = (Button) findViewById(R.id.weiter_fertig);

        nachricht.setText(R.string.willkommen);
        weiter_fertig.setText(R.string.weiter);
    }
}
