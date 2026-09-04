package com.billy.android.swipe;

import android.content.Context;
import android.view.View;
import com.billy.android.swipe.refresh.ClassicFooter;
import com.billy.android.swipe.refresh.ClassicHeader;

/* JADX INFO: compiled from: SmartSwipeRefresh.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static h f40393j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.billy.android.swipe.consumer.f f40394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f40395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f40396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0319d f40397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f40399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r6.a f40401h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f40402i = new c();

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public class a extends r6.a {
        a() {
        }

        @Override // r6.a, r6.b
        public void a(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10, boolean z10, float f10) {
            if (d.this.f40397d != null) {
                d.this.f40397d.b(!z10, f10);
            }
        }

        @Override // r6.a, r6.b
        public void d(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
            if (d.this.f40399f == null) {
                d.this.o(false);
                return;
            }
            if (d.this.f40397d == d.this.f40395b) {
                fVar.N0();
                d.this.f40397d.a();
                d.this.f40399f.a(d.this);
            } else if (d.this.f40397d == d.this.f40396c) {
                fVar.N0();
                d.this.f40397d.a();
                if (d.this.f40400g) {
                    d.this.o(true);
                } else {
                    d.this.f40399f.b(d.this);
                }
            }
        }

        @Override // r6.a, r6.b
        public void e(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
            fVar.X1();
            if (d.this.f40397d != null) {
                d.this.f40397d.e();
                d.this.f40397d = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0014  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e  */
        @Override // r6.a, r6.b
        public void f(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
            d.this.f40397d = null;
            if (i10 == 1) {
                d dVar = d.this;
                dVar.f40397d = dVar.f40395b;
            } else if (i10 == 2) {
                d dVar2 = d.this;
                dVar2.f40397d = dVar2.f40396c;
            } else if (i10 == 4) {
                d dVar3 = d.this;
                dVar3.f40397d = dVar3.f40395b;
            } else if (i10 == 8) {
                d dVar4 = d.this;
                dVar4.f40397d = dVar4.f40396c;
            }
            if (d.this.f40397d != null) {
                d.this.f40397d.c();
            }
        }
    }

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40404b;

        b(int i10) {
            this.f40404b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f40394a.q1(true, this.f40404b);
        }
    }

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f40394a.N1();
            d.this.f40394a.X1();
        }
    }

    /* JADX INFO: renamed from: com.billy.android.swipe.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public interface InterfaceC0319d {
        void a();

        void b(boolean z10, float f10);

        void c();

        void d(boolean z10);

        void e();

        View getView();

        long onFinish(boolean z10);
    }

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public interface e {
        void a(d dVar);

        void b(d dVar);
    }

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public interface f extends InterfaceC0319d {
        void setNoMoreData(boolean z10);
    }

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public interface g extends InterfaceC0319d {
    }

    /* JADX INFO: compiled from: SmartSwipeRefresh.java */
    public interface h {
        g a(Context context);

        f b(Context context);
    }

    public static d D(View view, float f10, boolean z10, boolean z11) {
        return j(view, new com.billy.android.swipe.consumer.h().M2(f10), z10, z11);
    }

    public static d G(View view, boolean z10) {
        return H(view, z10, true);
    }

    public static d H(View view, boolean z10, boolean z11) {
        return D(view, 1.0f, z10, z11);
    }

    public static d h(View view, boolean z10) {
        return i(view, z10, true);
    }

    public static d i(View view, boolean z10, boolean z11) {
        return D(view, 0.0f, z10, z11);
    }

    public static d j(View view, com.billy.android.swipe.consumer.f fVar, boolean z10, boolean z11) {
        d dVar = new d();
        dVar.f40394a = (com.billy.android.swipe.consumer.f) ((com.billy.android.swipe.consumer.f) com.billy.android.swipe.b.o(view).addConsumer(fVar)).w1(true).b(dVar.f40401h).H1(new q6.a(0.4f)).E1(5).D1(0.5f).F(false).D(false).d(com.billy.android.swipe.consumer.f.class);
        dVar.f40398e = z10;
        if (z11) {
            h hVar = f40393j;
            if (hVar != null) {
                dVar.B(hVar.a(view.getContext()));
                dVar.A(f40393j.b(view.getContext()));
            } else {
                dVar.B(new ClassicHeader(view.getContext()));
                dVar.A(new ClassicFooter(view.getContext()));
            }
        }
        return dVar;
    }

    public static d m(View view, boolean z10) {
        return n(view, z10, true);
    }

    public static d n(View view, boolean z10, boolean z11) {
        return j(view, new com.billy.android.swipe.consumer.f(), z10, z11);
    }

    private void v(int i10) {
        this.f40394a.N0();
        this.f40394a.l0().post(new b(i10));
    }

    public static d w(View view, boolean z10) {
        return x(view, z10, true);
    }

    public static d x(View view, boolean z10, boolean z11) {
        return D(view, 0.5f, z10, z11);
    }

    public static void z(h hVar) {
        f40393j = hVar;
    }

    public d A(f fVar) {
        this.f40396c = fVar;
        if (fVar != null) {
            fVar.d(this.f40398e);
        }
        this.f40394a.u2(this.f40398e ? 2 : 8, fVar == null ? null : fVar.getView());
        return this;
    }

    public d B(g gVar) {
        this.f40395b = gVar;
        if (gVar != null) {
            gVar.d(this.f40398e);
        }
        this.f40394a.u2(this.f40398e ? 1 : 4, gVar == null ? null : gVar.getView());
        return this;
    }

    public d C(boolean z10) {
        this.f40400g = z10;
        f fVar = this.f40396c;
        if (fVar != null) {
            fVar.setNoMoreData(z10);
        }
        return this;
    }

    public d E() {
        v(this.f40398e ? 2 : 8);
        return this;
    }

    public d F() {
        v(this.f40398e ? 1 : 4);
        return this;
    }

    public d k() {
        this.f40394a.m(this.f40398e ? 2 : 8);
        return this;
    }

    public d l() {
        this.f40394a.m(this.f40398e ? 1 : 4);
        return this;
    }

    public d o(boolean z10) {
        InterfaceC0319d interfaceC0319d = this.f40397d;
        if (interfaceC0319d != null) {
            if (z10 && interfaceC0319d == this.f40395b) {
                C(false);
            }
            long jOnFinish = this.f40397d.onFinish(z10);
            if (jOnFinish > 0) {
                this.f40394a.l0().postDelayed(this.f40402i, jOnFinish);
                return null;
            }
        }
        this.f40394a.N1();
        return this;
    }

    public e p() {
        return this.f40399f;
    }

    public f q() {
        return this.f40396c;
    }

    public g r() {
        return this.f40395b;
    }

    public com.billy.android.swipe.consumer.f s() {
        return this.f40394a;
    }

    public boolean t() {
        return this.f40398e;
    }

    public boolean u() {
        return this.f40400g;
    }

    public d y(e eVar) {
        this.f40399f = eVar;
        return this;
    }
}
