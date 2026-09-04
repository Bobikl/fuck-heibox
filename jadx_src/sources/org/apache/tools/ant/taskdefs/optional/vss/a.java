package org.apache.tools.ant.taskdefs.optional.vss;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.types.w;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: MSVSS.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends u2 implements g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135436k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135437l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135438m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135439n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f135440o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135441p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135442q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135443r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f135444s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f135445t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f135446u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f135447v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f135448w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f135449x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f135450y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f135451z = null;
    private String A = null;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = true;
    private boolean F = true;
    private int G = Integer.MIN_VALUE;
    private DateFormat H = DateFormat.getDateInstance(3);
    private C1235a I = null;
    private b J = null;

    /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.optional.vss.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MSVSS.java */
    public static class C1235a extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{g.H2, g.I2, g.J2};
        }
    }

    /* JADX INFO: compiled from: MSVSS.java */
    public static class b extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{g.K2, g.L2, "fail"};
        }
    }

    private int H2(o oVar) {
        try {
            n1 n1Var = new n1(new s3((u2) this, 2, 1));
            if (this.f135439n != null) {
                String[] strArrG = n1Var.g();
                if (strArrG == null) {
                    strArrG = new String[0];
                }
                String[] strArr = new String[strArrG.length + 1];
                System.arraycopy(strArrG, 0, strArr, 0, strArrG.length);
                strArr[strArrG.length] = "SSDIR=" + this.f135439n;
                n1Var.y(strArr);
            }
            n1Var.w(b());
            n1Var.E(b().Z());
            n1Var.x(oVar.s());
            n1Var.D(false);
            return n1Var.e();
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    private String j2(String str, int i10) throws ParseException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(this.H.parse(str));
        gregorianCalendar.add(5, i10);
        return this.H.format(gregorianCalendar.getTime());
    }

    private String k2(o oVar) {
        StringBuffer stringBuffer = new StringBuffer(oVar.toString());
        int iIndexOf = stringBuffer.substring(0).indexOf("-Y");
        if (iIndexOf > 0) {
            int iIndexOf2 = stringBuffer.substring(0).indexOf(Constants.ACCEPT_TIME_SEPARATOR_SP, iIndexOf);
            int iIndexOf3 = stringBuffer.substring(0).indexOf(" ", iIndexOf2);
            while (true) {
                iIndexOf2++;
                if (iIndexOf2 >= iIndexOf3) {
                    break;
                }
                stringBuffer.setCharAt(iIndexOf2, '*');
            }
        }
        return stringBuffer.toString();
    }

    private boolean n2() {
        return !G2().equals(g.L2) && this.E;
    }

    private String x2() {
        String str = this.f135442q;
        if (str == null || str.length() <= 31) {
            return this.f135442q;
        }
        String strSubstring = this.f135442q.substring(0, 30);
        x1("Label is longer than 31 characters, truncated to: " + strSubstring, 1);
        return strSubstring;
    }

    protected String A2() {
        if (this.f135440o == null) {
            return "";
        }
        return g.T2 + this.f135440o;
    }

    protected String B2() throws BuildException {
        StringBuilder sb2;
        String str;
        String str2 = this.f135450y;
        if (str2 == null && this.f135451z == null && this.G == Integer.MIN_VALUE) {
            return "";
        }
        if (str2 != null && this.f135451z != null) {
            return g.U2 + this.f135451z + g.f135454c3 + this.f135450y;
        }
        if (this.f135451z != null && this.G != Integer.MIN_VALUE) {
            try {
                return g.U2 + this.f135451z + g.f135454c3 + j2(this.f135451z, this.G);
            } catch (ParseException unused) {
                throw new BuildException("Error parsing date: " + this.f135451z, w1());
            }
        }
        if (str2 == null || this.G == Integer.MIN_VALUE) {
            if (str2 != null) {
                sb2 = new StringBuilder();
                sb2.append("-V~d");
                str = this.f135450y;
            } else {
                sb2 = new StringBuilder();
                sb2.append(g.U2);
                str = this.f135451z;
            }
            sb2.append(str);
            return sb2.toString();
        }
        try {
            return g.U2 + j2(this.f135450y, this.G) + g.f135454c3 + this.f135450y;
        } catch (ParseException unused2) {
            throw new BuildException("Error parsing date: " + this.f135450y, w1());
        }
    }

    protected String C2() {
        if (this.f135440o != null) {
            return g.T2 + this.f135440o;
        }
        if (this.f135441p != null) {
            return g.U2 + this.f135441p;
        }
        String strX2 = x2();
        if (strX2 == null || strX2.isEmpty()) {
            return "";
        }
        return g.V2 + strX2;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        o oVarI2 = i2();
        int iH2 = H2(oVarI2);
        if (n1.o(iH2) && n2()) {
            throw new BuildException("Failed executing: " + k2(oVarI2) + " With a return code of " + iH2, w1());
        }
    }

    protected String D2() {
        String str = this.f135446u;
        if (str == null && this.f135447v == null) {
            return "";
        }
        if (str != null && this.f135447v != null) {
            if (str.length() > 31) {
                this.f135446u = this.f135446u.substring(0, 30);
                x1("FromLabel is longer than 31 characters, truncated to: " + this.f135446u, 1);
            }
            if (this.f135447v.length() > 31) {
                this.f135447v = this.f135447v.substring(0, 30);
                x1("ToLabel is longer than 31 characters, truncated to: " + this.f135447v, 1);
            }
            return g.V2 + this.f135447v + g.f135455d3 + this.f135446u;
        }
        if (str != null) {
            if (str.length() > 31) {
                this.f135446u = this.f135446u.substring(0, 30);
                x1("FromLabel is longer than 31 characters, truncated to: " + this.f135446u, 1);
            }
            return "-V~L" + this.f135446u;
        }
        if (this.f135447v.length() > 31) {
            this.f135447v = this.f135447v.substring(0, 30);
            x1("ToLabel is longer than 31 characters, truncated to: " + this.f135447v, 1);
        }
        return g.V2 + this.f135447v;
    }

    protected String E2() {
        return this.f135438m;
    }

    protected String F2() {
        return this.D ? g.W2 : "";
    }

    public String G2() {
        b bVar = this.J;
        if (bVar == null) {
            return "";
        }
        if (bVar.d().equals(g.K2)) {
            return g.f135464m3;
        }
        if (!this.J.d().equals(g.L2)) {
            return "";
        }
        this.E = false;
        return g.f135465n3;
    }

    public final void I2(boolean z10) {
        this.E = z10;
    }

    protected void J2(String str) {
        this.f135443r = str;
    }

    protected void K2(String str) {
        this.f135445t = str;
    }

    protected void L2(String str) {
        this.f135441p = str;
    }

    protected void M2(DateFormat dateFormat) {
        this.H = dateFormat;
    }

    protected void N2(boolean z10) {
        this.E = z10;
    }

    protected void O2(C1235a c1235a) {
        this.I = c1235a;
    }

    protected void P2(String str) {
        this.f135450y = str;
    }

    protected void Q2(String str) {
        this.f135446u = str;
    }

    protected void R2(boolean z10) {
        this.F = z10;
    }

    protected void S2(String str) {
        this.f135442q = str;
    }

    protected void T2(String str) {
        this.f135444s = str;
    }

    protected void U2(int i10) {
        this.G = i10;
    }

    protected void V2(String str) {
        this.f135448w = str;
    }

    protected void W2(boolean z10) {
        this.B = z10;
    }

    protected void X2(boolean z10) {
        this.C = z10;
    }

    protected void Y2(String str) {
        this.A = str;
    }

    protected void Z2(String str) {
        this.f135451z = str;
    }

    protected void a3(String str) {
        this.f135447v = str;
    }

    protected void b3(String str) {
        this.f135449x = str;
    }

    protected void c3(String str) {
        this.f135440o = str;
    }

    protected void d3(boolean z10) {
        this.D = z10;
    }

    protected void e3(b bVar) {
        this.J = bVar;
    }

    public final void f3(String str) {
        this.f135437l = str;
    }

    public final void g3(String str) {
        this.f135439n = str;
    }

    public final void h3(String str) {
        this.f135436k = j0.s0(str);
    }

    abstract o i2();

    public final void i3(String str) {
        if (str.startsWith("vss://")) {
            str = str.substring(5);
        }
        if (str.startsWith("$")) {
            this.f135438m = str;
            return;
        }
        this.f135438m = "$" + str;
    }

    protected String l2() {
        String str = this.f135443r;
        if (str == null) {
            return g.P2;
        }
        if (str.equalsIgnoreCase("Y")) {
            return g.Q2;
        }
        return this.f135443r.equalsIgnoreCase("N") ? g.R2 : g.P2;
    }

    protected String m2() {
        if (this.f135445t == null) {
            return "-C-";
        }
        return g.f135452a3 + this.f135445t;
    }

    public String o2() {
        C1235a c1235a = this.I;
        if (c1235a == null) {
            return "";
        }
        if (c1235a.d().equals(g.I2)) {
            return g.f135462k3;
        }
        return this.I.d().equals(g.J2) ? g.f135463l3 : g.f135461j3;
    }

    protected String p2() {
        return !this.F ? g.f135466o3 : "";
    }

    protected String q2() {
        String str = this.f135442q;
        if (str == null || str.isEmpty()) {
            return "";
        }
        return g.f135453b3 + x2();
    }

    protected String r2() {
        if (this.f135444s == null) {
            return "";
        }
        File fileW0 = b().W0(this.f135444s);
        if (!fileW0.exists()) {
            if (!(fileW0.mkdirs() || fileW0.exists())) {
                throw new BuildException("Directory " + this.f135444s + " creation was not successful for an unknown reason", w1());
            }
            b().L0("Created dir: " + fileW0.getAbsolutePath());
        }
        return g.O2 + this.f135444s;
    }

    protected String s2() {
        if (this.f135437l == null) {
            return "";
        }
        return "-Y" + this.f135437l;
    }

    protected String t2() {
        if (this.f135448w == null) {
            return "";
        }
        return g.f135456e3 + this.f135448w;
    }

    protected String u2() {
        return this.B ? g.Z2 : "";
    }

    protected String v2() {
        return this.C ? g.S2 : "";
    }

    protected String w2() {
        String str = this.f135436k;
        if (str == null) {
            return g.f135467q2;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            return this.f135436k + g.f135467q2;
        }
        return this.f135436k + str2 + g.f135467q2;
    }

    protected String y2() {
        String str = this.A;
        return str != null ? str : "";
    }

    protected String z2() {
        if (this.f135449x == null) {
            return "";
        }
        return g.f135457f3 + this.f135449x;
    }
}
