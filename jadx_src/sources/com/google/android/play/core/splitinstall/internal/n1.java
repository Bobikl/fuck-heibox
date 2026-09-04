package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p1 f56310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f56311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f56312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f56313d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private zzr f56314e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f56315f = false;

    protected n1(p1 p1Var, IntentFilter intentFilter, Context context) {
        this.f56310a = p1Var;
        this.f56311b = intentFilter;
        this.f56312c = q0.a(context);
    }

    private final void f() {
        zzr zzrVar;
        if ((this.f56315f || !this.f56313d.isEmpty()) && this.f56314e == null) {
            zzr zzrVar2 = new zzr(this, null);
            this.f56314e = zzrVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f56312c.registerReceiver(zzrVar2, this.f56311b, 2);
            } else {
                this.f56312c.registerReceiver(zzrVar2, this.f56311b);
            }
        }
        if (this.f56315f || !this.f56313d.isEmpty() || (zzrVar = this.f56314e) == null) {
            return;
        }
        this.f56312c.unregisterReceiver(zzrVar);
        this.f56314e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(k9.a aVar) {
        this.f56310a.d("registerListener", new Object[0]);
        u0.a(aVar, "Registered Play Core listener should not be null.");
        this.f56313d.add(aVar);
        f();
    }

    public final synchronized void c(boolean z10) {
        this.f56315f = true;
        f();
    }

    public final synchronized void d(k9.a aVar) {
        this.f56310a.d("unregisterListener", new Object[0]);
        u0.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f56313d.remove(aVar);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f56313d).iterator();
        while (it.hasNext()) {
            ((k9.a) it.next()).onStateUpdate(obj);
        }
    }
}
