package org.apache.commons.codec.binary;

import java.io.OutputStream;

/* JADX INFO: compiled from: Base64OutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends i {
    public f(OutputStream outputStream) {
        this(outputStream, true);
    }

    public f(OutputStream outputStream, boolean z10) {
        super(outputStream, new d(false), z10);
    }

    public f(OutputStream outputStream, boolean z10, int i10, byte[] bArr) {
        super(outputStream, new d(i10, bArr), z10);
    }
}
