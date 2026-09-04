package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f52386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f52387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ h f52388d;

    g(h hVar, LifecycleCallback lifecycleCallback, String str) {
        this.f52388d = hVar;
        this.f52386b = lifecycleCallback;
        this.f52387c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f52388d;
        if (hVar.f52391c > 0) {
            this.f52386b.g(hVar.f52392d != null ? hVar.f52392d.getBundle(this.f52387c) : null);
        }
        if (this.f52388d.f52391c >= 2) {
            this.f52386b.k();
        }
        if (this.f52388d.f52391c >= 3) {
            this.f52386b.i();
        }
        if (this.f52388d.f52391c >= 4) {
            this.f52386b.l();
        }
        if (this.f52388d.f52391c >= 5) {
            this.f52386b.h();
        }
    }
}
