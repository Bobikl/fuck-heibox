package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42698a;

    public a(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        this.f42698a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f42698a += (long) i11;
    }
}
