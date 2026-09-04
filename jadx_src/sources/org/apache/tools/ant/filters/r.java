package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.m0;

/* JADX INFO: compiled from: SortFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends b implements c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f133248k = "reverse";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f133249l = "comparator";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Comparator<? super String> f133250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f133252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f133253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Iterator<String> f133254j;

    public r() {
        this.f133250f = null;
        this.f133253i = null;
        this.f133254j = null;
    }

    public r(Reader reader) {
        super(reader);
        this.f133250f = null;
        this.f133253i = null;
        this.f133254j = null;
    }

    private void m() {
        m0[] m0VarArrG = g();
        if (m0VarArrG != null) {
            for (m0 m0Var : m0VarArrG) {
                String strA = m0Var.a();
                if (f133248k.equals(strA)) {
                    p(Boolean.valueOf(m0Var.c()).booleanValue());
                } else if (f133249l.equals(strA)) {
                    try {
                        o((Comparator) Class.forName(m0Var.c()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (ClassCastException unused) {
                        throw new BuildException("Value of comparator attribute should implement java.util.Comparator interface");
                    } catch (Exception e10) {
                        throw new BuildException(e10);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private void q() {
        Comparator<? super String> comparator = this.f133250f;
        if (comparator != null) {
            this.f133252h.sort(comparator);
        } else if (n()) {
            this.f133252h.sort(Comparator.reverseOrder());
        } else {
            Collections.sort(this.f133252h);
        }
    }

    public void i(Comparator<? super String> comparator) {
        if (this.f133250f != null && comparator != null) {
            throw new BuildException("can't have more than one comparator");
        }
        o(comparator);
    }

    public Comparator<? super String> k() {
        return this.f133250f;
    }

    public boolean n() {
        return this.f133251g;
    }

    public void o(Comparator<? super String> comparator) {
        this.f133250f = comparator;
    }

    public void p(boolean z10) {
        this.f133251g = z10;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        if (!a()) {
            m();
            e(true);
        }
        String str = this.f133253i;
        if (str != null) {
            char cCharAt = str.charAt(0);
            if (this.f133253i.length() == 1) {
                this.f133253i = null;
                return cCharAt;
            }
            this.f133253i = this.f133253i.substring(1);
            return cCharAt;
        }
        if (this.f133252h == null) {
            this.f133252h = new ArrayList();
            while (true) {
                this.f133253i = d();
                String str2 = this.f133253i;
                if (str2 == null) {
                    break;
                }
                this.f133252h.add(str2);
            }
            q();
            this.f133254j = this.f133252h.iterator();
        }
        if (this.f133254j.hasNext()) {
            this.f133253i = this.f133254j.next();
        } else {
            this.f133253i = null;
            this.f133252h = null;
            this.f133254j = null;
        }
        if (this.f133253i != null) {
            return read();
        }
        return -1;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        r rVar = new r(reader);
        rVar.p(n());
        rVar.o(k());
        rVar.e(true);
        return rVar;
    }
}
