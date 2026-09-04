package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {
    private String label;

    public PieEntry(float f10) {
        super(0.0f, f10);
    }

    public PieEntry(float f10, Drawable drawable) {
        super(0.0f, f10, drawable);
    }

    public PieEntry(float f10, Drawable drawable, Object obj) {
        super(0.0f, f10, drawable, obj);
    }

    public PieEntry(float f10, Object obj) {
        super(0.0f, f10, obj);
    }

    public PieEntry(float f10, String str) {
        super(0.0f, f10);
        this.label = str;
    }

    public PieEntry(float f10, String str, Drawable drawable) {
        super(0.0f, f10, drawable);
        this.label = str;
    }

    public PieEntry(float f10, String str, Drawable drawable, Object obj) {
        super(0.0f, f10, drawable, obj);
        this.label = str;
    }

    public PieEntry(float f10, String str, Object obj) {
        super(0.0f, f10, obj);
        this.label = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public PieEntry copy() {
        return new PieEntry(getY(), this.label, getData());
    }

    public String getLabel() {
        return this.label;
    }

    public float getValue() {
        return getY();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float getX() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.getX();
    }

    public void setLabel(String str) {
        this.label = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void setX(float f10) {
        super.setX(f10);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }
}
