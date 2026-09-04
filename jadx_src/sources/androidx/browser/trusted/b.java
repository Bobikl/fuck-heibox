package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ConnectionHolder.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements ServiceConnection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f3269h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f3270i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f3271j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f3272k = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Runnable f3273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final a f3274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private w f3276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private List<CallbackToFutureAdapter.a<w>> f3277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Exception f3278g;

    /* JADX INFO: compiled from: ConnectionHolder.java */
    public static class a {
        a() {
        }

        @n0
        w a(ComponentName componentName, IBinder iBinder) {
            return new w(android.support.customtabs.trusted.b.AbstractBinderC0009b.g(iBinder), componentName);
        }
    }

    @k0
    b(@n0 Runnable runnable) {
        this(runnable, new a());
    }

    @k0
    b(@n0 Runnable runnable, @n0 a aVar) {
        this.f3275d = 0;
        this.f3277f = new ArrayList();
        this.f3273b = runnable;
        this.f3274c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(CallbackToFutureAdapter.a aVar) throws Exception {
        int i10 = this.f3275d;
        if (i10 == 0) {
            this.f3277f.add(aVar);
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    throw new IllegalStateException("Service has been disconnected.");
                }
                if (i10 != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw this.f3278g;
            }
            w wVar = this.f3276e;
            if (wVar == null) {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
            aVar.c(wVar);
        }
        return "ConnectionHolder, state = " + this.f3275d;
    }

    @k0
    public void b(@n0 Exception exc) {
        Iterator<CallbackToFutureAdapter.a<w>> it = this.f3277f.iterator();
        while (it.hasNext()) {
            it.next().f(exc);
        }
        this.f3277f.clear();
        this.f3273b.run();
        this.f3275d = 3;
        this.f3278g = exc;
    }

    @n0
    @k0
    public com.google.common.util.concurrent.p0<w> c() {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.browser.trusted.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object a(CallbackToFutureAdapter.a aVar) {
                return this.f3268a.d(aVar);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @k0
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3276e = this.f3274c.a(componentName, iBinder);
        Iterator<CallbackToFutureAdapter.a<w>> it = this.f3277f.iterator();
        while (it.hasNext()) {
            it.next().c(this.f3276e);
        }
        this.f3277f.clear();
        this.f3275d = 1;
    }

    @Override // android.content.ServiceConnection
    @k0
    public void onServiceDisconnected(ComponentName componentName) {
        this.f3276e = null;
        this.f3273b.run();
        this.f3275d = 2;
    }
}
