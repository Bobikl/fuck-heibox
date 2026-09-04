package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.SignedBytes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements i0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45898c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45899d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45900e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45901f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f45902g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f45903h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f45904i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f45905j = 134;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a2> f45907b;

    /* JADX INFO: compiled from: DefaultTsPayloadReaderFactory.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j() {
        this(0);
    }

    public j(int i10) {
        this(i10, ImmutableList.B());
    }

    public j(int i10, List<a2> list) {
        this.f45906a = i10;
        this.f45907b = list;
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<a2> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f45907b;
        }
        com.google.android.exoplayer2.util.e0 e0Var = new com.google.android.exoplayer2.util.e0(bVar.f45891d);
        List<a2> arrayList = this.f45907b;
        while (e0Var.a() > 0) {
            int iG = e0Var.G();
            int iE = e0Var.e() + e0Var.G();
            if (iG == 134) {
                arrayList = new ArrayList<>();
                int iG2 = e0Var.G() & 31;
                for (int i11 = 0; i11 < iG2; i11++) {
                    String strD = e0Var.D(3);
                    int iG3 = e0Var.G();
                    boolean z10 = (iG3 & 128) != 0;
                    if (z10) {
                        i10 = iG3 & 63;
                        str = com.google.android.exoplayer2.util.y.f51595r0;
                    } else {
                        str = com.google.android.exoplayer2.util.y.f51593q0;
                        i10 = 1;
                    }
                    byte bG = (byte) e0Var.G();
                    e0Var.T(1);
                    List<byte[]> listB = null;
                    if (z10) {
                        listB = com.google.android.exoplayer2.util.f.b((bG & SignedBytes.f59068a) != 0);
                    }
                    arrayList.add(new a2.b().e0(str).V(strD).F(i10).T(listB).E());
                }
            }
            e0Var.S(iE);
        }
        return arrayList;
    }

    private boolean f(int i10) {
        return (i10 & this.f45906a) != 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0.c
    @p0
    public i0 a(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f45889b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 == 27) {
                if (f(4)) {
                    return null;
                }
                return new w(new p(c(bVar), f(1), f(8)));
            }
            if (i10 == 36) {
                return new w(new q(c(bVar)));
            }
            if (i10 == 89) {
                return new w(new l(bVar.f45890c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w(new f(bVar.f45889b));
                }
                if (i10 == 257) {
                    return new c0(new v(com.google.android.exoplayer2.util.y.G0));
                }
                if (i10 == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new c0(new v(com.google.android.exoplayer2.util.y.A0));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (f(2)) {
                                return null;
                            }
                            return new w(new i(false, bVar.f45889b));
                        case 16:
                            return new w(new o(d(bVar)));
                        case 17:
                            if (f(2)) {
                                return null;
                            }
                            return new w(new s(bVar.f45889b));
                        default:
                            switch (i10) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new w(new c(bVar.f45889b));
            }
            return new w(new k(bVar.f45889b));
        }
        return new w(new n(d(bVar)));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.i0.c
    public SparseArray<i0> b() {
        return new SparseArray<>();
    }
}
