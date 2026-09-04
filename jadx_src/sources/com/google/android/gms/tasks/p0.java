package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends LifecycleCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f52784b;

    private p0(com.google.android.gms.common.api.internal.d dVar) {
        super(dVar);
        this.f52784b = new ArrayList();
        this.f52370a.K1("TaskOnStopCallback", this);
    }

    public static p0 m(Activity activity) {
        com.google.android.gms.common.api.internal.d dVarC = LifecycleCallback.c(activity);
        p0 p0Var = (p0) dVarC.V("TaskOnStopCallback", p0.class);
        return p0Var == null ? new p0(dVarC) : p0Var;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @androidx.annotation.k0
    public final void l() {
        synchronized (this.f52784b) {
            Iterator it = this.f52784b.iterator();
            while (it.hasNext()) {
                k0 k0Var = (k0) ((WeakReference) it.next()).get();
                if (k0Var != null) {
                    k0Var.y();
                }
            }
            this.f52784b.clear();
        }
    }

    public final void n(k0 k0Var) {
        synchronized (this.f52784b) {
            this.f52784b.add(new WeakReference(k0Var));
        }
    }
}
