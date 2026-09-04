package org.apache.tools.ant.filters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: ConcatFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends b implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f133152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f133153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Reader f133154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Reader f133155i;

    public e() {
        this.f133154h = null;
        this.f133155i = null;
    }

    public e(Reader reader) {
        super(reader);
        this.f133154h = null;
        this.f133155i = null;
    }

    private void m() throws IOException {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                String strA = m0Var.a();
                if ("prepend".equals(strA)) {
                    o(new File(m0Var.c()));
                } else if ("append".equals(strA)) {
                    n(new File(m0Var.c()));
                }
            }
        }
        File file = this.f133152f;
        if (file != null) {
            if (!file.isAbsolute()) {
                this.f133152f = new File(b().Z(), this.f133152f.getPath());
            }
            this.f133154h = new BufferedReader(new FileReader(this.f133152f));
        }
        File file2 = this.f133153g;
        if (file2 != null) {
            if (!file2.isAbsolute()) {
                this.f133153g = new File(b().Z(), this.f133153g.getPath());
            }
            this.f133155i = new BufferedReader(new FileReader(this.f133153g));
        }
    }

    public File i() {
        return this.f133153g;
    }

    public File k() {
        return this.f133152f;
    }

    public void n(File file) {
        this.f133153g = file;
    }

    public void o(File file) {
        this.f133152f = file;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i10;
        Reader reader;
        if (!a()) {
            m();
            e(true);
        }
        Reader reader2 = this.f133154h;
        if (reader2 != null) {
            i10 = reader2.read();
            if (i10 == -1) {
                this.f133154h.close();
                this.f133154h = null;
            }
        } else {
            i10 = -1;
        }
        if (i10 == -1) {
            i10 = super.read();
        }
        if (i10 == -1 && (reader = this.f133155i) != null && (i10 = reader.read()) == -1) {
            this.f133155i.close();
            this.f133155i = null;
        }
        return i10;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        e eVar = new e(reader);
        eVar.o(k());
        eVar.n(i());
        return eVar;
    }
}
