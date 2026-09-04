package com.bun.miitmdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes6.dex */
public class y extends m implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f42161a = "com.qiku.id";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f42162b = "qiku.service.action.id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f42163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42164d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f42165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f42166f;

    public y(Context context) {
        l0.a("QikuIdmanager", "QikuProvider");
        this.f42163c = checkContext(context);
    }

    public final native boolean a(Intent intent);

    public native boolean a(String str);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
