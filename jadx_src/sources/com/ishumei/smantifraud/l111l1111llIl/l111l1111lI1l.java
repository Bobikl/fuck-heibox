package com.ishumei.smantifraud.l111l1111llIl;

import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111lI1l {
    public static byte[] l1111l111111Il(byte[] bArr) {
        int iInflate;
        byte[] bArr2 = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        while (!inflater.finished() && (iInflate = inflater.inflate(bArr2)) > 0) {
            byteArrayOutputStream.write(bArr2, 0, iInflate);
        }
        inflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
