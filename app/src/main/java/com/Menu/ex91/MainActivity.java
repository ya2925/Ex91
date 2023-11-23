package com.Menu.ex91;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Yanir Aton
 * @version 1.0
 * @since 2023-09-18
 */
public class MainActivity extends AppCompatActivity {

    LinearLayout activityLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conner the activity layout to a java view
        activityLayout = (LinearLayout) findViewById(R.id.activityLayout);
    }

    /**
     * this will enable the manu to be displayed in the action bar. also it add the color options to the activity layout.
     * @return True so the manu will be displayed in the action bar.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.colors, menu);

        return super.onCreateOptionsMenu(menu);
    }

    /**
     * this method will run every time a menu item is selected and it will change the color of the activity layout.
     * @param item The menu item that was selected.
     * @return True
     */
    public boolean onOptionsItemSelected(@Nullable MenuItem item) {
        String color = item.getTitle().toString();
        activityLayout.setBackgroundColor(Color.parseColor(color));

        return super.onOptionsItemSelected(item);
    }

    /**
     * this mathod will take the user to the second activity.
     * @param view the button that was clicked.
     */
    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }


}