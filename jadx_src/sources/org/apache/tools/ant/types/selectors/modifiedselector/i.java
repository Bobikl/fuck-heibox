package org.apache.tools.ant.types.selectors.modifiedselector;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.i1;
import org.apache.tools.ant.k;
import org.apache.tools.ant.types.m0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.resources.selectors.n;
import org.apache.tools.ant.types.resources.z;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.w;
import org.apache.tools.ant.util.ResourceUtils;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: ModifiedSelector.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends org.apache.tools.ant.types.selectors.g implements k, n {
    private static final String C = "cache.";
    private static final String D = "algorithm.";
    private static final String E = "comparator.";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f136567k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f136569m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f136571o;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f136566j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f136568l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f136570n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f136572p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f136573q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f136574r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f136575s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Comparator<? super String> f136576t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private org.apache.tools.ant.types.selectors.modifiedselector.a f136577u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private org.apache.tools.ant.types.selectors.modifiedselector.b f136578v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f136579w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f136580x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<m0> f136581y = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<m0> f136582z = Collections.synchronizedList(new ArrayList());
    private ClassLoader A = null;
    private o0 B = null;

    /* JADX INFO: compiled from: ModifiedSelector.java */
    public static class a extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"hashvalue", "digest", "checksum", "lastmodified"};
        }
    }

    /* JADX INFO: compiled from: ModifiedSelector.java */
    public static class b extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"propertyfile"};
        }
    }

    /* JADX INFO: compiled from: ModifiedSelector.java */
    public static class c extends w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"equal", x9.b.f141151p};
        }
    }

    private boolean v2(File file, String str, String str2) {
        i2();
        File file2 = new File(file, str);
        if (file2.isDirectory()) {
            return this.f136573q;
        }
        String strValueOf = String.valueOf(this.f136578v.get(file2.getAbsolutePath()));
        String strA = this.f136577u.a(file2);
        boolean z10 = this.f136576t.compare(strValueOf, strA) != 0;
        if (this.f136572p && z10) {
            this.f136578v.put(file2.getAbsolutePath(), strA);
            G2(u2() + 1);
            if (!t2()) {
                x2();
            }
        }
        return z10;
    }

    public void A2(b bVar) {
        this.f136566j = bVar;
    }

    @Override // org.apache.tools.ant.k
    public void B0(BuildEvent buildEvent) {
        if (t2()) {
            x2();
        }
    }

    public void B2(String str) {
        this.f136567k = str;
    }

    public void C2(ClassLoader classLoader) {
        this.A = classLoader;
    }

    public void D2(c cVar) {
        this.f136570n = cVar;
    }

    public void E2(String str) {
        this.f136571o = str;
    }

    public void F2(boolean z10) {
        this.f136575s = z10;
    }

    public void G2(int i10) {
        this.f136579w = i10;
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.n0
    public void H0(m0... m0VarArr) {
        if (m0VarArr != null) {
            Collections.addAll(this.f136581y, m0VarArr);
        }
    }

    public void H2(boolean z10) {
        this.f136573q = z10;
    }

    public void I2(boolean z10) {
        this.f136574r = z10;
    }

    public void J2(boolean z10) {
        this.f136572p = z10;
    }

    protected void K2(Object obj, String str, String str2) {
        Project projectB = b() != null ? b() : new Project();
        try {
            i1.B(projectB, obj.getClass()).L(projectB, obj, str, str2);
        } catch (BuildException unused) {
        }
    }

    public void L2(m0 m0Var) {
        String strA = m0Var.a();
        String strC = m0Var.c();
        if ("cache".equals(strA)) {
            b bVar = new b();
            bVar.g(strC);
            A2(bVar);
            return;
        }
        if ("algorithm".equals(strA)) {
            a aVar = new a();
            aVar.g(strC);
            y2(aVar);
            return;
        }
        if ("comparator".equals(strA)) {
            c cVar = new c();
            cVar.g(strC);
            D2(cVar);
            return;
        }
        if ("update".equals(strA)) {
            J2("true".equalsIgnoreCase(strC));
            return;
        }
        if ("delayupdate".equals(strA)) {
            F2("true".equalsIgnoreCase(strC));
            return;
        }
        if ("seldirs".equals(strA)) {
            H2("true".equalsIgnoreCase(strC));
            return;
        }
        if (strA.startsWith(C)) {
            K2(this.f136578v, strA.substring(6), strC);
            return;
        }
        if (strA.startsWith(D)) {
            K2(this.f136577u, strA.substring(10), strC);
        } else if (strA.startsWith(E)) {
            K2(this.f136576t, strA.substring(11), strC);
        } else {
            g2("Invalid parameter " + strA);
        }
    }

    @Override // org.apache.tools.ant.types.selectors.g, org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v
    public boolean P0(File file, String str, File file2) {
        return v2(file, str, file2.getAbsolutePath());
    }

    @Override // org.apache.tools.ant.k
    public void R0(BuildEvent buildEvent) {
        if (t2()) {
            x2();
        }
    }

    @Override // org.apache.tools.ant.k
    public void V(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.types.selectors.h, org.apache.tools.ant.types.selectors.v, org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        if (s1Var.O()) {
            z zVar = (z) s1Var;
            return P0(zVar.w2(), zVar.k2(), zVar.l0());
        }
        try {
            File fileG = j0.O().G(b(), "modified-", ".tmp", null, true, false);
            ResourceUtils.i(s1Var, new z(fileG));
            boolean zV2 = v2(fileG.getParentFile(), fileG.getName(), s1Var.v2());
            fileG.delete();
            return zV2;
        } catch (UnsupportedOperationException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The resource '");
            sb2.append(s1Var.k2());
            sb2.append("' does not provide an InputStream, so it is not checked. According to 'selres' attribute value it is ");
            sb2.append(this.f136574r ? "" : " not");
            sb2.append("selected.");
            x1(sb2.toString(), 2);
            return this.f136574r;
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    @Override // org.apache.tools.ant.k
    public void h0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.k
    public void i0(BuildEvent buildEvent) {
    }

    @Override // org.apache.tools.ant.types.selectors.h
    public void j2() {
        o2();
        org.apache.tools.ant.types.selectors.modifiedselector.b bVar = this.f136578v;
        if (bVar == null) {
            g2("Cache must be set.");
            return;
        }
        if (this.f136577u == null) {
            g2("Algorithm must be set.");
        } else if (!bVar.isValid()) {
            g2("Cache must be proper configured.");
        } else {
            if (this.f136577u.isValid()) {
                return;
            }
            g2("Algorithm must be proper configured.");
        }
    }

    public void l2(o0 o0Var) {
        if (this.B != null) {
            throw new BuildException("<classpath> can be set only once.");
        }
        this.B = o0Var;
    }

    public void m2(String str, Object obj) {
        m0 m0Var = new m0();
        m0Var.d(str);
        m0Var.f(String.valueOf(obj));
        this.f136581y.add(m0Var);
    }

    public void n2(m0 m0Var) {
        this.f136581y.add(m0Var);
    }

    public void o2() {
        File file;
        if (this.f136580x) {
            return;
        }
        this.f136580x = true;
        Project projectB = b();
        if (projectB != null) {
            file = new File(projectB.Z(), "cache.properties");
            b().c(this);
        } else {
            file = new File("cache.properties");
            F2(false);
        }
        j jVar = new j(file);
        d dVar = new d();
        e eVar = new e();
        for (m0 m0Var : this.f136581y) {
            if (m0Var.a().indexOf(46) > 0) {
                this.f136582z.add(m0Var);
            } else {
                L2(m0Var);
            }
        }
        this.f136581y.clear();
        a aVar = this.f136568l;
        if (aVar == null) {
            String str = this.f136569m;
            if (str != null) {
                this.f136577u = (org.apache.tools.ant.types.selectors.modifiedselector.a) w2(str, "is not an Algorithm.", org.apache.tools.ant.types.selectors.modifiedselector.a.class);
            } else {
                this.f136577u = dVar;
            }
        } else if ("hashvalue".equals(aVar.d())) {
            this.f136577u = new f();
        } else if ("digest".equals(this.f136568l.d())) {
            this.f136577u = new d();
        } else if ("checksum".equals(this.f136568l.d())) {
            this.f136577u = new org.apache.tools.ant.types.selectors.modifiedselector.c();
        } else if ("lastmodified".equals(this.f136568l.d())) {
            this.f136577u = new g();
        }
        b bVar = this.f136566j;
        if (bVar == null) {
            String str2 = this.f136567k;
            if (str2 != null) {
                this.f136578v = (org.apache.tools.ant.types.selectors.modifiedselector.b) w2(str2, "is not a Cache.", org.apache.tools.ant.types.selectors.modifiedselector.b.class);
            } else {
                this.f136578v = jVar;
            }
        } else if ("propertyfile".equals(bVar.d())) {
            this.f136578v = new j();
        }
        c cVar = this.f136570n;
        if (cVar == null) {
            String str3 = this.f136571o;
            if (str3 != null) {
                this.f136576t = (Comparator) w2(str3, "is not a Comparator.", Comparator.class);
            } else {
                this.f136576t = eVar;
            }
        } else if ("equal".equals(cVar.d())) {
            this.f136576t = new e();
        } else if (x9.b.f141151p.equals(this.f136570n.d())) {
            throw new BuildException("RuleBasedCollator not yet supported.");
        }
        this.f136582z.forEach(new Consumer() { // from class: org.apache.tools.ant.types.selectors.modifiedselector.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f136565b.L2((m0) obj);
            }
        });
        this.f136582z.clear();
    }

    public org.apache.tools.ant.types.selectors.modifiedselector.a p2() {
        return this.f136577u;
    }

    public org.apache.tools.ant.types.selectors.modifiedselector.b q2() {
        return this.f136578v;
    }

    @Override // org.apache.tools.ant.k
    public void r1(BuildEvent buildEvent) {
    }

    public ClassLoader r2() {
        if (this.A == null) {
            this.A = this.B == null ? getClass().getClassLoader() : b().z(this.B);
        }
        return this.A;
    }

    @Override // org.apache.tools.ant.k
    public void s0(BuildEvent buildEvent) {
        if (t2()) {
            x2();
        }
    }

    public Comparator<? super String> s2() {
        return this.f136576t;
    }

    public boolean t2() {
        return this.f136575s;
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return String.format("{modifiedselector update=%s seldirs=%s cache=%s algorithm=%s comparator=%s}", Boolean.valueOf(this.f136572p), Boolean.valueOf(this.f136573q), this.f136578v, this.f136577u, this.f136576t);
    }

    public int u2() {
        return this.f136579w;
    }

    protected <T> T w2(String str, String str2, Class<? extends T> cls) {
        try {
            ClassLoader classLoaderR2 = r2();
            T t10 = (T) (classLoaderR2 != null ? classLoaderR2.loadClass(str) : Class.forName(str)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (cls.isInstance(t10)) {
                return t10;
            }
            throw new BuildException("Specified class (%s) %s", str, str2);
        } catch (ClassNotFoundException unused) {
            throw new BuildException("Specified class (%s) not found.", str);
        } catch (Exception e10) {
            throw new BuildException(e10);
        }
    }

    protected void x2() {
        if (u2() > 0) {
            this.f136578v.f();
            G2(0);
        }
    }

    public void y2(a aVar) {
        this.f136568l = aVar;
    }

    public void z2(String str) {
        this.f136569m = str;
    }
}
