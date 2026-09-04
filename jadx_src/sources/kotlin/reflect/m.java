package kotlin.reflect;

import kotlin.b2;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface m<D, E, V> extends q<D, E, V>, j<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<D, E, V> extends j.a<V>, yh.q<D, E, V, b2> {
    }

    @Override // kotlin.reflect.j
    @dl.d
    a<D, E, V> getSetter();

    void u0(D d10, E e10, V v10);
}
