package com.bun.miitmdid;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m extends o {
    public volatile long asyncStartTimeMillis;
    public volatile boolean isOnSupportCacheCall;
    public volatile String OAIDCache = "";
    public volatile String VAIDCache = "";
    public volatile String AAIDCache = "";
    public volatile boolean isSupportedCache = false;
    public volatile boolean isLimitedCache = false;
    public volatile long timeout = 5000;

    public native void cleanCache();

    public native void doAsyncCallAfter();

    public native void doAsyncCallBefore();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getAAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getOAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getVAID();

    public native boolean handleIfAsyncOverTime();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isLimited();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isSupported();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    public native void onSupportCache();
}
