package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.z;

/* JADX INFO: compiled from: BuiltInAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltInAnnotationDescriptor implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.builtins.g f125589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f125590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f125591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f125592d;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> allValueArguments) {
        f0.p(builtIns, "builtIns");
        f0.p(fqName, "fqName");
        f0.p(allValueArguments, "allValueArguments");
        this.f125589a = builtIns;
        this.f125590b = fqName;
        this.f125591c = allValueArguments;
        this.f125592d = b0.b(LazyThreadSafetyMode.PUBLICATION, new yh.a<j0>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke() {
                return this.f125593b.f125589a.o(this.f125593b.e()).v();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
        return this.f125591c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return this.f125590b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public d0 getType() {
        Object value = this.f125592d.getValue();
        f0.o(value, "<get-type>(...)");
        return (d0) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @dl.d
    public t0 j() {
        t0 NO_SOURCE = t0.f125942a;
        f0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }
}
