package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/z;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "", "p", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;", "e", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;", "parentIterator", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class z<K, V> extends v<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i<K, V> parentIterator;

    public z(@dl.d i<K, V> parentIterator) {
        f0.p(parentIterator, "parentIterator");
        this.parentIterator = parentIterator;
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        y0.a.a(e());
        o(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 2);
        return new c(this.parentIterator, getBuffer()[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 2], getBuffer()[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1]);
    }
}
