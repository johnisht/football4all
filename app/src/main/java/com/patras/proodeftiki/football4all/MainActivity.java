package com.patras.proodeftiki.football4all;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Dialog;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
Dialog myDialog;
    List<Player> Liverpool = new ArrayList<Player>();
    List<Player> ManchesterCity = new ArrayList<Player>();
int first=0;
int online=0;
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

    public void user(View view) {
        if (first==0) {
            first=1;
            User temp = new User();
            myDialog = new Dialog(this);
            temp.displayForm();
        }
        setContentView(R.layout.activity_user_first);


    }


    public void admin(View view) {
        if (first==0) {
            first=1;
            Reporter temp = new Reporter();
            myDialog = new Dialog(this);
            temp.create_acc();
        }
        setContentView(R.layout.activity_admin_first);
    }

    public void back(View view) {
        setContentView(R.layout.activity_main);
    }

    public void Start(View view) {
        Match LiveMc = new Match();
        setContentView(R.layout.activity_admin);
        LiveMc.start();
        online=1;
    }

    public void Live(View view) {
        setContentView(R.layout.livegames);
        Button games = (Button) findViewById(R.id.LiveMc);
        if (online==0) {
            games.setVisibility(View.GONE);
        }
        if (online==1) {
            games.setVisibility(View.VISIBLE);
        }
    }

    public void watch(View view){
        setContentView(R.layout.activity_user);
        TextView list = (TextView) findViewById(R.id.list);
        list.append("\nLiverpool");
        for (int i=0; i<Liverpool.size(); i++) {
            list.append("\n"+Liverpool.get(i).name);
        }
        list.append("\nManchester City");
        for (int i=0; i<ManchesterCity.size(); i++) {
            list.append("\n"+ManchesterCity.get(i).name);
        }
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.timer); // initiate a chronometer
        simpleChronometer.start();
    }

    public void finished(View view) {
        setContentView(R.layout.activity_finished_games);
    }



    public class User {
        public void inchange(int game,int comm_id) {

        }
        public void grandPermission(int comm_id){

        }
        public void displayForm(){
            TextView txtclose;
            myDialog.setContentView(R.layout.custompopup);
            txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
            txtclose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myDialog.dismiss();
                }
            });
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialog.show();
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
            TextView txtclose;
            myDialog.setContentView(R.layout.custompopup);
            txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
            txtclose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myDialog.dismiss();
                }
            });
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialog.show();
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
            displayGame();
            Chronometer simpleChronometer = (Chronometer) findViewById(R.id.timer); // initiate a chronometer
            simpleChronometer.start();
        }
        public void stop(){

        }
        public void displayGInstert(){

        }
        public void score(){

        }
        public void displayGame(){
            Random r = new Random();
            TextView list = (TextView) findViewById(R.id.list);
            list.append("\nLiverpool");
            for (int i=1;i<11;i++){
                Player temp = new Player();
                temp.name = "Liverpool"+i;
                temp.age =  r.nextInt(40 - 18) + 18;
                temp.number = i;
                temp.position= "Επίθεση";
                Liverpool.add(temp);
                list.append("\n"+temp.name);
            }
            list.append("\nManchester City");
            for (int i=1;i<11;i++){
                Player temp = new Player();
                temp.name = "ManchesterCity"+i;
                temp.age =  r.nextInt(40 - 18) + 18;
                temp.number = i;
                temp.position= "Επίθεση";
                ManchesterCity.add(temp);
                list.append("\n"+temp.name);
            }
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
