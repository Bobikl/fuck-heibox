package org.apache.tools.ant.taskdefs;

import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: GenerateKey.java */
/* JADX INFO: loaded from: classes5.dex */
public class a2 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f133701k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f133702l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f133703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f133704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f133705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f133706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f133707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f133708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected String f133709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected a f133710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f133711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f133712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f133713w;

    /* JADX INFO: compiled from: GenerateKey.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<b> f133714a = new Vector();

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String e(b bVar) {
            return c(bVar.a()) + ContainerUtils.KEY_VALUE_DELIMITER + c(bVar.b());
        }

        public Object b() {
            b bVar = new b();
            this.f133714a.add(bVar);
            return bVar;
        }

        public String c(String str) {
            return y1.a("\\,", str.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        }

        public Enumeration<b> d() {
            return Collections.enumeration(this.f133714a);
        }

        public String toString() {
            return (String) this.f133714a.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.z1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f136026a.e((a2.b) obj);
                }
            }).collect(Collectors.joining(", "));
        }
    }

    /* JADX INFO: compiled from: GenerateKey.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f133716b;

        public String a() {
            return this.f133715a;
        }

        public String b() {
            return this.f133716b;
        }

        public boolean c() {
            return (this.f133715a == null || this.f133716b == null) ? false : true;
        }

        public void d(String str) {
            this.f133715a = str;
        }

        public void e(String str) {
            this.f133716b = str;
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f133701k == null) {
            throw new BuildException(i6.f134299a0);
        }
        if (this.f133703m == null) {
            throw new BuildException(i6.f134300b0);
        }
        if (this.f133709s == null && this.f133710t == null) {
            throw new BuildException("dname must be set");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("-genkey ");
        if (this.f133713w) {
            sb2.append("-v ");
        }
        sb2.append("-alias \"");
        sb2.append(this.f133701k);
        sb2.append("\" ");
        if (this.f133709s != null) {
            sb2.append("-dname \"");
            sb2.append(this.f133709s);
            sb2.append("\" ");
        }
        if (this.f133710t != null) {
            sb2.append("-dname \"");
            sb2.append(this.f133710t);
            sb2.append("\" ");
        }
        if (this.f133702l != null) {
            sb2.append("-keystore \"");
            sb2.append(this.f133702l);
            sb2.append("\" ");
        }
        if (this.f133703m != null) {
            sb2.append("-storepass \"");
            sb2.append(this.f133703m);
            sb2.append("\" ");
        }
        if (this.f133704n != null) {
            sb2.append("-storetype \"");
            sb2.append(this.f133704n);
            sb2.append("\" ");
        }
        sb2.append("-keypass \"");
        String str = this.f133705o;
        if (str != null) {
            sb2.append(str);
        } else {
            sb2.append(this.f133703m);
        }
        sb2.append("\" ");
        if (this.f133706p != null) {
            sb2.append("-sigalg \"");
            sb2.append(this.f133706p);
            sb2.append("\" ");
        }
        if (this.f133707q != null) {
            sb2.append("-keyalg \"");
            sb2.append(this.f133707q);
            sb2.append("\" ");
        }
        if (this.f133711u > 0) {
            sb2.append("-keysize \"");
            sb2.append(this.f133711u);
            sb2.append("\" ");
        }
        if (this.f133712v > 0) {
            sb2.append("-validity \"");
            sb2.append(this.f133712v);
            sb2.append("\" ");
        }
        if (this.f133708r != null) {
            sb2.append("-ext ");
            sb2.append("\"san=");
            sb2.append(this.f133708r);
            sb2.append("\" ");
        }
        log("Generating Key for " + this.f133701k);
        j1 j1Var = new j1(this);
        j1Var.G2(org.apache.tools.ant.util.s0.h("keytool"));
        j1Var.l2().H1(sb2.toString());
        j1Var.I2(true);
        j1Var.g2(K1());
        j1Var.D1();
    }

    public a i2() throws BuildException {
        if (this.f133710t != null) {
            throw new BuildException("DName sub-element can only be specified once.");
        }
        if (this.f133709s != null) {
            throw new BuildException("It is not possible to specify dname  both as attribute and element.");
        }
        a aVar = new a();
        this.f133710t = aVar;
        return aVar;
    }

    public void j2(String str) {
        this.f133701k = str;
    }

    public void k2(String str) {
        if (this.f133710t != null) {
            throw new BuildException("It is not possible to specify dname  both as attribute and element.");
        }
        this.f133709s = str;
    }

    public void l2(String str) {
        this.f133707q = str;
    }

    public void m2(String str) {
        this.f133705o = str;
    }

    public void n2(String str) throws BuildException {
        try {
            this.f133711u = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new BuildException("KeySize attribute should be a integer");
        }
    }

    public void o2(String str) {
        this.f133702l = str;
    }

    public void p2(String str) {
        this.f133708r = str;
    }

    public void q2(String str) {
        this.f133706p = str;
    }

    public void r2(String str) {
        this.f133703m = str;
    }

    public void s2(String str) {
        this.f133704n = str;
    }

    public void t2(String str) throws BuildException {
        try {
            this.f133712v = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new BuildException("Validity attribute should be a integer");
        }
    }

    public void u2(boolean z10) {
        this.f133713w = z10;
    }
}
