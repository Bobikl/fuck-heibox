package io.reactivex.internal.util;

import java.util.ArrayList;

/* JADX INFO: compiled from: LinkedArrayList.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f123871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f123872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f123873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile int f123874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f123875e;

    public h(int i10) {
        this.f123871a = i10;
    }

    public void a(Object obj) {
        if (this.f123874d == 0) {
            Object[] objArr = new Object[this.f123871a + 1];
            this.f123872b = objArr;
            this.f123873c = objArr;
            objArr[0] = obj;
            this.f123875e = 1;
            this.f123874d = 1;
            return;
        }
        int i10 = this.f123875e;
        int i11 = this.f123871a;
        if (i10 != i11) {
            this.f123873c[i10] = obj;
            this.f123875e = i10 + 1;
            this.f123874d++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f123873c[i11] = objArr2;
            this.f123873c = objArr2;
            this.f123875e = 1;
            this.f123874d++;
        }
    }

    public Object[] b() {
        return this.f123872b;
    }

    public int c() {
        return this.f123874d;
    }

    public String toString() {
        int i10 = this.f123871a;
        int i11 = this.f123874d;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrB = b();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrB[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrB = (Object[]) objArrB[i10];
                i13 = 0;
            }
        }
        return arrayList.toString();
    }
}
