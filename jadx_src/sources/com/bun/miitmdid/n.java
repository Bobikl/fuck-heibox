package com.bun.miitmdid;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42119b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42120c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42121d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42122e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42123f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f42118a = b();

    public abstract g b();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getAAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getOAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getVAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isLimited();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isSupported();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
