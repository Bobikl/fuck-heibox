package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: DeserializedArrayValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedArrayValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final d0 f127665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedArrayValue(@dl.d List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> value, @dl.d final d0 type) {
        super(value, new yh.l<kotlin.reflect.jvm.internal.impl.descriptors.d0, d0>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue.1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 it) {
                f0.p(it, "it");
                return type;
            }
        });
        f0.p(value, "value");
        f0.p(type, "type");
        this.f127665c = type;
    }

    @dl.d
    public final d0 c() {
        return this.f127665c;
    }
}
