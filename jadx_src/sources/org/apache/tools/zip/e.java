package org.apache.tools.zip;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: FallbackZipEncoding.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f137401a;

    public e() {
        this.f137401a = null;
    }

    public e(String str) {
        this.f137401a = str;
    }

    @Override // org.apache.tools.zip.r
    public ByteBuffer a(String str) throws IOException {
        String str2 = this.f137401a;
        return str2 == null ? ByteBuffer.wrap(str.getBytes()) : ByteBuffer.wrap(str.getBytes(str2));
    }

    @Override // org.apache.tools.zip.r
    public boolean b(String str) {
        return true;
    }

    @Override // org.apache.tools.zip.r
    public String decode(byte[] bArr) throws IOException {
        String str = this.f137401a;
        return str == null ? new String(bArr) : new String(bArr, str);
    }
}
