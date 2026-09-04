package com.starlightc.ucropplus.model;

import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes4.dex */
public class ImageState {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RectF mCropRect;
    private float mCurrentAngle;
    private RectF mCurrentImageRect;
    private float mCurrentScale;

    public ImageState(RectF rectF, RectF rectF2, float f10, float f11) {
        this.mCropRect = rectF;
        this.mCurrentImageRect = rectF2;
        this.mCurrentScale = f10;
        this.mCurrentAngle = f11;
    }

    public RectF getCropRect() {
        return this.mCropRect;
    }

    public float getCurrentAngle() {
        return this.mCurrentAngle;
    }

    public RectF getCurrentImageRect() {
        return this.mCurrentImageRect;
    }

    public float getCurrentScale() {
        return this.mCurrentScale;
    }
}
