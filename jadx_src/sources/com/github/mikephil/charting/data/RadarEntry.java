package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ParcelCreator"})
public class RadarEntry extends Entry {
    public RadarEntry(float f10) {
        super(0.0f, f10);
    }

    public RadarEntry(float f10, Object obj) {
        super(0.0f, f10, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry
    public RadarEntry copy() {
        return new RadarEntry(getY(), getData());
    }

    public float getValue() {
        return getY();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float getX() {
        return super.getX();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void setX(float f10) {
        super.setX(f10);
    }
}
