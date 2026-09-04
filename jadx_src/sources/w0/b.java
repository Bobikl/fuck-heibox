package w0;

import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PersistentOrderedMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B7\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lw0/b;", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/b;", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", "Lw0/a;", "mutableMap", "key", SocializeProtocolConstants.LINKS, "<init>", "(Ljava/util/Map;Ljava/lang/Object;Lw0/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class b<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b<K, V> implements Map.Entry<K, V>, zh.g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<K, a<V>> f140922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private a<V> f140923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Map<K, a<V>> mutableMap, K k10, @dl.d a<V> links) {
        super(k10, links.e());
        f0.p(mutableMap, "mutableMap");
        f0.p(links, "links");
        this.f140922d = mutableMap;
        this.f140923e = links;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V getValue() {
        return this.f140923e.e();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map.Entry
    public V setValue(V newValue) {
        V vE = this.f140923e.e();
        this.f140923e = this.f140923e.h(newValue);
        this.f140922d.put(getKey(), this.f140923e);
        return vE;
    }
}
