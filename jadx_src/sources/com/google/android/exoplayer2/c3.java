package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Player.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c3 {
    public static final int A = 2;
    public static final int A0 = 27;
    public static final int B = 3;
    public static final int B0 = 28;
    public static final int C = 0;
    public static final int C0 = 29;
    public static final int D = 1;
    public static final int D0 = 30;
    public static final int E = 2;
    public static final int E0 = -1;
    public static final int F = 3;
    public static final int G = 4;
    public static final int H = 5;
    public static final int I = 6;
    public static final int J = 7;
    public static final int K = 8;
    public static final int L = 9;
    public static final int M = 10;
    public static final int N = 11;
    public static final int O = 12;
    public static final int P = 13;
    public static final int Q = 14;
    public static final int R = 15;
    public static final int S = 16;
    public static final int T = 17;
    public static final int U = 18;
    public static final int V = 19;
    public static final int W = 1;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int Z = 4;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f44400a0 = 5;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f44401b0 = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44402c = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f44403c0 = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44404d = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Deprecated
    public static final int f44405d0 = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44406e = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f44407e0 = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44408f = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f44409f0 = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44410g = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @Deprecated
    public static final int f44411g0 = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44412h = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f44413h0 = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44414i = 3;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f44415i0 = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44416j = 4;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @Deprecated
    public static final int f44417j0 = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44418k = 5;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f44419k0 = 11;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44420l = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f44421l0 = 12;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f44422m = 1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f44423m0 = 13;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f44424n = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f44425n0 = 14;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f44426o = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f44427o0 = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f44428p = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f44429p0 = 16;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f44430q = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f44431q0 = 17;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f44432r = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f44433r0 = 18;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f44434s = 2;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f44435s0 = 19;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f44436t = 3;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f44437t0 = 20;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f44438u = 4;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f44439u0 = 21;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f44440v = 5;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f44441v0 = 22;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f44442w = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f44443w0 = 23;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f44444x = 1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f44445x0 = 24;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f44446y = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f44447y0 = 25;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f44448z = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f44449z0 = 26;

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class c implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f44451d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.o f44453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f44450c = new a().f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<c> f44452e = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.d3
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return c3.c.f(bundle);
            }
        };

        /* JADX INFO: compiled from: Player.java */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final int[] f44454b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final com.google.android.exoplayer2.util.o.b f44455a;

            public a() {
                this.f44455a = new com.google.android.exoplayer2.util.o.b();
            }

            private a(c cVar) {
                com.google.android.exoplayer2.util.o.b bVar = new com.google.android.exoplayer2.util.o.b();
                this.f44455a = bVar;
                bVar.b(cVar.f44453b);
            }

            public a a(int i10) {
                this.f44455a.a(i10);
                return this;
            }

            public a b(c cVar) {
                this.f44455a.b(cVar.f44453b);
                return this;
            }

            public a c(int... iArr) {
                this.f44455a.c(iArr);
                return this;
            }

            public a d() {
                this.f44455a.c(f44454b);
                return this;
            }

            public a e(int i10, boolean z10) {
                this.f44455a.d(i10, z10);
                return this;
            }

            public c f() {
                return new c(this.f44455a.e());
            }

            public a g(int i10) {
                this.f44455a.f(i10);
                return this;
            }

            public a h(int... iArr) {
                this.f44455a.g(iArr);
                return this;
            }

            public a i(int i10, boolean z10) {
                this.f44455a.h(i10, z10);
                return this;
            }
        }

        private c(com.google.android.exoplayer2.util.o oVar) {
            this.f44453b = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c f(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(h(0));
            if (integerArrayList == null) {
                return f44450c;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.f();
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f44453b.d(); i10++) {
                arrayList.add(Integer.valueOf(this.f44453b.c(i10)));
            }
            bundle.putIntegerArrayList(h(0), arrayList);
            return bundle;
        }

        public a d() {
            return new a();
        }

        public boolean e(int i10) {
            return this.f44453b.a(i10);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f44453b.equals(((c) obj).f44453b);
            }
            return false;
        }

        public int g(int i10) {
            return this.f44453b.c(i10);
        }

        public int hashCode() {
            return this.f44453b.hashCode();
        }

        public int i() {
            return this.f44453b.d();
        }
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: Player.java */
    @Deprecated
    public interface f {
        @Deprecated
        void H();

        void b(b3 b3Var);

        void c(l lVar, l lVar2, int i10);

        void d(z3 z3Var, int i10);

        @Deprecated
        void d0(com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.p pVar);

        void e(m2 m2Var);

        void f(boolean z10);

        void f0(com.google.android.exoplayer2.trackselection.u uVar);

        void h(@androidx.annotation.p0 PlaybackException playbackException);

        @Deprecated
        void h0(int i10);

        void i(PlaybackException playbackException);

        void j(long j10);

        void k(boolean z10, int i10);

        void l(boolean z10);

        @Deprecated
        void l0(boolean z10, int i10);

        void m(int i10);

        void n(e4 e4Var);

        void o(c cVar);

        void onRepeatModeChanged(int i10);

        void p(int i10);

        void p0(long j10);

        void r(long j10);

        void u(boolean z10);

        void v(c3 c3Var, g gVar);

        void w(@androidx.annotation.p0 i2 i2Var, int i10);

        void x(m2 m2Var);

        @Deprecated
        void y(boolean z10);
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.o f44456a;

        public g(com.google.android.exoplayer2.util.o oVar) {
            this.f44456a = oVar;
        }

        public boolean a(int i10) {
            return this.f44456a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f44456a.b(iArr);
        }

        public int c(int i10) {
            return this.f44456a.c(i10);
        }

        public int d() {
            return this.f44456a.d();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return this.f44456a.equals(((g) obj).f44456a);
            }
            return false;
        }

        public int hashCode() {
            return this.f44456a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Player.java */
    public interface h extends f {
        void B(int i10);

        void F(int i10, boolean z10);

        void K(com.google.android.exoplayer2.audio.f fVar);

        void V(p pVar);

        void X();

        void a(boolean z10);

        @Override // com.google.android.exoplayer2.c3.f
        void b(b3 b3Var);

        @Override // com.google.android.exoplayer2.c3.f
        void c(l lVar, l lVar2, int i10);

        @Override // com.google.android.exoplayer2.c3.f
        void d(z3 z3Var, int i10);

        @Override // com.google.android.exoplayer2.c3.f
        void e(m2 m2Var);

        @Override // com.google.android.exoplayer2.c3.f
        void f(boolean z10);

        void g(com.google.android.exoplayer2.video.a0 a0Var);

        void g0(int i10, int i11);

        @Override // com.google.android.exoplayer2.c3.f
        void h(@androidx.annotation.p0 PlaybackException playbackException);

        @Override // com.google.android.exoplayer2.c3.f
        void i(PlaybackException playbackException);

        @Override // com.google.android.exoplayer2.c3.f
        void j(long j10);

        @Override // com.google.android.exoplayer2.c3.f
        void k(boolean z10, int i10);

        void k0(float f10);

        @Override // com.google.android.exoplayer2.c3.f
        void l(boolean z10);

        @Override // com.google.android.exoplayer2.c3.f
        void m(int i10);

        @Override // com.google.android.exoplayer2.c3.f
        void n(e4 e4Var);

        @Override // com.google.android.exoplayer2.c3.f
        void o(c cVar);

        @Override // com.google.android.exoplayer2.c3.f
        void onRepeatModeChanged(int i10);

        @Override // com.google.android.exoplayer2.c3.f
        void p(int i10);

        void q(Metadata metadata);

        @Override // com.google.android.exoplayer2.c3.f
        void r(long j10);

        void t(List<com.google.android.exoplayer2.text.b> list);

        @Override // com.google.android.exoplayer2.c3.f
        void u(boolean z10);

        @Override // com.google.android.exoplayer2.c3.f
        void v(c3 c3Var, g gVar);

        @Override // com.google.android.exoplayer2.c3.f
        void w(@androidx.annotation.p0 i2 i2Var, int i10);

        @Override // com.google.android.exoplayer2.c3.f
        void x(m2 m2Var);
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: compiled from: Player.java */
    public static final class l implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f44457l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f44458m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f44459n = 2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f44460o = 3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f44461p = 4;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final int f44462q = 5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final int f44463r = 6;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<l> f44464s = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.g3
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return c3.l.c(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f44465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public final int f44466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public final i2 f44468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f44469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f44470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f44471h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f44472i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f44473j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f44474k;

        public l(@androidx.annotation.p0 Object obj, int i10, @androidx.annotation.p0 i2 i2Var, @androidx.annotation.p0 Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f44465b = obj;
            this.f44466c = i10;
            this.f44467d = i10;
            this.f44468e = i2Var;
            this.f44469f = obj2;
            this.f44470g = i11;
            this.f44471h = j10;
            this.f44472i = j11;
            this.f44473j = i12;
            this.f44474k = i13;
        }

        @Deprecated
        public l(@androidx.annotation.p0 Object obj, int i10, @androidx.annotation.p0 Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this(obj, i10, i2.f46262j, obj2, i11, j10, j11, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static l c(Bundle bundle) {
            return new l(null, bundle.getInt(d(0), -1), (i2) com.google.android.exoplayer2.util.d.e(i2.f46267o, bundle.getBundle(d(1))), null, bundle.getInt(d(2), -1), bundle.getLong(d(3), com.google.android.exoplayer2.j.f46377b), bundle.getLong(d(4), com.google.android.exoplayer2.j.f46377b), bundle.getInt(d(5), -1), bundle.getInt(d(6), -1));
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(d(0), this.f44467d);
            bundle.putBundle(d(1), com.google.android.exoplayer2.util.d.j(this.f44468e));
            bundle.putInt(d(2), this.f44470g);
            bundle.putLong(d(3), this.f44471h);
            bundle.putLong(d(4), this.f44472i);
            bundle.putInt(d(5), this.f44473j);
            bundle.putInt(d(6), this.f44474k);
            return bundle;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || l.class != obj.getClass()) {
                return false;
            }
            l lVar = (l) obj;
            return this.f44467d == lVar.f44467d && this.f44470g == lVar.f44470g && this.f44471h == lVar.f44471h && this.f44472i == lVar.f44472i && this.f44473j == lVar.f44473j && this.f44474k == lVar.f44474k && com.google.common.base.s.a(this.f44465b, lVar.f44465b) && com.google.common.base.s.a(this.f44469f, lVar.f44469f) && com.google.common.base.s.a(this.f44468e, lVar.f44468e);
        }

        public int hashCode() {
            return com.google.common.base.s.b(this.f44465b, Integer.valueOf(this.f44467d), this.f44468e, this.f44469f, Integer.valueOf(this.f44470g), Long.valueOf(this.f44471h), Long.valueOf(this.f44472i), Integer.valueOf(this.f44473j), Integer.valueOf(this.f44474k));
        }
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    /* JADX INFO: compiled from: Player.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface o {
    }

    void A();

    int A0();

    List<com.google.android.exoplayer2.text.b> C();

    void D0(List<i2> list, int i10, long j10);

    void D1(int i10, long j10);

    void E0(int i10);

    c E1();

    void F(@androidx.annotation.p0 TextureView textureView);

    long F0();

    void F1(i2 i2Var);

    boolean H0();

    boolean H1();

    void I0(com.google.android.exoplayer2.trackselection.u uVar);

    void I1(i2 i2Var, long j10);

    com.google.android.exoplayer2.video.a0 J();

    m2 J0();

    @androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a)
    float K();

    void K1(i2 i2Var, boolean z10);

    void L();

    void L0(int i10, int i11);

    void M(@androidx.annotation.p0 SurfaceView surfaceView);

    void N(@androidx.annotation.f0(from = 0) int i10);

    boolean O();

    long O0();

    @Deprecated
    boolean O1();

    @Deprecated
    boolean P();

    void P0();

    void P1(m2 m2Var);

    long Q();

    long Q1();

    void S0(int i10, i2 i2Var);

    void S1(h hVar);

    void T0(List<i2> list);

    void T1(int i10, List<i2> list);

    void U(h hVar);

    boolean U0();

    @Deprecated
    int U1();

    void V(List<i2> list, boolean z10);

    void V0();

    long V1();

    boolean W();

    @androidx.annotation.p0
    i2 W0();

    void Y(int i10, int i11);

    @androidx.annotation.f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F)
    int Y0();

    int Z0();

    int Z1();

    boolean a();

    @Deprecated
    void a0();

    @Deprecated
    boolean a1();

    @Deprecated
    int a2();

    @androidx.annotation.p0
    PlaybackException b();

    @androidx.annotation.p0
    Object b0();

    void b1();

    void c0();

    void c1();

    @Deprecated
    boolean d2();

    void e(b3 b3Var);

    boolean e0();

    void e2(int i10, int i11, int i12);

    int f0();

    @Deprecated
    void f1();

    void f2(List<i2> list);

    b3 g();

    boolean g0(int i10);

    @Deprecated
    boolean g1();

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    void h1(int i10);

    boolean h2();

    @Deprecated
    boolean hasNext();

    @Deprecated
    boolean hasPrevious();

    com.google.android.exoplayer2.audio.f i();

    int i1();

    void i2();

    boolean isPlaying();

    void j(@androidx.annotation.x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);

    @Deprecated
    com.google.android.exoplayer2.source.p1 j0();

    m2 j2();

    long k2();

    void l(@androidx.annotation.p0 Surface surface);

    com.google.android.exoplayer2.trackselection.u l0();

    @Deprecated
    int l1();

    void m(@androidx.annotation.p0 SurfaceView surfaceView);

    void m1();

    void n(@androidx.annotation.p0 SurfaceHolder surfaceHolder);

    void n1(boolean z10);

    @Deprecated
    void next();

    void o(boolean z10);

    long o0();

    void p();

    boolean p0();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void q(@androidx.annotation.p0 SurfaceHolder surfaceHolder);

    void q0(boolean z10);

    int q1();

    @Deprecated
    void r0(boolean z10);

    void release();

    @androidx.annotation.f0(from = 0)
    int s();

    void seekTo(long j10);

    void setPlaybackSpeed(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10);

    void setRepeatMode(int i10);

    void stop();

    i2 t0(int i10);

    boolean t1();

    long u0();

    int u1();

    void v(@androidx.annotation.p0 TextureView textureView);

    e4 v1();

    p w();

    long w0();

    z3 w1();

    boolean x();

    int x0();

    Looper x1();

    void y0(i2 i2Var);

    void y1();

    void z(@androidx.annotation.p0 Surface surface);

    @Deprecated
    com.google.android.exoplayer2.trackselection.p z1();
}
