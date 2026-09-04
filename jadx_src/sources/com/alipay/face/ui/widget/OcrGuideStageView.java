package com.alipay.face.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrGuideStageView extends FrameLayout {
    public OcrGuideStageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.f39202k, this);
    }

    public void setStage(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int color;
        int color2;
        int i17;
        int color3;
        int i18;
        View viewFindViewById = findViewById(R.id.I);
        View viewFindViewById2 = findViewById(R.id.J);
        TextView textView = (TextView) findViewById(R.id.f39179n);
        TextView textView2 = (TextView) findViewById(R.id.f39178m);
        TextView textView3 = (TextView) findViewById(R.id.f39180o);
        TextView textView4 = (TextView) findViewById(R.id.f39168d0);
        TextView textView5 = (TextView) findViewById(R.id.f39166c0);
        TextView textView6 = (TextView) findViewById(R.id.f39170e0);
        String str = "2";
        String str2 = "3";
        String str3 = "";
        int color4 = 0;
        if (i10 == 0) {
            color4 = getResources().getColor(R.color.f39141d);
            int color5 = getResources().getColor(R.color.f39141d);
            int i19 = R.mipmap.f39209f;
            int color6 = getResources().getColor(R.color.f39139b);
            i15 = R.mipmap.f39208e;
            int color7 = getResources().getColor(R.color.f39142e);
            int i20 = R.mipmap.f39208e;
            color = getResources().getColor(R.color.f39142e);
            i16 = color7;
            i11 = color5;
            i13 = color6;
            i14 = i20;
            str3 = "1";
            i12 = i19;
        } else if (1 == i10) {
            color4 = getResources().getColor(R.color.f39140c);
            color3 = getResources().getColor(R.color.f39141d);
            i18 = R.mipmap.f39207d;
            int color8 = getResources().getColor(R.color.f39139b);
            i15 = R.mipmap.f39209f;
            int color9 = getResources().getColor(R.color.f39139b);
            int i21 = R.mipmap.f39208e;
            color = getResources().getColor(R.color.f39142e);
            i16 = color9;
            i13 = color8;
            i14 = i21;
        } else if (2 == i10) {
            color4 = getResources().getColor(R.color.f39140c);
            color2 = getResources().getColor(R.color.f39140c);
            i17 = R.mipmap.f39207d;
            int color10 = getResources().getColor(R.color.f39139b);
            int i22 = R.mipmap.f39207d;
            int color11 = getResources().getColor(R.color.f39139b);
            int i23 = R.mipmap.f39209f;
            color = getResources().getColor(R.color.f39139b);
            i16 = color11;
            i13 = color10;
            str = "";
            i15 = i22;
            i14 = i23;
        } else {
            str = "";
            str2 = str;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            color = 0;
        }
        if (viewFindViewById != null) {
            i12 = i17;
            i11 = color2;
            i12 = i18;
            i11 = color3;
            viewFindViewById.setBackgroundColor(color4);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setBackgroundColor(i11);
        }
        if (textView != null) {
            textView.setText(str3);
            textView.setBackgroundResource(i12);
        }
        if (textView2 != null) {
            textView2.setText(str);
            textView2.setBackgroundResource(i15);
        }
        if (textView3 != null) {
            textView3.setText(str2);
            textView3.setBackgroundResource(i14);
        }
        if (textView4 != null) {
            textView4.setTextColor(i13);
        }
        if (textView5 != null) {
            textView5.setTextColor(i16);
        }
        if (textView6 != 0) {
            textView6.setTextColor(color);
        }
    }
}
