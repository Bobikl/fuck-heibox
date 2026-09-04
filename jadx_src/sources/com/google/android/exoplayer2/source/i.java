package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ConcatenatingMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends com.google.android.exoplayer2.source.e<e> {
    private static final int A = 4;
    private static final int B = 5;
    private static final i2 C = new i2.c().K(Uri.EMPTY).a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f48423w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f48424x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f48425y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f48426z = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final List<e> f48427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Set<d> f48428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private Handler f48429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<e> f48430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final IdentityHashMap<c0, e> f48431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map<Object, e> f48432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set<e> f48433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f48434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f48435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f48436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Set<d> f48437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f1 f48438v;

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class b extends com.google.android.exoplayer2.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f48439j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f48440k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int[] f48441l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int[] f48442m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final z3[] f48443n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Object[] f48444o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final HashMap<Object, Integer> f48445p;

        public b(Collection<e> collection, f1 f1Var, boolean z10) {
            super(z10, f1Var);
            int size = collection.size();
            this.f48441l = new int[size];
            this.f48442m = new int[size];
            this.f48443n = new z3[size];
            this.f48444o = new Object[size];
            this.f48445p = new HashMap<>();
            int iW = 0;
            int iN = 0;
            int i10 = 0;
            for (e eVar : collection) {
                this.f48443n[i10] = eVar.f48448a.d0();
                this.f48442m[i10] = iW;
                this.f48441l[i10] = iN;
                iW += this.f48443n[i10].w();
                iN += this.f48443n[i10].n();
                Object[] objArr = this.f48444o;
                Object obj = eVar.f48449b;
                objArr[i10] = obj;
                this.f48445p.put(obj, Integer.valueOf(i10));
                i10++;
            }
            this.f48439j = iW;
            this.f48440k = iN;
        }

        @Override // com.google.android.exoplayer2.a
        protected int B(Object obj) {
            Integer num = this.f48445p.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.a
        protected int C(int i10) {
            return com.google.android.exoplayer2.util.u0.i(this.f48441l, i10 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.a
        protected int D(int i10) {
            return com.google.android.exoplayer2.util.u0.i(this.f48442m, i10 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.a
        protected Object G(int i10) {
            return this.f48444o[i10];
        }

        @Override // com.google.android.exoplayer2.a
        protected int I(int i10) {
            return this.f48441l[i10];
        }

        @Override // com.google.android.exoplayer2.a
        protected int J(int i10) {
            return this.f48442m[i10];
        }

        @Override // com.google.android.exoplayer2.a
        protected z3 M(int i10) {
            return this.f48443n[i10];
        }

        @Override // com.google.android.exoplayer2.z3
        public int n() {
            return this.f48440k;
        }

        @Override // com.google.android.exoplayer2.z3
        public int w() {
            return this.f48439j;
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class c extends com.google.android.exoplayer2.source.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.a
        protected void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        }

        @Override // com.google.android.exoplayer2.source.a
        protected void F() {
        }

        @Override // com.google.android.exoplayer2.source.f0
        public i2 c() {
            return i.C;
        }

        @Override // com.google.android.exoplayer2.source.f0
        public void f() {
        }

        @Override // com.google.android.exoplayer2.source.f0
        public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.f0
        public void k(c0 c0Var) {
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f48446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f48447b;

        public d(Handler handler, Runnable runnable) {
            this.f48446a = handler;
            this.f48447b = runnable;
        }

        public void a() {
            this.f48446a.post(this.f48447b);
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f48448a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f48453f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<f0.a> f48450c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f48449b = new Object();

        public e(f0 f0Var, boolean z10) {
            this.f48448a = new x(f0Var, z10);
        }

        public void a(int i10, int i11) {
            this.f48451d = i10;
            this.f48452e = i11;
            this.f48453f = false;
            this.f48450c.clear();
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f48455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public final d f48456c;

        public f(int i10, T t10, @androidx.annotation.p0 d dVar) {
            this.f48454a = i10;
            this.f48455b = t10;
            this.f48456c = dVar;
        }
    }

    public i(boolean z10, f1 f1Var, f0... f0VarArr) {
        this(z10, false, f1Var, f0VarArr);
    }

    public i(boolean z10, boolean z11, f1 f1Var, f0... f0VarArr) {
        for (f0 f0Var : f0VarArr) {
            com.google.android.exoplayer2.util.a.g(f0Var);
        }
        this.f48438v = f1Var.getLength() > 0 ? f1Var.d() : f1Var;
        this.f48431o = new IdentityHashMap<>();
        this.f48432p = new HashMap();
        this.f48427k = new ArrayList();
        this.f48430n = new ArrayList();
        this.f48437u = new HashSet();
        this.f48428l = new HashSet();
        this.f48433q = new HashSet();
        this.f48434r = z10;
        this.f48435s = z11;
        i0(Arrays.asList(f0VarArr));
    }

    public i(boolean z10, f0... f0VarArr) {
        this(z10, new f1.a(0), f0VarArr);
    }

    public i(f0... f0VarArr) {
        this(false, f0VarArr);
    }

    private static Object A0(e eVar, Object obj) {
        return com.google.android.exoplayer2.a.H(eVar.f48449b, obj);
    }

    private Handler B0() {
        return (Handler) com.google.android.exoplayer2.util.a.g(this.f48429m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean E0(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f fVar = (f) com.google.android.exoplayer2.util.u0.k(message.obj);
            this.f48438v = this.f48438v.g(fVar.f48454a, ((Collection) fVar.f48455b).size());
            l0(fVar.f48454a, (Collection) fVar.f48455b);
            S0(fVar.f48456c);
        } else if (i10 == 1) {
            f fVar2 = (f) com.google.android.exoplayer2.util.u0.k(message.obj);
            int i11 = fVar2.f48454a;
            int iIntValue = ((Integer) fVar2.f48455b).intValue();
            if (i11 == 0 && iIntValue == this.f48438v.getLength()) {
                this.f48438v = this.f48438v.d();
            } else {
                this.f48438v = this.f48438v.f(i11, iIntValue);
            }
            for (int i12 = iIntValue - 1; i12 >= i11; i12--) {
                N0(i12);
            }
            S0(fVar2.f48456c);
        } else if (i10 == 2) {
            f fVar3 = (f) com.google.android.exoplayer2.util.u0.k(message.obj);
            f1 f1Var = this.f48438v;
            int i13 = fVar3.f48454a;
            f1 f1VarF = f1Var.f(i13, i13 + 1);
            this.f48438v = f1VarF;
            this.f48438v = f1VarF.g(((Integer) fVar3.f48455b).intValue(), 1);
            I0(fVar3.f48454a, ((Integer) fVar3.f48455b).intValue());
            S0(fVar3.f48456c);
        } else if (i10 == 3) {
            f fVar4 = (f) com.google.android.exoplayer2.util.u0.k(message.obj);
            this.f48438v = (f1) fVar4.f48455b;
            S0(fVar4.f48456c);
        } else if (i10 == 4) {
            X0();
        } else {
            if (i10 != 5) {
                throw new IllegalStateException();
            }
            u0((Set) com.google.android.exoplayer2.util.u0.k(message.obj));
        }
        return true;
    }

    private void F0(e eVar) {
        if (eVar.f48453f && eVar.f48450c.isEmpty()) {
            this.f48433q.remove(eVar);
            X(eVar);
        }
    }

    private void I0(int i10, int i11) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iW = this.f48430n.get(iMin).f48452e;
        List<e> list = this.f48430n;
        list.add(i11, list.remove(i10));
        while (iMin <= iMax) {
            e eVar = this.f48430n.get(iMin);
            eVar.f48451d = iMin;
            eVar.f48452e = iW;
            iW += eVar.f48448a.d0().w();
            iMin++;
        }
    }

    @androidx.annotation.b0("this")
    private void J0(int i10, int i11, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        com.google.android.exoplayer2.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f48429m;
        List<e> list = this.f48427k;
        list.add(i11, list.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i10, Integer.valueOf(i11), s0(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void N0(int i10) {
        e eVarRemove = this.f48430n.remove(i10);
        this.f48432p.remove(eVarRemove.f48449b);
        p0(i10, -1, -eVarRemove.f48448a.d0().w());
        eVarRemove.f48453f = true;
        F0(eVarRemove);
    }

    @androidx.annotation.b0("this")
    private void Q0(int i10, int i11, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        com.google.android.exoplayer2.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f48429m;
        com.google.android.exoplayer2.util.u0.h1(this.f48427k, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i10, Integer.valueOf(i11), s0(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void R0() {
        S0(null);
    }

    private void S0(@androidx.annotation.p0 d dVar) {
        if (!this.f48436t) {
            B0().obtainMessage(4).sendToTarget();
            this.f48436t = true;
        }
        if (dVar != null) {
            this.f48437u.add(dVar);
        }
    }

    @androidx.annotation.b0("this")
    private void T0(f1 f1Var, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        com.google.android.exoplayer2.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f48429m;
        if (handler2 != null) {
            int iC0 = C0();
            if (f1Var.getLength() != iC0) {
                f1Var = f1Var.d().g(0, iC0);
            }
            handler2.obtainMessage(3, new f(0, f1Var, s0(handler, runnable))).sendToTarget();
            return;
        }
        if (f1Var.getLength() > 0) {
            f1Var = f1Var.d();
        }
        this.f48438v = f1Var;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void W0(e eVar, z3 z3Var) {
        if (eVar.f48451d + 1 < this.f48430n.size()) {
            int iW = z3Var.w() - (this.f48430n.get(eVar.f48451d + 1).f48452e - eVar.f48452e);
            if (iW != 0) {
                p0(eVar.f48451d + 1, 0, iW);
            }
        }
        R0();
    }

    private void X0() {
        this.f48436t = false;
        Set<d> set = this.f48437u;
        this.f48437u = new HashSet();
        E(new b(this.f48430n, this.f48438v, this.f48434r));
        B0().obtainMessage(5, set).sendToTarget();
    }

    private void f0(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f48430n.get(i10 - 1);
            eVar.a(i10, eVar2.f48452e + eVar2.f48448a.d0().w());
        } else {
            eVar.a(i10, 0);
        }
        p0(i10, 1, eVar.f48448a.d0().w());
        this.f48430n.add(i10, eVar);
        this.f48432p.put(eVar.f48449b, eVar);
        V(eVar, eVar.f48448a);
        if (C() && this.f48431o.isEmpty()) {
            this.f48433q.add(eVar);
        } else {
            I(eVar);
        }
    }

    private void l0(int i10, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            f0(i10, it.next());
            i10++;
        }
    }

    @androidx.annotation.b0("this")
    private void m0(int i10, Collection<f0> collection, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        com.google.android.exoplayer2.util.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f48429m;
        Iterator<f0> it = collection.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.util.a.g(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<f0> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f48435s));
        }
        this.f48427k.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i10, arrayList, s0(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void p0(int i10, int i11, int i12) {
        while (i10 < this.f48430n.size()) {
            e eVar = this.f48430n.get(i10);
            eVar.f48451d += i11;
            eVar.f48452e += i12;
            i10++;
        }
    }

    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private d s0(@androidx.annotation.p0 Handler handler, @androidx.annotation.p0 Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f48428l.add(dVar);
        return dVar;
    }

    private void t0() {
        Iterator<e> it = this.f48433q.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f48450c.isEmpty()) {
                I(next);
                it.remove();
            }
        }
    }

    private synchronized void u0(Set<d> set) {
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f48428l.removeAll(set);
    }

    private void v0(e eVar) {
        this.f48433q.add(eVar);
        J(eVar);
    }

    private static Object w0(Object obj) {
        return com.google.android.exoplayer2.a.E(obj);
    }

    private static Object z0(Object obj) {
        return com.google.android.exoplayer2.a.F(obj);
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void B() {
    }

    public synchronized int C0() {
        return this.f48427k.size();
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected synchronized void D(@androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var) {
        super.D(u0Var);
        this.f48429m = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f48027b.E0(message);
            }
        });
        if (this.f48427k.isEmpty()) {
            X0();
        } else {
            this.f48438v = this.f48438v.g(0, this.f48427k.size());
            l0(0, this.f48427k);
            R0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public int P(e eVar, int i10) {
        return i10 + eVar.f48452e;
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected synchronized void F() {
        super.F();
        this.f48430n.clear();
        this.f48433q.clear();
        this.f48432p.clear();
        this.f48438v = this.f48438v.d();
        Handler handler = this.f48429m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f48429m = null;
        }
        this.f48436t = false;
        this.f48437u.clear();
        u0(this.f48428l);
    }

    public synchronized void G0(int i10, int i11) {
        J0(i10, i11, null, null);
    }

    public synchronized void H0(int i10, int i11, Handler handler, Runnable runnable) {
        J0(i10, i11, handler, runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public void R(e eVar, f0 f0Var, z3 z3Var) {
        W0(eVar, z3Var);
    }

    public synchronized f0 L0(int i10) {
        f0 f0VarY0;
        f0VarY0 = y0(i10);
        Q0(i10, i10 + 1, null, null);
        return f0VarY0;
    }

    public synchronized f0 M0(int i10, Handler handler, Runnable runnable) {
        f0 f0VarY0;
        f0VarY0 = y0(i10);
        Q0(i10, i10 + 1, handler, runnable);
        return f0VarY0;
    }

    public synchronized void O0(int i10, int i11) {
        Q0(i10, i11, null, null);
    }

    public synchronized void P0(int i10, int i11, Handler handler, Runnable runnable) {
        Q0(i10, i11, handler, runnable);
    }

    public synchronized void U0(f1 f1Var) {
        T0(f1Var, null, null);
    }

    public synchronized void V0(f1 f1Var, Handler handler, Runnable runnable) {
        T0(f1Var, handler, runnable);
    }

    public synchronized void b0(int i10, f0 f0Var) {
        m0(i10, Collections.singletonList(f0Var), null, null);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public i2 c() {
        return C;
    }

    public synchronized void c0(int i10, f0 f0Var, Handler handler, Runnable runnable) {
        m0(i10, Collections.singletonList(f0Var), handler, runnable);
    }

    public synchronized void d0(f0 f0Var) {
        b0(this.f48427k.size(), f0Var);
    }

    public synchronized void e0(f0 f0Var, Handler handler, Runnable runnable) {
        c0(this.f48427k.size(), f0Var, handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.a, com.google.android.exoplayer2.source.f0
    public synchronized z3 g() {
        return new b(this.f48427k, this.f48438v.getLength() != this.f48427k.size() ? this.f48438v.d().g(0, this.f48427k.size()) : this.f48438v, this.f48434r);
    }

    public synchronized void g0(int i10, Collection<f0> collection) {
        m0(i10, collection, null, null);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public c0 h(f0.a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10) {
        Object objZ0 = z0(aVar.f47719a);
        f0.a aVarA = aVar.a(w0(aVar.f47719a));
        e eVar = this.f48432p.get(objZ0);
        if (eVar == null) {
            eVar = new e(new c(), this.f48435s);
            eVar.f48453f = true;
            V(eVar, eVar.f48448a);
        }
        v0(eVar);
        eVar.f48450c.add(aVarA);
        w wVarH = eVar.f48448a.h(aVarA, bVar, j10);
        this.f48431o.put(wVarH, eVar);
        t0();
        return wVarH;
    }

    public synchronized void h0(int i10, Collection<f0> collection, Handler handler, Runnable runnable) {
        m0(i10, collection, handler, runnable);
    }

    public synchronized void i0(Collection<f0> collection) {
        m0(this.f48427k.size(), collection, null, null);
    }

    @Override // com.google.android.exoplayer2.source.f0
    public void k(c0 c0Var) {
        e eVar = (e) com.google.android.exoplayer2.util.a.g(this.f48431o.remove(c0Var));
        eVar.f48448a.k(c0Var);
        eVar.f48450c.remove(((w) c0Var).f49238b);
        if (!this.f48431o.isEmpty()) {
            t0();
        }
        F0(eVar);
    }

    public synchronized void k0(Collection<f0> collection, Handler handler, Runnable runnable) {
        m0(this.f48427k.size(), collection, handler, runnable);
    }

    public synchronized void n0() {
        O0(0, C0());
    }

    public synchronized void o0(Handler handler, Runnable runnable) {
        P0(0, C0(), handler, runnable);
    }

    @Override // com.google.android.exoplayer2.source.a, com.google.android.exoplayer2.source.f0
    public boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.e
    @androidx.annotation.p0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public f0.a K(e eVar, f0.a aVar) {
        for (int i10 = 0; i10 < eVar.f48450c.size(); i10++) {
            if (eVar.f48450c.get(i10).f47722d == aVar.f47722d) {
                return aVar.a(A0(eVar, aVar.f47719a));
            }
        }
        return null;
    }

    public synchronized f0 y0(int i10) {
        return this.f48427k.get(i10).f48448a;
    }

    @Override // com.google.android.exoplayer2.source.e, com.google.android.exoplayer2.source.a
    protected void z() {
        super.z();
        this.f48433q.clear();
    }
}
