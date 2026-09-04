package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.b2;

/* JADX INFO: compiled from: StorageManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface m {
    @dl.d
    <K, V> f<K, V> a(@dl.d yh.l<? super K, ? extends V> lVar);

    @dl.d
    <T> i<T> b(@dl.d yh.a<? extends T> aVar);

    @dl.d
    <T> h<T> c(@dl.d yh.a<? extends T> aVar);

    @dl.d
    <T> h<T> d(@dl.d yh.a<? extends T> aVar, @dl.e yh.l<? super Boolean, ? extends T> lVar, @dl.d yh.l<? super T, b2> lVar2);

    @dl.d
    <K, V> a<K, V> e();

    @dl.d
    <K, V> b<K, V> f();

    <T> T g(@dl.d yh.a<? extends T> aVar);

    @dl.d
    <K, V> g<K, V> h(@dl.d yh.l<? super K, ? extends V> lVar);

    @dl.d
    <T> h<T> i(@dl.d yh.a<? extends T> aVar, @dl.d T t10);
}
