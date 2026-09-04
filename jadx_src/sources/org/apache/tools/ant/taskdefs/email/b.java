package org.apache.tools.ant.taskdefs.email;

import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.b0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.resources.y;
import org.apache.tools.ant.types.resources.z;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.w;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: EmailTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends u2 {
    private static final int G = 25;
    public static final String H = "auto";
    public static final String I = "mime";
    public static final String J = "uu";
    public static final String K = "plain";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f134108s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134100k = "auto";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134101l = org.apache.tools.mail.b.f137245k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f134102m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134103n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e f134104o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f134105p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f134106q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f134107r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.email.a f134109t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Vector<org.apache.tools.ant.taskdefs.email.a> f134110u = new Vector<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Vector<org.apache.tools.ant.taskdefs.email.a> f134111v = new Vector<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Vector<org.apache.tools.ant.taskdefs.email.a> f134112w = new Vector<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Vector<org.apache.tools.ant.taskdefs.email.a> f134113x = new Vector<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Vector<c> f134114y = new Vector<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private o0 f134115z = null;
    private String A = null;
    private String B = null;
    private String C = null;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;

    /* JADX INFO: compiled from: EmailTask.java */
    public static class a extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"auto", b.I, b.J, b.K};
        }
    }

    private void t2(String str, BuildException buildException) {
        Throwable cause = buildException.getCause();
        BuildException cause2 = buildException;
        if (cause != null) {
            cause2 = buildException.getCause();
        }
        x1(str + cause2.getMessage(), 1);
    }

    public void A2(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        while (stringTokenizer.hasMoreTokens()) {
            p2().f2(new z(b().W0(stringTokenizer.nextToken())));
        }
    }

    public void B2(boolean z10) {
        this.F = z10;
    }

    public void C2(boolean z10) {
        this.f134106q = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        boolean z10;
        d dVar;
        BuildException e10;
        BuildException e11;
        d dVar2;
        e eVar = this.f134104o;
        d hVar = null;
        try {
            try {
                try {
                    if (I.equals(this.f134100k) || "auto".equals(this.f134100k)) {
                        try {
                            Class.forName("javax.activation.DataHandler");
                            Class.forName("javax.mail.internet.MimeMessage");
                            dVar = (d) org.apache.tools.ant.util.i.k("org.apache.tools.ant.taskdefs.email.MimeMailer", b.class.getClassLoader(), d.class);
                            try {
                                x1("Using MIME mail", 3);
                                z10 = true;
                            } catch (BuildException e12) {
                                e10 = e12;
                                z10 = true;
                                t2("Failed to initialise MIME mail: ", e10);
                            }
                        } catch (BuildException e13) {
                            z10 = false;
                            dVar = null;
                            e10 = e13;
                        }
                        hVar = dVar;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((this.B != null || this.C != null) && (J.equals(this.f134100k) || K.equals(this.f134100k)))) {
                        throw new BuildException("SMTP auth only possible with MIME mail");
                    }
                    if (!z10 && ((this.D || this.E) && (J.equals(this.f134100k) || K.equals(this.f134100k)))) {
                        throw new BuildException("SSL and STARTTLS only possible with MIME mail");
                    }
                    if (J.equals(this.f134100k) || ("auto".equals(this.f134100k) && !z10)) {
                        try {
                            dVar2 = (d) org.apache.tools.ant.util.i.k("org.apache.tools.ant.taskdefs.email.UUMailer", b.class.getClassLoader(), d.class);
                            try {
                                x1("Using UU mail", 3);
                                hVar = dVar2;
                                z10 = true;
                            } catch (BuildException e14) {
                                e11 = e14;
                                z10 = true;
                                t2("Failed to initialise UU mail: ", e11);
                                hVar = dVar2;
                            }
                        } catch (BuildException e15) {
                            d dVar3 = hVar;
                            e11 = e15;
                            dVar2 = dVar3;
                        }
                    }
                    if (K.equals(this.f134100k) || ("auto".equals(this.f134100k) && !z10)) {
                        hVar = new h();
                        x1("Using plain mail", 3);
                    }
                    if (hVar == null) {
                        throw new BuildException("Failed to initialise encoding: %s", this.f134100k);
                    }
                    if (this.f134104o == null) {
                        e eVar2 = new e();
                        this.f134104o = eVar2;
                        eVar2.J(b());
                    }
                    org.apache.tools.ant.taskdefs.email.a aVar = this.f134109t;
                    if (aVar == null || aVar.a() == null) {
                        throw new BuildException("A from element is required");
                    }
                    if (this.f134111v.isEmpty() && this.f134112w.isEmpty() && this.f134113x.isEmpty()) {
                        throw new BuildException("At least one of to, cc or bcc must be supplied");
                    }
                    if (this.f134107r != null) {
                        if (this.f134104o.I1()) {
                            throw new BuildException("The mime type can only be specified in one location");
                        }
                        this.f134104o.O1(this.f134107r);
                    }
                    if (this.A != null) {
                        if (this.f134104o.D1() != null) {
                            throw new BuildException("The charset can only be specified in one location");
                        }
                        this.f134104o.L1(this.A);
                    }
                    this.f134104o.N1(this.f134108s);
                    Vector<File> vector = new Vector<>();
                    o0 o0Var = this.f134115z;
                    if (o0Var != null) {
                        Iterator<s1> it = o0Var.iterator();
                        while (it.hasNext()) {
                            vector.add(((y) it.next().e2(y.class)).l0());
                        }
                    }
                    x1("Sending email: " + this.f134103n, 2);
                    x1("From " + this.f134109t, 3);
                    x1("ReplyTo " + this.f134110u, 3);
                    x1("To " + this.f134111v, 3);
                    x1("Cc " + this.f134112w, 3);
                    x1("Bcc " + this.f134113x, 3);
                    hVar.k(this.f134101l);
                    Integer num = this.f134102m;
                    if (num != null) {
                        hVar.p(num.intValue());
                        hVar.q(true);
                    } else {
                        hVar.p(25);
                        hVar.q(false);
                    }
                    hVar.w(this.B);
                    hVar.o(this.C);
                    hVar.s(this.D);
                    hVar.g(this.E);
                    hVar.n(this.f134104o);
                    hVar.i(this.f134109t);
                    hVar.r(this.f134110u);
                    hVar.v(this.f134111v);
                    hVar.f(this.f134112w);
                    hVar.e(this.f134113x);
                    hVar.h(vector);
                    hVar.t(this.f134103n);
                    hVar.u(this);
                    hVar.m(this.f134106q);
                    hVar.j(this.f134114y);
                    hVar.l(this.F);
                    hVar.d();
                    int size = vector.size();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Sent email with ");
                    sb2.append(size);
                    sb2.append(" attachment");
                    sb2.append(size == 1 ? "" : ak.aB);
                    x1(sb2.toString(), 2);
                    this.f134104o = eVar;
                } catch (BuildException e16) {
                    t2("Failed to send email: ", e16);
                    if (this.f134105p) {
                        throw e16;
                    }
                }
            } catch (Exception e17) {
                x1("Failed to send email: " + e17.getMessage(), 1);
                if (this.f134105p) {
                    throw new BuildException(e17);
                }
            }
        } catch (Throwable th2) {
            this.f134104o = eVar;
            throw th2;
        }
    }

    public void D2(String str) {
        this.f134101l = str;
    }

    public void E2(int i10) {
        this.f134102m = Integer.valueOf(i10);
    }

    public void F2(String str) {
        if (this.f134104o != null) {
            throw new BuildException("Only one message can be sent in an email");
        }
        e eVar = new e(str);
        this.f134104o = eVar;
        eVar.J(b());
    }

    public void G2(File file) {
        if (this.f134104o != null) {
            throw new BuildException("Only one message can be sent in an email");
        }
        e eVar = new e(file);
        this.f134104o = eVar;
        eVar.J(b());
    }

    public void H2(String str) {
        this.f134108s = str;
    }

    public void I2(String str) {
        this.f134107r = str;
    }

    public void J2(String str) {
        this.C = str;
    }

    public void K2(String str) {
        this.f134110u.add(new org.apache.tools.ant.taskdefs.email.a(str));
    }

    public void L2(boolean z10) {
        this.D = z10;
    }

    public void M2(String str) {
        this.f134103n = str;
    }

    public void N2(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            this.f134111v.add(new org.apache.tools.ant.taskdefs.email.a(stringTokenizer.nextToken()));
        }
    }

    public void O2(String str) {
        this.B = str;
    }

    public void i2(org.apache.tools.ant.taskdefs.email.a aVar) {
        this.f134113x.add(aVar);
    }

    public void j2(org.apache.tools.ant.taskdefs.email.a aVar) {
        this.f134112w.add(aVar);
    }

    public void k2(b0 b0Var) {
        p2().f2(b0Var);
    }

    public void l2(org.apache.tools.ant.taskdefs.email.a aVar) {
        if (this.f134109t != null) {
            throw new BuildException("Emails can only be from one address");
        }
        this.f134109t = aVar;
    }

    public void m2(e eVar) throws BuildException {
        if (this.f134104o != null) {
            throw new BuildException("Only one message can be sent in an email");
        }
        this.f134104o = eVar;
    }

    public void n0(String str) {
        if (this.f134109t != null) {
            throw new BuildException("Emails can only be from one address");
        }
        this.f134109t = new org.apache.tools.ant.taskdefs.email.a(str);
    }

    public void n2(org.apache.tools.ant.taskdefs.email.a aVar) {
        this.f134110u.add(aVar);
    }

    public void o2(org.apache.tools.ant.taskdefs.email.a aVar) {
        this.f134111v.add(aVar);
    }

    public o0 p2() {
        if (this.f134115z == null) {
            this.f134115z = new o0(b());
        }
        return this.f134115z.u2();
    }

    public c q2() {
        c cVar = new c();
        this.f134114y.add(cVar);
        return cVar;
    }

    public String r2() {
        return this.A;
    }

    public boolean s2() {
        return this.f134106q;
    }

    public void u2(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            this.f134113x.add(new org.apache.tools.ant.taskdefs.email.a(stringTokenizer.nextToken()));
        }
    }

    public void v2(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
        while (stringTokenizer.hasMoreTokens()) {
            this.f134112w.add(new org.apache.tools.ant.taskdefs.email.a(stringTokenizer.nextToken()));
        }
    }

    public void w2(String str) {
        this.A = str;
    }

    public void x2(boolean z10) {
        this.E = z10;
    }

    public void y2(a aVar) {
        this.f134100k = aVar.d();
    }

    public void z2(boolean z10) {
        this.f134105p = z10;
    }
}
