package org.apache.tools.ant.types.resources.comparators;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: DelegatedResourceComparator.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<m> f136337g = null;

    private static Comparator<s1> i2(List<? extends Comparator<s1>> list) {
        Comparator<s1> comparatorThenComparing = null;
        if (list != null) {
            for (Comparator<s1> comparator : list) {
                comparatorThenComparing = comparatorThenComparing == null ? comparator : comparatorThenComparing.thenComparing(comparator);
            }
        }
        return comparatorThenComparing == null ? Comparator.naturalOrder() : comparatorThenComparing;
    }

    private f j2() {
        return (f) O1(f.class);
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
        List<m> list = this.f136337g;
        if (list != null && !list.isEmpty()) {
            for (m mVar : this.f136337g) {
                if (mVar instanceof org.apache.tools.ant.types.s) {
                    org.apache.tools.ant.types.s.a2(mVar, stack, project);
                }
            }
        }
        b2(true);
    }

    @Override // org.apache.tools.ant.types.resources.comparators.m, java.util.Comparator
    public synchronized boolean equals(Object obj) {
        boolean zEquals = true;
        if (obj == this) {
            return true;
        }
        if (Y1()) {
            return j2().equals(obj);
        }
        if (!(obj instanceof f)) {
            return false;
        }
        List<m> list = ((f) obj).f136337g;
        List<m> list2 = this.f136337g;
        if (list2 != null) {
            zEquals = list2.equals(list);
        } else if (list != null) {
            zEquals = false;
        }
        return zEquals;
    }

    @Override // org.apache.tools.ant.types.resources.comparators.m
    protected synchronized int g2(s1 s1Var, s1 s1Var2) {
        return i2(this.f136337g).compare(s1Var, s1Var2);
    }

    public synchronized void h2(m mVar) {
        if (Y1()) {
            throw Z1();
        }
        if (mVar == null) {
            return;
        }
        List<m> vector = this.f136337g;
        if (vector == null) {
            vector = new Vector<>();
        }
        this.f136337g = vector;
        vector.add(mVar);
        b2(false);
    }

    @Override // org.apache.tools.ant.types.resources.comparators.m
    public synchronized int hashCode() {
        if (Y1()) {
            return j2().hashCode();
        }
        List<m> list = this.f136337g;
        return list == null ? 0 : list.hashCode();
    }
}
