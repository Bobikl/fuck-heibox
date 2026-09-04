package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: AllButLast.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends j1 {
    @Override // org.apache.tools.ant.types.resources.r
    protected Collection<org.apache.tools.ant.types.s1> n2() {
        int iO2 = o2();
        org.apache.tools.ant.types.u1 u1VarH2 = h2();
        return iO2 > u1VarH2.size() ? Collections.emptyList() : (Collection) u1VarH2.stream().limit(((long) u1VarH2.size()) - ((long) iO2)).collect(Collectors.toList());
    }

    @Override // org.apache.tools.ant.types.resources.j1, org.apache.tools.ant.types.resources.c, org.apache.tools.ant.types.u1
    public synchronized int size() {
        return Math.max(h2().size() - o2(), 0);
    }
}
