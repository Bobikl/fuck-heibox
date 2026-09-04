package org.apache.tools.ant.types.resources.comparators;

import java.util.Comparator;
import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: ResourceComparator.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m extends org.apache.tools.ant.types.s implements Comparator<s1> {
    private m f2() {
        return (m) O1(m.class);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final int compare(s1 s1Var, s1 s1Var2) {
        H1();
        return (Y1() ? f2() : this).g2(s1Var, s1Var2);
    }

    public boolean equals(Object obj) {
        if (Y1()) {
            return f2().equals(obj);
        }
        return obj != null && (obj == this || obj.getClass().equals(getClass()));
    }

    protected abstract int g2(s1 s1Var, s1 s1Var2);

    public synchronized int hashCode() {
        if (Y1()) {
            return f2().hashCode();
        }
        return getClass().hashCode();
    }
}
