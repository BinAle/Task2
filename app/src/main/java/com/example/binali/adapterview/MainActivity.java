package com.example.binali.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String data[]={"st1","st2","st3","st4","st5","st6","st7","st8","st9","st10"};


            ListView listview = (ListView)findViewById(R.id.list1);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
            listview.setAdapter(arrayAdapter);

    }
}
