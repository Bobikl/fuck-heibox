package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.types.m0;
import org.apache.tools.ant.util.z0;

/* JADX INFO: compiled from: HeadFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class j extends b implements c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f133206m = "lines";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f133207n = "skip";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f133208o = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f133209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f133210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f133211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z0 f133212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f133213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f133214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f133215l;

    public j() {
        this.f133209f = 0L;
        this.f133210g = 10L;
        this.f133211h = 0L;
        this.f133212i = null;
        this.f133213j = null;
        this.f133214k = 0;
    }

    public j(Reader reader) {
        super(reader);
        this.f133209f = 0L;
        this.f133210g = 10L;
        this.f133211h = 0L;
        this.f133212i = null;
        this.f133213j = null;
        this.f133214k = 0;
        z0 z0Var = new z0();
        this.f133212i = z0Var;
        z0Var.B1(true);
    }

    private long i() {
        return this.f133210g;
    }

    private long k() {
        return this.f133211h;
    }

    private String m(String str) {
        long j10 = this.f133209f + 1;
        this.f133209f = j10;
        long j11 = this.f133211h;
        if (j11 > 0 && j10 - 1 < j11) {
            return null;
        }
        long j12 = this.f133210g;
        if (j12 <= 0 || j10 <= j12 + j11) {
            return str;
        }
        this.f133215l = true;
        return null;
    }

    private void n() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                String strA = m0Var.a();
                if (f133206m.equals(strA)) {
                    this.f133210g = Long.parseLong(m0Var.c());
                } else if ("skip".equals(strA)) {
                    this.f133211h = Long.parseLong(m0Var.c());
                }
            }
        }
    }

    public void o(long j10) {
        this.f133210g = j10;
    }

    public void p(long j10) {
        this.f133211h = j10;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            n();
            e(true);
        }
        while (true) {
            String str = this.f133213j;
            if (str != null && !str.isEmpty()) {
                char cCharAt = this.f133213j.charAt(this.f133214k);
                int i10 = this.f133214k + 1;
                this.f133214k = i10;
                if (i10 == this.f133213j.length()) {
                    this.f133213j = null;
                }
                return cCharAt;
            }
            String strH = this.f133212i.h(((FilterReader) this).in);
            this.f133213j = strH;
            if (strH == null) {
                return -1;
            }
            this.f133213j = m(strH);
            if (this.f133215l) {
                return -1;
            }
            this.f133214k = 0;
        }
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        j jVar = new j(reader);
        jVar.o(i());
        jVar.p(k());
        jVar.e(true);
        return jVar;
    }
}
