package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.n0;

/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f41762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b.a f41763c;

    d(@n0 Context context, @n0 b.a aVar) {
        this.f41762b = context.getApplicationContext();
        this.f41763c = aVar;
    }

    private void a() {
        SingletonConnectivityReceiver.a(this.f41762b).d(this.f41763c);
    }

    private void b() {
        SingletonConnectivityReceiver.a(this.f41762b).f(this.f41763c);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        a();
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
        b();
    }
}
