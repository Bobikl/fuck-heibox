package org.apache.tools.ant.types;

import java.util.Properties;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Mapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class k0 extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected a f136211g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f136212h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected o0 f136213i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f136214j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f136215k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.util.v f136216l = null;

    /* JADX INFO: compiled from: Mapper.java */
    public static class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Properties f136217c;

        public a() {
            Properties properties = new Properties();
            this.f136217c = properties;
            properties.put("identity", "org.apache.tools.ant.util.IdentityMapper");
            this.f136217c.put("flatten", "org.apache.tools.ant.util.FlatFileNameMapper");
            this.f136217c.put("glob", "org.apache.tools.ant.util.GlobPatternMapper");
            this.f136217c.put("merge", "org.apache.tools.ant.util.MergingMapper");
            this.f136217c.put(r1.f136306k, "org.apache.tools.ant.util.RegexpPatternMapper");
            this.f136217c.put("package", "org.apache.tools.ant.util.PackageNameMapper");
            this.f136217c.put("unpackage", "org.apache.tools.ant.util.UnPackageNameMapper");
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"identity", "flatten", "glob", "merge", r1.f136306k, "package", "unpackage"};
        }

        public String h() {
            return this.f136217c.getProperty(d());
        }
    }

    public k0(Project project) {
        J(project);
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.f136211g != null || this.f136214j != null || this.f136215k != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void e2(org.apache.tools.ant.util.g0 g0Var) {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136216l == null) {
            if (this.f136211g == null && this.f136212h == null) {
                this.f136216l = new org.apache.tools.ant.util.s();
            } else {
                org.apache.tools.ant.util.g0 g0VarI2 = i2();
                if (!(g0VarI2 instanceof org.apache.tools.ant.util.v)) {
                    throw new BuildException(String.valueOf(g0VarI2) + " mapper implementation does not support nested mappers!");
                }
                this.f136216l = (org.apache.tools.ant.util.v) g0VarI2;
            }
        }
        this.f136216l.a(g0Var);
        b2(false);
    }

    public void f2(org.apache.tools.ant.util.g0 g0Var) {
        e2(g0Var);
    }

    public void g2(k0 k0Var) {
        e2(k0Var.i2());
    }

    public o0 h2() {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136213i == null) {
            this.f136213i = new o0(b());
        }
        b2(false);
        return this.f136213i.u2();
    }

    public org.apache.tools.ant.util.g0 i2() throws BuildException {
        if (Y1()) {
            H1();
            q1 q1VarV1 = V1();
            Object objD = q1VarV1.d(b());
            if (objD instanceof org.apache.tools.ant.util.g0) {
                return (org.apache.tools.ant.util.g0) objD;
            }
            if (objD instanceof k0) {
                return ((k0) objD).i2();
            }
            throw new BuildException((objD == null ? "null" : objD.getClass().getName()) + " at reference '" + q1VarV1.b() + "' is not a valid mapper reference.");
        }
        a aVar = this.f136211g;
        if (aVar == null && this.f136212h == null && this.f136216l == null) {
            throw new BuildException("nested mapper or one of the attributes type or classname is required");
        }
        org.apache.tools.ant.util.v vVar = this.f136216l;
        if (vVar != null) {
            return vVar;
        }
        if (aVar != null && this.f136212h != null) {
            throw new BuildException("must not specify both type and classname attribute");
        }
        try {
            org.apache.tools.ant.util.g0 g0VarNewInstance = j2().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Project projectB = b();
            if (projectB != null) {
                projectB.o1(g0VarNewInstance);
            }
            g0VarNewInstance.n0(this.f136214j);
            g0VarNewInstance.q0(this.f136215k);
            return g0VarNewInstance;
        } catch (BuildException e10) {
            throw e10;
        } catch (Throwable th2) {
            throw new BuildException(th2);
        }
    }

    protected Class<? extends org.apache.tools.ant.util.g0> j2() throws ClassNotFoundException {
        String strH = this.f136212h;
        a aVar = this.f136211g;
        if (aVar != null) {
            strH = aVar.h();
        }
        return Class.forName(strH, true, this.f136213i == null ? getClass().getClassLoader() : b().z(this.f136213i)).asSubclass(org.apache.tools.ant.util.g0.class);
    }

    @Deprecated
    protected k0 k2() {
        return (k0) O1(k0.class);
    }

    public void l2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136212h = str;
    }

    public void m2(o0 o0Var) {
        if (Y1()) {
            throw d2();
        }
        o0 o0Var2 = this.f136213i;
        if (o0Var2 == null) {
            this.f136213i = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void n0(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136214j = str;
    }

    public void n2(q1 q1Var) {
        if (Y1()) {
            throw d2();
        }
        h2().c2(q1Var);
    }

    public void o2(a aVar) {
        if (Y1()) {
            throw d2();
        }
        this.f136211g = aVar;
    }

    public void q0(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136215k = str;
    }
}
