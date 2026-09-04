package com.tencent.ugc.videoprocessor;

import com.tencent.liteav.base.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WatermarkProcessor f103946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f103948c;

    private d(WatermarkProcessor watermarkProcessor, List list, Size size) {
        this.f103946a = watermarkProcessor;
        this.f103947b = list;
        this.f103948c = size;
    }

    public static Runnable a(WatermarkProcessor watermarkProcessor, List list, Size size) {
        return new d(watermarkProcessor, list, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103946a.setAnimatedPasterListInternal(this.f103947b, this.f103948c);
    }
}
