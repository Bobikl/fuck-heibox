package com.bun.miitmdid;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class c0 extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f42068h;

    public c0(Context context, String str) {
        this.f42068h = checkContext(context);
        this.f42067g = str;
    }

    public native boolean a(Activity activity, int i10);

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

    @Override // com.bun.miitmdid.o, com.bun.miitmdid.interfaces.IdSupplier
    public native void requestOAIDPermission(Activity activity, int i10);
}
