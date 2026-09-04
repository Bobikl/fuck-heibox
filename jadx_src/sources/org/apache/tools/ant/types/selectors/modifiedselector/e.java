package org.apache.tools.ant.types.selectors.modifiedselector;

import java.util.Comparator;

/* JADX INFO: compiled from: EqualComparator.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements Comparator<Object> {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? 1 : 0;
        }
        return !obj.equals(obj2) ? 1 : 0;
    }

    public String toString() {
        return "EqualComparator";
    }
}
