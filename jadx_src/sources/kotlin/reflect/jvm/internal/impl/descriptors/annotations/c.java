package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: AnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: AnnotationDescriptor.kt */
    public static final class a {
        @dl.e
        public static kotlin.reflect.jvm.internal.impl.name.c a(@dl.d c cVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarI = DescriptorUtilsKt.i(cVar);
            if (dVarI == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.types.error.h.m(dVarI)) {
                dVarI = null;
            }
            if (dVarI != null) {
                return DescriptorUtilsKt.h(dVarI);
            }
            return null;
        }
    }

    @dl.d
    Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a();

    @dl.e
    kotlin.reflect.jvm.internal.impl.name.c e();

    @dl.d
    d0 getType();

    @dl.d
    t0 j();
}
