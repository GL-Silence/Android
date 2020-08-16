package com.myapplication.LogAndMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.myapplication.Jemp.Jemp_image02;
import com.myapplication.Jemp.Jemp_image03;
import com.myapplication.Jemp.Jemp_image04;
import com.myapplication.Jemp.Jemp_image05;
import com.myapplication.Jemp.Jemp_image06;
import com.myapplication.Jemp.Jemp_image07;
import com.myapplication.Jemp.Jemp_image08;
import com.myapplication.Jemp.Jemp_image01;
import com.myapplication.R;


public class ActivityMain extends AppCompatActivity {

      ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*商品分类跳转*/
        imageView = findViewById(R.id.image_01);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image01.class);
                startActivity(intent);
            }
        });

        /*订单*/
        imageView = findViewById(R.id.image_02);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image02.class);
                startActivity(intent);
            }
        });

        /*彩票*/
        imageView = findViewById(R.id.image_03);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image03.class);
                startActivity(intent);
            }
        });

        /*购物车*/
        imageView = findViewById(R.id.image_04);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image04.class);
                startActivity(intent);
            }
        });

        /*我的易购*/
        imageView = findViewById(R.id.image_05);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image05.class);
                startActivity(intent);
            }
        });

        /*物流查询*/
        imageView = findViewById(R.id.image_06);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image06.class);
                startActivity(intent);
            }
        });
        /*易付宝充值*/
        imageView = findViewById(R.id.image_07);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image07.class);
                startActivity(intent);
            }
        });
        /*客户端下载*/
        imageView = findViewById(R.id.image_08);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityMain.this, Jemp_image08.class);
                startActivity(intent);
            }
        });
    }

}
