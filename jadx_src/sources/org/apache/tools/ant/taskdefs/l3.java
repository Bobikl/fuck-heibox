package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.PrintStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Length.java */
/* JADX INFO: loaded from: classes5.dex */
public class l3 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.taskdefs.condition.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f134441r = "all";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f134442s = "each";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f134443t = "string";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f134444u = "Use of the Length condition requires that the length attribute be set.";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f134447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134448n = "all";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.types.q f134449o = org.apache.tools.ant.types.q.f136292d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Long f134450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.f1 f134451q;

    /* JADX INFO: compiled from: Length.java */
    public class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f134452c;

        a() {
            super(null);
            this.f134452c = 0L;
        }

        protected a(PrintStream printStream) {
            super(printStream);
            this.f134452c = 0L;
        }

        @Override // org.apache.tools.ant.taskdefs.l3.e
        protected synchronized void c(org.apache.tools.ant.types.s1 s1Var) {
            long jN2 = s1Var.n2();
            if (jN2 == -1) {
                l3.this.x1("Size unknown for " + s1Var.toString(), 1);
            } else {
                this.f134452c += jN2;
            }
        }

        protected long d() {
            return this.f134452c;
        }
    }

    /* JADX INFO: compiled from: Length.java */
    public class b extends a {
        b(PrintStream printStream) {
            super(printStream);
        }

        @Override // org.apache.tools.ant.taskdefs.l3.e
        void a() {
            b().print(d());
            super.a();
        }
    }

    /* JADX INFO: compiled from: Length.java */
    public class c extends e {
        c(PrintStream printStream) {
            super(printStream);
        }

        @Override // org.apache.tools.ant.taskdefs.l3.e
        protected void c(org.apache.tools.ant.types.s1 s1Var) {
            b().print(s1Var.toString());
            b().print(" : ");
            long jN2 = s1Var.n2();
            if (jN2 == -1) {
                b().println("unknown");
            } else {
                b().println(jN2);
            }
        }
    }

    /* JADX INFO: compiled from: Length.java */
    public static class d extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final String[] f134456c = {l3.f134442s, "all"};

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f134456c;
        }
    }

    /* JADX INFO: compiled from: Length.java */
    public abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PrintStream f134457a;

        e(PrintStream printStream) {
            this.f134457a = printStream;
        }

        void a() {
            org.apache.tools.ant.util.j0.d(this.f134457a);
        }

        protected PrintStream b() {
            return this.f134457a;
        }

        protected abstract void c(org.apache.tools.ant.types.s1 s1Var);
    }

    /* JADX INFO: compiled from: Length.java */
    public static class f extends org.apache.tools.ant.types.q {
    }

    private static long k2(String str, boolean z10) {
        if (z10) {
            str = str.trim();
        }
        return str.length();
    }

    private void m2(e eVar) {
        for (org.apache.tools.ant.types.s1 s1Var : this.f134451q) {
            if (!s1Var.p2()) {
                x1(s1Var + " does not exist", 1);
            }
            if (s1Var.o2()) {
                x1(s1Var + " is a directory; length may not be meaningful", 1);
            }
            eVar.c(s1Var);
        }
        eVar.a();
    }

    private void w2() {
        if (this.f134446l != null) {
            if (this.f134451q != null) {
                throw new BuildException("the string length function is incompatible with the file/resource length function");
            }
            if (!"string".equals(this.f134448n)) {
                throw new BuildException("the mode attribute is for use with the file/resource length function");
            }
            return;
        }
        if (this.f134451q == null) {
            throw new BuildException("you must set either the string attribute or specify one or more files using the file attribute or nested resource collections");
        }
        if (f134442s.equals(this.f134448n) || "all".equals(this.f134448n)) {
            if (this.f134447m != null) {
                throw new BuildException("the trim attribute is for use with the string length function only");
            }
        } else {
            throw new BuildException("invalid mode setting for file/resource length function: \"" + this.f134448n + "\"");
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        w2();
        PrintStream printStream = new PrintStream(this.f134445k == null ? new r3((org.apache.tools.ant.u2) this, 2) : new org.apache.tools.ant.util.g1(b(), this.f134445k));
        String str = this.f134448n;
        str.hashCode();
        switch (str) {
            case "string":
                printStream.print(k2(this.f134446l, l2()));
                printStream.close();
                break;
            case "all":
                m2(new b(printStream));
                break;
            case "each":
                m2(new c(printStream));
                break;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() {
        Long lValueOf;
        w2();
        if (this.f134450p == null) {
            throw new BuildException(f134444u);
        }
        if ("string".equals(this.f134448n)) {
            lValueOf = Long.valueOf(k2(this.f134446l, l2()));
        } else {
            a aVar = new a();
            m2(aVar);
            lValueOf = Long.valueOf(aVar.d());
        }
        return this.f134449o.h(lValueOf.compareTo(this.f134450p));
    }

    public synchronized void i2(org.apache.tools.ant.types.b0 b0Var) {
        j2(b0Var);
    }

    public synchronized void j2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var == null) {
            return;
        }
        org.apache.tools.ant.types.resources.f1 f1Var = this.f134451q;
        if (f1Var == null) {
            f1Var = new org.apache.tools.ant.types.resources.f1();
        }
        this.f134451q = f1Var;
        f1Var.g2(u1Var);
    }

    public boolean l2() {
        return Boolean.TRUE.equals(this.f134447m);
    }

    public synchronized void n2(File file) {
        j2(new org.apache.tools.ant.types.resources.z(file));
    }

    public synchronized void o2(long j10) {
        this.f134450p = Long.valueOf(j10);
    }

    public synchronized void p2(d dVar) {
        this.f134448n = dVar.d();
    }

    public synchronized void q2(String str) {
        this.f134445k = str;
    }

    public synchronized void r2(org.apache.tools.ant.types.s1 s1Var) {
        j2(s1Var);
    }

    public synchronized void s2(String str) {
        this.f134446l = str;
        this.f134448n = "string";
    }

    public synchronized void t2(boolean z10) {
        this.f134447m = Boolean.valueOf(z10);
    }

    public synchronized void u2(f fVar) {
        v2(fVar);
    }

    public synchronized void v2(org.apache.tools.ant.types.q qVar) {
        this.f134449o = qVar;
    }
}
