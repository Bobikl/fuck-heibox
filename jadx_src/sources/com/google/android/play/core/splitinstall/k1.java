package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.splitinstall.internal.n1;
import com.google.android.play.core.splitinstall.internal.p1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class k1 extends n1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private static k1 f56348j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f56349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u0 f56350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f56351i;

    @androidx.annotation.j1
    public k1(Context context, u0 u0Var) {
        super(new p1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f56349g = new Handler(Looper.getMainLooper());
        this.f56351i = new LinkedHashSet();
        this.f56350h = u0Var;
    }

    public static synchronized k1 h(Context context) {
        if (f56348j == null) {
            f56348j = new k1(context, zzo.INSTANCE);
        }
        return f56348j;
    }

    @Override // com.google.android.play.core.splitinstall.internal.n1
    protected final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        f fVarN = f.n(bundleExtra);
        this.f56310a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", fVarN);
        v0 v0VarZza = this.f56350h.zza();
        if (fVarN.i() != 3 || v0VarZza == null) {
            l(fVarN);
        } else {
            v0VarZza.a(fVarN.m(), new i1(this, fVarN, intent, context));
        }
    }

    final synchronized void j(g gVar) {
        this.f56351i.add(gVar);
    }

    final synchronized void k(g gVar) {
        this.f56351i.remove(gVar);
    }

    public final synchronized void l(f fVar) {
        Iterator it = new LinkedHashSet(this.f56351i).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStateUpdate(fVar);
        }
        super.e(fVar);
    }
}
