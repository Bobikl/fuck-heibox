package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedList;
import org.apache.tools.ant.types.m0;
import org.apache.tools.ant.util.z0;

/* JADX INFO: compiled from: TailFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class y extends b implements c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f133281m = "lines";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f133282n = "skip";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f133283o = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f133284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f133285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f133286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z0 f133287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f133288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f133289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private LinkedList<String> f133290l;

    public y() {
        this.f133284f = 10L;
        this.f133285g = 0L;
        this.f133286h = false;
        this.f133287i = null;
        this.f133288j = null;
        this.f133289k = 0;
        this.f133290l = new LinkedList<>();
    }

    public y(Reader reader) {
        super(reader);
        this.f133284f = 10L;
        this.f133285g = 0L;
        this.f133286h = false;
        this.f133287i = null;
        this.f133288j = null;
        this.f133289k = 0;
        this.f133290l = new LinkedList<>();
        z0 z0Var = new z0();
        this.f133287i = z0Var;
        z0Var.B1(true);
    }

    private long i() {
        return this.f133284f;
    }

    private long k() {
        return this.f133285g;
    }

    private void m() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                String strA = m0Var.a();
                if (f133281m.equals(strA)) {
                    n(Long.parseLong(m0Var.c()));
                } else if ("skip".equals(strA)) {
                    this.f133285g = Long.parseLong(m0Var.c());
                }
            }
        }
    }

    private String p(String str) {
        if (!this.f133286h) {
            if (str != null) {
                this.f133290l.add(str);
                long j10 = this.f133284f;
                if (j10 == -1) {
                    return ((long) this.f133290l.size()) > this.f133285g ? this.f133290l.removeFirst() : "";
                }
                long j11 = this.f133285g;
                if (j10 + (j11 > 0 ? j11 : 0L) >= this.f133290l.size()) {
                    return "";
                }
                this.f133290l.removeFirst();
                return "";
            }
            this.f133286h = true;
            if (this.f133285g > 0) {
                for (int i10 = 0; i10 < this.f133285g; i10++) {
                    this.f133290l.removeLast();
                }
            }
            if (this.f133284f > -1) {
                while (this.f133290l.size() > this.f133284f) {
                    this.f133290l.removeFirst();
                }
            }
        }
        if (this.f133290l.size() > 0) {
            return this.f133290l.removeFirst();
        }
        return null;
    }

    public void n(long j10) {
        this.f133284f = j10;
    }

    public void o(long j10) {
        this.f133285g = j10;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            m();
            e(true);
        }
        while (true) {
            String str = this.f133288j;
            if (str != null && !str.isEmpty()) {
                char cCharAt = this.f133288j.charAt(this.f133289k);
                int i10 = this.f133289k + 1;
                this.f133289k = i10;
                if (i10 == this.f133288j.length()) {
                    this.f133288j = null;
                }
                return cCharAt;
            }
            String strH = this.f133287i.h(((FilterReader) this).in);
            this.f133288j = strH;
            String strP = p(strH);
            this.f133288j = strP;
            if (strP == null) {
                return -1;
            }
            this.f133289k = 0;
        }
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        y yVar = new y(reader);
        yVar.n(i());
        yVar.o(k());
        yVar.e(true);
        return yVar;
    }
}
