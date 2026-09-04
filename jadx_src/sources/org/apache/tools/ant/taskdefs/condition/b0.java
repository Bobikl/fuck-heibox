package org.apache.tools.ant.taskdefs.condition;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.s1;
import org.apache.tools.ant.types.u1;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: ResourceContains.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Project f133870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s1 f133872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f133873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f133874f = true;

    private void b() {
        try {
            if (a() == null) {
                throw new BuildException("Cannot retrieve refid; project unset");
            }
            Object objW0 = a().w0(this.f133873e);
            if (!(objW0 instanceof s1)) {
                if (!(objW0 instanceof u1)) {
                    throw new BuildException("Illegal value at '%s': %s", this.f133873e, objW0);
                }
                u1 u1Var = (u1) objW0;
                if (u1Var.size() == 1) {
                    objW0 = u1Var.iterator().next();
                }
            }
            this.f133872d = (s1) objW0;
            this.f133873e = null;
        } catch (Throwable th2) {
            this.f133873e = null;
            throw th2;
        }
    }

    private void i() {
        s1 s1Var = this.f133872d;
        if (s1Var != null && this.f133873e != null) {
            throw new BuildException("Cannot set both resource and refid");
        }
        if (s1Var == null && this.f133873e != null) {
            b();
        }
        if (this.f133872d == null || this.f133871c == null) {
            throw new BuildException("both resource and substring are required in <resourcecontains>");
        }
    }

    public Project a() {
        return this.f133870b;
    }

    public void c(boolean z10) {
        this.f133874f = z10;
    }

    public void d(Project project) {
        this.f133870b = project;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public synchronized boolean e() throws BuildException {
        i();
        if (this.f133871c.isEmpty()) {
            if (a() != null) {
                a().M0("Substring is empty; returning true", 3);
            }
            return true;
        }
        if (this.f133872d.n2() == 0) {
            return false;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f133872d.h2()));
            try {
                String strO0 = j0.o0(bufferedReader);
                String lowerCase = this.f133871c;
                if (!this.f133874f) {
                    strO0 = strO0.toLowerCase();
                    lowerCase = lowerCase.toLowerCase();
                }
                boolean zContains = strO0.contains(lowerCase);
                bufferedReader.close();
                return zContains;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            throw new BuildException("There was a problem accessing resource : " + this.f133872d);
        }
    }

    public void f(String str) {
        this.f133873e = str;
    }

    public void g(String str) {
        this.f133872d = new org.apache.tools.ant.types.resources.z(new File(str));
    }

    public void h(String str) {
        this.f133871c = str;
    }
}
