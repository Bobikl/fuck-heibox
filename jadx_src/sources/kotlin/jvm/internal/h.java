package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    @dl.d
    public static final <T> Iterator<T> a(@dl.d T[] array) {
        f0.p(array, "array");
        return new g(array);
    }
}
