package com.github.penfeizhou.animation.io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: Reader.java */
/* JADX INFO: loaded from: classes6.dex */
public interface e {
    InputStream a() throws IOException;

    int available() throws IOException;

    void close() throws IOException;

    byte peek() throws IOException;

    int position();

    int read(byte[] bArr, int i10, int i11) throws IOException;

    void reset() throws IOException;

    long skip(long j10) throws IOException;
}
