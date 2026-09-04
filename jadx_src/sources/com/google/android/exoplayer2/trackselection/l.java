package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e4;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.o3;
import com.google.android.exoplayer2.p3;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* JADX INFO: compiled from: MappingTrackSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private a f50107c;

    /* JADX INFO: compiled from: MappingTrackSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f50108h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f50109i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f50110j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f50111k = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f50113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f50114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p1[] f50115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f50116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f50117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final p1 f50118g;

        @j1
        a(String[] strArr, int[] iArr, p1[] p1VarArr, int[] iArr2, int[][][] iArr3, p1 p1Var) {
            this.f50113b = strArr;
            this.f50114c = iArr;
            this.f50115d = p1VarArr;
            this.f50117f = iArr3;
            this.f50116e = iArr2;
            this.f50118g = p1Var;
            this.f50112a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f50115d[i10].c(i11).f48599b;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iH = h(i10, i11, i14);
                if (iH == 4 || (z10 && iH == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f50115d[i10].c(i11).c(iArr[i12]).f43593m;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !u0.c(str, str2);
                }
                iMin = Math.min(iMin, n3.c(this.f50117f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f50116e[i10]) : iMin;
        }

        public int c() {
            return this.f50112a;
        }

        public String d(int i10) {
            return this.f50113b[i10];
        }

        public int e(int i10) {
            int iMax = 0;
            for (int[] iArr : this.f50117f[i10]) {
                for (int i11 : iArr) {
                    int iD = n3.d(i11);
                    int i12 = 2;
                    if (iD == 0 || iD == 1 || iD == 2) {
                        i12 = 1;
                    } else if (iD != 3) {
                        if (iD == 4) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    iMax = Math.max(iMax, i12);
                }
            }
            return iMax;
        }

        public int f(int i10) {
            return this.f50114c[i10];
        }

        public p1 g(int i10) {
            return this.f50115d[i10];
        }

        public int h(int i10, int i11, int i12) {
            return n3.d(this.f50117f[i10][i11][i12]);
        }

        public int i(int i10) {
            int iMax = 0;
            for (int i11 = 0; i11 < this.f50112a; i11++) {
                if (this.f50114c[i11] == i10) {
                    iMax = Math.max(iMax, e(i11));
                }
            }
            return iMax;
        }

        public p1 j() {
            return this.f50118g;
        }
    }

    @j1
    static e4 i(o[] oVarArr, a aVar) {
        ImmutableList.a aVar2 = new ImmutableList.a();
        for (int i10 = 0; i10 < aVar.c(); i10++) {
            p1 p1VarG = aVar.g(i10);
            o oVar = oVarArr[i10];
            for (int i11 = 0; i11 < p1VarG.f48609b; i11++) {
                n1 n1VarC = p1VarG.c(i11);
                int i12 = n1VarC.f48599b;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < n1VarC.f48599b; i13++) {
                    iArr[i13] = aVar.h(i10, i11, i13);
                    zArr[i13] = (oVar == null || oVar.h() != n1VarC || oVar.g(i13) == -1) ? false : true;
                }
                aVar2.a(new e4.a(n1VarC, iArr, aVar.f(i10), zArr));
            }
        }
        p1 p1VarJ = aVar.j();
        for (int i14 = 0; i14 < p1VarJ.f48609b; i14++) {
            n1 n1VarC2 = p1VarJ.c(i14);
            int[] iArr2 = new int[n1VarC2.f48599b];
            Arrays.fill(iArr2, 0);
            aVar2.a(new e4.a(n1VarC2, iArr2, com.google.android.exoplayer2.util.y.l(n1VarC2.c(0).f43593m), new boolean[n1VarC2.f48599b]));
        }
        return new e4(aVar2.e());
    }

    private static int j(o3[] o3VarArr, n1 n1Var, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = o3VarArr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < o3VarArr.length; i11++) {
            o3 o3Var = o3VarArr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < n1Var.f48599b; i12++) {
                iMax = Math.max(iMax, n3.d(o3Var.a(n1Var.c(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] l(o3 o3Var, n1 n1Var) throws ExoPlaybackException {
        int[] iArr = new int[n1Var.f48599b];
        for (int i10 = 0; i10 < n1Var.f48599b; i10++) {
            iArr[i10] = o3Var.a(n1Var.c(i10));
        }
        return iArr;
    }

    private static int[] m(o3[] o3VarArr) throws ExoPlaybackException {
        int length = o3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = o3VarArr[i10].v();
        }
        return iArr;
    }

    @Override // com.google.android.exoplayer2.trackselection.w
    public final void f(@p0 Object obj) {
        this.f50107c = (a) obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.w
    public final x g(o3[] o3VarArr, p1 p1Var, f0.a aVar, z3 z3Var) throws ExoPlaybackException {
        int[] iArr = new int[o3VarArr.length + 1];
        int length = o3VarArr.length + 1;
        n1[][] n1VarArr = new n1[length][];
        int[][][] iArr2 = new int[o3VarArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = p1Var.f48609b;
            n1VarArr[i10] = new n1[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrM = m(o3VarArr);
        for (int i12 = 0; i12 < p1Var.f48609b; i12++) {
            n1 n1VarC = p1Var.c(i12);
            int iJ = j(o3VarArr, n1VarC, iArr, com.google.android.exoplayer2.util.y.l(n1VarC.c(0).f43593m) == 5);
            int[] iArrL = iJ == o3VarArr.length ? new int[n1VarC.f48599b] : l(o3VarArr[iJ], n1VarC);
            int i13 = iArr[iJ];
            n1VarArr[iJ][i13] = n1VarC;
            iArr2[iJ][i13] = iArrL;
            iArr[iJ] = i13 + 1;
        }
        p1[] p1VarArr = new p1[o3VarArr.length];
        String[] strArr = new String[o3VarArr.length];
        int[] iArr3 = new int[o3VarArr.length];
        for (int i14 = 0; i14 < o3VarArr.length; i14++) {
            int i15 = iArr[i14];
            p1VarArr[i14] = new p1((n1[]) u0.Z0(n1VarArr[i14], i15));
            iArr2[i14] = (int[][]) u0.Z0(iArr2[i14], i15);
            strArr[i14] = o3VarArr[i14].getName();
            iArr3[i14] = o3VarArr[i14].d();
        }
        a aVar2 = new a(strArr, iArr3, p1VarArr, iArrM, iArr2, new p1((n1[]) u0.Z0(n1VarArr[o3VarArr.length], iArr[o3VarArr.length])));
        Pair<p3[], j[]> pairN = n(aVar2, iArr2, iArrM, aVar, z3Var);
        return new x((p3[]) pairN.first, (j[]) pairN.second, i((o[]) pairN.second, aVar2), aVar2);
    }

    @p0
    public final a k() {
        return this.f50107c;
    }

    protected abstract Pair<p3[], j[]> n(a aVar, int[][][] iArr, int[] iArr2, f0.a aVar2, z3 z3Var) throws ExoPlaybackException;
}
