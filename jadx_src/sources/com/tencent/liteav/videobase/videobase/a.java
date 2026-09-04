package com.tencent.liteav.videobase.videobase;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f100445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f100446b;

    private a(View view, int i10) {
        this.f100445a = view;
        this.f100446b = i10;
    }

    public static Runnable a(View view, int i10) {
        return new a(view, i10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f100445a.setVisibility(this.f100446b);
    }
}
