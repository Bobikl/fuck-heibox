package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.Stack;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Sort.java */
/* JADX INFO: loaded from: classes5.dex */
public class k1 extends r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.comparators.f f136382k = new org.apache.tools.ant.types.resources.comparators.f();

    @Override // org.apache.tools.ant.types.resources.c, org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        super.I1(stack, project);
        if (!Y1()) {
            org.apache.tools.ant.types.s.a2(this.f136382k, stack, project);
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.resources.r
    protected synchronized Collection<org.apache.tools.ant.types.s1> n2() {
        return (Collection) h2().stream().map(new i(org.apache.tools.ant.types.s1.class)).sorted(this.f136382k).collect(Collectors.toList());
    }

    public synchronized void o2(org.apache.tools.ant.types.resources.comparators.m mVar) {
        if (Y1()) {
            throw Z1();
        }
        this.f136382k.h2(mVar);
        x.d(this);
        b2(false);
    }
}
