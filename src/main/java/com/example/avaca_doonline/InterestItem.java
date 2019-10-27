package com.example.avaca_doonline;

import android.os.Parcel;
import android.os.Parcelable;

public class InterestItem implements Parcelable
{
    private int mImageResource;
    private String mText1;
    private String mText2;

    public InterestItem(int mImageResource, String mText1, String mText2)
    {
        this.setmImageResource(mImageResource);
        this.setmText1(mText1);
        this.setmText2(mText2);
    }

    protected InterestItem(Parcel in)
    {
        mImageResource = in.readInt();
        mText1 = in.readString();
        mText2 = in.readString();
    }

    public static final Creator<InterestItem> CREATOR = new Creator<InterestItem>()
    {
        @Override
        public InterestItem createFromParcel(Parcel in)
        {
            return new InterestItem(in);
        }

        @Override
        public InterestItem[] newArray(int size)
        {
            return new InterestItem[size];
        }
    };

    public int getmImageResource()
    {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource)
    {
        this.mImageResource = mImageResource;
    }

    public String getmText1()
    {
        return mText1;
    }

    public void setmText1(String mText1)
    {
        this.mText1 = mText1;
    }

    public String getmText2()
    {
        return mText2;
    }

    public void setmText2(String mText2)
    {
        this.mText2 = mText2;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(mImageResource);
        dest.writeString(mText1);
        dest.writeString(mText2);
    }
}
