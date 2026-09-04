package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h0;
import androidx.lifecycle.o;
import androidx.lifecycle.y;

/* JADX INFO: loaded from: classes4.dex */
public class LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final LifecycleEventsObservable.ArchLifecycleObserver f104074a;

    LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter(LifecycleEventsObservable.ArchLifecycleObserver archLifecycleObserver) {
        this.f104074a = archLifecycleObserver;
    }

    @Override // androidx.lifecycle.o
    public void a(y yVar, Lifecycle.Event event, boolean z10, h0 h0Var) {
        boolean z11 = h0Var != null;
        if (z10) {
            if (!z11 || h0Var.a("onStateChange", 4)) {
                this.f104074a.onStateChange(yVar, event);
            }
        }
    }
}
