package com.bun.miitmdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.samsung.android.deviceidservice.IDeviceIdService;

/* JADX INFO: loaded from: classes6.dex */
public class a0 extends m implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f42034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IDeviceIdService f42035d;

    public a0(Context context) {
        this.f42032a = context;
        Context contextCheckContext = checkContext(context);
        this.f42032a = contextCheckContext;
        this.f42033b = contextCheckContext != null ? contextCheckContext.getPackageName() : "";
    }

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.m, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
