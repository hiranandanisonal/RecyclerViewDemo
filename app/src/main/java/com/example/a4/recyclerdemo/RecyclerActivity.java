package com.example.a4.recyclerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] s={"No-Codename","No-Codename","CupCake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","IcecreamSandwich","Jelly Bean","KitKat","Lollipop","Marshmallow","Nougat","Orio"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView=(RecyclerView)findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final Adapter adapter=new Adapter(this,s);
        recyclerView.setAdapter(adapter);









    }
}
