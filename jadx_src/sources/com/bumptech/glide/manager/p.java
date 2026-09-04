package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: RequestTracker.java */
/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f41785d = "RequestTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f41786a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.e> f41787b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41788c;

    @j1
    void a(com.bumptech.glide.request.e eVar) {
        this.f41786a.add(eVar);
    }

    public boolean b(@p0 com.bumptech.glide.request.e eVar) {
        boolean z10 = true;
        if (eVar == null) {
            return true;
        }
        boolean zRemove = this.f41786a.remove(eVar);
        if (!this.f41787b.remove(eVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            eVar.clear();
        }
        return z10;
    }

    public void c() {
        Iterator it = com.bumptech.glide.util.o.l(this.f41786a).iterator();
        while (it.hasNext()) {
            b((com.bumptech.glide.request.e) it.next());
        }
        this.f41787b.clear();
    }

    public boolean d() {
        return this.f41788c;
    }

    public void e() {
        this.f41788c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f41786a)) {
            if (eVar.isRunning() || eVar.isComplete()) {
                eVar.clear();
                this.f41787b.add(eVar);
            }
        }
    }

    public void f() {
        this.f41788c = true;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f41786a)) {
            if (eVar.isRunning()) {
                eVar.pause();
                this.f41787b.add(eVar);
            }
        }
    }

    public void g() {
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f41786a)) {
            if (!eVar.isComplete() && !eVar.e()) {
                eVar.clear();
                if (this.f41788c) {
                    this.f41787b.add(eVar);
                } else {
                    eVar.h();
                }
            }
        }
    }

    public void h() {
        this.f41788c = false;
        for (com.bumptech.glide.request.e eVar : com.bumptech.glide.util.o.l(this.f41786a)) {
            if (!eVar.isComplete() && !eVar.isRunning()) {
                eVar.h();
            }
        }
        this.f41787b.clear();
    }

    public void i(@n0 com.bumptech.glide.request.e eVar) {
        this.f41786a.add(eVar);
        if (!this.f41788c) {
            eVar.h();
            return;
        }
        eVar.clear();
        if (Log.isLoggable(f41785d, 2)) {
            Log.v(f41785d, "Paused, delaying request");
        }
        this.f41787b.add(eVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f41786a.size() + ", isPaused=" + this.f41788c + z5.g.f141884d;
    }
}
