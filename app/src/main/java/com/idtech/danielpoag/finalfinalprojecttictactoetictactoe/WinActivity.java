package com.idtech.danielpoag.finalfinalprojecttictactoetictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        textView = (TextView) findViewById(R.id.textView);

        if (MainActivity.winner == 1){
            textView.setText("Player One Wins!");
        }

        else if (MainActivity.winner == 2){
            textView.setText("Player Two Wins!");
        }
    }
}
