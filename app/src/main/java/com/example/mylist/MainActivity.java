package com.example.mylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button add, sort, recursionSort;
    TextView result,data;
    MyList list=new MyList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.addButton);
        sort = findViewById(R.id.sort);
        recursionSort = findViewById(R.id.recursionSort);


        result = findViewById(R.id.result);
        data = findViewById(R.id.DataView);


        add.setOnClickListener(this);
        sort.setOnClickListener(this);
        recursionSort.setOnClickListener(this);

        list.add(10);
        list.add(35);
        list.add(5);
        list.add(32);
        list.add(1);
        list.add(1);
        list.add(35);
        list.add(40);
        list.add(3);
        list.add(98);
        list.add(1002);

        data.setText("Elements in order "+list.print());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           case R.id.addButton:list=new MyList();
           result.setText("Result: ");
               list.add(10);
               list.add(35);
               list.add(5);
               list.add(32);
               list.add(1);
               list.add(1);
               list.add(35);
               list.add(40);
               list.add(3);
               list.add(98);
               list.add(1002);

               data.setText("Elements in order "+list.print());break;

            case R.id.sort:list.sort();result.setText("Result: "+list.print());break;
            case R.id.recursionSort:list.recurs(list.getFirstListElement());result.setText("Result: "+list.print());break;
        }

    }
}

//https://drive.google.com/open?id=1ZSu6V10zPmXuCXM3sJ5UJ0XOPr68wZKJ