package com.igexin.push.d.c;

/* JADX INFO: loaded from: classes.dex */
public class j extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f63862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f63863b;

    @Override // com.igexin.push.d.c.c
    public void a(byte[] bArr) {
    }

    @Override // com.igexin.push.d.c.c
    public byte[] c() {
        byte b10 = this.f63862a;
        byte[] bytes = (b10 == 1 || b10 == 2 || (b10 != 3 && (b10 == 4 || b10 == 5))) ? ((String) this.f63863b).getBytes() : null;
        if (bytes == null) {
            return null;
        }
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = this.f63862a;
        bArr[1] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return bArr;
    }
}
