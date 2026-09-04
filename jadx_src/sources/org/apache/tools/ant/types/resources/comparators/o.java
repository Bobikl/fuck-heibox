package org.apache.tools.ant.types.resources.comparators;

import java.util.Comparator;
import java.util.Optional;
import java.util.Stack;
import java.util.function.Supplier;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Reverse.java */
/* JADX INFO: loaded from: classes5.dex */
public class o extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f136341h = "You must not nest more than one ResourceComparator for reversal.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m f136342g;

    public o() {
    }

    public o(m mVar) {
        h2(mVar);
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
        m mVar = this.f136342g;
        if (mVar != null) {
            org.apache.tools.ant.types.s.a2(mVar, stack, project);
        }
        b2(true);
    }

    @Override // org.apache.tools.ant.types.resources.comparators.m
    protected int g2(s1 s1Var, s1 s1Var2) {
        return ((Comparator) Optional.ofNullable(this.f136342g).orElseGet(new Supplier() { // from class: org.apache.tools.ant.types.resources.comparators.n
            @Override // java.util.function.Supplier
            public final Object get() {
                return Comparator.naturalOrder();
            }
        })).reversed().compare(s1Var, s1Var2);
    }

    public void h2(m mVar) {
        if (this.f136342g != null) {
            throw new BuildException(f136341h);
        }
        this.f136342g = mVar;
        b2(false);
    }
}
