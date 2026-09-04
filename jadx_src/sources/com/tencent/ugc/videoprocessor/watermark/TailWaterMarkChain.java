package com.tencent.ugc.videoprocessor.watermark;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videoprocessor.watermark.data.TailWaterMark;

/* JADX INFO: loaded from: classes4.dex */
public class TailWaterMarkChain {
    private static final String TAG = "TailWaterMarkChain";
    private TailWaterMark mTailWaterMark;

    public void clear() {
        TailWaterMark tailWaterMark = this.mTailWaterMark;
        if (tailWaterMark != null) {
            tailWaterMark.release();
        }
        this.mTailWaterMark = null;
    }

    public float getAlpha() {
        TailWaterMark tailWaterMark = this.mTailWaterMark;
        if (tailWaterMark == null) {
            return 0.0f;
        }
        return tailWaterMark.mMarkAlphaLevel;
    }

    public float getBlurLevel() {
        TailWaterMark tailWaterMark = this.mTailWaterMark;
        if (tailWaterMark == null) {
            return 0.0f;
        }
        return tailWaterMark.mBlurLevel;
    }

    public TailWaterMark getTailWaterMark(PixelFrame pixelFrame) {
        if (pixelFrame == null || this.mTailWaterMark == null || pixelFrame.getTimestamp() < this.mTailWaterMark.getStartTime()) {
            return null;
        }
        float fMin = Math.min(1.0f, Math.max(0.0f, (pixelFrame.getTimestamp() - this.mTailWaterMark.getStartTime()) / (this.mTailWaterMark.getDuration() * 1.0f)));
        TailWaterMark tailWaterMark = this.mTailWaterMark;
        tailWaterMark.mBlurLevel = fMin;
        tailWaterMark.mMarkAlphaLevel = fMin;
        return tailWaterMark;
    }

    public void setTailWaterMark(TailWaterMark tailWaterMark) {
        LiteavLog.i(TAG, "setTailWaterMark:".concat(String.valueOf(tailWaterMark)));
        this.mTailWaterMark = tailWaterMark;
    }
}
