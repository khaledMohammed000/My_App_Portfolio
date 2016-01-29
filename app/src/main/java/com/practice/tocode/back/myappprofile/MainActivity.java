package com.practice.tocode.back.myappprofile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button spotifyButt ;
    Button scoreButt ;
    Button libButt ;
   // Button buildButt ;
   // Button xyzButt ;
   // Button capstoneButt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        spotifyButt= (Button) findViewById(R.id.button1);
        scoreButt= (Button) findViewById(R.id.button2);
        libButt= (Button) findViewById(R.id.button3);
        // buildButt= (Button) findViewById(R.id.button4);
        //  xyzButt= (Button) findViewById(R.id.button5);
        // capstoneButt = (Button) findViewById(R.id.button6);

        spotifyButt.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "opens my spotify Streamer app", Toast.LENGTH_SHORT).show();
            }
        });

        scoreButt.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"opens my spotify Streamer app",Toast.LENGTH_SHORT).show();
            }
        });

        libButt.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"opens my Scores app",Toast.LENGTH_SHORT).show();
            }
        });
//
/*From here on Implementing these using
*separate methods for practicing
* onClick attribute of Button
*/
/*
        buildButt.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"opens my Build It Bigger app",Toast.LENGTH_SHORT).show();
            }
        });

        xyzButt.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"opens my XYZ Reader app",Toast.LENGTH_SHORT).show();
            }
        });

        capstoneButt.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"opens my CAPSTONE project app",Toast.LENGTH_SHORT).show();
            }
        });
*/
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

// defining methods for onClick attribute :)

    public void buildButton(View view){
        Toast.makeText(getApplicationContext(),"opens my Build It Bigger app",Toast.LENGTH_SHORT).show();
    }

    public void xyButton(View view){
        Toast.makeText(getApplicationContext(),"opens my XYZ Reader app",Toast.LENGTH_SHORT).show();
    }

    public void capButton(View view){
        Toast.makeText(getApplicationContext(),"opens my CAPSTONE project app",Toast.LENGTH_SHORT).show();
    }

}

