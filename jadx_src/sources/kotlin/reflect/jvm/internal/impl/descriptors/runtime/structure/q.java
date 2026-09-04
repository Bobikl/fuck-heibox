package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends e implements mi.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Object f125928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Object value) {
        super(fVar, null);
        f0.p(value, "value");
        this.f125928c = value;
    }

    @Override // mi.o
    @dl.d
    public Object getValue() {
        return this.f125928c;
    }
}
