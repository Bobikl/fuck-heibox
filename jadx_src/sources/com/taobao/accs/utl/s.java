package com.taobao.accs.utl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class s extends ByteArrayInputStream {
    public s(byte[] bArr) {
        super(bArr);
    }

    public int a() {
        return read() & 255;
    }

    public String a(int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = read(bArr);
        if (i11 == i10) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i10 + " but read for " + i11);
    }

    public int b() {
        return (a() << 8) | a();
    }

    public byte[] c() throws IOException {
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }
}
