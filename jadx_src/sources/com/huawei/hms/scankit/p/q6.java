package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ReedSolomonEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o3 f62260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<p3> f62261b;

    public q6(o3 o3Var) {
        this.f62260a = o3Var;
        ArrayList arrayList = new ArrayList();
        this.f62261b = arrayList;
        arrayList.add(new p3(o3Var, new int[]{1}));
    }

    private p3 a(int i10) throws Exception {
        if (i10 >= this.f62261b.size()) {
            List<p3> list = this.f62261b;
            p3 p3VarC = list.get(list.size() - 1);
            for (int size = this.f62261b.size(); size <= i10; size++) {
                o3 o3Var = this.f62260a;
                p3VarC = p3VarC.c(new p3(o3Var, new int[]{1, o3Var.a((size - 1) + o3Var.a())}));
                this.f62261b.add(p3VarC);
            }
        }
        return this.f62261b.get(i10);
    }

    public void a(int[] iArr, int i10) throws Exception {
        if (i10 == 0) {
            try {
                throw new IllegalArgumentException("No error correction bytes");
            } catch (Exception e10) {
                throw e10;
            }
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            try {
                throw new IllegalArgumentException("No data bytes provided");
            } catch (Exception e11) {
                throw e11;
            }
        }
        p3 p3VarA = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrA = new p3(this.f62260a, iArr2).a(i10, 1).b(p3VarA)[1].a();
        int length2 = i10 - iArrA.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArrA, 0, iArr, length + length2, iArrA.length);
    }
}
