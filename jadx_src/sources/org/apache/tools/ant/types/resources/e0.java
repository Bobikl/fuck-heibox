package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: First.java */
/* JADX INFO: loaded from: classes5.dex */
public class e0 extends j1 {
    @Override // org.apache.tools.ant.types.resources.r
    protected Collection<org.apache.tools.ant.types.s1> n2() {
        return (Collection) h2().stream().limit(o2()).collect(Collectors.toList());
    }
}
