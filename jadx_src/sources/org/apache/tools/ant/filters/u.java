package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: StripLineBreaks.java */
/* JADX INFO: loaded from: classes5.dex */
public final class u extends b implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f133258g = "\r\n";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f133259h = "linebreaks";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f133260f;

    public u() {
        this.f133260f = "\r\n";
    }

    public u(Reader reader) {
        super(reader);
        this.f133260f = "\r\n";
    }

    private String i() {
        return this.f133260f;
    }

    private void k() {
        String strC;
        m0[] m0VarArrG = g();
        if (m0VarArrG == null) {
            strC = null;
            break;
        }
        int length = m0VarArrG.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                strC = null;
                break;
            }
            m0 m0Var = m0VarArrG[i10];
            if (f133259h.equals(m0Var.a())) {
                strC = m0Var.c();
                break;
            }
            i10++;
        }
        if (strC != null) {
            this.f133260f = strC;
        }
    }

    public void m(String str) {
        this.f133260f = str;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            k();
            e(true);
        }
        int i10 = ((FilterReader) this).in.read();
        while (i10 != -1 && this.f133260f.indexOf(i10) != -1) {
            i10 = ((FilterReader) this).in.read();
        }
        return i10;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        u uVar = new u(reader);
        uVar.m(i());
        uVar.e(true);
        return uVar;
    }
}
