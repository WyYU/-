package com.example.user.ele;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import Adapter.MyAdapter;
import MyView.MyListview;

public class MainActivity extends AppCompatActivity {
    private ListView listView ;
    private Button but_start;
    private ArrayAdapter<String> adapter;
    private String[] data={
            "",
            "巴依老爷",
            "田老师",
            "陕西面",
            "西安大食堂",
            "火烧",
            "外卖",
            ""
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        listView = buildtView();
        but_start = buildStartBtn();
    }

    private Button buildStartBtn() {
        but_start = findViewById(R.id.start_btn);
        but_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"random: "+randomrest(),Toast.LENGTH_SHORT).show();
                listView.setSelection(randomrest());
            }
        });
        return but_start;
    }

    @SuppressLint("WrongViewCast")
    private ListView buildtView() {
        listView = findViewById(R.id.mainlist);
        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,data);
        listView.setAdapter(adapter);
        return listView;
    }

    private int randomrest() {
        //这里写随机餐馆的方法
        int random = (int) (Math.random()*data.length);
        return random;
    }
}
