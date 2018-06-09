package com.example.aksha.court_counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeforTeam(View v){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoforTeam(View v){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);;
    }
    public void addFreeforTeam(View v){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);;
    }
    public void addThreeforTeamB(View v){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoforTeamB(View v){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeforTeamB(View v){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void resetbutton(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_B);
        scoreView.setText(String.valueOf(score));
    }

}
