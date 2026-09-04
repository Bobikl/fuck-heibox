package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<K, V> implements Iterable<V>, zh.a {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArrayMapOwner.kt */
    public static abstract class AbstractC1183a<K, V, T extends V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.d<? extends K> f128225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f128226b;

        public AbstractC1183a(@dl.d kotlin.reflect.d<? extends K> key, int i10) {
            f0.p(key, "key");
            this.f128225a = key;
            this.f128226b = i10;
        }

        @dl.e
        protected final T c(@dl.d a<K, V> thisRef) {
            f0.p(thisRef, "thisRef");
            return thisRef.a().get(this.f128226b);
        }
    }

    @dl.d
    protected abstract c<V> a();

    @dl.d
    protected abstract TypeRegistry<K, V> b();

    protected abstract void e(@dl.d kotlin.reflect.d<? extends K> dVar, @dl.d V v10);

    public final boolean isEmpty() {
        return a().a() == 0;
    }

    @Override // java.lang.Iterable
    @dl.d
    public final Iterator<V> iterator() {
        return a().iterator();
    }
}
