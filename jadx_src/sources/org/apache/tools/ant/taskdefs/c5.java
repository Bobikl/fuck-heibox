package org.apache.tools.ant.taskdefs;

import java.util.ArrayList;
import java.util.List;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: PropertyHelperTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class c5 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.p2 f133826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Object> f133827l;

    /* JADX INFO: compiled from: PropertyHelperTask.java */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133828a;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.apache.tools.ant.p2.c c() {
            if (this.f133828a != null) {
                return (org.apache.tools.ant.p2.c) c5.this.b().w0(this.f133828a);
            }
            throw new BuildException("refid required for generic delegate");
        }

        public String b() {
            return this.f133828a;
        }

        public void d(String str) {
            this.f133828a = str;
        }
    }

    private synchronized List<Object> l2() {
        if (this.f133827l == null) {
            this.f133827l = new ArrayList();
        }
        return this.f133827l;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (b() == null) {
            throw new BuildException("Project instance not set");
        }
        org.apache.tools.ant.p2 p2VarU = this.f133826k;
        if (p2VarU == null && this.f133827l == null) {
            throw new BuildException("Either a new PropertyHelper or one or more PropertyHelper delegates are required");
        }
        if (p2VarU == null) {
            p2VarU = org.apache.tools.ant.p2.u(b());
        }
        synchronized (p2VarU) {
            List<Object> list = this.f133827l;
            if (list != null) {
                for (Object obj : list) {
                    org.apache.tools.ant.p2.c cVarC = obj instanceof b ? ((b) obj).c() : (org.apache.tools.ant.p2.c) obj;
                    x1("Adding PropertyHelper delegate " + cVarC, 4);
                    p2VarU.d(cVarC);
                }
            }
        }
        if (this.f133826k != null) {
            x1("Installing PropertyHelper " + this.f133826k, 4);
            b().i(org.apache.tools.ant.j1.f133502z, this.f133826k);
        }
    }

    public synchronized void i2(org.apache.tools.ant.p2.c cVar) {
        l2().add(cVar);
    }

    public synchronized void j2(org.apache.tools.ant.p2 p2Var) {
        if (this.f133826k != null) {
            throw new BuildException("Only one PropertyHelper can be installed");
        }
        this.f133826k = p2Var;
    }

    public b k2() {
        b bVar = new b();
        l2().add(bVar);
        return bVar;
    }
}
