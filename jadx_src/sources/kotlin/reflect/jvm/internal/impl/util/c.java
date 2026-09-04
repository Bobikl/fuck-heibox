package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c<T> implements Iterable<T>, zh.a {
    private c() {
    }

    public /* synthetic */ c(u uVar) {
        this();
    }

    public abstract int a();

    public abstract void b(int i10, @dl.d T t10);

    @dl.e
    public abstract T get(int i10);

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
