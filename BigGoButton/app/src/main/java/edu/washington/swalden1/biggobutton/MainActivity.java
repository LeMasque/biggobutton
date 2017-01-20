package edu.washington.swalden1.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button go = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go = (Button)findViewById(R.id.button);
        go.setOnClickListener(new View.OnClickListener() {

            private int counter = 0;
            @Override
            public void onClick(View v) {
                go.setText("You have pushed me "+ ++counter + " times!");
            }
        });
    }
}
