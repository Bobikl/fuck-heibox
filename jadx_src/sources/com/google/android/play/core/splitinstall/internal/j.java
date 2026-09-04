package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f56290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.splitinstall.t0 f56291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k f56292d;

    j(k kVar, List list, com.google.android.play.core.splitinstall.t0 t0Var) {
        this.f56292d = kVar;
        this.f56290b = list;
        this.f56291c = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f56292d.f56300c.b(this.f56290b)) {
                k.d(this.f56292d, this.f56291c);
            } else {
                k.c(this.f56292d, this.f56290b, this.f56291c);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.f56291c.a(-11);
        }
    }
}
