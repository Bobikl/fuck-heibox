package org.apache.tools.ant.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: compiled from: KeepAliveOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class u0 extends FilterOutputStream {
    public u0(OutputStream outputStream) {
        super(outputStream);
    }

    private static PrintStream a(PrintStream printStream) {
        return new PrintStream(new u0(printStream));
    }

    public static PrintStream b() {
        return a(System.err);
    }

    public static PrintStream c() {
        return a(System.out);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
