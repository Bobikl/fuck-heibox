package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.OutputStream;
import org.apache.tools.ant.BuildException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: EchoXML.java */
/* JADX INFO: loaded from: classes5.dex */
public class h1 extends org.apache.tools.ant.util.x2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f134224j = "No nested XML specified";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f134225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f134226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f134227i = a.f134231f;

    /* JADX INFO: compiled from: EchoXML.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f134228c = "ignore";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134229d = "elementsOnly";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f134230e = "all";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f134231f = new a("ignore");

        public a() {
        }

        public a(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"ignore", f134229d, "all"};
        }

        public org.apache.tools.ant.util.y.a h() {
            String strD = d();
            if ("ignore".equalsIgnoreCase(strD)) {
                return org.apache.tools.ant.util.y.a.f137004c;
            }
            if (f134229d.equalsIgnoreCase(strD)) {
                return org.apache.tools.ant.util.y.a.f137005d;
            }
            if ("all".equalsIgnoreCase(strD)) {
                return org.apache.tools.ant.util.y.a.f137006e;
            }
            throw new BuildException("Invalid namespace policy: " + strD);
        }
    }

    public void K1() {
        Node firstChild = I1().getFirstChild();
        if (firstChild == null) {
            throw new BuildException(f134224j);
        }
        org.apache.tools.ant.util.y yVar = new org.apache.tools.ant.util.y(!this.f134226h, this.f134227i.h());
        try {
            File file = this.f134225g;
            OutputStream r3Var = file == null ? new r3(this, 2) : org.apache.tools.ant.util.j0.h0(file.toPath(), this.f134226h);
            try {
                yVar.p((Element) firstChild, r3Var);
                if (r3Var != null) {
                    r3Var.close();
                }
            } catch (Throwable th2) {
                if (r3Var != null) {
                    try {
                        r3Var.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (BuildException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new BuildException(e11);
        }
    }

    public void L1(boolean z10) {
        this.f134226h = z10;
    }

    public void N1(File file) {
        this.f134225g = file;
    }

    public void O1(a aVar) {
        this.f134227i = aVar;
    }
}
