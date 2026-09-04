package kotlin.reflect;

import kotlin.u0;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface p<T, V> extends n<V>, yh.l<T, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<T, V> extends n.c<V>, yh.l<T, V> {
    }

    @u0(version = "1.1")
    @dl.e
    Object e0(T t10);

    V get(T t10);

    @Override // kotlin.reflect.n
    @dl.d
    a<T, V> getGetter();
}
