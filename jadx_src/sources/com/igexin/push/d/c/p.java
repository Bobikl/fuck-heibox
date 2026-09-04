package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class p extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63887a;

    public p() {
        this.f63827i = 20;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        if (bArr.length == 1) {
            this.f63887a = bArr[0] & 255;
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        return null;
    }
}
