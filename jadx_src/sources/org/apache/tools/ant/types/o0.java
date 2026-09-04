package org.apache.tools.ant.types;

import com.tencent.open.SocialConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Path.java */
/* JADX INFO: loaded from: classes5.dex */
public class o0 extends s implements Cloneable, u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static o0 f136242j = new o0(null, System.getProperty("java.class.path"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o0 f136243k = new o0(null, System.getProperty("sun.boot.class.path"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f136244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f136245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136246i;

    /* JADX INFO: compiled from: Path.java */
    public class a implements u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f136247b;

        public a() {
        }

        @Override // org.apache.tools.ant.types.u1
        public boolean O() {
            return true;
        }

        public String[] a() {
            return this.f136247b;
        }

        public void b(File file) {
            this.f136247b = new String[]{o0.E2(file.getAbsolutePath())};
        }

        public void e(String str) {
            this.f136247b = o0.G2(o0.this.b(), str);
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ boolean isEmpty() {
            return t1.a(this);
        }

        @Override // java.lang.Iterable
        public Iterator<s1> iterator() {
            return new org.apache.tools.ant.types.resources.a0(o0.this.b(), null, this.f136247b);
        }

        @Override // org.apache.tools.ant.types.u1
        public int size() {
            String[] strArr = this.f136247b;
            if (strArr == null) {
                return 0;
            }
            return strArr.length;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ Stream stream() {
            return t1.b(this);
        }
    }

    public o0(Project project) {
        this.f136245h = null;
        this.f136246i = false;
        J(project);
    }

    public o0(Project project, String str) {
        this(project);
        v2().e(str);
    }

    private static File A2(Project project, String str) {
        return org.apache.tools.ant.util.j0.O().n0(project == null ? null : project.Z(), str);
    }

    public static String E2(String str) {
        if (str == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i10 = 0; i10 < stringBuffer.length(); i10++) {
            F2(stringBuffer, i10);
        }
        return stringBuffer.toString();
    }

    protected static boolean F2(StringBuffer stringBuffer, int i10) {
        if (stringBuffer.charAt(i10) != '/' && stringBuffer.charAt(i10) != '\\') {
            return false;
        }
        stringBuffer.setCharAt(i10, File.separatorChar);
        return true;
    }

    public static String[] G2(Project project, String str) {
        if (str == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        org.apache.tools.ant.x1 x1Var = new org.apache.tools.ant.x1(str);
        while (x1Var.a()) {
            StringBuffer stringBuffer = new StringBuffer();
            String strB = x1Var.b();
            try {
                stringBuffer.append(A2(project, strB).getPath());
            } catch (BuildException unused) {
                project.M0("Dropping path element " + strB + " as it is not valid relative to the project", 3);
            }
            for (int i10 = 0; i10 < stringBuffer.length(); i10++) {
                F2(stringBuffer, i10);
            }
            arrayList.add(stringBuffer.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private o0 p2(String str, o0 o0Var) {
        o0 o0Var2 = new o0(b());
        String strU0 = b() != null ? b().u0(org.apache.tools.ant.j1.f133479c) : System.getProperty(org.apache.tools.ant.j1.f133479c);
        if (strU0 != null) {
            str = strU0;
        }
        if (SocialConstants.PARAM_ONLY.equals(str)) {
            o0Var2.i2(o0Var, true);
        } else if ("first".equals(str)) {
            o0Var2.i2(o0Var, true);
            o0Var2.h2(this);
        } else if (org.apache.tools.ant.taskdefs.z0.b.f136024i.equals(str)) {
            o0Var2.h2(this);
        } else {
            if (!"last".equals(str)) {
                x1("invalid value for build.sysclasspath: " + str, 1);
            }
            o0Var2.h2(this);
            o0Var2.i2(o0Var, true);
        }
        return o0Var2;
    }

    private static boolean t2(String str) {
        return str != null && (str.contains(androidx.webkit.b.f28327e) || str.contains("?"));
    }

    private synchronized boolean x2() {
        if (this.f136244g == null) {
            this.f136244g = w2() ? Boolean.TRUE : Boolean.FALSE;
        }
        return this.f136244g.booleanValue();
    }

    private o0 y2() {
        return (o0) O1(o0.class);
    }

    public void B2(boolean z10) {
        B1();
        this.f136246i = z10;
        org.apache.tools.ant.types.resources.w1 w1Var = this.f136245h;
        if (w1Var != null) {
            w1Var.n2(z10);
        }
    }

    public void C2(File file) throws BuildException {
        B1();
        v2().b(file);
    }

    public void D2(String str) throws BuildException {
        B1();
        v2().e(str);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            org.apache.tools.ant.types.resources.w1 w1Var = this.f136245h;
            if (w1Var != null) {
                s.a2(w1Var, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized boolean O() {
        if (Y1()) {
            return y2().O();
        }
        H1();
        o2(this.f136245h);
        return true;
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.f136245h != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        try {
            o0 o0Var = (o0) super.clone();
            org.apache.tools.ant.types.resources.w1 w1Var = this.f136245h;
            if (w1Var != null) {
                w1Var = (org.apache.tools.ant.types.resources.w1) w1Var.clone();
            }
            o0Var.f136245h = w1Var;
            return o0Var;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public void e2(o0 o0Var) throws BuildException {
        if (o0Var == this) {
            throw G1();
        }
        if (o0Var.b() == null) {
            o0Var.J(b());
        }
        f2(o0Var);
    }

    public void f2(u1 u1Var) {
        D1();
        if (u1Var == null) {
            return;
        }
        if (this.f136245h == null) {
            org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1();
            this.f136245h = w1Var;
            w1Var.J(b());
            this.f136245h.n2(this.f136246i);
        }
        this.f136245h.f2(u1Var);
        b2(false);
    }

    public void g2(v vVar) throws BuildException {
        if (vVar.b() == null) {
            vVar.J(b());
        }
        f2(vVar);
    }

    public void h2(o0 o0Var) {
        i2(o0Var, false);
    }

    public void i2(o0 o0Var, boolean z10) {
        File file = z10 ? new File(System.getProperty("user.dir")) : null;
        for (String str : o0Var.z2()) {
            File fileA2 = A2(b(), str);
            if (z10 && !fileA2.exists()) {
                fileA2 = new File(file, str);
            }
            if (fileA2.exists()) {
                C2(fileA2);
            } else if (fileA2.getParentFile() != null && fileA2.getParentFile().exists() && t2(fileA2.getName())) {
                C2(fileA2);
                x1("adding " + fileA2 + " which contains wildcards and may not do what you intend it to do depending on your OS or version of Java", 3);
            } else {
                x1("dropping " + fileA2 + " from path as it doesn't exist", 3);
            }
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return t1.a(this);
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator<s1> iterator() {
        if (Y1()) {
            return y2().iterator();
        }
        H1();
        if (x2()) {
            return new org.apache.tools.ant.types.resources.a0(b(), null, z2());
        }
        org.apache.tools.ant.types.resources.w1 w1Var = this.f136245h;
        return w1Var == null ? Collections.emptySet().iterator() : o2(w1Var).iterator();
    }

    public void j2(o0 o0Var) {
        if (o0Var == null) {
            String property = System.getProperty("java.ext.dirs");
            if (property == null) {
                return;
            } else {
                o0Var = new o0(b(), property);
            }
        }
        for (String str : o0Var.z2()) {
            File fileA2 = A2(b(), str);
            if (fileA2.exists() && fileA2.isDirectory()) {
                b0 b0Var = new b0();
                b0Var.R2(fileA2);
                b0Var.X2(androidx.webkit.b.f28327e);
                l2(b0Var);
            }
        }
    }

    public void k2(a0 a0Var) throws BuildException {
        if (a0Var.b() == null) {
            a0Var.J(b());
        }
        f2(a0Var);
    }

    public void l2(b0 b0Var) throws BuildException {
        if (b0Var.b() == null) {
            b0Var.J(b());
        }
        f2(b0Var);
    }

    public void m2() {
        if (org.apache.tools.ant.util.s0.r()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(org.apache.tools.ant.util.s0.e());
            String str = File.separator;
            sb2.append(str);
            sb2.append("share");
            sb2.append(str);
            sb2.append("kaffe");
            File file = new File(sb2.toString());
            if (file.isDirectory()) {
                b0 b0Var = new b0();
                b0Var.R2(file);
                b0Var.X2("*.jar");
                l2(b0Var);
            }
        } else if ("GNU libgcj".equals(System.getProperty("java.vm.name"))) {
            h2(f136243k);
        }
        if (System.getProperty("java.vendor").toLowerCase(Locale.ENGLISH).contains("microsoft")) {
            b0 b0Var2 = new b0();
            b0Var2.R2(new File(org.apache.tools.ant.util.s0.e() + File.separator + "Packages"));
            b0Var2.X2("*.ZIP");
            l2(b0Var2);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(org.apache.tools.ant.util.s0.e());
        String str2 = File.separator;
        sb3.append(str2);
        sb3.append("lib");
        sb3.append(str2);
        sb3.append("rt.jar");
        h2(new o0(null, sb3.toString()));
        h2(new o0(null, org.apache.tools.ant.util.s0.e() + str2 + "jre" + str2 + "lib" + str2 + "rt.jar"));
        for (String str3 : Arrays.asList("jce", "jsse")) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(org.apache.tools.ant.util.s0.e());
            String str4 = File.separator;
            sb4.append(str4);
            sb4.append("lib");
            sb4.append(str4);
            sb4.append(str3);
            sb4.append(".jar");
            h2(new o0(null, sb4.toString()));
            h2(new o0(null, org.apache.tools.ant.util.s0.e() + str4 + ".." + str4 + "Classes" + str4 + str3 + ".jar"));
        }
        for (String str5 : Arrays.asList("core", "graphics", "security", "server", "xml")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(org.apache.tools.ant.util.s0.e());
            String str6 = File.separator;
            sb5.append(str6);
            sb5.append("lib");
            sb5.append(str6);
            sb5.append(str5);
            sb5.append(".jar");
            h2(new o0(null, sb5.toString()));
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(org.apache.tools.ant.util.s0.e());
        String str7 = File.separator;
        sb6.append(str7);
        sb6.append("..");
        sb6.append(str7);
        sb6.append("Classes");
        sb6.append(str7);
        sb6.append("classes.jar");
        h2(new o0(null, sb6.toString()));
        h2(new o0(null, org.apache.tools.ant.util.s0.e() + str7 + ".." + str7 + "Classes" + str7 + "ui.jar"));
    }

    public void n2(o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        e2(o0Var);
    }

    protected u1 o2(u1 u1Var) {
        if (u1Var == null || u1Var.O()) {
            return u1Var;
        }
        throw new BuildException("%s allows only filesystem resources.", U1());
    }

    public o0 q2(String str) {
        return p2(str, f136243k);
    }

    public o0 r2() {
        return s2("last");
    }

    public o0 s2(String str) {
        return p2(str, f136242j);
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return y2().size();
        }
        H1();
        org.apache.tools.ant.types.resources.w1 w1Var = this.f136245h;
        return w1Var == null ? 0 : o2(w1Var).size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return t1.b(this);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return y2().toString();
        }
        org.apache.tools.ant.types.resources.w1 w1Var = this.f136245h;
        return w1Var == null ? "" : w1Var.toString();
    }

    public o0 u2() throws BuildException {
        o0 o0Var = new o0(b());
        e2(o0Var);
        return o0Var;
    }

    public a v2() throws BuildException {
        if (Y1()) {
            throw Z1();
        }
        a aVar = new a();
        f2(aVar);
        return aVar;
    }

    protected boolean w2() {
        if (getClass().equals(o0.class)) {
            return false;
        }
        try {
            return !getClass().getMethod("list", new Class[0]).getDeclaringClass().equals(o0.class);
        } catch (Exception unused) {
            return false;
        }
    }

    public String[] z2() {
        if (Y1()) {
            return y2().z2();
        }
        return o2(this.f136245h) == null ? new String[0] : this.f136245h.x2();
    }
}
