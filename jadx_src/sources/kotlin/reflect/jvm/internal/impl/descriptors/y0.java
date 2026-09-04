package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: TypeParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public interface y0 extends f, si.n {
    boolean I();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    y0 a();

    int getIndex();

    @dl.d
    List<kotlin.reflect.jvm.internal.impl.types.d0> getUpperBounds();

    @dl.d
    kotlin.reflect.jvm.internal.impl.storage.m j0();

    boolean k();

    @dl.d
    Variance n();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    kotlin.reflect.jvm.internal.impl.types.z0 r();
}
