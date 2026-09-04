package com.tencent.ugc.videoprocessor.watermark.data;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: loaded from: classes4.dex */
public class TailWaterMark extends WaterMark {
    public float mBlurLevel;
    private int mDuration;
    public float mMarkAlphaLevel;
    private long mStartTime;

    public TailWaterMark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j10, int i10) {
        super(bitmap, tXRect);
        this.mStartTime = j10;
        this.mDuration = i10;
        this.mBlurLevel = 0.0f;
        this.mMarkAlphaLevel = 1.0f;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public long getStartTime() {
        return this.mStartTime;
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.data.WaterMark
    public void release() {
        super.release();
    }
}
