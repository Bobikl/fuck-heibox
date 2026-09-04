package com.github.mikephil.charting.components;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import bb.c;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes6.dex */
public class LimitLine extends ComponentBase {
    private DashPathEffect mDashPathEffect;
    private String mLabel;
    private LimitLabelPosition mLabelPosition;
    private float mLimit;
    private int mLineColor;
    private float mLineWidth;
    private Paint.Style mTextStyle;

    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f10) {
        this.mLimit = 0.0f;
        this.mLineWidth = 2.0f;
        this.mLineColor = Color.rgb(c.b.D1, 91, 91);
        this.mTextStyle = Paint.Style.FILL_AND_STROKE;
        this.mLabel = "";
        this.mDashPathEffect = null;
        this.mLabelPosition = LimitLabelPosition.RIGHT_TOP;
        this.mLimit = f10;
    }

    public LimitLine(float f10, String str) {
        this.mLimit = 0.0f;
        this.mLineWidth = 2.0f;
        this.mLineColor = Color.rgb(c.b.D1, 91, 91);
        this.mTextStyle = Paint.Style.FILL_AND_STROKE;
        this.mLabel = "";
        this.mDashPathEffect = null;
        this.mLabelPosition = LimitLabelPosition.RIGHT_TOP;
        this.mLimit = f10;
        this.mLabel = str;
    }

    public void disableDashedLine() {
        this.mDashPathEffect = null;
    }

    public void enableDashedLine(float f10, float f11, float f12) {
        this.mDashPathEffect = new DashPathEffect(new float[]{f10, f11}, f12);
    }

    public DashPathEffect getDashPathEffect() {
        return this.mDashPathEffect;
    }

    public String getLabel() {
        return this.mLabel;
    }

    public LimitLabelPosition getLabelPosition() {
        return this.mLabelPosition;
    }

    public float getLimit() {
        return this.mLimit;
    }

    public int getLineColor() {
        return this.mLineColor;
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public Paint.Style getTextStyle() {
        return this.mTextStyle;
    }

    public boolean isDashedLineEnabled() {
        return this.mDashPathEffect != null;
    }

    public void setLabel(String str) {
        this.mLabel = str;
    }

    public void setLabelPosition(LimitLabelPosition limitLabelPosition) {
        this.mLabelPosition = limitLabelPosition;
    }

    public void setLineColor(int i10) {
        this.mLineColor = i10;
    }

    public void setLineWidth(float f10) {
        if (f10 < 0.2f) {
            f10 = 0.2f;
        }
        if (f10 > 12.0f) {
            f10 = 12.0f;
        }
        this.mLineWidth = Utils.convertDpToPixel(f10);
    }

    public void setTextStyle(Paint.Style style) {
        this.mTextStyle = style;
    }
}
