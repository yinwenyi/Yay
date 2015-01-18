package com.example.max.yay;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

import java.util.List;


public class DatabaseHandlerRoutine extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_handler_routine);
        Intent intent = getIntent();
        String message = intent.getStringExtra(DisplayInputFields.EXTRA_MESSAGE);

        DatabaseHandler db = new DatabaseHandler(this);

        Contact c = new Contact(7, message);
        db.addContact(c);

        Contact contact = db.getContact(7);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(contact.get_name());

        // Set the text view as the activity layout
        setContentView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_database_handler_routine, menu);
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
