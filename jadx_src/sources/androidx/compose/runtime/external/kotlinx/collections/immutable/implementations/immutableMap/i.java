package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rR2\u0010\u0010\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/i;", "K", androidx.exifinterface.media.a.X4, "", "", "", "hasNext", ak.av, "Lkotlin/b2;", "remove", "key", "newValue", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/g;", com.google.android.exoplayer2.text.ttml.d.X, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/f;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, zh.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final g<K, V, Map.Entry<K, V>> base;

    public i(@dl.d f<K, V> builder) {
        f0.p(builder, "builder");
        v[] vVarArr = new v[8];
        for (int i10 = 0; i10 < 8; i10++) {
            vVarArr[i10] = new z(this);
        }
        this.base = new g<>(builder, vVarArr);
    }

    @Override // java.util.Iterator
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.base.next();
    }

    public final void b(K key, V newValue) {
        this.base.p(key, newValue);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.base.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.base.remove();
    }
}
