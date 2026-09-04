package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: TabsToSpaces.java */
/* JADX INFO: loaded from: classes5.dex */
public final class x extends b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f133277h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f133278i = "tablength";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f133280g;

    public x() {
        this.f133279f = 8;
        this.f133280g = 0;
    }

    public x(Reader reader) {
        super(reader);
        this.f133279f = 8;
        this.f133280g = 0;
    }

    private int i() {
        return this.f133279f;
    }

    private void k() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if (m0Var != null && f133278i.equals(m0Var.a())) {
                    this.f133279f = Integer.parseInt(m0Var.c());
                    return;
                }
            }
        }
    }

    public void m(int i10) {
        this.f133279f = i10;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            k();
            e(true);
        }
        int i10 = this.f133280g;
        if (i10 > 0) {
            this.f133280g = i10 - 1;
            return 32;
        }
        int i11 = ((FilterReader) this).in.read();
        if (i11 != 9) {
            return i11;
        }
        this.f133280g = this.f133279f - 1;
        return 32;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        x xVar = new x(reader);
        xVar.m(i());
        xVar.e(true);
        return xVar;
    }
}
