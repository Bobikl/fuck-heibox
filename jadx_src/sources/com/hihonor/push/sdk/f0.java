package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.bean.RemoteServiceBean;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: loaded from: classes7.dex */
public class f0 implements ServiceConnection {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f60022e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteServiceBean f60023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f60024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f60025c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60026d = false;

    public interface a {
    }

    public f0(RemoteServiceBean remoteServiceBean) {
        this.f60023a = remoteServiceBean;
    }

    public final void a() {
        synchronized (f60022e) {
            Handler handler = this.f60025c;
            if (handler != null) {
                handler.removeMessages(1001);
                this.f60025c = null;
            }
        }
    }

    public final void a(int i10) {
        a aVar = this.f60024b;
        if (aVar != null) {
            c0 c0Var = (c0) aVar;
            c0Var.f60009a.f60012a.set(i10 == HonorPushErrorEnum.ERROR_SERVICE_TIME_OUT.statusCode ? 2 : 1);
            c0Var.f60009a.a(i10);
            c0Var.f60009a.f60013b = null;
        }
    }

    public void b() {
        try {
            Log.i("AIDLSrvConnection", "trying to unbind service from " + this);
            l.f60050e.a().unbindService(this);
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        Log.i("AIDLSrvConnection", "enter onNullBinding, than unBind.");
        if (this.f60026d) {
            this.f60026d = false;
            return;
        }
        b();
        a();
        a aVar = this.f60024b;
        if (aVar != null) {
            c0 c0Var = (c0) aVar;
            c0Var.f60009a.f60012a.set(1);
            c0Var.f60009a.a(8002005);
            c0Var.f60009a.f60013b = null;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("AIDLSrvConnection", "enter onServiceConnected.");
        a();
        a aVar = this.f60024b;
        if (aVar != null) {
            c0 c0Var = (c0) aVar;
            c0Var.f60009a.f60013b = IPushInvoke.Stub.asInterface(iBinder);
            if (c0Var.f60009a.f60013b == null) {
                c0Var.f60009a.f60015d.b();
                c0Var.f60009a.f60012a.set(1);
                c0Var.f60009a.a(8002001);
                return;
            }
            c0Var.f60009a.f60012a.set(3);
            b0.a aVar2 = c0Var.f60009a.f60014c;
            if (aVar2 != null) {
                z.a aVar3 = (z.a) aVar2;
                if (Looper.myLooper() == z.this.f60109a.getLooper()) {
                    aVar3.b();
                } else {
                    z.this.f60109a.post(new x(aVar3));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("AIDLSrvConnection", "enter onServiceDisconnected.");
        a aVar = this.f60024b;
        if (aVar != null) {
            c0 c0Var = (c0) aVar;
            c0Var.f60009a.f60012a.set(1);
            c0Var.f60009a.a(8002002);
            c0Var.f60009a.f60013b = null;
        }
    }
}
