package nh;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.f;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends f<E> {
    public final boolean b(@dl.d E element) {
        f0.p(element, "element");
        return e(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean e(@dl.d Map.Entry<? extends K, ? extends V> entry);

    public /* bridge */ boolean g(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
