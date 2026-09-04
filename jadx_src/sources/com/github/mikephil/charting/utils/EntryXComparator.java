package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class EntryXComparator implements Comparator<Entry> {
    @Override // java.util.Comparator
    public int compare(Entry entry, Entry entry2) {
        float x10 = entry.getX() - entry2.getX();
        if (x10 == 0.0f) {
            return 0;
        }
        return x10 > 0.0f ? 1 : -1;
    }
}
