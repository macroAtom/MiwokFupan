package com.example.android.miwokfupan;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ColorsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ColorsFragment extends Fragment {

    /**
     * 生命mediaplayer 对象
     */
    private MediaPlayer mediaPlayer;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ColorsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ColorsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ColorsFragment newInstance(String param1, String param2) {
        ColorsFragment fragment = new ColorsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // 方式二，通过自定义类和自定义类型的adapter 布局。

        ArrayList<Word> wordArray = new ArrayList<Word>();
        wordArray.add(new Word("red","红",R.drawable.color_red, R.raw.color_red));
        wordArray.add(new Word("green","绿",R.drawable.color_green, R.raw.color_green));
        wordArray.add(new Word("black","黑",R.drawable.color_black, R.raw.color_black));

        WordArrayAdapter wordAdapter = new WordArrayAdapter(getActivity(),R.layout.word_item,wordArray);

        Log.i("NumbersActivity", "wordAdapter: "+wordAdapter);
        ListView listView = rootView.findViewById(R.id.word_list);
        listView.setAdapter(wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = wordArray.get(position);
                mediaPlayer = MediaPlayer.create(getActivity(), word.getmWordVoice());
                mediaPlayer.start(); // no need to call prepare(); create() does that for you
            }
        });

        return rootView;




    }
}