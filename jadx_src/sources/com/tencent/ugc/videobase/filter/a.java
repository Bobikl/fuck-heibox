package com.tencent.ugc.videobase.filter;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TXCGPUImagePerspectiveCorrectionFilter f103883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f103885c;

    private a(TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter, List list, List list2) {
        this.f103883a = tXCGPUImagePerspectiveCorrectionFilter;
        this.f103884b = list;
        this.f103885c = list2;
    }

    public static Runnable a(TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter, List list, List list2) {
        return new a(tXCGPUImagePerspectiveCorrectionFilter, list, list2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImagePerspectiveCorrectionFilter.lambda$setTransformPoints$0(this.f103883a, this.f103884b, this.f103885c);
    }
}
