package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: UPCEANReader.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q7 extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f62262c = {1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f62263d = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f62264e = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[][] f62265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f62266g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f62267a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7 f62268b = new p7();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f62265f = iArr;
        int[][] iArr2 = new int[20][];
        f62266g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f62265f[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f62266g[i10] = iArr4;
        }
    }

    protected q7() {
    }

    static int a(r rVar, int[] iArr, int i10, int[][] iArr2) throws a {
        g5.a(rVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.46f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fA = g5.a(iArr, iArr2[i12], 0.8f);
            if (fA < f10) {
                i11 = i12;
                f10 = fA;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw a.a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    private void a(s6 s6Var, int[] iArr, int i10, r rVar, Map<l1, ?> map) throws a {
        int length;
        boolean z10 = true;
        try {
            s6 s6VarA = this.f62268b.a(i10, rVar, iArr[1]);
            s6Var.a(s6VarA.j());
            length = s6VarA.k().length();
        } catch (a unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(l1.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            for (int i11 : iArr2) {
                if (length == i11) {
                    if (z10) {
                        throw a.a();
                    }
                }
            }
            z10 = false;
            if (z10) {
                throw a.a();
            }
        }
    }

    public static boolean a(CharSequence charSequence) throws a {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return b(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    static int[] a(r rVar) throws a {
        return b(rVar, 0);
    }

    static int[] a(r rVar, int i10, boolean z10, int[] iArr) throws a {
        return a(rVar, i10, z10, iArr, new int[iArr.length]);
    }

    private static int[] a(r rVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws a {
        int iE = rVar.e();
        int iD = z10 ? rVar.d(i10) : rVar.c(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = iD;
        while (iD < iE) {
            if (rVar.b(iD) == z11) {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (g5.a(iArr2, iArr, 0.8f) < 0.46f) {
                        return new int[]{i12, iD};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            } else {
                if (i11 < 0 || i11 >= iArr2.length) {
                    throw a.a();
                }
                iArr2[i11] = iArr2[i11] + 1;
            }
            iD++;
        }
        throw a.a();
    }

    public static int b(CharSequence charSequence) throws a {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw a.a();
            }
            i10 += iCharAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw a.a();
            }
            i12 += iCharAt2;
        }
        return (1000 - i12) % 10;
    }

    static ArrayList<int[]> b(r rVar) throws a {
        int iE = rVar.e() / 2;
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i10 = 0;
        while (i10 < iE) {
            try {
                int[] iArrB = b(rVar, i10);
                arrayList.add(iArrB);
                i10 = iArrB[0] + 1;
            } catch (a unused) {
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        throw a.a();
    }

    static int[] b(r rVar, int i10) throws a {
        int[] iArr = new int[f62262c.length];
        int[] iArrA = null;
        boolean zA = false;
        while (!zA) {
            int[] iArr2 = f62262c;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrA = a(rVar, i10, false, iArr2, iArr);
            int i11 = iArrA[0];
            int i12 = iArrA[1];
            int i13 = i11 - (i12 - i11);
            int i14 = i13 + 3;
            while (i13 <= i14 && (i13 < 0 || !(zA = rVar.a(i13, i11, false, true)))) {
                i13++;
            }
            i10 = i12;
        }
        return iArrA;
    }

    protected abstract int a(r rVar, int[] iArr, StringBuilder sb2) throws a;

    abstract BarcodeFormat a();

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i10, r rVar, Map<l1, ?> map) throws a {
        return a(i10, rVar, a(rVar), map);
    }

    public s6 a(int i10, r rVar, int[] iArr, Map<l1, ?> map) throws a {
        v6 v6Var = map == null ? null : (v6) map.get(l1.NEED_RESULT_POINT_CALLBACK);
        if (v6Var != null) {
            v6Var.a(new u6((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f62267a;
        sb2.setLength(0);
        int iA = a(rVar, iArr, sb2);
        if (v6Var != null) {
            v6Var.a(new u6(iA, i10));
        }
        int[] iArrA = a(rVar, iA);
        if (iArrA[0] - iA > 1) {
            throw a.a();
        }
        if (v6Var != null) {
            v6Var.a(new u6((iArrA[0] + iArrA[1]) / 2.0f, i10));
        }
        if (!a(iArr, iArrA)) {
            throw a.a();
        }
        int i11 = iArrA[1];
        if ((i11 - iArrA[0]) + i11 >= rVar.e() || !a(iArrA[0], i11, rVar)) {
            throw a.a();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw a.a();
        }
        if (!a(string)) {
            throw a.a();
        }
        float f10 = i10;
        s6 s6Var = new s6(string, null, new u6[]{new u6(iArr[0], f10), new u6(iArrA[1], f10)}, a());
        a(s6Var, iArrA, i10, rVar, map);
        return s6Var;
    }

    abstract boolean a(int i10, int i11, r rVar);

    boolean a(String str) throws a {
        return a((CharSequence) str);
    }

    abstract boolean a(int[] iArr, int[] iArr2) throws a;

    int[] a(r rVar, int i10) throws a {
        return a(rVar, i10, false, f62262c);
    }
}
