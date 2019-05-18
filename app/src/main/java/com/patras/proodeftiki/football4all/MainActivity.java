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

    public class Statistics
    {
        private int possesionA, possesionB; //οπου Α και Β οι 2 ομαδες
        private int offsidesA, offsidesB;

        public Statistics(int possesionA, int possesionB, int offsidesA, int offsidesB) {
            this.possesionA = possesionA;
            this.possesionB = possesionB;
            this.offsidesA = offsidesA;
            this.offsidesB = offsidesB;
        }

        public int getPossesionA(){
            return possesionA;
        }
        public void setPossesionA(int possesionΑ){
            this.possesionA = possesionΑ;
        }
        public int getPossesionB(){
            return possesionB;
        }
        public void setPossesionB(int possesionB){
            this.possesionB = possesionB;
        }
        public int getOffsidesA(){
            return offsidesA;
        }
        public void setOffsidesA(int offsidesA){
            this.offsidesA = offsidesA;
        }
        public int getOffsidesB(){
            return offsidesB;
        }
        public void setOffsidesB(int offsidesB){
            this.offsidesB = offsidesB;
        }

    }




    public static class Match
    {
        private int id;
        private String a;
        private String b;
        private int hour; //θεωρω πως η ωρα δινεται με 4 ψηφια, 2 για την ωρα και 2 για τα λεπτα
        private int goals; //θεωρω πως τα γκολ δινονται με 4 ψηφια,2 για τα γκολ της καθε ομαδας
        private String A;
        private String B;

        public Match() {
        }


        public String getA() {
            return A;
        }

        public String getB() {
            return B;
        }



        public void setA(String a) {
            A = a;
        }

        public void setB(String b) {
            B = b;
        }

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public int getHour(){
            return hour;
        }
        public void setHour(int hour){
            this.hour = hour;
        }
        public int getGoals(){
            return goals;
        }
        public void setGoals(int goals){
            this.goals = goals;
        }

        protected Match(int id, String a, String b, int hour, int goals) {
            this.id = id;
            this.a = A;
            this.b = B;
            this.hour = hour;
            this.goals = goals;
        }

        //προσπαθω να φτιαξω το timer
        int secondsPassed = 0;
        Timer myTimer = new Timer ();
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                secondsPassed++;
                System.out.println(secondsPassed);
            }
        };
        public void start(){
            myTimer.scheduleAtFixedRate(task,1000,1000);
        }
        public void stop() {
        }
    }



}
