package com.myapplication.LogAndMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.myapplication.R;
import com.myapplication.Register.Register;

/*
*
*
*
*
* */
public class ActivityLogin extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;
    private Button bt_log;
    private Button bt_bos;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            //通过资源标识获得控件实例
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        bt_log = findViewById(R.id.bt_log);
        bt_bos = findViewById(R.id.bt_bos);

        //添加按钮事件
        bt_log.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                //获取用户输入数据
                String strUsername = et_username.getText().toString();
                String strPassword = et_password.getText().toString();
                // 判断用户名和密码是否正确
                if (strUsername.equals("admin") && strPassword.equals("admin"))
                {
                    Toast.makeText(ActivityLogin.this,"用户名和密码正确！",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ActivityLogin.this, ActivityMain.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(ActivityLogin.this,"用户名和密码错误！",Toast.LENGTH_SHORT).show();
                }
            }
        });
        //给取消注册监听器，实现监听器接口，编写事件
        bt_bos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this, Register.class);
                startActivity(intent);
            }
        });

    }
}
