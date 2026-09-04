package com.google.common.eventbus;

import androidx.core.app.o0;
import com.google.common.base.q;
import com.google.common.base.w;

/* JADX INFO: compiled from: DeadEvent.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f58272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58273b;

    public c(Object obj, Object obj2) {
        this.f58272a = w.E(obj);
        this.f58273b = w.E(obj2);
    }

    public Object a() {
        return this.f58273b;
    }

    public Object b() {
        return this.f58272a;
    }

    public String toString() {
        return q.c(this).f("source", this.f58272a).f(o0.I0, this.f58273b).toString();
    }
}
