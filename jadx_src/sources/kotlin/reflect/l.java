package kotlin.reflect;

import kotlin.b2;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface l<T, V> extends p<T, V>, j<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<T, V> extends j.a<V>, yh.p<T, V, b2> {
    }

    void Y0(T t10, V v10);

    @Override // kotlin.reflect.j
    @dl.d
    a<T, V> getSetter();
}
