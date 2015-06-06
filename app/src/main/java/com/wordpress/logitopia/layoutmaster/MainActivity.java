package com.wordpress.logitopia.layoutmaster;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AnalogClock clock = (AnalogClock)findViewById(R.id.clockid);

        TextView showtext = (TextView)findViewById(R.id.showTextid);
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

    public void ClickMe(View view) {

        Toast.makeText(this,"Self Destruction in 3 Seconds",Toast.LENGTH_SHORT).show();


    }

    public void DoNotClick(View view) {
        Toast.makeText(this,"Watch What Happens Next",Toast.LENGTH_SHORT).show();

//        v.findViewById(R.id.showTextid);
//
//        v.setText("You Clicked The Button, You killed a fly.");
//


    }
}
