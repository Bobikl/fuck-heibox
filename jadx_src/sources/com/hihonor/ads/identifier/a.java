package com.hihonor.ads.identifier;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.bun.miitmdid.q0;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdvertisingIdClient.Info f59983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f59984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BinderC0502a f59985c = new BinderC0502a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f59986d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f59987e = new CountDownLatch(2);

    /* JADX INFO: renamed from: com.hihonor.ads.identifier.a$a, reason: collision with other inner class name */
    public class BinderC0502a extends q0.a {
        public BinderC0502a() {
        }

        @Override // com.bun.miitmdid.q0
        public native void a(int i10, long j10, boolean z10, float f10, double d10, String str);

        @Override // com.bun.miitmdid.q0
        public native void a(int i10, Bundle bundle);
    }

    public class b extends q0.a {
        public b() {
        }

        @Override // com.bun.miitmdid.q0
        public native void a(int i10, long j10, boolean z10, float f10, double d10, String str);

        @Override // com.bun.miitmdid.q0
        public native void a(int i10, Bundle bundle);
    }

    public final native void a();

    public native boolean a(Context context);

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);
}
