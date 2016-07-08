package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mTeamAScore;
    private TextView mScoreViewA;

    private int mTeamBScore;
    private TextView mScoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreViewA = (TextView) findViewById(R.id.team_a_score);
        mScoreViewA.setText(String.valueOf(mTeamAScore));

        mScoreViewB = (TextView) findViewById(R.id.team_b_score);
        mScoreViewB.setText(String.valueOf(mTeamBScore));
    }

    public void resetScores(View view) {
        mTeamAScore = 0;
        displayScoreForTeam(mScoreViewA);
        mTeamBScore = 0;
        displayScoreForTeam(mScoreViewB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeam(TextView team) {
        if (team == mScoreViewA)
            team.setText(String.valueOf(mTeamAScore));
        else
            team.setText(String.valueOf(mTeamBScore));
    }

    public void threePointerTeamA(View view) {
        mTeamAScore += 3;
        displayScoreForTeam(mScoreViewA);
    }

    public void twoPointerTeamA(View view) {
        mTeamAScore += 2;
        displayScoreForTeam(mScoreViewA);
    }

    public void freeThrowTeamA(View view) {
        mTeamAScore += 1;
        displayScoreForTeam(mScoreViewA);
    }

    public void threePointerTeamB(View view) {
        mTeamBScore += 3;
        displayScoreForTeam(mScoreViewB);
    }

    public void twoPointerTeamB(View view) {
        mTeamBScore += 2;
        displayScoreForTeam(mScoreViewB);
    }

    public void freeThrowTeamB(View view) {
        mTeamBScore += 1;
        displayScoreForTeam(mScoreViewB);
    }
}
