package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: PrefixLines.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f133231h = "prefix";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133233g;

    public n() {
        this.f133232f = null;
        this.f133233g = null;
    }

    public n(Reader reader) {
        super(reader);
        this.f133232f = null;
        this.f133233g = null;
    }

    private String i() {
        return this.f133232f;
    }

    private void k() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if (f133231h.equals(m0Var.a())) {
                    this.f133232f = m0Var.c();
                    return;
                }
            }
        }
    }

    public void m(String str) {
        this.f133232f = str;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            k();
            e(true);
        }
        String str = this.f133233g;
        if (str != null && str.isEmpty()) {
            this.f133233g = null;
        }
        String str2 = this.f133233g;
        if (str2 != null) {
            char cCharAt = str2.charAt(0);
            String strSubstring = this.f133233g.substring(1);
            this.f133233g = strSubstring;
            if (!strSubstring.isEmpty()) {
                return cCharAt;
            }
            this.f133233g = null;
            return cCharAt;
        }
        String strD = d();
        this.f133233g = strD;
        if (strD == null) {
            return -1;
        }
        if (this.f133232f != null) {
            this.f133233g = this.f133232f + this.f133233g;
        }
        return read();
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        n nVar = new n(reader);
        nVar.m(i());
        nVar.e(true);
        return nVar;
    }
}
