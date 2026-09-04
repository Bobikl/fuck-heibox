package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o extends e implements mi.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Enum<?> f125926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Enum<?> value) {
        super(fVar, null);
        f0.p(value, "value");
        this.f125926c = value;
    }

    @Override // mi.m
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.b b() {
        Class<?> enumClass = this.f125926c.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        f0.o(enumClass, "enumClass");
        return ReflectClassUtilKt.a(enumClass);
    }

    @Override // mi.m
    @dl.e
    public kotlin.reflect.jvm.internal.impl.name.f d() {
        return kotlin.reflect.jvm.internal.impl.name.f.f(this.f125926c.name());
    }
}
