package org.apache.tools.ant.taskdefs.optional.script;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.e2;
import org.apache.tools.ant.h;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.taskdefs.v0;
import org.apache.tools.ant.types.u1;
import org.apache.tools.ant.u;
import org.apache.tools.ant.util.i;
import org.apache.tools.ant.util.x1;
import org.apache.tools.ant.util.z1;

/* JADX INFO: compiled from: ScriptDef.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends v0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135325p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Set<String> f135328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<String, b> f135329t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z1 f135324o = new z1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<C1232a> f135326q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<b> f135327r = new ArrayList();

    /* JADX INFO: renamed from: org.apache.tools.ant.taskdefs.optional.script.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ScriptDef.java */
    public static class C1232a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135330a;

        public void b(String str) {
            this.f135330a = str.toLowerCase(Locale.ENGLISH);
        }
    }

    /* JADX INFO: compiled from: ScriptDef.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f135332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f135333c;

        public void d(String str) {
            this.f135333c = str;
        }

        public void e(String str) {
            this.f135331a = str.toLowerCase(Locale.ENGLISH);
        }

        public void f(String str) {
            this.f135332b = str;
        }
    }

    private Map<String, a> G2() {
        Map<String, a> map;
        Project projectB = b();
        synchronized (projectB) {
            map = (Map) projectB.w0(j1.f133480d);
            if (map == null) {
                map = new HashMap<>();
                projectB.i(j1.f133480d, map);
            }
        }
        return map;
    }

    public void A2(b bVar) {
        this.f135327r.add(bVar);
    }

    public void B2(String str) {
        this.f135324o.b(str);
    }

    public Object C2(String str) {
        Object objJ;
        Object objC;
        b bVar = this.f135329t.get(str);
        if (bVar == null) {
            throw new BuildException("<%s> does not support the <%s> nested element", this.f135325p, str);
        }
        String str2 = bVar.f135333c;
        if (str2 == null) {
            objC = b().C(bVar.f135332b);
            if (objC == null) {
                objC = b().A(bVar.f135332b);
            }
        } else {
            try {
                objJ = i.j(str2, n2());
            } catch (BuildException unused) {
                objJ = i.j(str2, a.class.getClassLoader());
            }
            objC = objJ;
            b().o1(objC);
        }
        if (objC != null) {
            return objC;
        }
        throw new BuildException("<%s> is unable to create the <%s> nested element", this.f135325p, str);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f135325p == null) {
            throw new BuildException("scriptdef requires a name attribute to name the script");
        }
        if (this.f135324o.h() == null) {
            throw new BuildException("scriptdef requires a language attribute to specify the script language");
        }
        if (this.f135324o.k() == null && this.f135324o.g() != null) {
            throw new BuildException("scriptdef requires a src attribute if the encoding is set");
        }
        if (i2() != null || s2()) {
            this.f135324o.l(n2());
        }
        this.f135328s = new HashSet();
        for (C1232a c1232a : this.f135326q) {
            if (c1232a.f135330a == null) {
                throw new BuildException("scriptdef <attribute> elements must specify an attribute name");
            }
            if (this.f135328s.contains(c1232a.f135330a)) {
                throw new BuildException("scriptdef <%s> declares the %s attribute more than once", this.f135325p, c1232a.f135330a);
            }
            this.f135328s.add(c1232a.f135330a);
        }
        this.f135329t = new HashMap();
        for (b bVar : this.f135327r) {
            if (bVar.f135331a == null) {
                throw new BuildException("scriptdef <element> elements must specify an element name");
            }
            if (this.f135329t.containsKey(bVar.f135331a)) {
                throw new BuildException("scriptdef <%s> declares the %s nested element more than once", this.f135325p, bVar.f135331a);
            }
            if (bVar.f135333c == null && bVar.f135332b == null) {
                throw new BuildException("scriptdef <element> elements must specify either a classname or type attribute");
            }
            if (bVar.f135333c != null && bVar.f135332b != null) {
                throw new BuildException("scriptdef <element> elements must specify only one of the classname and type attributes");
            }
            this.f135329t.put(bVar.f135331a, bVar);
        }
        Map<String, a> mapG2 = G2();
        String strL = e2.l(j2(), this.f135325p);
        this.f135325p = strL;
        mapG2.put(strL, this);
        h hVar = new h();
        hVar.t(this.f135325p);
        hVar.q(c.class);
        u.y(b()).h(hVar);
    }

    @Deprecated
    public void D2(Map<String, String> map, Map<String, List<Object>> map2) {
        E2(map, map2, null);
    }

    public void E2(Map<String, String> map, Map<String, List<Object>> map2, c cVar) {
        x1 x1VarJ = this.f135324o.j();
        x1VarJ.s("attributes", map);
        x1VarJ.s("elements", map2);
        x1VarJ.s("project", b());
        if (cVar != null) {
            x1VarJ.s("self", cVar);
        }
        x1VarJ.j("scriptdef_" + this.f135325p);
    }

    public boolean F2(String str) {
        return this.f135328s.contains(str);
    }

    public void H2(boolean z10) {
        this.f135324o.o(z10);
    }

    public void I2(String str) {
        this.f135324o.p(str);
    }

    @Override // org.apache.tools.ant.b2
    public void J(Project project) {
        super.J(project);
        this.f135324o.s(this);
        this.f135324o.t(false);
    }

    public void J2(String str) {
        this.f135324o.q(str);
    }

    public void K2(String str) {
        this.f135324o.r(str);
    }

    public void L2(String str) {
        this.f135325p = str;
    }

    public void M2(File file) {
        this.f135324o.u(file);
    }

    public void y2(u1 u1Var) {
        this.f135324o.a(u1Var);
    }

    public void z2(C1232a c1232a) {
        this.f135326q.add(c1232a);
    }
}
