package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52775a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    private Queue f52776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f52777c;

    l0() {
    }

    public final void a(@androidx.annotation.n0 k0 k0Var) {
        synchronized (this.f52775a) {
            if (this.f52776b == null) {
                this.f52776b = new ArrayDeque();
            }
            this.f52776b.add(k0Var);
        }
    }

    public final void b(@androidx.annotation.n0 k kVar) {
        k0 k0Var;
        synchronized (this.f52775a) {
            if (this.f52776b != null && !this.f52777c) {
                this.f52777c = true;
                while (true) {
                    synchronized (this.f52775a) {
                        k0Var = (k0) this.f52776b.poll();
                        if (k0Var == null) {
                            this.f52777c = false;
                            return;
                        }
                    }
                    k0Var.a(kVar);
                }
            }
        }
    }
}
