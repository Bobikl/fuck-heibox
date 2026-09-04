package org.ahocorasick.interval;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: IntervalTree.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IntervalNode f132786a;

    public b(List<c> list) {
        this.f132786a = null;
        this.f132786a = new IntervalNode(list);
    }

    public List<c> a(c cVar) {
        return this.f132786a.g(cVar);
    }

    public List<c> b(List<c> list) {
        Collections.sort(list, new e());
        TreeSet treeSet = new TreeSet();
        for (c cVar : list) {
            if (!treeSet.contains(cVar)) {
                treeSet.addAll(a(cVar));
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            list.remove((c) it.next());
        }
        Collections.sort(list, new d());
        return list;
    }
}
