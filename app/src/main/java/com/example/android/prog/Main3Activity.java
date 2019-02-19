package com.example.android.prog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.prog.MainActivity.EXTRA_MESSAGE;

public class Main3Activity extends AppCompatActivity {
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showSim(View view) {
        mOrderMessage = getString(R.string.yes_order_message);
        displayToast(mOrderMessage);
        Intent intent = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void showNao(View view) {
        mOrderMessage = getString(R.string.no_order_message);
        displayToast(mOrderMessage);
        Intent intent = new Intent(Main3Activity.this, MainActivity.class);
        startActivity(intent);
    }

}
