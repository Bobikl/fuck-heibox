package org.apache.tools.ant.taskdefs;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: LoadResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class p3 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f135509k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f135510l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135511m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135512n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135513o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.c0> f135514p = new Vector();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l2(int i10, org.apache.tools.ant.filters.util.i iVar) {
        if (this.f135509k.n2() != -1) {
            iVar.k(i10);
        }
    }

    @Override // org.apache.tools.ant.u2
    public final void D1() throws BuildException {
        String strA;
        org.apache.tools.ant.types.s1 s1Var = this.f135509k;
        if (s1Var == null) {
            throw new BuildException("source resource not defined");
        }
        if (this.f135513o == null) {
            throw new BuildException("output property not defined");
        }
        if (this.f135511m && this.f135510l) {
            throw new BuildException("quiet and failonerror cannot both be set to true");
        }
        if (!s1Var.p2()) {
            String str = this.f135509k + " doesn't exist";
            if (this.f135510l) {
                throw new BuildException(str);
            }
            x1(str, this.f135511m ? 1 : 0);
            return;
        }
        x1("loading " + this.f135509k + " into property " + this.f135513o, 3);
        String str2 = this.f135512n;
        Charset charsetDefaultCharset = str2 == null ? Charset.defaultCharset() : Charset.forName(str2);
        try {
            long jN2 = this.f135509k.n2();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("resource size = ");
            sb2.append(jN2 != -1 ? String.valueOf(jN2) : "unknown");
            x1(sb2.toString(), 4);
            final int i10 = (int) jN2;
            if (i10 != 0) {
                org.apache.tools.ant.filters.util.i.b bVarF = new org.apache.tools.ant.filters.util.i(b(), new InputStreamReader(new BufferedInputStream(this.f135509k.h2()), charsetDefaultCharset), this.f135514p).p(new Consumer() { // from class: org.apache.tools.ant.taskdefs.o3
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.f134637b.l2(i10, (org.apache.tools.ant.filters.util.i) obj);
                    }
                }).f();
                try {
                    strA = bVarF.a();
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
            } else {
                x1("Do not set property " + this.f135513o + " as its length is 0.", this.f135511m ? 3 : 2);
                strA = null;
            }
            if (strA == null || strA.isEmpty()) {
                return;
            }
            b().n1(this.f135513o, strA);
            x1("loaded " + strA.length() + " characters", 3);
            x1(this.f135513o + " := " + strA, 4);
        } catch (IOException e10) {
            String str3 = "Unable to load resource: " + e10;
            if (this.f135510l) {
                throw new BuildException(str3, e10, w1());
            }
            x1(str3, this.f135511m ? 3 : 0);
        } catch (BuildException e11) {
            if (this.f135510l) {
                throw e11;
            }
            x1(e11.getMessage(), this.f135511m ? 3 : 0);
        }
    }

    public void j2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var.size() != 1) {
            throw new BuildException("only single argument resource collections are supported");
        }
        this.f135509k = u1Var.iterator().next();
    }

    public final void k2(org.apache.tools.ant.types.c0 c0Var) {
        this.f135514p.add(c0Var);
    }

    public final void m2(String str) {
        this.f135512n = str;
    }

    public final void n2(boolean z10) {
        this.f135510l = z10;
    }

    public final void o2(String str) {
        this.f135513o = str;
    }

    public void p2(boolean z10) {
        this.f135511m = z10;
        if (z10) {
            this.f135510l = false;
        }
    }
}
