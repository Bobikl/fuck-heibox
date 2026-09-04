package org.apache.tools.ant.filters;

import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import java.util.Properties;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.p2;
import org.apache.tools.ant.types.j1;

/* JADX INFO: compiled from: ExpandProperties.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends a implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f133158h = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private char[] f133159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j1 f133161g;

    public h() {
    }

    public h(Reader reader) {
        super(reader);
    }

    public void g(j1 j1Var) {
        if (this.f133161g != null) {
            throw new BuildException("expandproperties filter accepts only one propertyset");
        }
        this.f133161g = j1Var;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        org.apache.tools.ant.property.a aVarU;
        if (this.f133160f > -1) {
            if (this.f133159e == null) {
                String strC = c();
                Project projectB = b();
                j1 j1Var = this.f133161g;
                if (j1Var == null) {
                    aVarU = p2.u(projectB);
                } else {
                    final Properties propertiesA2 = j1Var.A2();
                    Objects.requireNonNull(propertiesA2);
                    aVarU = new org.apache.tools.ant.property.a() { // from class: org.apache.tools.ant.filters.g
                        @Override // org.apache.tools.ant.property.a
                        public final Object getProperty(String str) {
                            return propertiesA2.getProperty(str);
                        }
                    };
                }
                Object objG = new org.apache.tools.ant.property.m(projectB, p2.u(projectB).k(), aVarU).g(strC);
                this.f133159e = objG == null ? new char[0] : objG.toString().toCharArray();
            }
            int i10 = this.f133160f;
            char[] cArr = this.f133159e;
            if (i10 < cArr.length) {
                this.f133160f = i10 + 1;
                return cArr[i10];
            }
            this.f133160f = -1;
        }
        return -1;
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        h hVar = new h(reader);
        hVar.f(b());
        hVar.g(this.f133161g);
        return hVar;
    }
}
