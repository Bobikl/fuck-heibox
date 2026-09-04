package kotlinx.serialization.internal;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class MapEntrySerializer<K, V> extends u0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130620c;

    /* JADX INFO: compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, zh.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final K f130621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V f130622c;

        public a(K k10, V v10) {
            this.f130621b = k10;
            this.f130622c = v10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, Object obj, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                obj = aVar.f130621b;
            }
            if ((i10 & 2) != 0) {
                obj2 = aVar.f130622c;
            }
            return aVar.c(obj, obj2);
        }

        public final K a() {
            return this.f130621b;
        }

        public final V b() {
            return this.f130622c;
        }

        @dl.d
        public final a<K, V> c(K k10, V v10) {
            return new a<>(k10, v10);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f0.g(this.f130621b, aVar.f130621b) && kotlin.jvm.internal.f0.g(this.f130622c, aVar.f130622c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f130621b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f130622c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f130621b;
            int iHashCode = (k10 == null ? 0 : k10.hashCode()) * 31;
            V v10 = this.f130622c;
            return iHashCode + (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @dl.d
        public String toString() {
            return "MapEntry(key=" + this.f130621b + ", value=" + this.f130622c + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(@dl.d final kotlinx.serialization.g<K> keySerializer, @dl.d final kotlinx.serialization.g<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.f0.p(keySerializer, "keySerializer");
        kotlin.jvm.internal.f0.p(valueSerializer, "valueSerializer");
        this.f130620c = SerialDescriptorsKt.e("kotlin.collections.Map.Entry", kotlinx.serialization.descriptors.i.c.f130593a, new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, kotlin.b2>() { // from class: kotlinx.serialization.internal.MapEntrySerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d kotlinx.serialization.descriptors.a buildSerialDescriptor) {
                kotlin.jvm.internal.f0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "key", keySerializer.a(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "value", valueSerializer.a(), null, false, 12, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(kotlinx.serialization.descriptors.a aVar) {
                a(aVar);
                return kotlin.b2.f124493a;
            }
        });
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130620c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.u0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public K f(@dl.d Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.f0.p(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.u0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public V h(@dl.d Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.f0.p(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.u0
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> j(K k10, V v10) {
        return new a(k10, v10);
    }
}
