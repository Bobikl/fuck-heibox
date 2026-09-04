package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@z8.d0
public final class k0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f52528c;

    public k0(d dVar, int i10) {
        this.f52528c = dVar;
        this.f52527b = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.f52528c;
        if (iBinder == null) {
            d.f0(dVar, 16);
            return;
        }
        synchronized (dVar.f52488n) {
            d dVar2 = this.f52528c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dVar2.f52489o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new z(iBinder) : (l) iInterfaceQueryLocalInterface;
        }
        this.f52528c.g0(0, null, this.f52527b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f52528c.f52488n) {
            this.f52528c.f52489o = null;
        }
        Handler handler = this.f52528c.f52486l;
        handler.sendMessage(handler.obtainMessage(6, this.f52527b, 1));
    }
}
