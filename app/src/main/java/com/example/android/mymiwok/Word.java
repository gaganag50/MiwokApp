package com.example.android.mymiwok;

public class Word {
    private  String mMiwokTranslation;
    private  String mDefaultTranslation;
    private int mImageResourceId;
    private int mAudioResourceId;
    public Word(String miwokTranslation , String defaultTranslation  , int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }
    public Word(String miwokTranslation , String defaultTranslation , int imageResourceId , int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
