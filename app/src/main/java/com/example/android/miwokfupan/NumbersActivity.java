package com.example.android.miwokfupan;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /**
     * 生命mediaplayer 对象
     */
//    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new NumbersFragment()).commit();

//         方式1：通过ArrayList 加 for 循环向子页面中添加布局
//        /**
//         * 通过ArrayList 创建不同类型的对象数组
//         */
//        ArrayList<String> wordArray = new ArrayList<String>();
//        wordArray.add("one");
//        wordArray.add("two");
//        wordArray.add("three");
//
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//
//        for(int i=0; i<wordArray.size(); i++){
//            /**
//             * new TextView(this) 相当于新建一个TextView 并且在layout 中的TextView 后面
//             */
//            TextView textView = new TextView(this);
//            textView.setText(wordArray.get(i));
//
//            /**
//             * LinearView 通过方法addView 添加view 对象
//             */
//            rootView.addView(textView);
//        }

// 方式二，通过自定义类和自定义类型的adapter 布局。

//        ArrayList<Word> wordArray = new ArrayList<Word>();
//        wordArray.add(new Word("one","一",R.drawable.number_one, R.raw.number_one));
//        wordArray.add(new Word("two","二",R.drawable.number_two, R.raw.number_two));
//        wordArray.add(new Word("three","三",R.drawable.number_three, R.raw.number_three));
//
//        WordArrayAdapter wordAdapter = new WordArrayAdapter(this,R.layout.word_item,wordArray);
//
//        Log.i("NumbersActivity", "wordAdapter: "+wordAdapter);
//        ListView listView = findViewById(R.id.word_list);
//        listView.setAdapter(wordAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Word word = wordArray.get(position);
//                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmWordVoice());
//                mediaPlayer.start(); // no need to call prepare(); create() does that for you
//            }
//        });

    }
}