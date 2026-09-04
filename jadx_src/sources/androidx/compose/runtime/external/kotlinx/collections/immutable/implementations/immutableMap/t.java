package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/t;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/e;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/u;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class t<K, V> extends e<K, V, V> {
    /* JADX WARN: Illegal instructions before constructor call */
    public t(@dl.d u<K, V> node) {
        f0.p(node, "node");
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new a0();
        }
        super(node, vVarArr);
    }
}
