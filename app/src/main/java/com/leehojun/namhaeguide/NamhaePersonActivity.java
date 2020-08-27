package com.leehojun.namhaeguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NamhaePersonActivity extends AppCompatActivity {

    Button btn_main, btn_map, btn_person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        connectButton();
    }

    private void connectButton(){
        btn_main = findViewById(R.id.btn_main);
        btn_map = findViewById(R.id.btn_map);
        btn_person = findViewById(R.id.btn_person);

        btn_main.setOnClickListener(ClickListener);
        btn_map.setOnClickListener(ClickListener);
        btn_person.setOnClickListener(ClickListener);

    }

    Button.OnClickListener ClickListener = new Button.OnClickListener() {
        Intent intent = null;
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_main:
                    intent = new Intent(NamhaePersonActivity.this,MainActivity.class);
                    break;
                case R.id.btn_map:
                    intent = new Intent(NamhaePersonActivity.this,NamhaeMapActivity.class);
                    break;
                case R.id.btn_person:
                    intent = new Intent(NamhaePersonActivity.this,NamhaePersonActivity.class);
                    break;
            }
            startActivity(intent);
        }
    };
}
