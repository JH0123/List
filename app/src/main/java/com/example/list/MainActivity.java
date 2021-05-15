package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private TextView  title, author, pay,introduction;
//    private ImageView picture;
//    private Button btn1, btn2;
    ListView comment_list;
    View header,footer;
    TextView time_text;
    EditText comment_edit;


    protected void onCrete(Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, TestUpdate.class);
        startActivity(intent);
    }
    public void onClick2(View view) {
        Intent intent = new Intent(this, TestDelete.class);
        startActivity(intent);
    }

    public void clickSend(View view){

    }
//    public void init() {
//        comment_list = (ListView)findViewById(R.id.jrv_comment_list);
//        header = getLayoutInflater().inflate(R.layout.header, null, false
//        );
//        footer = getLayoutInflater().inflate(R.layout.footer, null, false);
//        comment_list.addHeaderView(header);
//        comment_list.addFooterView(footer);
//
//        time_text = (TextView)header.findViewById(R.id.jrv_title_text);
//
//        setFooter();
//    }
//    public void setFooter(){
//        comment_edit = (EditText)footer.findViewById(R.id.jrv_comment_edit);
//        Button commentinput_btn = (Button)footer.findViewById(R.id.jrv_commentinput_btn);
//        commentinput_btn.setOnClickListener(this);
//    }

}