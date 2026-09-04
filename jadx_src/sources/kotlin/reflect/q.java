package kotlin.reflect;

import kotlin.u0;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface q<D, E, V> extends n<V>, yh.p<D, E, V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<D, E, V> extends n.c<V>, yh.p<D, E, V> {
    }

    @u0(version = "1.1")
    @dl.e
    Object Q0(D d10, E e10);

    V Y(D d10, E e10);

    @Override // kotlin.reflect.n
    @dl.d
    a<D, E, V> getGetter();
}
