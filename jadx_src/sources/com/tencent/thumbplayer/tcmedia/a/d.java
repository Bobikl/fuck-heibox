package com.tencent.thumbplayer.tcmedia.a;

import android.graphics.Bitmap;
import android.util.Log;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.ITPImageGeneratorCallback;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGenerator;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class d implements com.tencent.thumbplayer.tcmedia.adapter.a.a, ITPImageGeneratorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f102154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TPImageGenerator f102155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Long, TPCaptureCallBack> f102156c;

    public d(int i10) {
        this(i10, 0L, 0L);
    }

    public d(int i10, long j10, long j11) {
        this.f102154a = 0L;
        this.f102155b = new TPImageGenerator(i10, j10, j11, this);
        this.f102156c = new HashMap();
        try {
            this.f102155b.init();
        } catch (Exception e10) {
            TPLogUtil.e("TPThumbPlayer[TPThumbCapture.java]", "init: " + Log.getStackTraceString(e10));
        }
    }

    public d(String str) {
        this.f102154a = 0L;
        this.f102155b = new TPImageGenerator(str, this);
        this.f102156c = new HashMap();
        try {
            this.f102155b.init();
        } catch (Exception e10) {
            TPLogUtil.e("TPThumbPlayer[TPThumbCapture.java]", "init: " + Log.getStackTraceString(e10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a
    public void a() {
        try {
            this.f102155b.cancelAllImageGenerations();
            this.f102155b.unInit();
        } catch (Exception e10) {
            TPLogUtil.e("TPThumbPlayer[TPThumbCapture.java]", "release: " + Log.getStackTraceString(e10));
        }
        this.f102156c.clear();
        this.f102155b = null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a
    public void a(long j10, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack) {
        if (tPImageGeneratorParams == null) {
            tPImageGeneratorParams = new TPImageGeneratorParams();
            tPImageGeneratorParams.format = 37;
        }
        TPImageGeneratorParams tPImageGeneratorParams2 = tPImageGeneratorParams;
        long j11 = this.f102154a + 1;
        this.f102154a = j11;
        this.f102156c.put(Long.valueOf(j11), tPCaptureCallBack);
        try {
            this.f102155b.generateImageAsyncAtTime(j10, this.f102154a, tPImageGeneratorParams2);
        } catch (Exception e10) {
            TPLogUtil.e("TPThumbPlayer[TPThumbCapture.java]", "generateImageAsyncAtTime: " + Log.getStackTraceString(e10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.imagegenerator.ITPImageGeneratorCallback
    public void onImageGenerationCompleted(int i10, long j10, long j11, long j12, TPVideoFrame tPVideoFrame) {
        TPCaptureCallBack tPCaptureCallBack = this.f102156c.get(Long.valueOf(j12));
        if (tPCaptureCallBack != null) {
            if (i10 != 0 || tPVideoFrame == null) {
                tPCaptureCallBack.onCaptureVideoFailed(i10);
            } else {
                Bitmap bitmapA = a.a(tPVideoFrame);
                if (bitmapA != null) {
                    tPCaptureCallBack.onCaptureVideoSuccess(bitmapA);
                } else {
                    i10 = TPGeneralError.FAILED;
                    tPCaptureCallBack.onCaptureVideoFailed(i10);
                }
            }
        }
        this.f102156c.remove(Long.valueOf(j12));
    }
}
