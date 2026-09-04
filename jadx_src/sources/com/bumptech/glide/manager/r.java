package com.bumptech.glide.manager;

import androidx.annotation.n0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: TargetTracker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class r implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.p<?>> f41789b = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f41789b.clear();
    }

    @n0
    public List<com.bumptech.glide.request.target.p<?>> b() {
        return com.bumptech.glide.util.o.l(this.f41789b);
    }

    public void c(@n0 com.bumptech.glide.request.target.p<?> pVar) {
        this.f41789b.add(pVar);
    }

    public void d(@n0 com.bumptech.glide.request.target.p<?> pVar) {
        this.f41789b.remove(pVar);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
        Iterator it = com.bumptech.glide.util.o.l(this.f41789b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        Iterator it = com.bumptech.glide.util.o.l(this.f41789b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
        Iterator it = com.bumptech.glide.util.o.l(this.f41789b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.p) it.next()).onStop();
        }
    }
}
