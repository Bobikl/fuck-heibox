package com.bun.miitmdid;

import android.content.Context;
import com.hihonor.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: classes6.dex */
public class q extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f42139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AdvertisingIdClient.Info f42140h;

    public q(Context context) {
        this.f42139g = checkContext(context);
        l0.c("HonorProvider", "enter into HonorProvider");
    }

    @Override // com.bun.miitmdid.n
    public native g b();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native String getAAID();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native String getOAID();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native String getVAID();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isLimited();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isSupported();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
