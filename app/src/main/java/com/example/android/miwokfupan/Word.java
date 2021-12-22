package com.example.android.miwokfupan;

import androidx.annotation.NonNull;

public class Word {

    /**
     * 默认本地翻译
     */
    private String mDefaultTranslation;

    /**
     * 英语翻译
     */
    private String mEnglishTranslation;

    /**
     * 用于存储icon
     */
    private int mImageResourceId;


    /**
     * 用于存储音频id
     */

    private int mWordVoice;

    /**
     * 生产构造函数
     *
     * @param defaultTranslation 单词默认的本地翻译
     * @param englishTranslation 单词的英语翻译
     * @param imageResourceId 图片的id
     */
    public Word(String englishTranslation, String defaultTranslation, int imageResourceId, int wordVoice) {

        this.mEnglishTranslation = englishTranslation;

        this.mDefaultTranslation = defaultTranslation;

        this.mImageResourceId = imageResourceId;

        this.mWordVoice = wordVoice;
    }

    /**
     * 获取单词默认翻译
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * 获取单词英语翻译
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * 获取图片id
     */

    public int getImageResouceId(){
        return mImageResourceId;
    }

    public int getmWordVoice() {
        return mWordVoice;
    }

    /**
     * 获取音频id
     * @return
     */

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
