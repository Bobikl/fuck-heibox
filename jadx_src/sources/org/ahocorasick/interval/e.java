package org.ahocorasick.interval;

import java.util.Comparator;

/* JADX INFO: compiled from: IntervalableComparatorBySize.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements Comparator<c> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c cVar, c cVar2) {
        int size = cVar2.size() - cVar.size();
        return size == 0 ? cVar.D() - cVar2.D() : size;
    }
}
