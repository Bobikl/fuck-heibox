package com.huawei.hms.scankit.p;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* JADX INFO: compiled from: State.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final b7 f61587e = new b7(i7.f61956b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i7 f61589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f61591d;

    private b7(i7 i7Var, int i10, int i11, int i12) {
        this.f61589b = i7Var;
        this.f61588a = i10;
        this.f61590c = i11;
        this.f61591d = i12;
    }

    int a() {
        return this.f61590c;
    }

    b7 a(int i10) {
        int i11;
        i7 i7VarA = this.f61589b;
        int i12 = this.f61588a;
        int i13 = this.f61591d;
        if (i12 == 4 || i12 == 2) {
            int i14 = c4.f61628c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            i7VarA = i7VarA.a(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.f61590c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else {
            i11 = i17 == 62 ? 9 : 8;
        }
        b7 b7Var = new b7(i7VarA, i12, i17 + 1, i13 + i11);
        return b7Var.f61590c == 2078 ? b7Var.b(i10 + 1) : b7Var;
    }

    b7 a(int i10, int i11) {
        int i12 = this.f61591d;
        i7 i7VarA = this.f61589b;
        int i13 = this.f61588a;
        if (i10 != i13) {
            int i14 = c4.f61628c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            i7VarA = i7VarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new b7(i7VarA.a(i11, i17), i10, 0, i12 + i17);
    }

    r a(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (i7 i7VarA = b(bArr.length).f61589b; i7VarA != null; i7VarA = i7VarA.a()) {
            linkedList.addFirst(i7VarA);
        }
        r rVar = new r();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((i7) it.next()).a(rVar, bArr);
        }
        return rVar;
    }

    boolean a(b7 b7Var) {
        int i10;
        int i11 = this.f61591d + (c4.f61628c[this.f61588a][b7Var.f61588a] >> 16);
        int i12 = b7Var.f61590c;
        if (i12 > 0 && ((i10 = this.f61590c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= b7Var.f61591d;
    }

    int b() {
        return this.f61591d;
    }

    b7 b(int i10) {
        int i11 = this.f61590c;
        return i11 == 0 ? this : new b7(this.f61589b.b(i10 - i11, i11), this.f61588a, 0, this.f61591d);
    }

    b7 b(int i10, int i11) {
        i7 i7VarA = this.f61589b;
        int i12 = this.f61588a;
        int i13 = i12 == 2 ? 4 : 5;
        if (i12 >= 0) {
            int[][] iArr = c4.f61630e;
            if (i12 < iArr.length && i10 > 0) {
                int[] iArr2 = iArr[i12];
                if (i10 < iArr2.length) {
                    i7VarA = i7VarA.a(iArr2[i10], i13);
                }
            }
        }
        return new b7(i7VarA.a(i11, 5), this.f61588a, 0, this.f61591d + i13 + 5);
    }

    int c() {
        return this.f61588a;
    }

    public String toString() {
        try {
            String[] strArr = c4.f61627b;
            if (w7.a(strArr, this.f61588a)) {
                return String.format(Locale.ENGLISH, "%s bits=%d bytes=%d", strArr[this.f61588a], Integer.valueOf(this.f61591d), Integer.valueOf(this.f61590c));
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }
}
