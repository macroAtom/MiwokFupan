package com.example.android.miwokfupan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    /**
     * Oncreate 方法 android 框架启动程序的入口
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /**
         * 父类调用onCreate 方法，进行后台即及其他相关的加载
         */
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
// 方式1：mater - detail 导航模式

//        /**
//         * 使用Activity_main 布局文件加载页面
//         */
//        setContentView(R.layout.activity_main);
//
//
//        /**
//         * 通过findViewByid找到layout 中的number text 并将其存到TextView 对象number中
//         */
//        TextView number = findViewById(R.id.numbers);
//        TextView color  = findViewById(R.id.colors);
//
//        /**
//         * 设置监听器，监听点击事件，并做出响应
//         * 监听器：有类的定义，类的实体，以及回调做出的反馈
//         */
//        number.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(),NumbersActivity.class);
//                startActivity(i);
//            }
//        });
//
//        color.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(),ColorsActivity.class);
//                startActivity(i);
//            }
//        });


        // 方式2：viewPager + Fragment 模式
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        pager.setAdapter(new CategoryFragementAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = pager.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(pager);
    }
}