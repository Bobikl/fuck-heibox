package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: ArraySetJvmUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class d {
    private d() {
    }

    static <T> T[] a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
