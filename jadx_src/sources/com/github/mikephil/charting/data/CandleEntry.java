package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {
    private float mClose;
    private float mOpen;
    private float mShadowHigh;
    private float mShadowLow;

    public CandleEntry(float f10, float f11, float f12, float f13, float f14) {
        super(f10, (f11 + f12) / 2.0f);
        this.mShadowHigh = f11;
        this.mShadowLow = f12;
        this.mOpen = f13;
        this.mClose = f14;
    }

    public CandleEntry(float f10, float f11, float f12, float f13, float f14, Drawable drawable) {
        super(f10, (f11 + f12) / 2.0f, drawable);
        this.mShadowHigh = f11;
        this.mShadowLow = f12;
        this.mOpen = f13;
        this.mClose = f14;
    }

    public CandleEntry(float f10, float f11, float f12, float f13, float f14, Drawable drawable, Object obj) {
        super(f10, (f11 + f12) / 2.0f, drawable, obj);
        this.mShadowHigh = f11;
        this.mShadowLow = f12;
        this.mOpen = f13;
        this.mClose = f14;
    }

    public CandleEntry(float f10, float f11, float f12, float f13, float f14, Object obj) {
        super(f10, (f11 + f12) / 2.0f, obj);
        this.mShadowHigh = f11;
        this.mShadowLow = f12;
        this.mOpen = f13;
        this.mClose = f14;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public CandleEntry copy() {
        return new CandleEntry(getX(), this.mShadowHigh, this.mShadowLow, this.mOpen, this.mClose, getData());
    }

    public float getBodyRange() {
        return Math.abs(this.mOpen - this.mClose);
    }

    public float getClose() {
        return this.mClose;
    }

    public float getHigh() {
        return this.mShadowHigh;
    }

    public float getLow() {
        return this.mShadowLow;
    }

    public float getOpen() {
        return this.mOpen;
    }

    public float getShadowRange() {
        return Math.abs(this.mShadowHigh - this.mShadowLow);
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public void setClose(float f10) {
        this.mClose = f10;
    }

    public void setHigh(float f10) {
        this.mShadowHigh = f10;
    }

    public void setLow(float f10) {
        this.mShadowLow = f10;
    }

    public void setOpen(float f10) {
        this.mOpen = f10;
    }
}
