package com.google.android.play.core.splitcompat;

import android.util.Log;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f56221b;

    r(a aVar) {
        this.f56221b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f56221b.f56193a.k();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
