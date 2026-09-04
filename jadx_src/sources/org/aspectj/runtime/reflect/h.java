package org.aspectj.runtime.reflect;

import java.util.Stack;
import zj.z;

/* JADX INFO: compiled from: JoinPointImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements org.aspectj.lang.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f137736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Object f137737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Object[] f137738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    org.aspectj.lang.c.b f137739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private org.aspectj.runtime.internal.a f137740r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Stack<org.aspectj.runtime.internal.a> f137741s = null;

    /* JADX INFO: compiled from: JoinPointImpl.java */
    public static class a extends b implements org.aspectj.lang.c.a {
        public a(int i10, String str, org.aspectj.lang.f fVar, z zVar) {
            super(i10, str, fVar, zVar);
        }
    }

    /* JADX INFO: compiled from: JoinPointImpl.java */
    public static class b implements org.aspectj.lang.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f137742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.aspectj.lang.f f137743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        z f137744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f137745d;

        public b(int i10, String str, org.aspectj.lang.f fVar, z zVar) {
            this.f137742a = str;
            this.f137743b = fVar;
            this.f137744c = zVar;
            this.f137745d = i10;
        }

        String a(n nVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nVar.d(b()));
            stringBuffer.append("(");
            stringBuffer.append(((l) h()).D(nVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // org.aspectj.lang.c.b
        public String b() {
            return this.f137742a;
        }

        @Override // org.aspectj.lang.c.b
        public final String d() {
            return a(n.f137765j);
        }

        @Override // org.aspectj.lang.c.b
        public final String f() {
            return a(n.f137767l);
        }

        @Override // org.aspectj.lang.c.b
        public z g() {
            return this.f137744c;
        }

        @Override // org.aspectj.lang.c.b
        public int getId() {
            return this.f137745d;
        }

        @Override // org.aspectj.lang.c.b
        public org.aspectj.lang.f h() {
            return this.f137743b;
        }

        @Override // org.aspectj.lang.c.b
        public final String toString() {
            return a(n.f137766k);
        }
    }

    public h(org.aspectj.lang.c.b bVar, Object obj, Object obj2, Object[] objArr) {
        this.f137739q = bVar;
        this.f137736n = obj;
        this.f137737o = obj2;
        this.f137738p = objArr;
    }

    @Override // org.aspectj.lang.e
    public Object a() throws Throwable {
        Stack<org.aspectj.runtime.internal.a> stack = this.f137741s;
        if (stack != null) {
            return stack.peek().g(this.f137741s.peek().c());
        }
        org.aspectj.runtime.internal.a aVar = this.f137740r;
        if (aVar == null) {
            return null;
        }
        return aVar.g(aVar.c());
    }

    @Override // org.aspectj.lang.c
    public String b() {
        return this.f137739q.b();
    }

    @Override // org.aspectj.lang.c
    public Object c() {
        return this.f137736n;
    }

    @Override // org.aspectj.lang.c
    public final String d() {
        return this.f137739q.d();
    }

    @Override // org.aspectj.lang.c
    public Object[] e() {
        if (this.f137738p == null) {
            this.f137738p = new Object[0];
        }
        Object[] objArr = this.f137738p;
        Object[] objArr2 = new Object[objArr.length];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    @Override // org.aspectj.lang.c
    public final String f() {
        return this.f137739q.f();
    }

    @Override // org.aspectj.lang.c
    public z g() {
        return this.f137739q.g();
    }

    @Override // org.aspectj.lang.c
    public Object getTarget() {
        return this.f137737o;
    }

    @Override // org.aspectj.lang.c
    public org.aspectj.lang.f h() {
        return this.f137739q.h();
    }

    @Override // org.aspectj.lang.e
    public void i(org.aspectj.runtime.internal.a aVar) {
        this.f137740r = aVar;
    }

    @Override // org.aspectj.lang.c
    public org.aspectj.lang.c.b j() {
        return this.f137739q;
    }

    @Override // org.aspectj.lang.e
    public Object k(Object[] objArr) throws Throwable {
        int i10;
        Stack<org.aspectj.runtime.internal.a> stack = this.f137741s;
        org.aspectj.runtime.internal.a aVarPeek = stack == null ? this.f137740r : stack.peek();
        if (aVarPeek == null) {
            return null;
        }
        int iA = aVarPeek.a();
        boolean z10 = (65536 & iA) != 0;
        int i11 = (iA & 4096) != 0 ? 1 : 0;
        int i12 = (iA & 256) != 0 ? 1 : 0;
        boolean z11 = (iA & 16) != 0;
        boolean z12 = (iA & 1) != 0;
        Object[] objArrC = aVarPeek.c();
        int i13 = i11 + 0 + ((!z11 || z10) ? 0 : 1);
        if (i11 == 0 || i12 == 0) {
            i10 = 0;
        } else {
            objArrC[0] = objArr[0];
            i10 = 1;
        }
        if (z11 && z12) {
            if (z10) {
                i10 = i12 + 1;
                objArrC[0] = objArr[i12];
            } else {
                char c10 = (i11 == 0 || i12 == 0) ? (char) 0 : (char) 1;
                int i14 = (i11 == 0 || i12 == 0) ? 0 : 1;
                int i15 = (z11 && z12 && !z10) ? 1 : 0;
                objArrC[i11] = objArr[c10];
                i10 = i14 + i15;
            }
        }
        for (int i16 = i10; i16 < objArr.length; i16++) {
            objArrC[(i16 - i10) + i13] = objArr[i16];
        }
        return aVarPeek.g(objArrC);
    }

    @Override // org.aspectj.lang.e
    public void l(org.aspectj.runtime.internal.a aVar) {
        if (this.f137741s == null) {
            this.f137741s = new Stack<>();
        }
        if (aVar == null) {
            this.f137741s.pop();
        } else {
            this.f137741s.push(aVar);
        }
    }

    @Override // org.aspectj.lang.c
    public final String toString() {
        return this.f137739q.toString();
    }
}
