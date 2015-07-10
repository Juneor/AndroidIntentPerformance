package com.test.activity.androidperformance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.juner.utils.ActivityUtils;

public class FirstActivity extends AppCompatActivity {

    public static  long before_time;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        long after = System.currentTimeMillis();
        System.out.println("juner first after: " + after );
        System.out.println("juner first take time: " + (after - before_time));
        initViews();
    }

    private void initViews(){

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.before_time = System.currentTimeMillis();
                System.out.println("juner before: " + FirstActivity.before_time);
//                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
//                startActivity(intent);
                ActivityUtils.startActivity(FirstActivity.this, SecondActivity.class);

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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
}
