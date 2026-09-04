package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m<K, V, T extends V> extends a.AbstractC1183a<K, V, T> implements kotlin.properties.e<a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d kotlin.reflect.d<? extends K> key, int i10) {
        super(key, i10);
        f0.p(key, "key");
    }

    @Override // kotlin.properties.e
    @dl.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T a(@dl.d a<K, V> thisRef, @dl.d kotlin.reflect.n<?> property) {
        f0.p(thisRef, "thisRef");
        f0.p(property, "property");
        return c(thisRef);
    }
}
