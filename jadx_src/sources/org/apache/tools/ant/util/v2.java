package org.apache.tools.ant.util;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: WeakishReference.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Object> f136968a;

    /* JADX INFO: compiled from: WeakishReference.java */
    public static class a extends v2 {
        public a(Object obj) {
            super(obj);
        }
    }

    v2(Object obj) {
        this.f136968a = new WeakReference<>(obj);
    }

    public static v2 a(Object obj) {
        return new v2(obj);
    }

    public Object b() {
        return this.f136968a.get();
    }
}
