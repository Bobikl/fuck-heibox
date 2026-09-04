package com.elvishew.xlog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f42864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.elvishew.xlog.printer.c f42865b;

    /* JADX INFO: compiled from: Logger.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f42867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f42869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f42870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f42871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f42872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f42873h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f42874i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f42875j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private t7.b f42876k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private w7.b f42877l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private v7.b f42878m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private y7.b f42879n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private x7.b f42880o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private s7.a f42881p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Map<Class<?>, u7.c<?>> f42882q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<com.elvishew.xlog.interceptor.c> f42883r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private com.elvishew.xlog.printer.c f42884s;

        public a() {
            h.c();
        }

        public void A(String str, Throwable th2) {
            x().c(str, th2);
        }

        public void B(String str, Object... objArr) {
            x().d(str, objArr);
        }

        public void C(Object[] objArr) {
            x().e(objArr);
        }

        public a D() {
            this.f42874i = false;
            this.f42875j = true;
            return this;
        }

        public a E() {
            this.f42870e = false;
            this.f42871f = null;
            this.f42872g = 0;
            this.f42873h = true;
            return this;
        }

        public a F() {
            this.f42868c = false;
            this.f42869d = true;
            return this;
        }

        public void G(Object obj) {
            x().f(obj);
        }

        public void H(String str) {
            x().g(str);
        }

        public void I(String str, Throwable th2) {
            x().h(str, th2);
        }

        public void J(String str, Object... objArr) {
            x().i(str, objArr);
        }

        public void K(Object[] objArr) {
            x().j(objArr);
        }

        public a L() {
            this.f42874i = true;
            this.f42875j = true;
            return this;
        }

        public a M(int i10) {
            this.f42870e = true;
            this.f42872g = i10;
            this.f42873h = true;
            return this;
        }

        public a N(String str, int i10) {
            this.f42870e = true;
            this.f42871f = str;
            this.f42872g = i10;
            this.f42873h = true;
            return this;
        }

        public a O() {
            this.f42868c = true;
            this.f42869d = true;
            return this;
        }

        public void P(Object obj) {
            x().l(obj);
        }

        public void Q(String str) {
            x().m(str);
        }

        public void R(String str, Throwable th2) {
            x().n(str, th2);
        }

        public void S(String str, Object... objArr) {
            x().o(str, objArr);
        }

        public void T(Object[] objArr) {
            x().p(objArr);
        }

        public void U(String str) {
            x().q(str);
        }

        public a V(t7.b bVar) {
            this.f42876k = bVar;
            return this;
        }

        public void W(int i10, Object obj) {
            x().r(i10, obj);
        }

        public void X(int i10, String str) {
            x().s(i10, str);
        }

        public void Y(int i10, String str, Throwable th2) {
            x().t(i10, str, th2);
        }

        public void Z(int i10, String str, Object... objArr) {
            x().u(i10, str, objArr);
        }

        public void a0(int i10, Object[] objArr) {
            x().v(i10, objArr);
        }

        public a b0(int i10) {
            this.f42866a = i10;
            return this;
        }

        @Deprecated
        public a c0() {
            return D();
        }

        @Deprecated
        public a d0() {
            return E();
        }

        @Deprecated
        public a e0() {
            return F();
        }

        public a f0(com.elvishew.xlog.printer.c... cVarArr) {
            if (cVarArr.length == 0) {
                this.f42884s = null;
            } else if (cVarArr.length == 1) {
                this.f42884s = cVarArr[0];
            } else {
                this.f42884s = new com.elvishew.xlog.printer.d(cVarArr);
            }
            return this;
        }

        @Deprecated
        public a g0(int i10) {
            return M(i10);
        }

        @Deprecated
        public a h0(String str, int i10) {
            return N(str, i10);
        }

        public a i0(x7.b bVar) {
            this.f42880o = bVar;
            return this;
        }

        @Deprecated
        public a j0() {
            return O();
        }

        public a k0(String str) {
            this.f42867b = str;
            return this;
        }

        public a l0(y7.b bVar) {
            this.f42879n = bVar;
            return this;
        }

        public a m0(v7.b bVar) {
            this.f42878m = bVar;
            return this;
        }

        public void n0(Object obj) {
            x().C(obj);
        }

        public void o0(String str) {
            x().D(str);
        }

        public void p0(String str, Throwable th2) {
            x().E(str, th2);
        }

        public void q0(String str, Object... objArr) {
            x().F(str, objArr);
        }

        public void r0(Object[] objArr) {
            x().G(objArr);
        }

        public void s0(Object obj) {
            x().H(obj);
        }

        public a t(com.elvishew.xlog.interceptor.c cVar) {
            if (this.f42883r == null) {
                this.f42883r = new ArrayList();
            }
            this.f42883r.add(cVar);
            return this;
        }

        public void t0(String str) {
            x().I(str);
        }

        public <T> a u(Class<T> cls, u7.c<? super T> cVar) {
            if (this.f42882q == null) {
                this.f42882q = new HashMap(com.elvishew.xlog.internal.a.a());
            }
            this.f42882q.put(cls, cVar);
            return this;
        }

        public void u0(String str, Throwable th2) {
            x().J(str, th2);
        }

        @Deprecated
        public a v() {
            return L();
        }

        public void v0(String str, Object... objArr) {
            x().K(str, objArr);
        }

        public a w(s7.a aVar) {
            this.f42881p = aVar;
            return this;
        }

        public void w0(Object[] objArr) {
            x().L(objArr);
        }

        public f x() {
            return new f(this);
        }

        public void x0(String str) {
            x().M(str);
        }

        public void y(Object obj) {
            x().a(obj);
        }

        public a y0(w7.b bVar) {
            this.f42877l = bVar;
            return this;
        }

        public void z(String str) {
            x().b(str);
        }
    }

    f(b bVar, com.elvishew.xlog.printer.c cVar) {
        this.f42864a = bVar;
        this.f42865b = cVar;
    }

    f(a aVar) {
        b.a aVar2 = new b.a(h.f42903b);
        if (aVar.f42866a != 0) {
            aVar2.E(aVar.f42866a);
        }
        if (aVar.f42867b != null) {
            aVar2.N(aVar.f42867b);
        }
        if (aVar.f42869d) {
            if (aVar.f42868c) {
                aVar2.A();
            } else {
                aVar2.w();
            }
        }
        if (aVar.f42873h) {
            if (aVar.f42870e) {
                aVar2.z(aVar.f42871f, aVar.f42872g);
            } else {
                aVar2.v();
            }
        }
        if (aVar.f42875j) {
            if (aVar.f42874i) {
                aVar2.x();
            } else {
                aVar2.u();
            }
        }
        if (aVar.f42876k != null) {
            aVar2.D(aVar.f42876k);
        }
        if (aVar.f42877l != null) {
            aVar2.Q(aVar.f42877l);
        }
        if (aVar.f42878m != null) {
            aVar2.P(aVar.f42878m);
        }
        if (aVar.f42879n != null) {
            aVar2.O(aVar.f42879n);
        }
        if (aVar.f42880o != null) {
            aVar2.L(aVar.f42880o);
        }
        if (aVar.f42881p != null) {
            aVar2.s(aVar.f42881p);
        }
        if (aVar.f42882q != null) {
            aVar2.I(aVar.f42882q);
        }
        if (aVar.f42883r != null) {
            aVar2.C(aVar.f42883r);
        }
        this.f42864a = aVar2.t();
        if (aVar.f42884s != null) {
            this.f42865b = aVar.f42884s;
        } else {
            this.f42865b = h.f42904c;
        }
    }

    private void A(int i10, Object[] objArr) {
        if (i10 < this.f42864a.f42820a) {
            return;
        }
        B(i10, Arrays.deepToString(objArr));
    }

    private void B(int i10, String str) {
        String strA;
        String string;
        b bVar = this.f42864a;
        String str2 = bVar.f42821b;
        String strA2 = bVar.f42822c ? bVar.f42830k.a(Thread.currentThread()) : null;
        b bVar2 = this.f42864a;
        if (bVar2.f42823d) {
            x7.b bVar3 = bVar2.f42831l;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            b bVar4 = this.f42864a;
            strA = bVar3.a(a8.b.b(stackTrace, bVar4.f42824e, bVar4.f42825f));
        } else {
            strA = null;
        }
        if (this.f42864a.f42834o != null) {
            c cVar = new c(i10, str2, strA2, strA, str);
            for (com.elvishew.xlog.interceptor.c cVar2 : this.f42864a.f42834o) {
                cVar = cVar2.a(cVar);
                if (cVar == null) {
                    return;
                }
                if (cVar.f42853b == null || cVar.f42854c == null) {
                    com.elvishew.xlog.internal.b.e().c("Interceptor " + cVar2 + " should not remove the tag or message of a log, if you don't want to print this log, just return a null when intercept.");
                    return;
                }
            }
            i10 = cVar.f42852a;
            str2 = cVar.f42853b;
            strA2 = cVar.f42855d;
            strA = cVar.f42856e;
            str = cVar.f42854c;
        }
        com.elvishew.xlog.printer.c cVar3 = this.f42865b;
        b bVar5 = this.f42864a;
        if (bVar5.f42826g) {
            string = bVar5.f42832m.a(new String[]{strA2, strA, str});
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA2 != null ? strA2 + com.elvishew.xlog.internal.c.f42912a : "");
            sb2.append(strA != null ? strA + com.elvishew.xlog.internal.c.f42912a : "");
            sb2.append(str);
            string = sb2.toString();
        }
        cVar3.a(i10, str2, string);
    }

    private String k(String str, Object... objArr) {
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i10]);
        }
        return sb2.toString();
    }

    private <T> void w(int i10, T t10) {
        String strA;
        b bVar = this.f42864a;
        if (i10 < bVar.f42820a) {
            return;
        }
        if (t10 != null) {
            u7.c<? super T> cVarB = bVar.b(t10);
            strA = cVarB != null ? cVarB.a(t10) : t10.toString();
        } else {
            strA = "null";
        }
        B(i10, strA);
    }

    private void y(int i10, String str, Throwable th2) {
        String str2;
        if (i10 < this.f42864a.f42820a) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            str2 = str + com.elvishew.xlog.internal.c.f42912a;
        }
        sb2.append(str2);
        sb2.append(this.f42864a.f42829j.a(th2));
        B(i10, sb2.toString());
    }

    private void z(int i10, String str, Object... objArr) {
        if (i10 < this.f42864a.f42820a) {
            return;
        }
        B(i10, k(str, objArr));
    }

    public void C(Object obj) {
        w(2, obj);
    }

    public void D(String str) {
        x(2, str);
    }

    public void E(String str, Throwable th2) {
        y(2, str, th2);
    }

    public void F(String str, Object... objArr) {
        z(2, str, objArr);
    }

    public void G(Object[] objArr) {
        A(2, objArr);
    }

    public void H(Object obj) {
        w(5, obj);
    }

    public void I(String str) {
        x(5, str);
    }

    public void J(String str, Throwable th2) {
        y(5, str, th2);
    }

    public void K(String str, Object... objArr) {
        z(5, str, objArr);
    }

    public void L(Object[] objArr) {
        A(5, objArr);
    }

    public void M(String str) {
        b bVar = this.f42864a;
        if (3 < bVar.f42820a) {
            return;
        }
        B(3, bVar.f42828i.a(str));
    }

    public void a(Object obj) {
        w(3, obj);
    }

    public void b(String str) {
        x(3, str);
    }

    public void c(String str, Throwable th2) {
        y(3, str, th2);
    }

    public void d(String str, Object... objArr) {
        z(3, str, objArr);
    }

    public void e(Object[] objArr) {
        A(3, objArr);
    }

    public void f(Object obj) {
        w(6, obj);
    }

    public void g(String str) {
        x(6, str);
    }

    public void h(String str, Throwable th2) {
        y(6, str, th2);
    }

    public void i(String str, Object... objArr) {
        z(6, str, objArr);
    }

    public void j(Object[] objArr) {
        A(6, objArr);
    }

    public void l(Object obj) {
        w(4, obj);
    }

    public void m(String str) {
        x(4, str);
    }

    public void n(String str, Throwable th2) {
        y(4, str, th2);
    }

    public void o(String str, Object... objArr) {
        z(4, str, objArr);
    }

    public void p(Object[] objArr) {
        A(4, objArr);
    }

    public void q(String str) {
        b bVar = this.f42864a;
        if (3 < bVar.f42820a) {
            return;
        }
        B(3, bVar.f42827h.a(str));
    }

    public void r(int i10, Object obj) {
        w(i10, obj);
    }

    public void s(int i10, String str) {
        x(i10, str);
    }

    public void t(int i10, String str, Throwable th2) {
        y(i10, str, th2);
    }

    public void u(int i10, String str, Object... objArr) {
        z(i10, str, objArr);
    }

    public void v(int i10, Object[] objArr) {
        A(i10, objArr);
    }

    void x(int i10, String str) {
        if (i10 < this.f42864a.f42820a) {
            return;
        }
        if (str == null) {
            str = "";
        }
        B(i10, str);
    }
}
