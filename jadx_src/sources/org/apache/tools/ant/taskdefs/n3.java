package org.apache.tools.ant.taskdefs;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: LoadProperties.java */
/* JADX INFO: loaded from: classes5.dex */
public class n3 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f134606k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.c0> f134607l = new Vector();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f134608m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134609n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134610o = true;

    private synchronized org.apache.tools.ant.types.resources.l0 m2() {
        org.apache.tools.ant.types.s1 s1Var = this.f134606k;
        if (s1Var == null) {
            org.apache.tools.ant.types.resources.l0 l0Var = new org.apache.tools.ant.types.resources.l0();
            this.f134606k = l0Var;
            l0Var.J(b());
        } else if (!(s1Var instanceof org.apache.tools.ant.types.resources.l0)) {
            throw new BuildException("expected a java resource as source");
        }
        return (org.apache.tools.ant.types.resources.l0) this.f134606k;
    }

    @Override // org.apache.tools.ant.u2
    public final void D1() throws BuildException {
        org.apache.tools.ant.types.s1 s1Var = this.f134606k;
        if (s1Var == null) {
            throw new BuildException("A source resource is required.");
        }
        if (!s1Var.p2()) {
            if (!(this.f134606k instanceof org.apache.tools.ant.types.resources.l0)) {
                throw new BuildException("Source resource does not exist: " + this.f134606k);
            }
            x1("Unable to find resource " + this.f134606k, 1);
            return;
        }
        String str = this.f134608m;
        try {
            org.apache.tools.ant.filters.util.i.b bVarF = new org.apache.tools.ant.filters.util.i(b(), new InputStreamReader(new BufferedInputStream(this.f134606k.h2()), str == null ? Charset.defaultCharset() : Charset.forName(str)), this.f134607l).f();
            try {
                String strA = bVarF.a();
                if (strA != null && !strA.isEmpty()) {
                    if (!strA.endsWith("\n")) {
                        strA = strA + "\n";
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(strA.getBytes(StandardCharsets.ISO_8859_1));
                    Properties properties = new Properties();
                    properties.load(byteArrayInputStream);
                    b5 b5Var = new b5();
                    b5Var.B1(this);
                    b5Var.Q2(this.f134609n);
                    b5Var.R2(this.f134610o);
                    b5Var.k2(properties);
                }
                bVarF.close();
            } catch (Throwable th2) {
                if (bVarF != null) {
                    try {
                        bVarF.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to load file: " + e10, e10, w1());
        }
    }

    public synchronized void i2(org.apache.tools.ant.types.u1 u1Var) {
        if (this.f134606k != null) {
            throw new BuildException("only a single source is supported");
        }
        if (u1Var.size() != 1) {
            throw new BuildException("only single-element resource collections are supported");
        }
        this.f134606k = u1Var.iterator().next();
    }

    public final void j2(org.apache.tools.ant.types.c0 c0Var) {
        this.f134607l.add(c0Var);
    }

    public org.apache.tools.ant.types.o0 k2() {
        return m2().w2();
    }

    public org.apache.tools.ant.types.o0 l2() {
        return m2().y2();
    }

    public void n2(org.apache.tools.ant.types.o0 o0Var) {
        m2().C2(o0Var);
    }

    public void o2(org.apache.tools.ant.types.q1 q1Var) {
        m2().D2(q1Var);
    }

    public final void p2(String str) {
        this.f134608m = str;
    }

    public void q2(String str) {
        this.f134609n = str;
    }

    public void r2(boolean z10) {
        this.f134610o = z10;
    }

    public void s2(String str) {
        m2().t2(str);
    }

    public final void t2(File file) {
        i2(new org.apache.tools.ant.types.resources.z(file));
    }
}
