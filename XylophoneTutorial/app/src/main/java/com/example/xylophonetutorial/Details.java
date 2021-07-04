package com.example.xylophonetutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

public class Details extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        DbHandler db = new DbHandler(this);
        ArrayList<HashMap<String, String>> userList = db.Geteasy();
        ListView lv = (ListView) findViewById(R.id.userlistof);
        ListAdapter adapter = new SimpleAdapter(Details.this, userList, R.layout.list_row,
                new String[]{"tittle","remarks","score"},
                new int[]{R.id.tittlescore, R.id.remarksscore, R.id.percentagescore});
        lv.setAdapter(adapter);

    }
}