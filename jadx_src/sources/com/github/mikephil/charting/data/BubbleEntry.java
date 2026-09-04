package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public class BubbleEntry extends Entry {
    private float mSize;

    public BubbleEntry(float f10, float f11, float f12) {
        super(f10, f11);
        this.mSize = f12;
    }

    public BubbleEntry(float f10, float f11, float f12, Drawable drawable) {
        super(f10, f11, drawable);
        this.mSize = f12;
    }

    public BubbleEntry(float f10, float f11, float f12, Drawable drawable, Object obj) {
        super(f10, f11, drawable, obj);
        this.mSize = f12;
    }

    public BubbleEntry(float f10, float f11, float f12, Object obj) {
        super(f10, f11, obj);
        this.mSize = f12;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BubbleEntry copy() {
        return new BubbleEntry(getX(), getY(), this.mSize, getData());
    }

    public float getSize() {
        return this.mSize;
    }

    public void setSize(float f10) {
        this.mSize = f10;
    }
}
