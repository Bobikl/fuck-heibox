package com.starlightc.ucropplus.callback;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public interface OverlayViewChangeListener {

    public interface CropAreaResizeCallback {
        void onCropAreaResize(RectF rectF);
    }

    void onCropRectUpdated(RectF rectF);

    void onCropRectUpdatedWithCropAreaResizeCallback(RectF rectF, CropAreaResizeCallback cropAreaResizeCallback);
}
