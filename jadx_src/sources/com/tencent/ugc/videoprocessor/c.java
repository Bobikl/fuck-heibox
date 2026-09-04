package com.tencent.ugc.videoprocessor;

import com.tencent.liteav.base.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WatermarkProcessor f103943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Size f103945c;

    private c(WatermarkProcessor watermarkProcessor, List list, Size size) {
        this.f103943a = watermarkProcessor;
        this.f103944b = list;
        this.f103945c = size;
    }

    public static Runnable a(WatermarkProcessor watermarkProcessor, List list, Size size) {
        return new c(watermarkProcessor, list, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f103943a.setSubtitleListInternal(this.f103944b, this.f103945c);
    }
}
