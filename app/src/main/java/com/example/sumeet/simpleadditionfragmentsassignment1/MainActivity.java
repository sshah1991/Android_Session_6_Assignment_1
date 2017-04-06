package com.example.sumeet.simpleadditionfragmentsassignment1;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoad = (Button) findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SimpleAddition_Fragment fragmentShow = new SimpleAddition_Fragment();
                fragmentTransaction.add(R.id.fragmentcontainer, fragmentShow);
                btnLoad.setVisibility(View.GONE);
                fragmentTransaction.commit();

            }
        });

    }


}
