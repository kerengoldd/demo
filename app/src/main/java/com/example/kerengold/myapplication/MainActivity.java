package com.example.kerengold.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.*;
import static com.example.kerengold.myapplication.R.id.add;
import static com.example.kerengold.myapplication.R.id.edit_query;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn1,btn2;
    TextView name,tv1;
    EditText edit;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button1);
        btn2  = (Button)findViewById(R.id.button2);
        tv1= (TextView)findViewById(R.id.textView);
        edit = (EditText)findViewById(R.id.et);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
     if(edit.getText().toString().length()>0 ){
         tv1.setText(edit.getText().toString());
         edit.setText("");
     }
        else
         Toast.makeText(this,"filllll",Toast.LENGTH_LONG).show();
      /*  if (view== btn1)
        x++;
        else
        x--;
        name.setText("vdfvfdv" + x);
    */
    }
}
