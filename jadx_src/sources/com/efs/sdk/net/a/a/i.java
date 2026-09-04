package com.efs.sdk.net.a.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }
}
