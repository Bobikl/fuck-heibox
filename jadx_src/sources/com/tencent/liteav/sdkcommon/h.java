package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99834a;

    private h(g gVar) {
        this.f99834a = gVar;
    }

    public static Runnable a(g gVar) {
        return new h(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f99834a.f99823k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }
}
