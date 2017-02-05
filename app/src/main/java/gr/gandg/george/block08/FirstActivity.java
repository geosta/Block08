package gr.gandg.george.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
    }

    public void vote(View v) {
        //Toast.makeText(getApplicationContext(), "You voted " + (int)ratingBar.getRating() + " stars", Toast.LENGTH_SHORT).show();
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, SecondActivity.class);
        goToSecond.putExtra("vote", (int)ratingBar.getRating());
        startActivity(goToSecond);
        //Toast.makeText(getApplicationContext(), "Before finish!", Toast.LENGTH_SHORT).show();
        finish();
        //Toast.makeText(getApplicationContext(), "After finish!", Toast.LENGTH_SHORT).show();
    }
}
