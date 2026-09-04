package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: BaseFilterReader.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends FilterReader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f133145d = 8192;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f133146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Project f133147c;

    public a() {
        super(new StringReader(""));
        this.f133146b = false;
        this.f133147c = null;
        j0.e(this);
    }

    public a(Reader reader) {
        super(reader);
        this.f133146b = false;
        this.f133147c = null;
    }

    protected final boolean a() {
        return this.f133146b;
    }

    protected final Project b() {
        return this.f133147c;
    }

    protected final String c() throws IOException {
        return j0.k0(((FilterReader) this).in, 8192);
    }

    protected final String d() throws IOException {
        int i10 = ((FilterReader) this).in.read();
        if (i10 == -1) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (i10 != -1) {
            stringBuffer.append((char) i10);
            if (i10 == 10) {
                break;
            }
            i10 = ((FilterReader) this).in.read();
        }
        return stringBuffer.toString();
    }

    protected final void e(boolean z10) {
        this.f133146b = z10;
    }

    public final void f(Project project) {
        this.f133147c = project;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = read();
            if (i13 == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            cArr[i10 + i12] = (char) i13;
        }
        return i11;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public final long skip(long j10) throws IOException, IllegalArgumentException {
        if (j10 < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        for (long j11 = 0; j11 < j10; j11++) {
            if (read() == -1) {
                return j11;
            }
        }
        return j10;
    }
}
