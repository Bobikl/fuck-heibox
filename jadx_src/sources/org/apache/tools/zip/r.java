package org.apache.tools.zip;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ZipEncoding.java */
/* JADX INFO: loaded from: classes5.dex */
public interface r {
    ByteBuffer a(String str) throws IOException;

    boolean b(String str);

    String decode(byte[] bArr) throws IOException;
}
