package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.a2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n1 implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48596e = "TrackGroup";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f48597f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<n1> f48598g = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.source.m1
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return n1.f(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a2[] f48600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48601d;

    public n1(a2... a2VarArr) {
        com.google.android.exoplayer2.util.a.a(a2VarArr.length > 0);
        this.f48600c = a2VarArr;
        this.f48599b = a2VarArr.length;
        j();
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n1 f(Bundle bundle) {
        return new n1((a2[]) com.google.android.exoplayer2.util.d.c(a2.L3, bundle.getParcelableArrayList(e(0)), ImmutableList.B()).toArray(new a2[0]));
    }

    private static void g(String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("Different ");
        sb2.append(str);
        sb2.append(" combined in one TrackGroup: '");
        sb2.append(str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i10);
        sb2.append(")");
        com.google.android.exoplayer2.util.u.e(f48596e, "", new IllegalStateException(sb2.toString()));
    }

    private static String h(@androidx.annotation.p0 String str) {
        return (str == null || str.equals(com.google.android.exoplayer2.j.f46383c1)) ? "" : str;
    }

    private static int i(int i10) {
        return i10 | 16384;
    }

    private void j() {
        String strH = h(this.f48600c[0].f43584d);
        int i10 = i(this.f48600c[0].f43586f);
        int i11 = 1;
        while (true) {
            a2[] a2VarArr = this.f48600c;
            if (i11 >= a2VarArr.length) {
                return;
            }
            if (!strH.equals(h(a2VarArr[i11].f43584d))) {
                a2[] a2VarArr2 = this.f48600c;
                g("languages", a2VarArr2[0].f43584d, a2VarArr2[i11].f43584d, i11);
                return;
            } else {
                if (i10 != i(this.f48600c[i11].f43586f)) {
                    g("role flags", Integer.toBinaryString(this.f48600c[0].f43586f), Integer.toBinaryString(this.f48600c[i11].f43586f), i11);
                    return;
                }
                i11++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e(0), com.google.android.exoplayer2.util.d.g(Lists.t(this.f48600c)));
        return bundle;
    }

    public a2 c(int i10) {
        return this.f48600c[i10];
    }

    public int d(a2 a2Var) {
        int i10 = 0;
        while (true) {
            a2[] a2VarArr = this.f48600c;
            if (i10 >= a2VarArr.length) {
                return -1;
            }
            if (a2Var == a2VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f48599b == n1Var.f48599b && Arrays.equals(this.f48600c, n1Var.f48600c);
    }

    public int hashCode() {
        if (this.f48601d == 0) {
            this.f48601d = bb.c.b.f30674h7 + Arrays.hashCode(this.f48600c);
        }
        return this.f48601d;
    }
}
