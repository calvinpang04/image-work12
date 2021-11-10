package com.example.image;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
private ImageButton i1;
boolean on=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageButton) findViewById(R.id.imageButton2);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!on){
                    on=true;
                    i1.setImageDrawable(getDrawable(R.drawable._62730494760530_p8142605));}
                else{
                    i1.setImageDrawable(getDrawable(R.drawable._63622352542140_p13631597_jpeg));
                }
            }
        });
    }
}