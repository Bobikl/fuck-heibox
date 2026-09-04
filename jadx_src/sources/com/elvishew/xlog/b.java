package com.elvishew.xlog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LogConfiguration.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f42824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t7.b f42827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w7.b f42828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v7.b f42829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y7.b f42830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x7.b f42831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s7.a f42832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<Class<?>, u7.c<?>> f42833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<com.elvishew.xlog.interceptor.c> f42834o;

    /* JADX INFO: compiled from: LogConfiguration.java */
    public static class a {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f42835p = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f42836q = "X-LOG";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f42838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f42840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f42841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f42842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f42843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private t7.b f42844h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w7.b f42845i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private v7.b f42846j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private y7.b f42847k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private x7.b f42848l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private s7.a f42849m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Map<Class<?>, u7.c<?>> f42850n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private List<com.elvishew.xlog.interceptor.c> f42851o;

        public a() {
            this.f42837a = Integer.MIN_VALUE;
            this.f42838b = f42836q;
        }

        public a(b bVar) {
            this.f42837a = Integer.MIN_VALUE;
            this.f42838b = f42836q;
            this.f42837a = bVar.f42820a;
            this.f42838b = bVar.f42821b;
            this.f42839c = bVar.f42822c;
            this.f42840d = bVar.f42823d;
            this.f42841e = bVar.f42824e;
            this.f42842f = bVar.f42825f;
            this.f42843g = bVar.f42826g;
            this.f42844h = bVar.f42827h;
            this.f42845i = bVar.f42828i;
            this.f42846j = bVar.f42829j;
            this.f42847k = bVar.f42830k;
            this.f42848l = bVar.f42831l;
            this.f42849m = bVar.f42832m;
            if (bVar.f42833n != null) {
                this.f42850n = new HashMap(bVar.f42833n);
            }
            if (bVar.f42834o != null) {
                this.f42851o = new ArrayList(bVar.f42834o);
            }
        }

        private void B() {
            if (this.f42844h == null) {
                this.f42844h = com.elvishew.xlog.internal.a.h();
            }
            if (this.f42845i == null) {
                this.f42845i = com.elvishew.xlog.internal.a.m();
            }
            if (this.f42846j == null) {
                this.f42846j = com.elvishew.xlog.internal.a.l();
            }
            if (this.f42847k == null) {
                this.f42847k = com.elvishew.xlog.internal.a.k();
            }
            if (this.f42848l == null) {
                this.f42848l = com.elvishew.xlog.internal.a.j();
            }
            if (this.f42849m == null) {
                this.f42849m = com.elvishew.xlog.internal.a.c();
            }
            if (this.f42850n == null) {
                this.f42850n = new HashMap(com.elvishew.xlog.internal.a.a());
            }
        }

        public a A() {
            this.f42839c = true;
            return this;
        }

        a C(List<com.elvishew.xlog.interceptor.c> list) {
            this.f42851o = list;
            return this;
        }

        public a D(t7.b bVar) {
            this.f42844h = bVar;
            return this;
        }

        public a E(int i10) {
            this.f42837a = i10;
            return this;
        }

        public a F() {
            return u();
        }

        public a G() {
            return v();
        }

        public a H() {
            return w();
        }

        a I(Map<Class<?>, u7.c<?>> map) {
            this.f42850n = map;
            return this;
        }

        public a J(int i10) {
            y(i10);
            return this;
        }

        public a K(String str, int i10) {
            return z(str, i10);
        }

        public a L(x7.b bVar) {
            this.f42848l = bVar;
            return this;
        }

        public a M() {
            return A();
        }

        public a N(String str) {
            this.f42838b = str;
            return this;
        }

        public a O(y7.b bVar) {
            this.f42847k = bVar;
            return this;
        }

        public a P(v7.b bVar) {
            this.f42846j = bVar;
            return this;
        }

        public a Q(w7.b bVar) {
            this.f42845i = bVar;
            return this;
        }

        public a p(com.elvishew.xlog.interceptor.c cVar) {
            if (this.f42851o == null) {
                this.f42851o = new ArrayList();
            }
            this.f42851o.add(cVar);
            return this;
        }

        public <T> a q(Class<T> cls, u7.c<? super T> cVar) {
            if (this.f42850n == null) {
                this.f42850n = new HashMap(com.elvishew.xlog.internal.a.a());
            }
            this.f42850n.put(cls, cVar);
            return this;
        }

        public a r() {
            return x();
        }

        public a s(s7.a aVar) {
            this.f42849m = aVar;
            return this;
        }

        public b t() {
            B();
            return new b(this);
        }

        public a u() {
            this.f42843g = false;
            return this;
        }

        public a v() {
            this.f42840d = false;
            this.f42841e = null;
            this.f42842f = 0;
            return this;
        }

        public a w() {
            this.f42839c = false;
            return this;
        }

        public a x() {
            this.f42843g = true;
            return this;
        }

        public a y(int i10) {
            z(null, i10);
            return this;
        }

        public a z(String str, int i10) {
            this.f42840d = true;
            this.f42841e = str;
            this.f42842f = i10;
            return this;
        }
    }

    b(a aVar) {
        this.f42820a = aVar.f42837a;
        this.f42821b = aVar.f42838b;
        this.f42822c = aVar.f42839c;
        this.f42823d = aVar.f42840d;
        this.f42824e = aVar.f42841e;
        this.f42825f = aVar.f42842f;
        this.f42826g = aVar.f42843g;
        this.f42827h = aVar.f42844h;
        this.f42828i = aVar.f42845i;
        this.f42829j = aVar.f42846j;
        this.f42830k = aVar.f42847k;
        this.f42831l = aVar.f42848l;
        this.f42832m = aVar.f42849m;
        this.f42833n = aVar.f42850n;
        this.f42834o = aVar.f42851o;
    }

    public <T> u7.c<? super T> b(T t10) {
        u7.c<? super T> cVar;
        if (this.f42833n == null) {
            return null;
        }
        Class<?> superclass = t10.getClass();
        do {
            cVar = (u7.c) this.f42833n.get(superclass);
            superclass = superclass.getSuperclass();
            if (cVar != null) {
                break;
            }
        } while (superclass != null);
        return cVar;
    }

    boolean c(int i10) {
        return i10 >= this.f42820a;
    }
}
