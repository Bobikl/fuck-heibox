package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: StripJavaComments.java */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends a implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f133255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f133256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133257g;

    public t() {
        this.f133255e = -1;
        this.f133256f = false;
        this.f133257g = false;
    }

    public t(Reader reader) {
        super(reader);
        this.f133255e = -1;
        this.f133256f = false;
        this.f133257g = false;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i10 = this.f133255e;
        if (i10 != -1) {
            this.f133255e = -1;
            return i10;
        }
        int i11 = ((FilterReader) this).in.read();
        if (i11 == 34 && !this.f133257g) {
            this.f133256f = !this.f133256f;
            this.f133257g = false;
            return i11;
        }
        if (i11 == 92) {
            this.f133257g = !this.f133257g;
            return i11;
        }
        this.f133257g = false;
        if (this.f133256f || i11 != 47) {
            return i11;
        }
        int i12 = ((FilterReader) this).in.read();
        if (i12 == 47) {
            while (i12 != 10 && i12 != -1 && i12 != 13) {
                i12 = ((FilterReader) this).in.read();
            }
            return i12;
        }
        if (i12 != 42) {
            this.f133255e = i12;
            return 47;
        }
        while (i12 != -1) {
            i12 = ((FilterReader) this).in.read();
            if (i12 == 42) {
                i12 = ((FilterReader) this).in.read();
                while (i12 == 42) {
                    i12 = ((FilterReader) this).in.read();
                }
                if (i12 == 47) {
                    return read();
                }
            }
        }
        return i12;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        return new t(reader);
    }
}
