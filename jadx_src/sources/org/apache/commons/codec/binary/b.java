package org.apache.commons.codec.binary;

import java.io.InputStream;

/* JADX INFO: compiled from: Base32InputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends h {
    public b(InputStream inputStream) {
        this(inputStream, false);
    }

    public b(InputStream inputStream, boolean z10) {
        super(inputStream, new a(false), z10);
    }

    public b(InputStream inputStream, boolean z10, int i10, byte[] bArr) {
        super(inputStream, new a(i10, bArr), z10);
    }
}
