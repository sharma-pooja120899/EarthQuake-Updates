package com.e.earthquakeupdates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ArrayList<EarthCustom> aList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       aList=QueryUtils.giveLists();



//        aList.add(new EarthCustom(5.6,"Mumbai","Feb 02,2019"));
//        aList.add(new EarthCustom(4.5,"Kolkata","Jan 09,2020"));
//        aList.add(new EarthCustom(7.8,"Bihar","Mar 01,2021"));
//        aList.add(new EarthCustom(6.7,"Bengalore","May 01,2021"));
//        aList.add(new EarthCustom(5.6,"Jharkhand","Aug 12,2020"));
//        aList.add(new EarthCustom(7.8,"Uttarakhand","Aug 01,2021"));
//        aList.add(new EarthCustom(6.4,"Jaipur","Jun 09,2020"));
//        aList.add(new EarthCustom(8.9,"Udaipur","Sep 09,2021"));
//        aList.add(new EarthCustom(5.6,"Delhi","Jan 08,2007"));
//        aList.add(new EarthCustom(8.1,"Bikaner","Jul 04,2010"));
//        aList.add(new EarthCustom(7.6,"Gandhinagar","Oct 01,2003"));
//        aList.add(new EarthCustom(8.9,"Ahmedabad","Nov 19,2019"));






       CustomAdapter customAdapter=new CustomAdapter(this,aList);
        ListView lv=findViewById(R.id.list);
        lv.setAdapter(customAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String url = aList.get(i).getUrl();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
