package org.apache.commons.codec.binary;

import java.io.InputStream;

/* JADX INFO: compiled from: Base64InputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends h {
    public e(InputStream inputStream) {
        this(inputStream, false);
    }

    public e(InputStream inputStream, boolean z10) {
        super(inputStream, new d(false), z10);
    }

    public e(InputStream inputStream, boolean z10, int i10, byte[] bArr) {
        super(inputStream, new d(i10, bArr), z10);
    }
}
