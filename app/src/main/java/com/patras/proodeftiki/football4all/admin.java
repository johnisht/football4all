package com.patras.proodeftiki.football4all;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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

    public class Commentary extends MainActivity.Match {

        String[] Comments;

        protected Commentary(int id, int hour, int goals) {
            super(id, hour, goals);
        }

        public void commentary()
        {
            Comments = new String[]{"Κάνει πάσα", "Κάνει μακρινή μπαλιά", "Κάνει τάκλιν", "Βγάζει την σέντρα", "Κάνει κεφαλιά", "Μπλοκάρει","Γκοοοολ",
                    "Κάνει βολέ", "Ελεύθερο λάκτισμα", "Πλάγιο", "Φάουλ", "Κίτρινη κάρτα", "Κόκκινη κάρτα", "Αλλαγή", "Σουτάρει", "Κόρνερ"};
        }
    }

    public abstract class Reporter extends user {


        private int id;
        private String name;
        private String surname;

        public Reporter(int id, String name, String surname)
        {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public void set_id(int id)
        {
            this.id = id;
        }

        public void set_name(String name)
        {
            this.name = name;
        }

        public void set_surname(String surname)
        {
            this.surname = surname;
        }

        public int get_id()
        {
            return id;
        }

        public String get_name()
        {
            return name;
        }

        public String get_surname()
        {
            return surname;
        }
    }

}