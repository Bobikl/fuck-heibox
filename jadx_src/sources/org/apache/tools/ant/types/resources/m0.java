package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Last.java */
/* JADX INFO: loaded from: classes5.dex */
public class m0 extends j1 {
    @Override // org.apache.tools.ant.types.resources.r
    protected Collection<org.apache.tools.ant.types.s1> n2() {
        int iO2 = o2();
        org.apache.tools.ant.types.u1 u1VarH2 = h2();
        int size = u1VarH2.size();
        int iMax = Math.max(0, size - iO2);
        List list = (List) u1VarH2.stream().skip(iMax).collect(Collectors.toList());
        int size2 = list.size();
        if (size2 == iO2 || (size < iO2 && size2 == size)) {
            return list;
        }
        String str = String.format("Resource collection %s reports size %d but returns %d elements.", u1VarH2, Integer.valueOf(size), Integer.valueOf(iMax + size2));
        if (size2 <= iO2) {
            throw new BuildException(str);
        }
        x1(str, 1);
        return list.subList(size2 - iO2, size2);
    }
}
