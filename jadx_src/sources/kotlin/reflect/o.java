package kotlin.reflect;

import kotlin.u0;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface o<V> extends n<V>, yh.a<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    public interface a<V> extends n.c<V>, yh.a<V> {
    }

    V get();

    @u0(version = "1.1")
    @dl.e
    Object getDelegate();

    @Override // kotlin.reflect.n
    @dl.d
    a<V> getGetter();
}
