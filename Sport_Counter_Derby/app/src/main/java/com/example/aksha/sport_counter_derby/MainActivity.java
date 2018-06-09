package com.example.aksha.sport_counter_derby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int subs_one = 3;
    int subs_two = 4;
    String manager_one = "MANAGER";
    String manager_two = "MANAGER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void halftime(View v) {
        int scoreTeamB = 2;
        displayForTeamA(scoreTeamB);
    }

    public void fulltime(View v) {
        int scoreTeamA = 3;
        int scoreTeamB = 2;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void subs_one(View v) {

        displayForTeamA(subs_one);
    }

    public void subs_two(View v) {

        displayForTeamB(subs_two);
    }

    public void resetbutton(View v) {
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayMessage(manager_one);
        displayMessage_two(manager_two);

    }

    public void manager_1(View v) {
        String manager_one = "Jose Mourinho";
        displayMessage(manager_one);
    }

    public void manager_2(View v) {
        String manager_two = "Pep Guardiola";
        displayMessage_two(manager_two);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_is_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_is_B);
        scoreView.setText(String.valueOf(score));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    private void displayMessage_two(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view_2);
        priceTextView.setText(message);
    }
}


