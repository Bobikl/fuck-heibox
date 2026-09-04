package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: PreSetDef.java */
/* JADX INFO: loaded from: classes5.dex */
public class s4 extends o implements org.apache.tools.ant.x2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.z2 f135738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135739n;

    /* JADX INFO: compiled from: PreSetDef.java */
    public static class a extends org.apache.tools.ant.h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private org.apache.tools.ant.h f135740h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private org.apache.tools.ant.z2 f135741i;

        public a(org.apache.tools.ant.h hVar, org.apache.tools.ant.z2 z2Var) {
            if (hVar instanceof a) {
                a aVar = (a) hVar;
                z2Var.j2(aVar.f135741i);
                hVar = aVar.f135740h;
            }
            this.f135740h = hVar;
            this.f135741i = z2Var;
        }

        @Override // org.apache.tools.ant.h
        public void a(Project project) {
            this.f135740h.a(project);
        }

        @Override // org.apache.tools.ant.h
        public Object b(Project project) {
            return this;
        }

        @Override // org.apache.tools.ant.h
        public ClassLoader e() {
            return this.f135740h.e();
        }

        @Override // org.apache.tools.ant.h
        public String f() {
            return this.f135740h.f();
        }

        @Override // org.apache.tools.ant.h
        public Class<?> g(Project project) {
            return this.f135740h.g(project);
        }

        @Override // org.apache.tools.ant.h
        public Class<?> i(Project project) {
            return this.f135740h.i(project);
        }

        @Override // org.apache.tools.ant.h
        public boolean n(org.apache.tools.ant.h hVar, Project project) {
            org.apache.tools.ant.h hVar2;
            if (hVar != null && hVar.getClass() == getClass() && (hVar2 = this.f135740h) != null) {
                a aVar = (a) hVar;
                if (hVar2.n(aVar.f135740h, project) && this.f135741i.B2(aVar.f135741i)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.apache.tools.ant.h
        public void o(Class<?> cls) {
            throw new BuildException("Not supported");
        }

        @Override // org.apache.tools.ant.h
        public void p(Class<?> cls) {
            throw new BuildException("Not supported");
        }

        @Override // org.apache.tools.ant.h
        public void q(Class<?> cls) {
            throw new BuildException("Not supported");
        }

        @Override // org.apache.tools.ant.h
        public void r(ClassLoader classLoader) {
            throw new BuildException("Not supported");
        }

        @Override // org.apache.tools.ant.h
        public void s(String str) {
            throw new BuildException("Not supported");
        }

        @Override // org.apache.tools.ant.h
        public boolean v(org.apache.tools.ant.h hVar, Project project) {
            org.apache.tools.ant.h hVar2;
            if (hVar != null && hVar.getClass().getName().equals(getClass().getName()) && (hVar2 = this.f135740h) != null) {
                a aVar = (a) hVar;
                if (hVar2.v(aVar.f135740h, project) && this.f135741i.B2(aVar.f135741i)) {
                    return true;
                }
            }
            return false;
        }

        public Object w(Project project) {
            return this.f135740h.b(project);
        }

        public org.apache.tools.ant.z2 x() {
            return this.f135741i;
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f135738m == null) {
            throw new BuildException("Missing nested element");
        }
        if (this.f135739n == null) {
            throw new BuildException("Name not specified");
        }
        this.f135739n = org.apache.tools.ant.e2.l(j2(), this.f135739n);
        org.apache.tools.ant.u uVarY = org.apache.tools.ant.u.y(b());
        String strL = org.apache.tools.ant.e2.l(this.f135738m.o2(), this.f135738m.s2());
        org.apache.tools.ant.h hVarC = uVarY.C(strL);
        if (hVarC == null) {
            throw new BuildException("Unable to find typedef %s", strL);
        }
        a aVar = new a(hVarC, this.f135738m);
        aVar.t(this.f135739n);
        uVarY.h(aVar);
        x1("defining preset " + this.f135739n, 3);
    }

    @Override // org.apache.tools.ant.x2
    public void c1(org.apache.tools.ant.u2 u2Var) {
        if (this.f135738m != null) {
            throw new BuildException("Only one nested element allowed");
        }
        if (!(u2Var instanceof org.apache.tools.ant.z2)) {
            throw new BuildException("addTask called with a task that is not an unknown element");
        }
        this.f135738m = (org.apache.tools.ant.z2) u2Var;
    }

    public void m2(String str) {
        this.f135739n = str;
    }
}
