package com.bumptech.glide.manager;

import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k0;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class LifecycleLifecycle implements j, x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Set<k> f41731b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final Lifecycle f41732c;

    LifecycleLifecycle(Lifecycle lifecycle) {
        this.f41732c = lifecycle;
        lifecycle.a(this);
    }

    @Override // com.bumptech.glide.manager.j
    public void b(@n0 k kVar) {
        this.f41731b.remove(kVar);
    }

    @Override // com.bumptech.glide.manager.j
    public void c(@n0 k kVar) {
        this.f41731b.add(kVar);
        if (this.f41732c.b() == Lifecycle.State.DESTROYED) {
            kVar.onDestroy();
        } else if (this.f41732c.b().isAtLeast(Lifecycle.State.STARTED)) {
            kVar.onStart();
        } else {
            kVar.onStop();
        }
    }

    @k0(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@n0 y yVar) {
        Iterator it = com.bumptech.glide.util.o.l(this.f41731b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
        yVar.getLifecycle().d(this);
    }

    @k0(Lifecycle.Event.ON_START)
    public void onStart(@n0 y yVar) {
        Iterator it = com.bumptech.glide.util.o.l(this.f41731b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @k0(Lifecycle.Event.ON_STOP)
    public void onStop(@n0 y yVar) {
        Iterator it = com.bumptech.glide.util.o.l(this.f41731b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }
}
