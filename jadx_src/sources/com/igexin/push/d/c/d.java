package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f63830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f63831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f63832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f63833d;

    public d() {
        this.f63827i = 6;
        this.f63828j = com.google.common.base.a.f56671x;
        this.f63830a = "";
        this.f63831b = "";
        this.f63832c = "";
        this.f63833d = "";
    }

    public d(String str, String str2, String str3, String str4) {
        this.f63827i = 6;
        this.f63828j = com.google.common.base.a.f56671x;
        this.f63830a = str == null ? "" : str;
        this.f63831b = str2 == null ? "" : str2;
        this.f63832c = str3 == null ? "" : str3;
        this.f63833d = str4 == null ? "" : str4;
    }

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
        try {
            int iA = com.igexin.a.a.b.e.a(bArr, 0);
            this.f63830a = new String(bArr, 1, iA, "utf-8");
            int i10 = iA + 1;
            int iA2 = com.igexin.a.a.b.e.a(bArr, i10);
            int i11 = i10 + 1;
            this.f63831b = new String(bArr, i11, iA2, "utf-8");
            int i12 = i11 + iA2;
            int iA3 = com.igexin.a.a.b.e.a(bArr, i12);
            int i13 = i12 + 1;
            this.f63832c = new String(bArr, i13, iA3, "utf-8");
            int i14 = i13 + iA3;
            this.f63833d = new String(bArr, i14 + 1, com.igexin.a.a.b.e.a(bArr, i14), "utf-8");
        } catch (Exception unused) {
        }
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        byte[] bytes = this.f63831b.getBytes();
        byte[] bytes2 = this.f63830a.getBytes();
        byte[] bytes3 = this.f63832c.getBytes();
        byte[] bytes4 = this.f63833d.getBytes();
        byte[] bArr = new byte[bytes.length + bytes2.length + bytes3.length + bytes4.length + 4];
        com.igexin.a.a.b.e.c(bytes.length, bArr, 0);
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        int length = 1 + bytes.length;
        int i10 = length + 1;
        com.igexin.a.a.b.e.c(bytes2.length, bArr, length);
        System.arraycopy(bytes2, 0, bArr, i10, bytes2.length);
        int length2 = i10 + bytes2.length;
        int i11 = length2 + 1;
        com.igexin.a.a.b.e.c(bytes3.length, bArr, length2);
        System.arraycopy(bytes3, 0, bArr, i11, bytes3.length);
        int length3 = i11 + bytes3.length;
        com.igexin.a.a.b.e.c(bytes4.length, bArr, length3);
        System.arraycopy(bytes4, 0, bArr, length3 + 1, bytes4.length);
        return bArr;
    }
}
