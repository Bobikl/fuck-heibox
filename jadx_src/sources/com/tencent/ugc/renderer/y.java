package com.tencent.ugc.renderer;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoRenderer f103851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f103852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f103853c;

    private y(VideoRenderer videoRenderer, List list, List list2) {
        this.f103851a = videoRenderer;
        this.f103852b = list;
        this.f103853c = list2;
    }

    public static Runnable a(VideoRenderer videoRenderer, List list, List list2) {
        return new y(videoRenderer, list, list2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setPerspectiveCorrectionPoints$4(this.f103851a, this.f103852b, this.f103853c);
    }
}
