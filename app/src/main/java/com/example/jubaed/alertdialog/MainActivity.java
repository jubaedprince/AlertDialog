package com.example.jubaed.alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate is called");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sample Title");
        builder.setMessage("Sample Message");
        builder.setPositiveButton("Yes yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "Yes is clicked");
            }
        });

        builder.setNegativeButton("No no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "No Clicked", Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "No is clicked");
            }
        });

        builder.create().show();
    }
}
