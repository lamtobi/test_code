package com.example.test_code;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
UserAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView=findViewById(R.id.rcl);
        adapter=new UserAdapter(this);
        LinearLayoutManager layout=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layout);

        adapter.setdata(getList());
        recyclerView.setAdapter(adapter);
    }
    private List<User>getList(){
        List<User>ls=new ArrayList<>();
        ls.add(new User(R.drawable.src1,"Ảnh 1"));
        ls.add(new User(R.drawable.src2,"Ảnh 2"));
        ls.add(new User(R.drawable.src3,"Ảnh 3"));

        ls.add(new User(R.drawable.src1,"Ảnh 1"));
        ls.add(new User(R.drawable.src2,"Ảnh 2"));
        ls.add(new User(R.drawable.src3,"Ảnh 3"));

        ls.add(new User(R.drawable.src1,"Ảnh 1"));
        ls.add(new User(R.drawable.src2,"Ảnh 2"));
        ls.add(new User(R.drawable.src3,"Ảnh 3"));
        return  ls;
    }
}