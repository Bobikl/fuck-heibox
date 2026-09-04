package com.tencent.ugc.videoprocessor.watermark.data;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: loaded from: classes4.dex */
public class WaterMark {
    private Bitmap mWaterMark;
    private TXVideoEditConstants.TXRect mWaterMarkRect;

    public WaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        this.mWaterMark = bitmap;
        this.mWaterMarkRect = tXRect;
    }

    public Bitmap getWaterMark() {
        return this.mWaterMark;
    }

    public TXVideoEditConstants.TXRect getmWaterMarkRect() {
        return this.mWaterMarkRect;
    }

    public void release() {
        Bitmap bitmap = this.mWaterMark;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mWaterMark.recycle();
            this.mWaterMark = null;
        }
        this.mWaterMarkRect = null;
    }
}
