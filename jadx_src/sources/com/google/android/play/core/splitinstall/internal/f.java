package com.google.android.play.core.splitinstall.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f56269b;

    /* synthetic */ f(g gVar, e eVar) {
        this.f56269b = gVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f56269b.f56274b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f56269b.c().post(new c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f56269b.f56274b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f56269b.c().post(new d(this));
    }
}
