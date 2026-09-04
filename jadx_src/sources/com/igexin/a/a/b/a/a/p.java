package com.igexin.a.a.b.a.a;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BufferedOutputStream f63170a;

    public p(OutputStream outputStream) throws IOException {
        this.f63170a = new BufferedOutputStream(outputStream);
    }

    public void a(byte[] bArr) throws IOException {
        this.f63170a.write(bArr, 0, bArr.length);
        this.f63170a.flush();
    }
}
