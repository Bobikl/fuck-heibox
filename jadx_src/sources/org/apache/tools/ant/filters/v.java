package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import java.util.Vector;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: StripLineComments.java */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f133270h = "comment";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Vector<String> f133271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f133272g;

    /* JADX INFO: compiled from: StripLineComments.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133273a;

        public void a(String str) {
            c(str);
        }

        public final String b() {
            return this.f133273a;
        }

        public final void c(String str) {
            if (this.f133273a != null) {
                throw new IllegalStateException("Comment value already set.");
            }
            this.f133273a = str;
        }
    }

    public v() {
        this.f133271f = new Vector<>();
        this.f133272g = null;
    }

    public v(Reader reader) {
        super(reader);
        this.f133271f = new Vector<>();
        this.f133272g = null;
    }

    private Vector<String> k() {
        return this.f133271f;
    }

    private void m() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                if ("comment".equals(m0Var.b())) {
                    this.f133271f.addElement(m0Var.c());
                }
            }
        }
    }

    private void n(Vector<String> vector) {
        this.f133271f = vector;
    }

    public void i(a aVar) {
        this.f133271f.addElement(aVar.b());
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            m();
            e(true);
        }
        String str = this.f133272g;
        if (str != null) {
            char cCharAt = str.charAt(0);
            if (this.f133272g.length() == 1) {
                this.f133272g = null;
                return cCharAt;
            }
            this.f133272g = this.f133272g.substring(1);
            return cCharAt;
        }
        this.f133272g = d();
        int size = this.f133271f.size();
        while (this.f133272g != null) {
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f133272g.startsWith(this.f133271f.elementAt(i10))) {
                    this.f133272g = null;
                    break;
                }
            }
            if (this.f133272g != null) {
                break;
            }
            this.f133272g = d();
        }
        if (this.f133272g != null) {
            return read();
        }
        return -1;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        v vVar = new v(reader);
        vVar.n(k());
        vVar.e(true);
        return vVar;
    }
}
