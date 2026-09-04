package com.bun.miitmdid;

import android.content.Context;
import com.android.msasdk.FreemeIdsSupplier;
import com.android.msasdk.IConnect;

/* JADX INFO: loaded from: classes6.dex */
public class l extends m implements IConnect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FreemeIdsSupplier f42113c;

    public l(Context context) {
        this.f42111a = context;
    }

    @Override // com.android.msasdk.IConnect
    public native void connectSuccess(boolean z10);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
