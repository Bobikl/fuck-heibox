package kotlinx.serialization.internal;

import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class PairSerializer<K, V> extends u0<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(@dl.d final kotlinx.serialization.g<K> keySerializer, @dl.d final kotlinx.serialization.g<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.f0.p(keySerializer, "keySerializer");
        kotlin.jvm.internal.f0.p(valueSerializer, "valueSerializer");
        this.f130631c = SerialDescriptorsKt.c("kotlin.Pair", new kotlinx.serialization.descriptors.f[0], new yh.l<kotlinx.serialization.descriptors.a, kotlin.b2>() { // from class: kotlinx.serialization.internal.PairSerializer$descriptor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
                kotlin.jvm.internal.f0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "first", keySerializer.a(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, p7.a.f135567e, valueSerializer.a(), null, false, 12, null);
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
        return this.f130631c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.u0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public K f(@dl.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return pair.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.u0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public V h(@dl.d Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.f0.p(pair, "<this>");
        return pair.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.u0
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<K, V> j(K k10, V v10) {
        return kotlin.c1.a(k10, v10);
    }
}
