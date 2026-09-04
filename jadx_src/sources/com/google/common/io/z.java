package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: MultiReader.java */
/* JADX INFO: loaded from: classes7.dex */
@p
@o9.c
public class z extends Reader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterator<? extends j> f58723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private Reader f58724c;

    z(Iterator<? extends j> it) throws IOException {
        this.f58723b = it;
        a();
    }

    private void a() throws IOException {
        close();
        if (this.f58723b.hasNext()) {
            this.f58724c = this.f58723b.next().m();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f58724c;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f58724c = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        com.google.common.base.w.E(cArr);
        Reader reader = this.f58724c;
        if (reader == null) {
            return -1;
        }
        int i12 = reader.read(cArr, i10, i11);
        if (i12 != -1) {
            return i12;
        }
        a();
        return read(cArr, i10, i11);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f58724c;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j10) throws IOException {
        com.google.common.base.w.e(j10 >= 0, "n is negative");
        if (j10 > 0) {
            while (true) {
                Reader reader = this.f58724c;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j10);
                if (jSkip > 0) {
                    return jSkip;
                }
                a();
            }
        }
        return 0L;
    }
}
