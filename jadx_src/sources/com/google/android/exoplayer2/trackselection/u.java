package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: TrackSelectionParameters.java */
/* JADX INFO: loaded from: classes7.dex */
public class u implements com.google.android.exoplayer2.i {

    @Deprecated
    public static final u A;
    private static final int B = 1;
    private static final int C = 2;
    private static final int D = 3;
    private static final int E = 4;
    private static final int F = 5;
    private static final int G = 6;
    private static final int H = 7;
    private static final int I = 8;
    private static final int J = 9;
    private static final int K = 10;
    private static final int L = 11;
    private static final int M = 12;
    private static final int N = 13;
    private static final int O = 14;
    private static final int P = 15;
    private static final int Q = 16;
    private static final int R = 17;
    private static final int S = 18;
    private static final int T = 19;
    private static final int U = 20;
    private static final int V = 21;
    private static final int W = 22;
    private static final int X = 23;
    private static final int Y = 24;
    private static final int Z = 25;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<u> f50138a0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final u f50139z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f50145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f50146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f50147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f50148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f50149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f50150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImmutableList<String> f50151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImmutableList<String> f50152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f50153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f50154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f50155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImmutableList<String> f50156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImmutableList<String> f50157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f50158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f50159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f50160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f50161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f50162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImmutableSet<Integer> f50163y;

    /* JADX INFO: compiled from: TrackSelectionParameters.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f50167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f50168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f50169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f50170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f50171h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f50172i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f50173j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f50174k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ImmutableList<String> f50175l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ImmutableList<String> f50176m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50177n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f50178o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f50179p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ImmutableList<String> f50180q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ImmutableList<String> f50181r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f50182s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f50183t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f50184u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f50185v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private r f50186w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ImmutableSet<Integer> f50187x;

        @Deprecated
        public a() {
            this.f50164a = Integer.MAX_VALUE;
            this.f50165b = Integer.MAX_VALUE;
            this.f50166c = Integer.MAX_VALUE;
            this.f50167d = Integer.MAX_VALUE;
            this.f50172i = Integer.MAX_VALUE;
            this.f50173j = Integer.MAX_VALUE;
            this.f50174k = true;
            this.f50175l = ImmutableList.B();
            this.f50176m = ImmutableList.B();
            this.f50177n = 0;
            this.f50178o = Integer.MAX_VALUE;
            this.f50179p = Integer.MAX_VALUE;
            this.f50180q = ImmutableList.B();
            this.f50181r = ImmutableList.B();
            this.f50182s = 0;
            this.f50183t = false;
            this.f50184u = false;
            this.f50185v = false;
            this.f50186w = r.f50128c;
            this.f50187x = ImmutableSet.D();
        }

        public a(Context context) {
            this();
            W(context);
            f0(context, true);
        }

        protected a(Bundle bundle) {
            String strF = u.f(6);
            u uVar = u.f50139z;
            this.f50164a = bundle.getInt(strF, uVar.f50140b);
            this.f50165b = bundle.getInt(u.f(7), uVar.f50141c);
            this.f50166c = bundle.getInt(u.f(8), uVar.f50142d);
            this.f50167d = bundle.getInt(u.f(9), uVar.f50143e);
            this.f50168e = bundle.getInt(u.f(10), uVar.f50144f);
            this.f50169f = bundle.getInt(u.f(11), uVar.f50145g);
            this.f50170g = bundle.getInt(u.f(12), uVar.f50146h);
            this.f50171h = bundle.getInt(u.f(13), uVar.f50147i);
            this.f50172i = bundle.getInt(u.f(14), uVar.f50148j);
            this.f50173j = bundle.getInt(u.f(15), uVar.f50149k);
            this.f50174k = bundle.getBoolean(u.f(16), uVar.f50150l);
            this.f50175l = ImmutableList.x((String[]) com.google.common.base.q.a(bundle.getStringArray(u.f(17)), new String[0]));
            this.f50176m = C((String[]) com.google.common.base.q.a(bundle.getStringArray(u.f(1)), new String[0]));
            this.f50177n = bundle.getInt(u.f(2), uVar.f50153o);
            this.f50178o = bundle.getInt(u.f(18), uVar.f50154p);
            this.f50179p = bundle.getInt(u.f(19), uVar.f50155q);
            this.f50180q = ImmutableList.x((String[]) com.google.common.base.q.a(bundle.getStringArray(u.f(20)), new String[0]));
            this.f50181r = C((String[]) com.google.common.base.q.a(bundle.getStringArray(u.f(3)), new String[0]));
            this.f50182s = bundle.getInt(u.f(4), uVar.f50158t);
            this.f50183t = bundle.getBoolean(u.f(5), uVar.f50159u);
            this.f50184u = bundle.getBoolean(u.f(21), uVar.f50160v);
            this.f50185v = bundle.getBoolean(u.f(22), uVar.f50161w);
            this.f50186w = (r) com.google.android.exoplayer2.util.d.f(r.f50130e, bundle.getBundle(u.f(23)), r.f50128c);
            this.f50187x = ImmutableSet.w(Ints.c((int[]) com.google.common.base.q.a(bundle.getIntArray(u.f(25)), new int[0])));
        }

        protected a(u uVar) {
            B(uVar);
        }

        @mk.d({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "trackSelectionOverrides", "disabledTrackTypes"})
        private void B(u uVar) {
            this.f50164a = uVar.f50140b;
            this.f50165b = uVar.f50141c;
            this.f50166c = uVar.f50142d;
            this.f50167d = uVar.f50143e;
            this.f50168e = uVar.f50144f;
            this.f50169f = uVar.f50145g;
            this.f50170g = uVar.f50146h;
            this.f50171h = uVar.f50147i;
            this.f50172i = uVar.f50148j;
            this.f50173j = uVar.f50149k;
            this.f50174k = uVar.f50150l;
            this.f50175l = uVar.f50151m;
            this.f50176m = uVar.f50152n;
            this.f50177n = uVar.f50153o;
            this.f50178o = uVar.f50154p;
            this.f50179p = uVar.f50155q;
            this.f50180q = uVar.f50156r;
            this.f50181r = uVar.f50157s;
            this.f50182s = uVar.f50158t;
            this.f50183t = uVar.f50159u;
            this.f50184u = uVar.f50160v;
            this.f50185v = uVar.f50161w;
            this.f50186w = uVar.f50162x;
            this.f50187x = uVar.f50163y;
        }

        private static ImmutableList<String> C(String[] strArr) {
            ImmutableList.a aVarQ = ImmutableList.q();
            for (String str : (String[]) com.google.android.exoplayer2.util.a.g(strArr)) {
                aVarQ.a(u0.W0((String) com.google.android.exoplayer2.util.a.g(str)));
            }
            return aVarQ.e();
        }

        @w0(19)
        private void X(Context context) {
            CaptioningManager captioningManager;
            if ((u0.f51536a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f50182s = bb.c.b.Wh;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f50181r = ImmutableList.D(u0.i0(locale));
                }
            }
        }

        public a A() {
            return e0(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        protected a D(u uVar) {
            B(uVar);
            return this;
        }

        public a E(Set<Integer> set) {
            this.f50187x = ImmutableSet.w(set);
            return this;
        }

        public a F(boolean z10) {
            this.f50185v = z10;
            return this;
        }

        public a G(boolean z10) {
            this.f50184u = z10;
            return this;
        }

        public a H(int i10) {
            this.f50179p = i10;
            return this;
        }

        public a I(int i10) {
            this.f50178o = i10;
            return this;
        }

        public a J(int i10) {
            this.f50167d = i10;
            return this;
        }

        public a K(int i10) {
            this.f50166c = i10;
            return this;
        }

        public a L(int i10, int i11) {
            this.f50164a = i10;
            this.f50165b = i11;
            return this;
        }

        public a M() {
            return L(1279, 719);
        }

        public a N(int i10) {
            this.f50171h = i10;
            return this;
        }

        public a O(int i10) {
            this.f50170g = i10;
            return this;
        }

        public a P(int i10, int i11) {
            this.f50168e = i10;
            this.f50169f = i11;
            return this;
        }

        public a Q(@p0 String str) {
            return str == null ? R(new String[0]) : R(str);
        }

        public a R(String... strArr) {
            this.f50176m = C(strArr);
            return this;
        }

        public a S(@p0 String str) {
            return str == null ? T(new String[0]) : T(str);
        }

        public a T(String... strArr) {
            this.f50180q = ImmutableList.x(strArr);
            return this;
        }

        public a U(int i10) {
            this.f50177n = i10;
            return this;
        }

        public a V(@p0 String str) {
            return str == null ? Y(new String[0]) : Y(str);
        }

        public a W(Context context) {
            if (u0.f51536a >= 19) {
                X(context);
            }
            return this;
        }

        public a Y(String... strArr) {
            this.f50181r = C(strArr);
            return this;
        }

        public a Z(int i10) {
            this.f50182s = i10;
            return this;
        }

        public a a0(@p0 String str) {
            return str == null ? b0(new String[0]) : b0(str);
        }

        public a b0(String... strArr) {
            this.f50175l = ImmutableList.x(strArr);
            return this;
        }

        public a c0(boolean z10) {
            this.f50183t = z10;
            return this;
        }

        public a d0(r rVar) {
            this.f50186w = rVar;
            return this;
        }

        public a e0(int i10, int i11, boolean z10) {
            this.f50172i = i10;
            this.f50173j = i11;
            this.f50174k = z10;
            return this;
        }

        public a f0(Context context, boolean z10) {
            Point pointV = u0.V(context);
            return e0(pointV.x, pointV.y, z10);
        }

        public u y() {
            return new u(this);
        }

        public a z() {
            return L(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    static {
        u uVarY = new a().y();
        f50139z = uVarY;
        A = uVarY;
        f50138a0 = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.trackselection.t
            @Override // com.google.android.exoplayer2.i.a
            public final com.google.android.exoplayer2.i a(Bundle bundle) {
                return u.g(bundle);
            }
        };
    }

    protected u(a aVar) {
        this.f50140b = aVar.f50164a;
        this.f50141c = aVar.f50165b;
        this.f50142d = aVar.f50166c;
        this.f50143e = aVar.f50167d;
        this.f50144f = aVar.f50168e;
        this.f50145g = aVar.f50169f;
        this.f50146h = aVar.f50170g;
        this.f50147i = aVar.f50171h;
        this.f50148j = aVar.f50172i;
        this.f50149k = aVar.f50173j;
        this.f50150l = aVar.f50174k;
        this.f50151m = aVar.f50175l;
        this.f50152n = aVar.f50176m;
        this.f50153o = aVar.f50177n;
        this.f50154p = aVar.f50178o;
        this.f50155q = aVar.f50179p;
        this.f50156r = aVar.f50180q;
        this.f50157s = aVar.f50181r;
        this.f50158t = aVar.f50182s;
        this.f50159u = aVar.f50183t;
        this.f50160v = aVar.f50184u;
        this.f50161w = aVar.f50185v;
        this.f50162x = aVar.f50186w;
        this.f50163y = aVar.f50187x;
    }

    public static u e(Context context) {
        return new a(context).y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ u g(Bundle bundle) {
        return new a(bundle).y();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f(6), this.f50140b);
        bundle.putInt(f(7), this.f50141c);
        bundle.putInt(f(8), this.f50142d);
        bundle.putInt(f(9), this.f50143e);
        bundle.putInt(f(10), this.f50144f);
        bundle.putInt(f(11), this.f50145g);
        bundle.putInt(f(12), this.f50146h);
        bundle.putInt(f(13), this.f50147i);
        bundle.putInt(f(14), this.f50148j);
        bundle.putInt(f(15), this.f50149k);
        bundle.putBoolean(f(16), this.f50150l);
        bundle.putStringArray(f(17), (String[]) this.f50151m.toArray(new String[0]));
        bundle.putStringArray(f(1), (String[]) this.f50152n.toArray(new String[0]));
        bundle.putInt(f(2), this.f50153o);
        bundle.putInt(f(18), this.f50154p);
        bundle.putInt(f(19), this.f50155q);
        bundle.putStringArray(f(20), (String[]) this.f50156r.toArray(new String[0]));
        bundle.putStringArray(f(3), (String[]) this.f50157s.toArray(new String[0]));
        bundle.putInt(f(4), this.f50158t);
        bundle.putBoolean(f(5), this.f50159u);
        bundle.putBoolean(f(21), this.f50160v);
        bundle.putBoolean(f(22), this.f50161w);
        bundle.putBundle(f(23), this.f50162x.a());
        bundle.putIntArray(f(25), Ints.B(this.f50163y));
        return bundle;
    }

    public a d() {
        return new a(this);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f50140b == uVar.f50140b && this.f50141c == uVar.f50141c && this.f50142d == uVar.f50142d && this.f50143e == uVar.f50143e && this.f50144f == uVar.f50144f && this.f50145g == uVar.f50145g && this.f50146h == uVar.f50146h && this.f50147i == uVar.f50147i && this.f50150l == uVar.f50150l && this.f50148j == uVar.f50148j && this.f50149k == uVar.f50149k && this.f50151m.equals(uVar.f50151m) && this.f50152n.equals(uVar.f50152n) && this.f50153o == uVar.f50153o && this.f50154p == uVar.f50154p && this.f50155q == uVar.f50155q && this.f50156r.equals(uVar.f50156r) && this.f50157s.equals(uVar.f50157s) && this.f50158t == uVar.f50158t && this.f50159u == uVar.f50159u && this.f50160v == uVar.f50160v && this.f50161w == uVar.f50161w && this.f50162x.equals(uVar.f50162x) && this.f50163y.equals(uVar.f50163y);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((this.f50140b + 31) * 31) + this.f50141c) * 31) + this.f50142d) * 31) + this.f50143e) * 31) + this.f50144f) * 31) + this.f50145g) * 31) + this.f50146h) * 31) + this.f50147i) * 31) + (this.f50150l ? 1 : 0)) * 31) + this.f50148j) * 31) + this.f50149k) * 31) + this.f50151m.hashCode()) * 31) + this.f50152n.hashCode()) * 31) + this.f50153o) * 31) + this.f50154p) * 31) + this.f50155q) * 31) + this.f50156r.hashCode()) * 31) + this.f50157s.hashCode()) * 31) + this.f50158t) * 31) + (this.f50159u ? 1 : 0)) * 31) + (this.f50160v ? 1 : 0)) * 31) + (this.f50161w ? 1 : 0)) * 31) + this.f50162x.hashCode()) * 31) + this.f50163y.hashCode();
    }
}
