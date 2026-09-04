package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseEntry {
    private Object mData;
    private Drawable mIcon;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f43136y;

    public BaseEntry() {
        this.f43136y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public BaseEntry(float f10) {
        this.mData = null;
        this.mIcon = null;
        this.f43136y = f10;
    }

    public BaseEntry(float f10, Drawable drawable) {
        this(f10);
        this.mIcon = drawable;
    }

    public BaseEntry(float f10, Drawable drawable, Object obj) {
        this(f10);
        this.mIcon = drawable;
        this.mData = obj;
    }

    public BaseEntry(float f10, Object obj) {
        this(f10);
        this.mData = obj;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.f43136y;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setY(float f10) {
        this.f43136y = f10;
    }
}
