package com.example.rajiv.auditioning;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public ArrayList<weather_forecast> w1 = new ArrayList<weather_forecast>();
    weather_forecast b = new weather_forecast();
    Recycler_Adapter adapter;
    RecyclerView recycle;

    CustomLinearLayoutManager m;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle = (RecyclerView) findViewById(R.id.cycle);
        m = new CustomLinearLayoutManager(this,20);
        m.setOrientation(LinearLayoutManager.VERTICAL);
        
        recycle.setLayoutManager(m);
        adapter = new Recycler_Adapter(w1);
        recycle.setAdapter(adapter);
        String[] A = new String[10];
        for(int i=0;i<10;i++)
        A[i] = "bbbnm";
        b.fill_dat(A);
        Log.i("sss:"," "+A[0]+A[1]+A[9]);
        for(int i=0;i<10;i++)
        w1.add(b);
    }
}