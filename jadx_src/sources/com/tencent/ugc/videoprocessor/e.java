package com.tencent.ugc.videoprocessor;

import com.tencent.liteav.base.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WatermarkProcessor f103949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f103951c;

    private e(WatermarkProcessor watermarkProcessor, List list, Size size) {
        this.f103949a = watermarkProcessor;
        this.f103950b = list;
        this.f103951c = size;
    }

    public static Runnable a(WatermarkProcessor watermarkProcessor, List list, Size size) {
        return new e(watermarkProcessor, list, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103949a.setPasterListInternal(this.f103950b, this.f103951c);
    }
}
