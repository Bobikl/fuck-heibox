package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.util.s2;

/* JADX INFO: compiled from: EscapeUnicode.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends b implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private StringBuffer f133156f;

    public f() {
        this.f133156f = new StringBuffer();
    }

    public f(Reader reader) {
        super(reader);
        this.f133156f = new StringBuffer();
    }

    private void i() {
    }

    @Override // java.io.FilterReader, java.io.Reader
    public final int read() throws IOException {
        char c10;
        if (!a()) {
            i();
            e(true);
        }
        if (this.f133156f.length() > 0) {
            char cCharAt = this.f133156f.charAt(0);
            this.f133156f.deleteCharAt(0);
            return cCharAt;
        }
        int i10 = ((FilterReader) this).in.read();
        if (i10 == -1 || (c10 = (char) i10) < 128) {
            return i10;
        }
        this.f133156f = s2.a(c10);
        return 92;
    }

    @Override // org.apache.tools.ant.filters.c
    public final Reader t0(Reader reader) {
        f fVar = new f(reader);
        fVar.e(true);
        return fVar;
    }
}
