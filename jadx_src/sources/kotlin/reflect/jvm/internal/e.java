package kotlin.reflect.jvm.internal;

import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e extends kotlin.reflect.jvm.internal.impl.descriptors.impl.k<KCallableImpl<?>, b2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final KDeclarationContainerImpl f125318a;

    public e(@dl.d KDeclarationContainerImpl container) {
        f0.p(container, "container");
        this.f125318a = container;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @dl.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> l(@dl.d w descriptor, @dl.d b2 data) {
        f0.p(descriptor, "descriptor");
        f0.p(data, "data");
        return new KFunctionImpl(this.f125318a, descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    @dl.d
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> c(@dl.d o0 descriptor, @dl.d b2 data) {
        f0.p(descriptor, "descriptor");
        f0.p(data, "data");
        int i10 = (descriptor.i0() != null ? 1 : 0) + (descriptor.l0() != null ? 1 : 0);
        if (descriptor.G()) {
            if (i10 == 0) {
                return new KMutableProperty0Impl(this.f125318a, descriptor);
            }
            if (i10 == 1) {
                return new KMutableProperty1Impl(this.f125318a, descriptor);
            }
            if (i10 == 2) {
                return new KMutableProperty2Impl(this.f125318a, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new KProperty0Impl(this.f125318a, descriptor);
            }
            if (i10 == 1) {
                return new KProperty1Impl(this.f125318a, descriptor);
            }
            if (i10 == 2) {
                return new KProperty2Impl(this.f125318a, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}
