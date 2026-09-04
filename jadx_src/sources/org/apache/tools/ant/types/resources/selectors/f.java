package org.apache.tools.ant.types.resources.selectors;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.e2;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.u;

/* JADX INFO: compiled from: InstanceOf.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f136434f = "Exactly one of class|type must be set.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f136435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f136436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f136437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f136438e;

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        Class<?> clsL = this.f136436c;
        boolean z10 = clsL == null;
        String str = this.f136437d;
        if (z10 == (str == null)) {
            throw new BuildException(f136434f);
        }
        if (str != null) {
            Project project = this.f136435b;
            if (project == null) {
                throw new BuildException("No project set for InstanceOf ResourceSelector; the type attribute is invalid.");
            }
            org.apache.tools.ant.h hVarC = u.y(project).C(e2.l(this.f136438e, this.f136437d));
            if (hVarC == null) {
                throw new BuildException("type %s not found.", this.f136437d);
            }
            try {
                clsL = hVarC.l();
            } catch (ClassNotFoundException e10) {
                throw new BuildException(e10);
            }
        }
        return clsL.isAssignableFrom(s1Var.getClass());
    }

    public Class<?> b() {
        return this.f136436c;
    }

    public String c() {
        return this.f136437d;
    }

    public String d() {
        return this.f136438e;
    }

    public void e(Class<?> cls) {
        if (this.f136436c != null) {
            throw new BuildException("The class attribute has already been set.");
        }
        this.f136436c = cls;
    }

    public void f(Project project) {
        this.f136435b = project;
    }

    public void g(String str) {
        this.f136437d = str;
    }

    public void h(String str) {
        this.f136438e = str;
    }
}
