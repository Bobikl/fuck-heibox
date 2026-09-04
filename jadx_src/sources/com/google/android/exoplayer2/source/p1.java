package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p1 implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f48607f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n1[] f48610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p1 f48606e = new p1(new n1[0]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<p1> f48608g = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.source.o1
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return p1.g(bundle);
        }
    };

    public p1(n1... n1VarArr) {
        this.f48610c = n1VarArr;
        this.f48609b = n1VarArr.length;
    }

    private static String f(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p1 g(Bundle bundle) {
        return new p1((n1[]) com.google.android.exoplayer2.util.d.c(n1.f48598g, bundle.getParcelableArrayList(f(0)), ImmutableList.B()).toArray(new n1[0]));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f(0), com.google.android.exoplayer2.util.d.g(Lists.t(this.f48610c)));
        return bundle;
    }

    public n1 c(int i10) {
        return this.f48610c[i10];
    }

    public int d(n1 n1Var) {
        for (int i10 = 0; i10 < this.f48609b; i10++) {
            if (this.f48610c[i10] == n1Var) {
                return i10;
            }
        }
        return -1;
    }

    public boolean e() {
        return this.f48609b == 0;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p1.class != obj.getClass()) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f48609b == p1Var.f48609b && Arrays.equals(this.f48610c, p1Var.f48610c);
    }

    public int hashCode() {
        if (this.f48611d == 0) {
            this.f48611d = Arrays.hashCode(this.f48610c);
        }
        return this.f48611d;
    }
}
