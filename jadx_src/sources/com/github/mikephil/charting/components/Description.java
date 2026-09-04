package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes6.dex */
public class Description extends ComponentBase {
    private MPPointF mPosition;
    private String text = "Description Label";
    private Paint.Align mTextAlign = Paint.Align.RIGHT;

    public Description() {
        this.mTextSize = Utils.convertDpToPixel(8.0f);
    }

    public MPPointF getPosition() {
        return this.mPosition;
    }

    public String getText() {
        return this.text;
    }

    public Paint.Align getTextAlign() {
        return this.mTextAlign;
    }

    public void setPosition(float f10, float f11) {
        MPPointF mPPointF = this.mPosition;
        if (mPPointF == null) {
            this.mPosition = MPPointF.getInstance(f10, f11);
        } else {
            mPPointF.f43143x = f10;
            mPPointF.f43144y = f11;
        }
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextAlign(Paint.Align align) {
        this.mTextAlign = align;
    }
}
