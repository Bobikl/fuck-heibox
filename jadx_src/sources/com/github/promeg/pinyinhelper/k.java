package com.github.promeg.pinyinhelper;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private k() {
    }

    static org.ahocorasick.trie.f a(List<h> list) {
        TreeSet treeSet = new TreeSet();
        org.ahocorasick.trie.f.b bVarE = org.ahocorasick.trie.f.e();
        if (list == null) {
            return null;
        }
        for (h hVar : list) {
            if (hVar != null && hVar.a() != null) {
                treeSet.addAll(hVar.a());
            }
        }
        if (treeSet.size() <= 0) {
            return null;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            bVarE.a((String) it.next());
        }
        return bVarE.b();
    }
}
