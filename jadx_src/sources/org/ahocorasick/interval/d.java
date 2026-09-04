package org.ahocorasick.interval;

import java.util.Comparator;

/* JADX INFO: compiled from: IntervalableComparatorByPosition.java */
/* JADX INFO: loaded from: classes5.dex */
public class d implements Comparator<c> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c cVar, c cVar2) {
        return cVar.D() - cVar2.D();
    }
}
