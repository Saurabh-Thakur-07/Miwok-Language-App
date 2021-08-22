package com.example.miwok;

public class Word {
    private String mDefaultTranslation ;
    private String mMiwokTranslation ;
    private int mImageResourceId = NO_IMG;
    private int mAudioResourceId;
    public static final int NO_IMG = -1 ;
    public Word(String DefaultWord , String MiwokWord , int audioResourceId)
    {
        mDefaultTranslation = DefaultWord ;
        mAudioResourceId = audioResourceId ;
        mMiwokTranslation = MiwokWord ;
    }
    public Word(String DefaultWord , String MiwokWord , int ImageId ,int audioResourceId)
    {
        mDefaultTranslation = DefaultWord ;
        mMiwokTranslation = MiwokWord ;
        mImageResourceId = ImageId ;
        mAudioResourceId = audioResourceId ;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation ;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation ;
    }
    public int getGetImageResourceId(){ return mImageResourceId ;}
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMG ;
    }
    public int getAudioResourceId(){ return mAudioResourceId ;}
}
