package com.bun.miitmdid;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bun.lib.MsaIdInterface;

/* JADX INFO: loaded from: classes6.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f42087a = "MsaClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServiceConnection f42088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f42089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MsaIdInterface f42090d;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h0 f42091a;

        public a(h0 h0Var) {
            this.f42091a = h0Var;
        }

        @Override // android.content.ServiceConnection
        public native synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder);

        @Override // android.content.ServiceConnection
        public native void onServiceDisconnected(ComponentName componentName);
    }

    public g0(Context context, h0 h0Var) {
        if (context == null) {
            throw new NullPointerException("Context can not be null.");
        }
        this.f42089c = context;
        this.f42088b = new a(h0Var);
    }

    public static native void a(Context context, String str);

    public native String a();

    public native void a(String str);

    public native String b();

    public native String c();

    public native boolean d();

    public native void e();
}
