package com.google.android.gms.internal.common;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f52707a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f52708b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f52709c;

    b(int i10) {
    }

    private final void b(int i10) {
        Object[] objArr = this.f52707a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f52709c) {
                this.f52707a = (Object[]) objArr.clone();
                this.f52709c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f52707a = Arrays.copyOf(objArr, i11);
        this.f52709c = false;
    }

    @s9.a
    public final b a(Object obj) {
        obj.getClass();
        b(this.f52708b + 1);
        Object[] objArr = this.f52707a;
        int i10 = this.f52708b;
        this.f52708b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
