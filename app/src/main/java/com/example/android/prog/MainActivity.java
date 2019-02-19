package com.example.android.prog;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private String mOrderMessage;

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
                Intent intent = new Intent(MainActivity.this,
                        Main2Activity.class);
                intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                startActivity(intent);
            }
        });
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

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showFrango(View view) {
        mOrderMessage = getString(R.string.frango_order_message);
        displayToast(mOrderMessage);
    }

    public void showMarguerita(View view) {
        mOrderMessage = getString(R.string.marguerita_order_message);
        displayToast(mOrderMessage);
    }

    public void showCarne(View view) {
        mOrderMessage = getString(R.string.carne_order_message);
        displayToast(mOrderMessage);
    }

    public void showPortuguesa(View view) {
        mOrderMessage = getString(R.string.portuguesa_order_message);
        displayToast(mOrderMessage);
    }

    public void showCamarao(View view) {
        mOrderMessage = getString(R.string.camarao_order_message);
        displayToast(mOrderMessage);
    }

    public void showCalabressa(View view) {
        mOrderMessage = getString(R.string.calabressa_order_message);
        displayToast(mOrderMessage);
    }
    public static final String EXTRA_MESSAGE =
            "com.example.android.droidcafe.extra.MESSAGE";

    public void onClick(View view) {
        Intent intent =
                new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }
}
