package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class kr extends kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107808a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private kb f930a;

    public kr(int i10) {
        this.f930a = new kb(i10);
    }

    @Override // com.xiaomi.push.kt
    public int a(byte[] bArr, int i10, int i11) {
        byte[] bArrM637a = this.f930a.m637a();
        if (i11 > this.f930a.a() - this.f107808a) {
            i11 = this.f930a.a() - this.f107808a;
        }
        if (i11 > 0) {
            System.arraycopy(bArrM637a, this.f107808a, bArr, i10, i11);
            this.f107808a += i11;
        }
        return i11;
    }

    @Override // com.xiaomi.push.kt
    /* JADX INFO: renamed from: a */
    public void mo652a(byte[] bArr, int i10, int i11) throws IOException {
        this.f930a.write(bArr, i10, i11);
    }

    public int a_() {
        return this.f930a.size();
    }
}
