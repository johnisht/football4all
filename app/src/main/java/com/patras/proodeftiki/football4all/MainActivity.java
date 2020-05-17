package com.patras.proodeftiki.football4all;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void admin(View view) {
        Button admin = (Button) findViewById(R.id.Admin);
        admin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view){
            startActivity(new Intent(MainActivity.this, admin_first.class));
        }
        });
    }
    public void user(View view) {
        Button admin = (Button) findViewById(R.id.User);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, user_first.class));
            }
        });
    }

    public class User{

    }

    public class Viewer extends User{

    }

    public class dis_Viewer extends User{

    }

    public class Reporter{
        int d_int=0;
        String name,surname;
        Date date = new Date();
    }

    public class Report_for_Dis extends Reporter{

    }

    public class Voice_assistant{

    }

    public class Match{
        int a_id,start_time,score;
    }

    public class Player{
        String name,position;
        int age,number;
    }

    public class Line_Up extends Player{

    }

    public class Statistics{
        int corner,offside,fouls,cards;
    }

    public class Match_Statistics extends Statistics{

    }

    public class Player_Statistics extends Statistics{

    }

    public class Commentary{

    }

    public class Ball{
        float position_x,position_y;
    }

    public class Database{

    }


}
