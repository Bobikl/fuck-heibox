package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: TracksInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e4 implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f44784d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList<a> f44786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e4 f44783c = new e4(ImmutableList.B());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i.a<e4> f44785e = new i.a() { // from class: com.google.android.exoplayer2.c4
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return e4.g(bundle);
        }
    };

    /* JADX INFO: compiled from: TracksInfo.java */
    public static final class a implements i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f44787f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f44788g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f44789h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f44790i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final i.a<a> f44791j = new i.a() { // from class: com.google.android.exoplayer2.d4
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return e4.a.l(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.android.exoplayer2.source.n1 f44792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f44793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f44794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f44795e;

        public a(com.google.android.exoplayer2.source.n1 n1Var, int[] iArr, int i10, boolean[] zArr) {
            int i11 = n1Var.f48599b;
            com.google.android.exoplayer2.util.a.a(i11 == iArr.length && i11 == zArr.length);
            this.f44792b = n1Var;
            this.f44793c = (int[]) iArr.clone();
            this.f44794d = i10;
            this.f44795e = (boolean[]) zArr.clone();
        }

        private static String k(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ a l(Bundle bundle) {
            com.google.android.exoplayer2.source.n1 n1Var = (com.google.android.exoplayer2.source.n1) com.google.android.exoplayer2.util.d.e(com.google.android.exoplayer2.source.n1.f48598g, bundle.getBundle(k(0)));
            com.google.android.exoplayer2.util.a.g(n1Var);
            return new a(n1Var, (int[]) com.google.common.base.q.a(bundle.getIntArray(k(1)), new int[n1Var.f48599b]), bundle.getInt(k(2), -1), (boolean[]) com.google.common.base.q.a(bundle.getBooleanArray(k(3)), new boolean[n1Var.f48599b]));
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(k(0), this.f44792b.a());
            bundle.putIntArray(k(1), this.f44793c);
            bundle.putInt(k(2), this.f44794d);
            bundle.putBooleanArray(k(3), this.f44795e);
            return bundle;
        }

        public com.google.android.exoplayer2.source.n1 d() {
            return this.f44792b;
        }

        public int e(int i10) {
            return this.f44793c[i10];
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f44794d == aVar.f44794d && this.f44792b.equals(aVar.f44792b) && Arrays.equals(this.f44793c, aVar.f44793c) && Arrays.equals(this.f44795e, aVar.f44795e);
        }

        public int f() {
            return this.f44794d;
        }

        public boolean g() {
            return Booleans.f(this.f44795e, true);
        }

        public boolean h() {
            for (int i10 = 0; i10 < this.f44793c.length; i10++) {
                if (j(i10)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f44792b.hashCode() * 31) + Arrays.hashCode(this.f44793c)) * 31) + this.f44794d) * 31) + Arrays.hashCode(this.f44795e);
        }

        public boolean i(int i10) {
            return this.f44795e[i10];
        }

        public boolean j(int i10) {
            return this.f44793c[i10] == 4;
        }
    }

    public e4(List<a> list) {
        this.f44786b = ImmutableList.v(list);
    }

    private static String f(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e4 g(Bundle bundle) {
        return new e4(com.google.android.exoplayer2.util.d.c(a.f44791j, bundle.getParcelableArrayList(f(0)), ImmutableList.B()));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f(0), com.google.android.exoplayer2.util.d.g(this.f44786b));
        return bundle;
    }

    public ImmutableList<a> c() {
        return this.f44786b;
    }

    public boolean d(int i10) {
        for (int i11 = 0; i11 < this.f44786b.size(); i11++) {
            a aVar = this.f44786b.get(i11);
            if (aVar.g() && aVar.f() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10) {
        boolean z10 = true;
        for (int i11 = 0; i11 < this.f44786b.size(); i11++) {
            if (this.f44786b.get(i11).f44794d == i10) {
                if (this.f44786b.get(i11).h()) {
                    return true;
                }
                z10 = false;
            }
        }
        return z10;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e4.class != obj.getClass()) {
            return false;
        }
        return this.f44786b.equals(((e4) obj).f44786b);
    }

    public int hashCode() {
        return this.f44786b.hashCode();
    }
}
