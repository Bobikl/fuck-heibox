package org.apache.tools.ant.types.resources.selectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.s;

/* JADX INFO: compiled from: ResourceSelectorContainer.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<n> f136450g = new ArrayList();

    public o() {
    }

    public o(n... nVarArr) {
        for (n nVar : nVarArr) {
            e2(nVar);
        }
    }

    private o f2() {
        return (o) O1(o.class);
    }

    @Override // org.apache.tools.ant.types.s
    protected void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
            return;
        }
        for (Object obj : this.f136450g) {
            if (obj instanceof s) {
                s.a2((s) obj, stack, project);
            }
        }
        b2(true);
    }

    public boolean S0() {
        if (Y1()) {
            return f2().S0();
        }
        H1();
        return !this.f136450g.isEmpty();
    }

    public void e2(n nVar) {
        if (Y1()) {
            throw Z1();
        }
        if (nVar == null) {
            return;
        }
        this.f136450g.add(nVar);
        b2(false);
    }

    public List<n> g2() {
        if (Y1()) {
            return f2().g2();
        }
        H1();
        return Collections.unmodifiableList(this.f136450g);
    }

    public Iterator<n> h2() {
        return Y1() ? f2().h2() : g2().iterator();
    }

    public int p1() {
        if (Y1()) {
            return f2().p1();
        }
        H1();
        return this.f136450g.size();
    }
}
