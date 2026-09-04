package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99835a;

    private i(g gVar) {
        this.f99835a = gVar;
    }

    public static Runnable a(g gVar) {
        return new i(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f99835a.f99823k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }
}
