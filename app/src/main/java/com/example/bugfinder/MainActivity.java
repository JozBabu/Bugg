package com.example.bugfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView value;
    EditText count;
    int countsssss;
    int flagg;
    Button start,Stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count=findViewById(R.id.count);
        value=findViewById(R.id.valuee);
        start=findViewById(R.id.start);
        Stop=findViewById(R.id.stop);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countsssss = Integer.parseInt(count.getText().toString());

                Log.e("iiiiiii",""+countsssss);

                flagg=0;
                Counting();

            }
        });

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flagg=1;

                Counting();
            }
        });


    }

    public void Counting()
    {

        for(int i=0;i<countsssss;i++)
        {

            Log.e("iiiiiii",""+i);

            value.setText(String.valueOf(i));

            if (flagg==1)
            {
                break;
            }
        }

    }
}
