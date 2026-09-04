package com.elvishew.xlog;

/* JADX INFO: compiled from: XLog.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f42902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static b f42903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static com.elvishew.xlog.printer.c f42904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f42905d;

    /* JADX INFO: compiled from: XLog.java */
    public static class a {
        public static void a(String str, String str2) {
            h.Z(str).x().b(str2);
        }

        public static void b(String str, String str2, Throwable th2) {
            h.Z(str).x().c(str2, th2);
        }

        public static void c(String str, String str2) {
            h.Z(str).x().g(str2);
        }

        public static void d(String str, String str2, Throwable th2) {
            h.Z(str).x().h(str2, th2);
        }

        public static String e(Throwable th2) {
            return a8.b.d(th2);
        }

        public static void f(String str, String str2) {
            h.Z(str).x().m(str2);
        }

        public static void g(String str, String str2, Throwable th2) {
            h.Z(str).x().n(str2, th2);
        }

        public static boolean h(String str, int i10) {
            return h.f42903b.c(i10);
        }

        public static void i(int i10, String str, String str2) {
            h.Z(str).x().x(i10, str2);
        }

        public static void j(String str, String str2) {
            h.Z(str).x().D(str2);
        }

        public static void k(String str, String str2, Throwable th2) {
            h.Z(str).x().E(str2, th2);
        }

        public static void l(String str, String str2) {
            h.Z(str).x().I(str2);
        }

        public static void m(String str, String str2, Throwable th2) {
            h.Z(str).x().J(str2, th2);
        }

        public static void n(String str, Throwable th2) {
            h.Z(str).x().J("", th2);
        }

        public static void o(String str, String str2) {
            c(str, str2);
        }

        public static void p(String str, String str2, Throwable th2) {
            d(str, str2, th2);
        }

        public static void q(String str, Throwable th2) {
            p(str, "", th2);
        }
    }

    private h() {
    }

    public static void A(Object[] objArr) {
        c();
        f42902a.p(objArr);
    }

    public static void B() {
        H(new b.a().t(), com.elvishew.xlog.internal.a.i());
    }

    public static void C(int i10) {
        H(new b.a().E(i10).t(), com.elvishew.xlog.internal.a.i());
    }

    @Deprecated
    public static void D(int i10, b bVar) {
        G(new b.a(bVar).E(i10).t());
    }

    @Deprecated
    public static void E(int i10, b bVar, com.elvishew.xlog.printer.c... cVarArr) {
        H(new b.a(bVar).E(i10).t(), cVarArr);
    }

    public static void F(int i10, com.elvishew.xlog.printer.c... cVarArr) {
        H(new b.a().E(i10).t(), cVarArr);
    }

    public static void G(b bVar) {
        H(bVar, com.elvishew.xlog.internal.a.i());
    }

    public static void H(b bVar, com.elvishew.xlog.printer.c... cVarArr) {
        if (f42905d) {
            com.elvishew.xlog.internal.b.e().g("XLog is already initialized, do not initialize again");
        }
        f42905d = true;
        if (bVar == null) {
            throw new IllegalArgumentException("Please specify a LogConfiguration");
        }
        f42903b = bVar;
        com.elvishew.xlog.printer.d dVar = new com.elvishew.xlog.printer.d(cVarArr);
        f42904c = dVar;
        f42902a = new f(f42903b, dVar);
    }

    public static void I(com.elvishew.xlog.printer.c... cVarArr) {
        H(new b.a().t(), cVarArr);
    }

    public static void J(String str) {
        c();
        f42902a.q(str);
    }

    public static f.a K(t7.b bVar) {
        return new f.a().V(bVar);
    }

    public static void L(int i10, Object obj) {
        c();
        f42902a.r(i10, obj);
    }

    public static void M(int i10, String str) {
        c();
        f42902a.s(i10, str);
    }

    public static void N(int i10, String str, Throwable th2) {
        c();
        f42902a.t(i10, str, th2);
    }

    public static void O(int i10, String str, Object... objArr) {
        c();
        f42902a.u(i10, str, objArr);
    }

    public static void P(int i10, Object[] objArr) {
        c();
        f42902a.v(i10, objArr);
    }

    public static f.a Q(int i10) {
        return new f.a().b0(i10);
    }

    @Deprecated
    public static f.a R() {
        return k();
    }

    @Deprecated
    public static f.a S() {
        return l();
    }

    @Deprecated
    public static f.a T() {
        return m();
    }

    public static f.a U(com.elvishew.xlog.printer.c... cVarArr) {
        return new f.a().f0(cVarArr);
    }

    @Deprecated
    public static f.a V(int i10) {
        return t(i10);
    }

    @Deprecated
    public static f.a W(String str, int i10) {
        return u(str, i10);
    }

    public static f.a X(x7.b bVar) {
        return new f.a().i0(bVar);
    }

    @Deprecated
    public static f.a Y() {
        return v();
    }

    public static f.a Z(String str) {
        return new f.a().k0(str);
    }

    public static f.a a(com.elvishew.xlog.interceptor.c cVar) {
        return new f.a().t(cVar);
    }

    public static f.a a0(y7.b bVar) {
        return new f.a().l0(bVar);
    }

    public static <T> f.a b(Class<T> cls, u7.c<? super T> cVar) {
        return new f.a().u(cls, cVar);
    }

    public static f.a b0(v7.b bVar) {
        return new f.a().m0(bVar);
    }

    static void c() {
        if (!f42905d) {
            throw new IllegalStateException("Do you forget to initialize XLog?");
        }
    }

    public static void c0(Object obj) {
        c();
        f42902a.C(obj);
    }

    @Deprecated
    public static f.a d() {
        return s();
    }

    public static void d0(String str) {
        c();
        f42902a.D(str);
    }

    public static f.a e(s7.a aVar) {
        return new f.a().w(aVar);
    }

    public static void e0(String str, Throwable th2) {
        c();
        f42902a.E(str, th2);
    }

    public static void f(Object obj) {
        c();
        f42902a.a(obj);
    }

    public static void f0(String str, Object... objArr) {
        c();
        f42902a.F(str, objArr);
    }

    public static void g(String str) {
        c();
        f42902a.b(str);
    }

    public static void g0(Object[] objArr) {
        c();
        f42902a.G(objArr);
    }

    public static void h(String str, Throwable th2) {
        c();
        f42902a.c(str, th2);
    }

    public static void h0(Object obj) {
        c();
        f42902a.H(obj);
    }

    public static void i(String str, Object... objArr) {
        c();
        f42902a.d(str, objArr);
    }

    public static void i0(String str) {
        c();
        f42902a.I(str);
    }

    public static void j(Object[] objArr) {
        c();
        f42902a.e(objArr);
    }

    public static void j0(String str, Throwable th2) {
        c();
        f42902a.J(str, th2);
    }

    public static f.a k() {
        return new f.a().D();
    }

    public static void k0(String str, Object... objArr) {
        c();
        f42902a.K(str, objArr);
    }

    public static f.a l() {
        return new f.a().E();
    }

    public static void l0(Object[] objArr) {
        c();
        f42902a.L(objArr);
    }

    public static f.a m() {
        return new f.a().F();
    }

    public static void m0(String str) {
        c();
        f42902a.M(str);
    }

    public static void n(Object obj) {
        c();
        f42902a.f(obj);
    }

    public static f.a n0(w7.b bVar) {
        return new f.a().y0(bVar);
    }

    public static void o(String str) {
        c();
        f42902a.g(str);
    }

    public static void p(String str, Throwable th2) {
        c();
        f42902a.h(str, th2);
    }

    public static void q(String str, Object... objArr) {
        c();
        f42902a.i(str, objArr);
    }

    public static void r(Object[] objArr) {
        c();
        f42902a.j(objArr);
    }

    public static f.a s() {
        return new f.a().L();
    }

    public static f.a t(int i10) {
        return new f.a().M(i10);
    }

    public static f.a u(String str, int i10) {
        return new f.a().N(str, i10);
    }

    public static f.a v() {
        return new f.a().O();
    }

    public static void w(Object obj) {
        c();
        f42902a.l(obj);
    }

    public static void x(String str) {
        c();
        f42902a.m(str);
    }

    public static void y(String str, Throwable th2) {
        c();
        f42902a.n(str, th2);
    }

    public static void z(String str, Object... objArr) {
        c();
        f42902a.o(str, objArr);
    }
}
