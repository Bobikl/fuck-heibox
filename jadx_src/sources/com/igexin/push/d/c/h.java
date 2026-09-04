package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f63855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f63856b;

    public h() {
        this.f63827i = 97;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        this.f63855a = bArr[0];
        this.f63856b = bArr[1];
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        return new byte[]{this.f63855a, this.f63856b};
    }
}
