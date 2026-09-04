package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.n0;

/* JADX INFO: compiled from: DefaultConnectivityMonitorFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41764a = "ConnectivityMonitor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41765b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.bumptech.glide.manager.c
    @n0
    public b a(@n0 Context context, @n0 b.a aVar) {
        boolean z10 = androidx.core.content.d.a(context, f41765b) == 0;
        if (Log.isLoggable(f41764a, 3)) {
            Log.d(f41764a, z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new m();
    }
}
