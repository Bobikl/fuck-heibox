package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* JADX INFO: compiled from: DeserializedAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.d m storageManager, @dl.d yh.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> compute) {
        super(storageManager, compute);
        f0.p(storageManager, "storageManager");
        f0.p(compute, "compute");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e
    public boolean isEmpty() {
        return false;
    }
}
