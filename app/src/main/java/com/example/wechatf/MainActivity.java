package com.example.wechatf;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private List<People> peopleList=new ArrayList<>();
    String time1;
    public static int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        if(n!=0){
            Bundle bundle=this.getIntent().getExtras();
            time1=bundle.getString("time");
        }
        else{
            time1="00:00";
            n++;
        }
        initPeople();
        PeopleAdapter adapter=new PeopleAdapter(MainActivity.this,R.layout.people_item,peopleList);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                People people=peopleList.get(position);
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                Bundle dataContainer=new Bundle();
                dataContainer.putString("name",people.getName());
                intent.putExtras(dataContainer);
                startActivity(intent);
            }
        });
        super.onCreate(savedInstanceState);
    }
    private void initPeople(){
        for(int i=0;i<1;i++){
            People A=new People("A",R.drawable.a,time1);
            peopleList.add(A);
            People B=new People("B",R.drawable.b,"01:00");
            peopleList.add(B);
            People C=new People("C",R.drawable.c,"02:00");
            peopleList.add(C);

        }
    }
}
