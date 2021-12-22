package com.example.android.miwokfupan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordArrayAdapter extends ArrayAdapter<Word> {
    public WordArrayAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        super.getView(position, convertView, parent);

        View listContentView = convertView;

        /**
         * 通过索引，获取word 对象
         */
        Word word = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        /**
         * 检查是否有存在的view 正在被重复使用，否侧重新膨胀一个View
         */
        if (listContentView == null) {
            listContentView = LayoutInflater.from(getContext()).inflate(R.layout.word_item, parent, false);
        }

        // Lookup view for data population
        /**
         * 查找用于填充的对象
         */
        TextView englishView = listContentView.findViewById(R.id.english_text);
        TextView defaultView = listContentView.findViewById(R.id.default_text);

        ImageView imageView = listContentView.findViewById(R.id.icon_image);

        // Populate the data into the template view using the data object
        /**
         * 使用数据对象填充模板
         */
        englishView.setText(word.getEnglishTranslation());
        defaultView.setText(word.getDefaultTranslation());
        imageView.setImageResource(word.getImageResouceId());
        return listContentView;
    }
}
