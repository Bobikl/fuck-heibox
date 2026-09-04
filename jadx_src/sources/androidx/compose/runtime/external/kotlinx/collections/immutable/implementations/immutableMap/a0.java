package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/a0;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "next", "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class a0<K, V> extends v<K, V, V> {
    @Override // java.util.Iterator
    public V next() {
        y0.a.a(e());
        o(getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() + 2);
        return (V) getBuffer()[getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - 1];
    }
}
