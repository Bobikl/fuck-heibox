package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f52383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f52384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzb f52385d;

    f(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f52385d = zzbVar;
        this.f52383b = lifecycleCallback;
        this.f52384c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzb zzbVar = this.f52385d;
        if (zzbVar.f52395c > 0) {
            this.f52383b.g(zzbVar.f52396d != null ? zzbVar.f52396d.getBundle(this.f52384c) : null);
        }
        if (this.f52385d.f52395c >= 2) {
            this.f52383b.k();
        }
        if (this.f52385d.f52395c >= 3) {
            this.f52383b.i();
        }
        if (this.f52385d.f52395c >= 4) {
            this.f52383b.l();
        }
        if (this.f52385d.f52395c >= 5) {
            this.f52383b.h();
        }
    }
}
