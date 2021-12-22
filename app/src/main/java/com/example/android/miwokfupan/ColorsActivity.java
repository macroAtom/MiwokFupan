package com.example.android.miwokfupan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
//    /**
//     * 生命mediaplayer 对象
//     */
//    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new ColorsFragment()).commit();


//        // 方式二，通过自定义类和自定义类型的adapter 布局。
//
//        ArrayList<Word> wordArray = new ArrayList<Word>();
//        wordArray.add(new Word("red","红",R.drawable.color_red, R.raw.color_red));
//        wordArray.add(new Word("green","绿",R.drawable.color_green, R.raw.color_green));
//        wordArray.add(new Word("black","黑",R.drawable.color_black, R.raw.color_black));
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
//                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmWordVoice());
//                mediaPlayer.start(); // no need to call prepare(); create() does that for you
//            }
//        });
    }
}