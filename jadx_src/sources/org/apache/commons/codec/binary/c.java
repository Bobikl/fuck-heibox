package org.apache.commons.codec.binary;

import java.io.OutputStream;

/* JADX INFO: compiled from: Base32OutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends i {
    public c(OutputStream outputStream) {
        this(outputStream, true);
    }

    public c(OutputStream outputStream, boolean z10) {
        super(outputStream, new a(false), z10);
    }

    public c(OutputStream outputStream, boolean z10, int i10, byte[] bArr) {
        super(outputStream, new a(i10, bArr), z10);
    }
}
