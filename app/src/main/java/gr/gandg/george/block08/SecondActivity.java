package gr.gandg.george.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent caller = getIntent();

        ((TextView)findViewById(R.id.textView)).setText("You vote: " + caller.getIntExtra("vote", 0) + " stars!");
    }
}
