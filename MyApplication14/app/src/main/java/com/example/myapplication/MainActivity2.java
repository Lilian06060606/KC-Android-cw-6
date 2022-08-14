package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
ArrayList<Characters> charactersArrayList = new ArrayList<>();
    int currentcarc =0;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name = findViewById(R.id.textView);
        TextView age = findViewById(R.id.textView2);
        TextView money = findViewById(R.id.textView3);
        Button next1 = findViewById(R.id.button2);
        ImageView pic = findViewById(R.id.imageView);
        Intent intent1 = new Intent();
        String names = "basinessmen";
        Characters carc1= new Characters("Jeff Bezos",58,168,R.drawable.download1);
        Characters carc2= new Characters("Jack Ma",57,24,R.drawable.download2);
        Characters carc3= new Characters("Bill Gates",66,114,R.drawable.download);
        Characters carc4= new Characters("Elon Musk",51,265,R.drawable.download3);

        charactersArrayList.add(carc1);
        charactersArrayList.add(carc2);
        charactersArrayList.add(carc3);
        charactersArrayList.add(carc4);

        pic.setImageResource(charactersArrayList.get(currentcarc).getPhoto());
        name.setText(charactersArrayList.get(currentcarc).getManname());
        age.setText(String.valueOf(charactersArrayList.get(currentcarc).getManage()));
        money.setText(String.valueOf(charactersArrayList.get(currentcarc).getWealth()));

        next1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        currentcarc++;
        if (currentcarc== charactersArrayList.size()){
            currentcarc=0;}
            pic.setImageResource(charactersArrayList.get(currentcarc).getPhoto());
            name.setText(charactersArrayList.get(currentcarc).getManname());
            age.setText(String.valueOf(charactersArrayList.get(currentcarc).getManage()));
            money.setText(String.valueOf(charactersArrayList.get(currentcarc).getWealth()));


        }
});





    }
}