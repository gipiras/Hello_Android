package com.hallo.gian_lucapiras.hello_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nachricht;
    private Button weiter_fertig;
    private EditText eingabe;
    private boolean first_Click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nachricht = (TextView) findViewById(R.id.nachricht);
        eingabe = (EditText) findViewById(R.id.eingabe);
        weiter_fertig = (Button) findViewById(R.id.weiter_fertig);

        first_Click = true;

        nachricht.setText(R.string.willkommen);
        weiter_fertig.setText(R.string.weiter);
        weiter_fertig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(first_Click){
                    nachricht.setText(getString(R.string.hallo,eingabe.getText()));
                    eingabe.setVisibility(View.INVISIBLE);
                    weiter_fertig.setText(R.string.fertig);
                    first_Click=false;
                }else{
                    finish();
                }
            }
        });
    }
}
