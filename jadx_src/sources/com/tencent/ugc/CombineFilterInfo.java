package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class CombineFilterInfo {
    private Bitmap mLeftBitmap;
    private float mLeftRatio;
    private float mLeftSpecialRatio;
    private Bitmap mRightBitmap;
    private float mRightSpecialRatio;

    public CombineFilterInfo() {
    }

    public CombineFilterInfo(float f10, Bitmap bitmap, float f11, Bitmap bitmap2, float f12) {
        this.mLeftRatio = f10;
        this.mLeftBitmap = bitmap;
        this.mRightBitmap = bitmap2;
        this.mLeftSpecialRatio = f11;
        this.mRightSpecialRatio = f12;
    }

    public Bitmap getLeftBitmap() {
        return this.mLeftBitmap;
    }

    public float getLeftRatio() {
        return this.mLeftRatio;
    }

    public float getLeftSpecialRatio() {
        return this.mLeftSpecialRatio;
    }

    public Bitmap getRightBitmap() {
        return this.mRightBitmap;
    }

    public float getRightSpecialRatio() {
        return this.mRightSpecialRatio;
    }

    public void release() {
        Bitmap bitmap = this.mLeftBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mLeftBitmap.recycle();
            this.mLeftBitmap = null;
        }
        Bitmap bitmap2 = this.mRightBitmap;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.mRightBitmap.recycle();
        this.mRightBitmap = null;
    }

    public void setLeftBitmap(Bitmap bitmap) {
        this.mLeftBitmap = bitmap;
    }

    public void setLeftRatio(float f10) {
        this.mLeftRatio = f10;
    }

    public void setLeftSpecialRatio(float f10) {
        this.mLeftSpecialRatio = f10;
    }

    public void setRightBitmap(Bitmap bitmap) {
        this.mRightBitmap = bitmap;
    }

    public void setRightSpecialRatio(float f10) {
        this.mRightSpecialRatio = f10;
    }
}
