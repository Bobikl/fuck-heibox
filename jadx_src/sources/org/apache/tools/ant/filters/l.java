package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Vector;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.m0;
import org.apache.tools.ant.types.r1;

/* JADX INFO: compiled from: LineContainsRegExp.java */
/* JADX INFO: loaded from: classes5.dex */
public final class l extends b implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f133223j = "regexp";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f133224k = "negate";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f133225l = "casesensitive";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Vector<r1> f133226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f133228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f133229i;

    public l() {
        this.f133226f = new Vector<>();
        this.f133227g = null;
        this.f133228h = false;
        this.f133229i = 0;
    }

    public l(Reader reader) {
        super(reader);
        this.f133226f = new Vector<>();
        this.f133227g = null;
        this.f133228h = false;
        this.f133229i = 0;
    }

    private Vector<r1> k() {
        return this.f133226f;
    }

    private void m() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if ("regexp".equals(m0Var.b())) {
                    q(m0Var.c());
                } else if ("negate".equals(m0Var.b())) {
                    p(Project.t1(m0Var.c()));
                } else if ("casesensitive".equals(m0Var.b())) {
                    o(Project.t1(m0Var.c()));
                }
            }
        }
    }

    private void r(Vector<r1> vector) {
        this.f133226f = vector;
    }

    public void i(r1 r1Var) {
        this.f133226f.addElement(r1Var);
    }

    public boolean n() {
        return this.f133228h;
    }

    public void o(boolean z10) {
        this.f133229i = org.apache.tools.ant.util.regexp.g.b(z10);
    }

    public void p(boolean z10) {
        this.f133228h = z10;
    }

    public void q(String str) {
        r1 r1Var = new r1();
        r1Var.j2(str);
        this.f133226f.addElement(r1Var);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        boolean z10;
        if (!a()) {
            m();
            e(true);
        }
        String str = this.f133227g;
        if (str != null) {
            char cCharAt = str.charAt(0);
            if (this.f133227g.length() == 1) {
                this.f133227g = null;
                return cCharAt;
            }
            this.f133227g = this.f133227g.substring(1);
            return cCharAt;
        }
        do {
            this.f133227g = d();
            if (this.f133227g == null) {
                break;
            }
            Iterator<r1> it = this.f133226f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!it.next().g2(b()).e(this.f133227g, this.f133229i)) {
                    z10 = false;
                    break;
                }
            }
        } while (!(z10 ^ n()));
        if (this.f133227g != null) {
            return read();
        }
        return -1;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        l lVar = new l(reader);
        lVar.r(k());
        lVar.p(n());
        lVar.o(!org.apache.tools.ant.util.regexp.g.d(this.f133229i, 256));
        return lVar;
    }
}
