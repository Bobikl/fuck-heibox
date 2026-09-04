package com.bun.miitmdid;

import android.app.Activity;
import android.content.Context;
import com.heytap.openid.bean.OpenIDInfo;
import com.heytap.openid.sdk.OpenIDSDK;

/* JADX INFO: loaded from: classes6.dex */
public class v extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f42151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OpenIDInfo f42152h;

    public v(Context context) {
        this.f42151g = context;
        Context contextCheckContext = checkContext(context);
        this.f42151g = contextCheckContext;
        OpenIDSDK.init(contextCheckContext);
        if (l0.f42114a) {
            OpenIDSDK.setLoggable(true);
        }
    }

    @Override // com.bun.miitmdid.n
    public native g b();

    public final native void c();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.o, com.bun.miitmdid.interfaces.IdSupplier
    public native void requestOAIDPermission(Activity activity, int i10);
}
