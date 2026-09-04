package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends g<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c value) {
        super(value);
        f0.p(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public d0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 module) {
        f0.p(module, "module");
        return b().getType();
    }
}
