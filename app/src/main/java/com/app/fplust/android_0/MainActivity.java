package com.app.fplust.android_0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cB_movie(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "This button will launch my movies app!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void cB_hawk(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "This button will launch my hawk app!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void cB_bigger(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "This button will make it bigger!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void cB_material(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "This button will make the app material!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void cB_gubi(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "This button will make the app ubiquitous!", Toast.LENGTH_SHORT);
        t.show();
    }

    public void cB_capstone(View view) {
        Toast t = Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_SHORT);
        t.show();
    }
}
