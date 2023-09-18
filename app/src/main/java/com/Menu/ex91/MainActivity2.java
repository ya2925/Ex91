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
public class MainActivity2 extends AppCompatActivity {

    LinearLayout activity2Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        activity2Layout = (LinearLayout) findViewById(R.id.activity2Layout);
    }

     /**
     * this will enable the manu to be displayed in the action bar. also it add the color options to the activity layout.
     * @return True so the manu will be displayed in the action bar.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("red");
        menu.add("green");
        menu.add("blue");
        menu.add("yellow");

        return super.onCreateOptionsMenu(menu);
    }

     /**
     * this method will run every time a menu item is selected and it will change the color of the activity layout.
     * @param item The menu item that was selected.
     * @return True
     */
    public boolean onOptionsItemSelected(@Nullable MenuItem item) {
        String color = item.getTitle().toString();
        activity2Layout.setBackgroundColor(Color.parseColor(color));

        return super.onOptionsItemSelected(item);
    }

    /**
     * this method will return the user to the main activity.
     * @param view the button that was clicked.
     */
    public void returnToMain(View view) {
        finish();
    }
}