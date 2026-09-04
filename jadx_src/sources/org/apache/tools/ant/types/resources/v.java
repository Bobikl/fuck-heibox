package org.apache.tools.ant.types.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Difference.java */
/* JADX INFO: loaded from: classes5.dex */
public class v extends q {
    @Override // org.apache.tools.ant.types.resources.q
    protected Collection<org.apache.tools.ant.types.s1> i2() {
        List<org.apache.tools.ant.types.u1> listK2 = k2();
        int size = listK2.size();
        if (size < 2) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = size == 1 ? "collection" : "collections";
            throw new BuildException("The difference of %d resource %s is undefined.", objArr);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<org.apache.tools.ant.types.u1> it = listK2.iterator();
        while (it.hasNext()) {
            for (org.apache.tools.ant.types.s1 s1Var : it.next()) {
                if (hashSet.add(s1Var)) {
                    arrayList.add(s1Var);
                } else {
                    arrayList.remove(s1Var);
                }
            }
        }
        return arrayList;
    }
}
