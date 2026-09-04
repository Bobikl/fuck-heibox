package com.tencent.thumbplayer.tcmedia.a;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import java.io.FileDescriptor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a, com.tencent.thumbplayer.tcmedia.adapter.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, TPCaptureCallBack> f102150a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f102151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileDescriptor f102152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f102153d;

    public c(AssetFileDescriptor assetFileDescriptor) {
        this.f102153d = assetFileDescriptor;
    }

    public c(FileDescriptor fileDescriptor) {
        this.f102152c = fileDescriptor;
    }

    public c(String str) {
        this.f102151b = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a
    public void a() {
        this.f102150a.clear();
    }

    @Override // com.tencent.thumbplayer.tcmedia.a.b.a
    public void a(int i10, int i11) {
        TPCaptureCallBack tPCaptureCallBack = this.f102150a.get(Integer.valueOf(i10));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoFailed(i11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.a.b.a
    public void a(int i10, long j10, int i11, int i12, Bitmap bitmap, long j11) {
        TPCaptureCallBack tPCaptureCallBack = this.f102150a.get(Integer.valueOf(i10));
        if (tPCaptureCallBack != null) {
            tPCaptureCallBack.onCaptureVideoSuccess(bitmap);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.a
    public void a(long j10, TPImageGeneratorParams tPImageGeneratorParams, TPCaptureCallBack tPCaptureCallBack) {
        b.d dVar = new b.d();
        dVar.f102144a = this.f102151b;
        dVar.f102145b = this.f102152c;
        dVar.f102146c = this.f102153d;
        dVar.f102147d = j10;
        dVar.f102148e = tPImageGeneratorParams.width;
        dVar.f102149f = tPImageGeneratorParams.height;
        this.f102150a.put(Integer.valueOf(b.a().a(dVar, this)), tPCaptureCallBack);
    }
}
