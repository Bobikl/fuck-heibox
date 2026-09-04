package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ IBinder f56261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ f f56262d;

    c(f fVar, IBinder iBinder) {
        this.f56262d = fVar;
        this.f56261c = iBinder;
    }

    @Override // com.google.android.play.core.splitinstall.internal.q1
    public final void c() {
        this.f56262d.f56269b.f56285m = m0.N(this.f56261c);
        g.q(this.f56262d.f56269b);
        this.f56262d.f56269b.f56279g = false;
        Iterator it = this.f56262d.f56269b.f56276d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f56262d.f56269b.f56276d.clear();
    }
}
