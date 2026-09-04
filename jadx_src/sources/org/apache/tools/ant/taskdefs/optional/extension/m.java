package org.apache.tools.ant.taskdefs.optional.extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.q1;

/* JADX INFO: compiled from: ExtensionSet.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends org.apache.tools.ant.types.s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<k> f135076g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.b0> f135077h = new ArrayList();

    private m h2() {
        return (m) O1(m.class);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            Iterator<k> it = this.f135076g.iterator();
            while (it.hasNext()) {
                org.apache.tools.ant.types.s.a2(it.next(), stack, project);
            }
            Iterator<org.apache.tools.ant.types.b0> it2 = this.f135077h.iterator();
            while (it2.hasNext()) {
                org.apache.tools.ant.types.s.a2(it2.next(), stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (!this.f135076g.isEmpty() || !this.f135077h.isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void e2(k kVar) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f135076g.add(kVar);
    }

    public void f2(org.apache.tools.ant.types.b0 b0Var) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f135077h.add(b0Var);
    }

    public void g2(a0 a0Var) {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        this.f135077h.add(a0Var);
    }

    public j[] i2(Project project) throws BuildException {
        if (Y1()) {
            return h2().i2(project);
        }
        H1();
        ArrayList<j> arrayListF = p.f(this.f135076g);
        p.b(project, arrayListF, this.f135077h);
        return (j[]) arrayListF.toArray(new j[arrayListF.size()]);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        return "ExtensionSet" + Arrays.asList(i2(b()));
    }
}
