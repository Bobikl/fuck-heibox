package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: AllButFirst.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends j1 {
    @Override // org.apache.tools.ant.types.resources.r
    protected Collection<org.apache.tools.ant.types.s1> n2() {
        return (Collection) h2().stream().skip(o2()).collect(Collectors.toList());
    }

    @Override // org.apache.tools.ant.types.resources.j1, org.apache.tools.ant.types.resources.c, org.apache.tools.ant.types.u1
    public synchronized int size() {
        return Math.max(h2().size() - o2(), 0);
    }
}
