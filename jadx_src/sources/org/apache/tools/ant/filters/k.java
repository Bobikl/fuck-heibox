package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import java.util.Vector;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: LineContains.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends b implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f133216j = "contains";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f133217k = "negate";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Vector<String> f133218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f133220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f133221i;

    /* JADX INFO: compiled from: LineContains.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133222a;

        public final String a() {
            return this.f133222a;
        }

        public final void b(String str) {
            this.f133222a = str;
        }
    }

    public k() {
        this.f133218f = new Vector<>();
        this.f133219g = null;
        this.f133220h = false;
        this.f133221i = false;
    }

    public k(Reader reader) {
        super(reader);
        this.f133218f = new Vector<>();
        this.f133219g = null;
        this.f133220h = false;
        this.f133221i = false;
    }

    private Vector<String> k() {
        return this.f133218f;
    }

    private void m() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if (f133216j.equals(m0Var.b())) {
                    this.f133218f.addElement(m0Var.c());
                } else if ("negate".equals(m0Var.b())) {
                    r(Project.t1(m0Var.c()));
                }
            }
        }
    }

    private void p(Vector<String> vector) {
        this.f133218f = vector;
    }

    public void i(a aVar) {
        this.f133218f.addElement(aVar.a());
    }

    public boolean n() {
        return this.f133221i;
    }

    public boolean o() {
        return this.f133220h;
    }

    public void q(boolean z10) {
        this.f133221i = z10;
    }

    public void r(boolean z10) {
        this.f133220h = z10;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        boolean zContains;
        if (!a()) {
            m();
            e(true);
        }
        String str = this.f133219g;
        if (str != null) {
            char cCharAt = str.charAt(0);
            if (this.f133219g.length() == 1) {
                this.f133219g = null;
                return cCharAt;
            }
            this.f133219g = this.f133219g.substring(1);
            return cCharAt;
        }
        int size = this.f133218f.size();
        do {
            this.f133219g = d();
            if (this.f133219g == null) {
                break;
            }
            zContains = true;
            for (int i10 = 0; i10 < size; i10++) {
                zContains = this.f133219g.contains(this.f133218f.elementAt(i10));
                if (!zContains) {
                    if (!this.f133221i) {
                        break;
                    }
                } else {
                    if (this.f133221i) {
                        break;
                    }
                }
            }
        } while (!(o() ^ zContains));
        if (this.f133219g != null) {
            return read();
        }
        return -1;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        k kVar = new k(reader);
        kVar.p(k());
        kVar.r(o());
        kVar.q(n());
        return kVar;
    }
}
