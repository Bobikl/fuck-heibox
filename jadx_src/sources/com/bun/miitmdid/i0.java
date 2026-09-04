package com.bun.miitmdid;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class i0 extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f42102g;

    public i0(Context context) {
        this.f42102g = context;
    }

    @Override // com.bun.miitmdid.n
    public native g b();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();
}
