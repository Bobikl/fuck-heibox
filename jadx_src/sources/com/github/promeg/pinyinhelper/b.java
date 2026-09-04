package com.github.promeg.pinyinhelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: ForwardLongestSelector.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a.C0369a f43470a = new a.C0369a();

    b() {
    }

    @Override // com.github.promeg.pinyinhelper.j
    public List<org.ahocorasick.trie.a> a(Collection<org.ahocorasick.trie.a> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList<org.ahocorasick.trie.a> arrayList = new ArrayList(collection);
        Collections.sort(arrayList, f43470a);
        int iG = -1;
        TreeSet treeSet = new TreeSet();
        for (org.ahocorasick.trie.a aVar : arrayList) {
            if (aVar.D() <= iG || aVar.G() <= iG) {
                treeSet.add(aVar);
            } else {
                iG = aVar.G();
            }
        }
        arrayList.removeAll(treeSet);
        return arrayList;
    }
}
