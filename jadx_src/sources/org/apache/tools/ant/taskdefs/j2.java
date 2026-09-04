package org.apache.tools.ant.taskdefs;

import java.util.Collection;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Input.java */
/* JADX INFO: loaded from: classes5.dex */
public class j2 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134319k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134320l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f134321m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134322n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f134323o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f134324p;

    /* JADX INFO: compiled from: Input.java */
    public class a extends v0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f134325o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private b f134326p = null;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f134327q = null;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.apache.tools.ant.input.c A2() {
            b bVar = this.f134326p;
            if (bVar != null) {
                return bVar.i();
            }
            if (this.f134325o == null) {
                String str = this.f134327q;
                if (str != null) {
                    return (org.apache.tools.ant.input.c) org.apache.tools.ant.util.i.k(str, n2(), org.apache.tools.ant.input.c.class);
                }
                throw new BuildException("Must specify refid, classname or type");
            }
            try {
                return (org.apache.tools.ant.input.c) b().w0(this.f134325o);
            } catch (ClassCastException e10) {
                throw new BuildException(this.f134325o + " does not denote an InputHandler", e10);
            }
        }

        public String B2() {
            return this.f134325o;
        }

        public b C2() {
            return this.f134326p;
        }

        public void D2(String str) {
            this.f134327q = str;
        }

        public void E2(String str) {
            this.f134325o = str;
        }

        public void F2(b bVar) {
            this.f134326p = bVar;
        }

        public String z2() {
            return this.f134327q;
        }
    }

    /* JADX INFO: compiled from: Input.java */
    public static class b extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f134329c = {"default", "propertyfile", "greedy", "secure"};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final org.apache.tools.ant.input.c[] f134330d = {new org.apache.tools.ant.input.a(), new org.apache.tools.ant.input.f(), new org.apache.tools.ant.input.b(), new org.apache.tools.ant.input.g()};

        /* JADX INFO: Access modifiers changed from: private */
        public org.apache.tools.ant.input.c i() {
            return f134330d[b()];
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f134329c;
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        String str;
        if (this.f134321m != null && b().u0(this.f134321m) != null) {
            log("skipping " + K1() + " as property " + this.f134321m + " has already been set.");
            return;
        }
        String str2 = this.f134319k;
        org.apache.tools.ant.input.d eVar = str2 != null ? new org.apache.tools.ant.input.e(this.f134320l, (Collection<String>) org.apache.tools.ant.util.j2.l(str2, 44)) : new org.apache.tools.ant.input.d(this.f134320l);
        eVar.e(this.f134322n);
        a aVar = this.f134323o;
        (aVar == null ? b().p0() : aVar.A2()).a(eVar);
        String strB = eVar.b();
        if ((strB == null || strB.trim().isEmpty()) && (str = this.f134322n) != null) {
            strB = str;
        }
        if (this.f134321m == null || strB == null) {
            return;
        }
        b().n1(this.f134321m, strB);
    }

    public void i2(String str) {
        if (this.f134324p && str.trim().isEmpty()) {
            return;
        }
        this.f134320l += b().V0(str);
    }

    public a j2() {
        if (this.f134323o != null) {
            throw new BuildException("Cannot define > 1 nested input handler");
        }
        a aVar = new a();
        this.f134323o = aVar;
        return aVar;
    }

    public void k2(String str) {
        this.f134321m = str;
    }

    public void l2(String str) {
        this.f134322n = str;
    }

    public void m2(String str) {
        this.f134320l = str;
        this.f134324p = true;
    }

    public void n2(String str) {
        this.f134319k = str;
    }
}
