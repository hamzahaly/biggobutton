package edu.washington.hamzaha.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.push_me);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count++;
                button.setText("You have pushed me " + count + " times!");
            }
        });

    }
}
