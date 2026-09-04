package com.tencent.liteav.sdkcommon;

import android.widget.ScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f99839a;

    private l(g gVar) {
        this.f99839a = gVar;
    }

    public static Runnable a(g gVar) {
        return new l(gVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScrollView scrollView = this.f99839a.f99823k;
        if (scrollView != null) {
            scrollView.fullScroll(130);
        }
    }
}
