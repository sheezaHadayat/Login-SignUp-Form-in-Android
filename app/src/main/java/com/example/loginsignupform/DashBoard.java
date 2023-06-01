package com.example.loginsignupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity {

    Button btn_Edu1,btn_Edu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        btn_Edu1=(Button)findViewById(R.id.ButtonEdu);
        btn_Edu2=(Button)findViewById(R.id.ButtonEdu2);





        btn_Edu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText (DashBoard.this, "Education selected", Toast.LENGTH_SHORT).show();

            }
        });


        btn_Edu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashBoard.this, "Advanced education selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}