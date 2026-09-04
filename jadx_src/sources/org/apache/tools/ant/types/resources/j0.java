package org.apache.tools.ant.types.resources;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Intersect.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 extends q {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Set q2(org.apache.tools.ant.types.u1 u1Var) {
        return (Set) u1Var.stream().collect(Collectors.toSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r2(Set set, Function function, org.apache.tools.ant.types.u1 u1Var) {
        set.retainAll((Collection) function.apply(u1Var));
    }

    @Override // org.apache.tools.ant.types.resources.q
    protected Collection<org.apache.tools.ant.types.s1> i2() {
        List<org.apache.tools.ant.types.u1> listK2 = k2();
        int size = listK2.size();
        if (size < 2) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = size == 1 ? "collection" : "collections";
            throw new BuildException("The intersection of %d resource %s is undefined.", objArr);
        }
        final Function function = new Function() { // from class: org.apache.tools.ant.types.resources.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return j0.q2((org.apache.tools.ant.types.u1) obj);
            }
        };
        Iterator<org.apache.tools.ant.types.u1> it = listK2.iterator();
        final LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) function.apply(it.next()));
        it.forEachRemaining(new Consumer() { // from class: org.apache.tools.ant.types.resources.i0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                j0.r2(linkedHashSet, function, (org.apache.tools.ant.types.u1) obj);
            }
        });
        return linkedHashSet;
    }
}
