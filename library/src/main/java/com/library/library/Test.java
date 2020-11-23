package com.library.library;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class Test {

    protected  Context mCon;

    public Test(Context mCon) {
        this.mCon = mCon;
    }

    public  void setUnderline(TextView tv, String msg){
        SpannableString content = new SpannableString(msg);
        content.setSpan(new UnderlineSpan(), 0, msg.length(), 0);
        tv.setText(content);
    }
}
