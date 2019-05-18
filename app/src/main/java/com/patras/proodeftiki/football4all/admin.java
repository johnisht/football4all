package com.patras.proodeftiki.football4all;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        test testing = new test();
        testing.test();
        TextView textView = (TextView) findViewById(R.id.list);
        textView.setSingleLine(false);
        for (Player temp : testing.getLiverpool()) {
            textView.append("\n");
            textView.append(temp.getName());
        }
        TextView textView2 = (TextView) findViewById(R.id.list2);
        textView2.setSingleLine(false);
        for (Player temp : testing.getTottenham()) {
            textView2.append("\n");
            textView2.append(temp.getName());
        }


    }

    public void back(View view) {
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin.this, admin_first.class));
            }
        });
    }






}