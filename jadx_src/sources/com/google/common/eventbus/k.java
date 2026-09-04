package com.google.common.eventbus;

import com.google.common.base.w;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: SubscriberExceptionContext.java */
/* JADX INFO: loaded from: classes7.dex */
@e
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f58295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f58296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f58297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f58298d;

    k(f fVar, Object obj, Object obj2, Method method) {
        this.f58295a = (f) w.E(fVar);
        this.f58296b = w.E(obj);
        this.f58297c = w.E(obj2);
        this.f58298d = (Method) w.E(method);
    }

    public Object a() {
        return this.f58296b;
    }

    public f b() {
        return this.f58295a;
    }

    public Object c() {
        return this.f58297c;
    }

    public Method d() {
        return this.f58298d;
    }
}
