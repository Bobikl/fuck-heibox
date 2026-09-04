package org.apache.tools.ant.taskdefs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.RuntimeConfigurable;

/* JADX INFO: compiled from: MacroDef.java */
/* JADX INFO: loaded from: classes5.dex */
public class t3 extends o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f135777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135778n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135779o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<a> f135780p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, d> f135781q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135782r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f135783s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f135784t = false;

    /* JADX INFO: compiled from: MacroDef.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f135786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f135787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f135788d = true;

        public String a() {
            return this.f135786b;
        }

        public String b() {
            return this.f135787c;
        }

        public String c() {
            return this.f135785a;
        }

        public boolean d() {
            return this.f135788d;
        }

        public void e(String str) {
            this.f135786b = str;
        }

        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f135785a;
            if (str == null) {
                if (aVar.f135785a != null) {
                    return false;
                }
            } else if (!str.equals(aVar.f135785a)) {
                return false;
            }
            String str2 = this.f135786b;
            if (str2 == null) {
                return aVar.f135786b == null;
            }
            return str2.equals(aVar.f135786b);
        }

        public void f(String str) {
            this.f135787c = str;
        }

        public void g(boolean z10) {
            this.f135788d = z10;
        }

        public void h(String str) {
            if (!t3.w2(str)) {
                throw new BuildException("Illegal name [%s] for attribute", str);
            }
            this.f135785a = str.toLowerCase(Locale.ENGLISH);
        }

        public int hashCode() {
            return Objects.hashCode(this.f135786b) + Objects.hashCode(this.f135785a);
        }
    }

    /* JADX INFO: compiled from: MacroDef.java */
    public static class b extends org.apache.tools.ant.h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private t3 f135789h;

        public b(t3 t3Var) {
            this.f135789h = t3Var;
        }

        @Override // org.apache.tools.ant.h
        public Object b(Project project) {
            Object objB = super.b(project);
            if (objB == null) {
                return null;
            }
            ((u3) objB).o2(this.f135789h);
            return objB;
        }

        @Override // org.apache.tools.ant.h
        public boolean n(org.apache.tools.ant.h hVar, Project project) {
            if (super.n(hVar, project)) {
                return this.f135789h.y2(((b) hVar).f135789h);
            }
            return false;
        }

        @Override // org.apache.tools.ant.h
        public boolean v(org.apache.tools.ant.h hVar, Project project) {
            if (super.v(hVar, project)) {
                return this.f135789h.C2(((b) hVar).f135789h);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MacroDef.java */
    public static class c implements org.apache.tools.ant.x2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<org.apache.tools.ant.u2> f135790b = new ArrayList();

        public List<org.apache.tools.ant.u2> a() {
            return this.f135790b;
        }

        public boolean b(c cVar) {
            int size = this.f135790b.size();
            if (size != cVar.f135790b.size()) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!((org.apache.tools.ant.z2) this.f135790b.get(i10)).B2((org.apache.tools.ant.z2) cVar.f135790b.get(i10))) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.apache.tools.ant.x2
        public void c1(org.apache.tools.ant.u2 u2Var) {
            this.f135790b.add(u2Var);
        }
    }

    /* JADX INFO: compiled from: MacroDef.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f135792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f135793c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f135794d = false;

        public String a() {
            return this.f135792b;
        }

        public String b() {
            return this.f135791a;
        }

        public boolean c() {
            return this.f135794d;
        }

        public boolean d() {
            return this.f135793c;
        }

        public void e(String str) {
            this.f135792b = str;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || !obj.getClass().equals(getClass())) {
                return false;
            }
            d dVar = (d) obj;
            String str = this.f135791a;
            if (str != null ? str.equals(dVar.f135791a) : dVar.f135791a == null) {
                if (this.f135793c == dVar.f135793c && this.f135794d == dVar.f135794d) {
                    return true;
                }
            }
            return false;
        }

        public void f(boolean z10) {
            this.f135794d = z10;
        }

        public void g(String str) {
            if (!t3.w2(str)) {
                throw new BuildException("Illegal name [%s] for macro element", str);
            }
            this.f135791a = str.toLowerCase(Locale.ENGLISH);
        }

        public void h(boolean z10) {
            this.f135793c = z10;
        }

        public int hashCode() {
            return Objects.hashCode(this.f135791a) + (this.f135793c ? 1 : 0) + (this.f135794d ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: MacroDef.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f135796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f135797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f135798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f135799e;

        public String a() {
            return this.f135799e;
        }

        public String b() {
            return this.f135798d;
        }

        public String c() {
            return this.f135795a;
        }

        public boolean d() {
            return this.f135796b;
        }

        public boolean e() {
            return this.f135797c;
        }

        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return Objects.equals(this.f135795a, eVar.f135795a) && this.f135796b == eVar.f135796b && this.f135797c == eVar.f135797c && Objects.equals(this.f135799e, eVar.f135799e);
        }

        public void f(String str) {
            this.f135799e = str;
        }

        public void g(String str) {
            this.f135798d = str;
        }

        public void h(String str) {
            if (!t3.w2(str)) {
                throw new BuildException("Illegal name [%s] for element", str);
            }
            this.f135795a = str.toLowerCase(Locale.ENGLISH);
        }

        public int hashCode() {
            return Objects.hashCode(this.f135795a);
        }

        public void i(boolean z10) {
            this.f135796b = z10;
        }

        public void j(boolean z10) {
            this.f135797c = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w2(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!x2(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean x2(char c10) {
        return Character.isLetterOrDigit(c10) || c10 == '.' || c10 == '-';
    }

    private boolean z2(Object obj, boolean z10) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        t3 t3Var = (t3) obj;
        String str = this.f135778n;
        if (str == null) {
            return t3Var.f135778n == null;
        }
        if (!str.equals(t3Var.f135778n)) {
            return false;
        }
        if (t3Var.w1() != null && t3Var.w1().equals(w1()) && !z10) {
            return true;
        }
        e eVar = this.f135783s;
        if (eVar == null) {
            if (t3Var.f135783s != null) {
                return false;
            }
        } else if (!eVar.equals(t3Var.f135783s)) {
            return false;
        }
        if (j2() == null || j2().isEmpty() || j2().equals(org.apache.tools.ant.e2.f133119c)) {
            if (t3Var.j2() != null && !t3Var.j2().isEmpty() && !t3Var.j2().equals(org.apache.tools.ant.e2.f133119c)) {
                return false;
            }
        } else if (!j2().equals(t3Var.j2())) {
            return false;
        }
        return this.f135777m.b(t3Var.f135777m) && this.f135780p.equals(t3Var.f135780p) && this.f135781q.equals(t3Var.f135781q);
    }

    public void A2(boolean z10) {
        this.f135779o = z10;
    }

    public void B2(String str) {
        this.f135778n = str;
    }

    public boolean C2(Object obj) {
        return z2(obj, false);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f135777m == null) {
            throw new BuildException("Missing sequential element");
        }
        if (this.f135778n == null) {
            throw new BuildException("Name not specified");
        }
        this.f135778n = org.apache.tools.ant.e2.l(j2(), this.f135778n);
        b bVar = new b(this);
        bVar.t(this.f135778n);
        bVar.q(u3.class);
        org.apache.tools.ant.u.y(b()).h(bVar);
        x1("creating macro  " + this.f135778n, 3);
    }

    public void n2(a aVar) {
        if (aVar.c() == null) {
            throw new BuildException("the attribute nested element needed a \"name\" attribute");
        }
        if (aVar.c().equals(this.f135782r)) {
            throw new BuildException("the name \"%s\" has already been used by the text element", aVar.c());
        }
        Iterator<a> it = this.f135780p.iterator();
        while (it.hasNext()) {
            if (it.next().c().equals(aVar.c())) {
                throw new BuildException("the name \"%s\" has already been used in another attribute element", aVar.c());
            }
        }
        this.f135780p.add(aVar);
    }

    public void o2(d dVar) {
        if (dVar.b() == null) {
            throw new BuildException("the element nested element needed a \"name\" attribute");
        }
        if (this.f135781q.get(dVar.b()) != null) {
            throw new BuildException("the element %s has already been specified", dVar.b());
        }
        if (this.f135784t || (dVar.c() && !this.f135781q.isEmpty())) {
            throw new BuildException("Only one element allowed when using implicit elements");
        }
        this.f135784t = dVar.c();
        this.f135781q.put(dVar.b(), dVar);
    }

    public void p2(e eVar) {
        if (this.f135783s != null) {
            throw new BuildException("Only one nested text element allowed");
        }
        if (eVar.c() == null) {
            throw new BuildException("the text nested element needed a \"name\" attribute");
        }
        Iterator<a> it = this.f135780p.iterator();
        while (it.hasNext()) {
            if (eVar.c().equals(it.next().c())) {
                throw new BuildException("the name \"%s\" is already used as an attribute", eVar.c());
            }
        }
        this.f135783s = eVar;
        this.f135782r = eVar.c();
    }

    public c q2() {
        if (this.f135777m != null) {
            throw new BuildException("Only one sequential allowed");
        }
        c cVar = new c();
        this.f135777m = cVar;
        return cVar;
    }

    public List<a> r2() {
        return this.f135780p;
    }

    public boolean s2() {
        return this.f135779o;
    }

    public Map<String, d> t2() {
        return this.f135781q;
    }

    public org.apache.tools.ant.z2 u2() {
        org.apache.tools.ant.z2 z2Var = new org.apache.tools.ant.z2("sequential");
        z2Var.g2("sequential");
        z2Var.y2("");
        z2Var.z2("sequential");
        new RuntimeConfigurable(z2Var, "sequential");
        int size = this.f135777m.a().size();
        for (int i10 = 0; i10 < size; i10++) {
            org.apache.tools.ant.z2 z2Var2 = (org.apache.tools.ant.z2) this.f135777m.a().get(i10);
            z2Var.i2(z2Var2);
            z2Var.N1().a(z2Var2.N1());
        }
        return z2Var;
    }

    public e v2() {
        return this.f135783s;
    }

    public boolean y2(Object obj) {
        return z2(obj, true);
    }
}
