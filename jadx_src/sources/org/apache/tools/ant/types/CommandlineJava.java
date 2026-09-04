package org.apache.tools.ant.types;

import com.huawei.hms.framework.common.ContainerUtils;
import com.uc.crashsdk.export.LogType;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: loaded from: classes5.dex */
public class CommandlineJava implements Cloneable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f136082i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ExecutableType f136085l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f136075b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f136076c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f136077d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0 f136078e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f136079f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f136080g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f136081h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f136083j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private m f136084k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f136086m = false;

    public enum ExecutableType {
        CLASS,
        JAR,
        MODULE,
        SOURCE_FILE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f136087a;

        static {
            int[] iArr = new int[ExecutableType.values().length];
            f136087a = iArr;
            try {
                iArr[ExecutableType.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136087a[ExecutableType.MODULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f136087a[ExecutableType.JAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b extends z implements Cloneable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Properties f136088c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Vector<j1> f136089d = new Vector<>();

        private Properties i() {
            Properties properties = new Properties();
            Iterator<j1> it = this.f136089d.iterator();
            while (it.hasNext()) {
                properties.putAll(it.next().A2());
            }
            return properties;
        }

        @Override // org.apache.tools.ant.types.z
        public String[] c() throws BuildException {
            LinkedList linkedList = new LinkedList();
            f(linkedList.listIterator());
            if (linkedList.isEmpty()) {
                return null;
            }
            return (String[]) linkedList.toArray(new String[linkedList.size()]);
        }

        public Object clone() throws CloneNotSupportedException {
            try {
                b bVar = (b) super.clone();
                bVar.f136680b = (Vector) this.f136680b.clone();
                bVar.f136089d = (Vector) this.f136089d.clone();
                return bVar;
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        public void f(ListIterator<String> listIterator) {
            String[] strArrC = super.c();
            if (strArrC != null) {
                for (String str : strArrC) {
                    listIterator.add(org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3 + str);
                }
            }
            Properties propertiesI = i();
            for (String str2 : propertiesI.stringPropertyNames()) {
                listIterator.add(org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3 + str2 + ContainerUtils.KEY_VALUE_DELIMITER + propertiesI.getProperty(str2));
            }
        }

        public void g(b bVar) {
            this.f136680b.addAll(bVar.f136680b);
            this.f136089d.addAll(bVar.f136089d);
        }

        public void h(j1 j1Var) {
            this.f136089d.addElement(j1Var);
        }

        public void j() throws BuildException {
            Properties properties = this.f136088c;
            if (properties == null) {
                throw new BuildException("Unbalanced nesting of SysProperties");
            }
            try {
                System.setProperties(properties);
                this.f136088c = null;
            } catch (SecurityException e10) {
                throw new BuildException("Cannot modify system properties", e10);
            }
        }

        public void k() throws BuildException {
            try {
                this.f136088c = System.getProperties();
                Properties properties = new Properties();
                for (String str : this.f136088c.stringPropertyNames()) {
                    String property = this.f136088c.getProperty(str);
                    if (property != null) {
                        properties.put(str, property);
                    }
                }
                properties.putAll(i());
                for (z.a aVar : this.f136680b) {
                    aVar.h();
                    properties.put(aVar.b(), aVar.c());
                }
                System.setProperties(properties);
            } catch (SecurityException e10) {
                throw new BuildException("Cannot modify system properties", e10);
            }
        }

        public int l() {
            return this.f136680b.size() + i().size();
        }
    }

    public CommandlineJava() {
        Z(org.apache.tools.ant.util.s0.i(LogType.JAVA_TYPE));
        b0(org.apache.tools.ant.util.s0.f());
    }

    private boolean K() {
        return this.f136086m || Boolean.parseBoolean(System.getProperty("ant.build.clonevm"));
    }

    private static String M(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 2) {
            return strArrSplit[1];
        }
        return null;
    }

    private static String O(String str) {
        if (str == null) {
            return null;
        }
        return str.split("/")[0];
    }

    private void a(ListIterator<String> listIterator) {
        p().e(listIterator);
        this.f136077d.f(listIterator);
        if (K()) {
            b bVar = new b();
            j1 j1Var = new j1();
            j1.a aVar = new j1.a();
            aVar.g("system");
            j1Var.q2(aVar);
            bVar.h(j1Var);
            bVar.f(listIterator);
        }
        o0 o0VarE = e(true);
        if (o0VarE.size() > 0) {
            listIterator.add("-Xbootclasspath:" + o0VarE.toString());
        }
        if (G()) {
            listIterator.add("-classpath");
            listIterator.add(this.f136078e.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i).toString());
        }
        if (H()) {
            listIterator.add("--module-path");
            listIterator.add(this.f136080g.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i).toString());
        }
        if (J()) {
            listIterator.add("--upgrade-module-path");
            listIterator.add(this.f136081h.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i).toString());
        }
        if (q() != null) {
            q().i2(listIterator);
        }
        ExecutableType executableType = this.f136085l;
        if (executableType == ExecutableType.JAR) {
            listIterator.add("-jar");
        } else if (executableType == ExecutableType.MODULE) {
            listIterator.add("-m");
        }
        this.f136076c.e(listIterator);
    }

    private o0 e(boolean z10) {
        if (!this.f136082i.startsWith("1.1")) {
            o0 o0Var = this.f136079f;
            if (o0Var == null) {
                o0Var = new o0(null);
            }
            return o0Var.q2(K() ? "last" : org.apache.tools.ant.taskdefs.z0.b.f136024i);
        }
        o0 o0Var2 = this.f136079f;
        if (o0Var2 != null && z10) {
            o0Var2.log("Ignoring bootclasspath as the target VM doesn't support it.");
        }
        return new o0(null);
    }

    private static String j(String str, String str2) {
        return str2 == null ? str : String.format("%s/%s", str, str2);
    }

    public b B() {
        return this.f136077d;
    }

    public o0 C() {
        return this.f136081h;
    }

    public o D() {
        return p();
    }

    public String E() {
        return this.f136082i;
    }

    protected boolean F(boolean z10) {
        return e(z10).size() > 0;
    }

    public boolean G() {
        o0 o0Var = this.f136078e;
        o0 o0VarS2 = o0Var == null ? null : o0Var.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i);
        return (o0VarS2 == null || o0VarS2.toString().trim().isEmpty()) ? false : true;
    }

    public boolean H() {
        o0 o0Var = this.f136080g;
        o0 o0VarS2 = o0Var != null ? o0Var.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i) : null;
        return (o0VarS2 == null || o0VarS2.toString().trim().isEmpty()) ? false : true;
    }

    public boolean J() {
        o0 o0Var = this.f136081h;
        o0 o0VarS2 = o0Var != null ? o0Var.s2(org.apache.tools.ant.taskdefs.z0.b.f136024i) : null;
        return (o0VarS2 == null || o0VarS2.toString().trim().isEmpty()) ? false : true;
    }

    public void P() throws BuildException {
        this.f136077d.j();
    }

    public void Q(m mVar) {
        this.f136084k = mVar;
    }

    public void R(String str) {
        if (this.f136085l == ExecutableType.MODULE) {
            o oVar = this.f136076c;
            oVar.x(j(O(oVar.t()), str), false);
        } else {
            this.f136076c.w(str);
            this.f136085l = ExecutableType.CLASS;
        }
    }

    public void S(boolean z10) {
        this.f136086m = z10;
    }

    public void T(String str) {
        this.f136076c.w(str);
        this.f136085l = ExecutableType.JAR;
    }

    public void U(String str) {
        this.f136083j = str;
    }

    public void V(String str) {
        ExecutableType executableType = this.f136085l;
        if (executableType == null) {
            this.f136076c.w(str);
        } else {
            int i10 = a.f136087a[executableType.ordinal()];
            if (i10 == 1) {
                o oVar = this.f136076c;
                oVar.x(j(str, oVar.t()), false);
            } else if (i10 == 2) {
                o oVar2 = this.f136076c;
                oVar2.x(j(str, M(oVar2.t())), false);
            } else if (i10 == 3) {
                this.f136076c.x(str, false);
            }
        }
        this.f136085l = ExecutableType.MODULE;
    }

    public void X(String str) {
        this.f136085l = ExecutableType.SOURCE_FILE;
        this.f136076c.w(str);
    }

    public void Y() throws BuildException {
        this.f136077d.k();
    }

    public void Z(String str) {
        this.f136075b.w(str);
    }

    public void b(b bVar) {
        this.f136077d.g(bVar);
    }

    public void b0(String str) {
        this.f136082i = str;
    }

    public void c(z.a aVar) {
        this.f136077d.b(aVar);
    }

    @Deprecated
    public int c0() {
        int iY = p().y() + this.f136076c.y() + this.f136077d.l();
        if (K()) {
            iY += System.getProperties().size();
        }
        if (G()) {
            iY += 2;
        }
        if (e(true).size() > 0) {
            iY++;
        }
        ExecutableType executableType = this.f136085l;
        if (executableType == ExecutableType.JAR || executableType == ExecutableType.MODULE) {
            iY++;
        }
        return q() != null ? iY + q().size() : iY;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            CommandlineJava commandlineJava = (CommandlineJava) super.clone();
            commandlineJava.f136075b = (o) this.f136075b.clone();
            commandlineJava.f136076c = (o) this.f136076c.clone();
            commandlineJava.f136077d = (b) this.f136077d.clone();
            o0 o0Var = this.f136078e;
            if (o0Var != null) {
                commandlineJava.f136078e = (o0) o0Var.clone();
            }
            o0 o0Var2 = this.f136079f;
            if (o0Var2 != null) {
                commandlineJava.f136079f = (o0) o0Var2.clone();
            }
            o0 o0Var3 = this.f136080g;
            if (o0Var3 != null) {
                commandlineJava.f136080g = (o0) o0Var3.clone();
            }
            o0 o0Var4 = this.f136081h;
            if (o0Var4 != null) {
                commandlineJava.f136081h = (o0) o0Var4.clone();
            }
            m mVar = this.f136084k;
            if (mVar != null) {
                commandlineJava.f136084k = (m) mVar.clone();
            }
            return commandlineJava;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public void d(j1 j1Var) {
        this.f136077d.h(j1Var);
    }

    public void f() {
        this.f136076c.g();
    }

    public o.a g() {
        return this.f136076c.h();
    }

    public o0 h(Project project) {
        if (this.f136079f == null) {
            this.f136079f = new o0(project);
        }
        return this.f136079f;
    }

    public o0 i(Project project) {
        if (this.f136078e == null) {
            this.f136078e = new o0(project);
        }
        return this.f136078e;
    }

    public o0 k(Project project) {
        if (this.f136080g == null) {
            this.f136080g = new o0(project);
        }
        return this.f136080g;
    }

    public o0 l(Project project) {
        if (this.f136081h == null) {
            this.f136081h = new o0(project);
        }
        return this.f136081h;
    }

    public o.a m() {
        return this.f136075b.h();
    }

    public String n() {
        return o.q(u());
    }

    public String o() {
        return o.p(w());
    }

    protected o p() {
        o oVar = (o) this.f136075b.clone();
        if (this.f136083j != null) {
            if (this.f136082i.startsWith("1.1")) {
                oVar.h().O1("-mx" + this.f136083j);
            } else {
                oVar.h().O1("-Xmx" + this.f136083j);
            }
        }
        return oVar;
    }

    public m q() {
        return this.f136084k;
    }

    public o0 r() {
        return this.f136079f;
    }

    public String s() {
        ExecutableType executableType = this.f136085l;
        if (executableType == null) {
            return null;
        }
        int i10 = a.f136087a[executableType.ordinal()];
        if (i10 == 1) {
            return this.f136076c.t();
        }
        if (i10 != 2) {
            return null;
        }
        return M(this.f136076c.t());
    }

    public o0 t() {
        return this.f136078e;
    }

    public String toString() {
        return o.z(u());
    }

    public String[] u() {
        LinkedList linkedList = new LinkedList();
        a(linkedList.listIterator());
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public String v() {
        if (this.f136085l == ExecutableType.JAR) {
            return this.f136076c.t();
        }
        return null;
    }

    public o w() {
        return this.f136076c;
    }

    public String x() {
        if (this.f136085l == ExecutableType.MODULE) {
            return O(this.f136076c.t());
        }
        return null;
    }

    public o0 y() {
        return this.f136080g;
    }

    public String z() {
        if (this.f136085l == ExecutableType.SOURCE_FILE) {
            return this.f136076c.t();
        }
        return null;
    }
}
