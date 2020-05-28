package com.patras.proodeftiki.football4all;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


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


    public class User {
        public void inchange(int game,int comm_id) {

        }
        public void grandPermission(int comm_id){

        }
        public void displayForm(){

        }
        public void isFirstTime(){

        }
        public void displayAndGiveID(){

        }
        public void searchID(){

        }
        public void displayUser(){

        }
        public void isFilled(){

        }
        public void sendToAdmin(){

        }
        public void displayEditAcc(){

        }
        public void delete(){

        }
        public void isLoggedIn(){

        }
    }

    public class Viewer extends User{
        private int t_id;
    }

    public class dis_Viewer extends User{
        private int t_id;
    }

    public class Reporter{
        int d_int=0;
        String name,surname;
        Date date = new Date();
        public void create_acc(){

        }
        public void displayF(){

        }
        public void check(){

        }
        public void soc_med_con(){

        }
        public void save(){

        }
        public void media_select(){

        }
        public void display_C(){

        }
        public void approval(){

        }
        public void displayA(){

        }
        public void importData(){

        }
        public void displayW(){

        }
    }

    public class Report_for_Dis extends Reporter{

    }

    public class Voice_assistant{
        public void sound_message(){

        }
        public void recordMessage(){

        }
        public void sendToAdmin(){

        }
        public void voice_command_rec(){

        }
        public void optic_to_text(){

        }
        public void new_info(){

        }
        public void optic_to_sound(){

        }
        public void voice_command(){

        }
        public void ready_for_service(){

        }
        public void update_to_base(){

        }
        public void help(){

        }
    }

    public class Match{
        int a_id,start_time,score;
        public void start(){

        }
        public void stop(){

        }
        public void displayGInstert(){

        }
        public void score(){

        }
        public void displayGame(){

        }
    }

    public class Player{
        String name,position;
        int age,number;

        public void Modify_Player(){

        }
        public void Delete_Player(){

        }
        public void display_selectPlayer(){

        }
        public void display_PlayerStats(){

        }
    }

    public class Line_Up extends Player{
        public void Modify_Team(){

        }
        public void Delete_Team(){

        }
        public void display_teamSelect(){

        }
        public void display_TeamStats(){

        }
    }

    public class Statistics{
        private int corner,offside,fouls,cards;
    }

    public class Match_Statistics extends Statistics{
        private int possession;
    }

    public class Player_Statistics extends Statistics{
        private int goals, fouls_committed,shoots,mistakes;
    }

    public class Commentary{

    }

    public class Ball{
        private float position_x,position_y;
    }

    public class Database{
        public void get_info(int par){

        }
        public void check_if_available(){

        }
        public void displayGameCovered(){

        }
        public void displayToVI(){

        }
        public void displayToNonVI(){

        }
        public void displayNoGames(){

        }
        public void displayGames(){

        }
        public void search(int no_coverage){

        }
        public void displayNotCovered(){

        }
        public void SaveUserSelection(){

        }
        public void successSave(){

        }
    }

    public class LiveShow{
        public void display(){

        }
        public void isApproved(){

        }
        public void isMachineReadyForLive(){

        }
        public void startLive(){

        }
        public void notifyUsers(){

        }
        public void existLive(){

        }
        public void categoryOfUser(){

        }
        public void displayAllLives(){

        }
        public void displayLive(){

        }
    }

    public class News{
        public void checkSize(){

        }
        public void displayFiles(){

        }
        public void isSafe(){

        }
        public void display(){

        }
        public void isApprove(){

        }
        public void publishArticle(){

        }
        public void existNews(){

        }
        public void displayArticle(){

        }
    }

    public class Chat{
        public void displayChat(){

        }
        public void use(){

        }
        public void checkMessage(){

        }
        public void sendMessage(){

        }
    }

    public class VoiceChat extends Chat{
        public void record(){

        }
        public void displaySend(){

        }
        public void store(){

        }
        public void play(String message){

        }
        public void search(String message){

        }
        public void activate(){

        }
        public void displayPlay(){

        }
        public void displayToUser(){

        }
    }

    public class History{
        public void displayEditHistory(){

        }
        public void Modify_History(){

        }
        public void displayHistoryLeague(){

        }
    }

}
