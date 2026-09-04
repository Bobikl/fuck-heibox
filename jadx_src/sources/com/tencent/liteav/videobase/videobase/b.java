package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f100447a;

    private b(View view) {
        this.f100447a = view;
    }

    public static Runnable a(View view) {
        return new b(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100447a.requestLayout();
    }
}
