package com.igexin.a.a.b.a.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    BufferedInputStream f63169a;

    public o(InputStream inputStream) throws IOException {
        this.f63169a = new BufferedInputStream(inputStream);
    }

    public int a(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            i11 = this.f63169a.read(bArr, i10, length - i10);
            if (i11 <= 0) {
                throw new IOException("read = -1, end of stream !");
            }
            i10 += i11;
        }
        return i11;
    }
}
