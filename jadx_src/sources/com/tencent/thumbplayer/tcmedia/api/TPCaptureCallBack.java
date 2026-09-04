package com.tencent.thumbplayer.tcmedia.api;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public interface TPCaptureCallBack {
    void onCaptureVideoFailed(int i10);

    void onCaptureVideoSuccess(Bitmap bitmap);
}
