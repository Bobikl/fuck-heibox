package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.Quaternionf;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IPanoramicVideo;

/* JADX INFO: loaded from: classes4.dex */
public class NativePanoramicVideo implements IPanoramicVideo {
    private static final String TAG = "NativePanoramicVideo}";
    private long mNaiveInstance;

    public NativePanoramicVideo(long j10) {
        this.mNaiveInstance = j10;
    }

    public static native int nativeUpdateQuaternionf(long j10, float f10, float f11, float f12, float f13);

    public void release() {
        this.mNaiveInstance = 0L;
    }

    @Override // com.ss.bytertc.engine.video.IPanoramicVideo
    public int updateQuaternionf(Quaternionf quaternionf) {
        long j10 = this.mNaiveInstance;
        if (j10 != 0) {
            return nativeUpdateQuaternionf(j10, quaternionf.f97946x, quaternionf.f97947y, quaternionf.f97948z, quaternionf.f97945w);
        }
        LogUtil.e(TAG, "native Panoramic is invalid, updateQuaternionf failed.");
        return -1;
    }
}
