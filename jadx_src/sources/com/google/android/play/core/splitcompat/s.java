package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f56222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f56223c;

    s(a aVar, Set set) {
        this.f56223c = aVar;
        this.f56222b = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f56223c.i(this.f56222b);
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e10);
        }
    }
}
