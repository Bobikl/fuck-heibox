package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends e implements mi.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Class<?> f125922c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d Class<?> klass) {
        super(fVar, null);
        f0.p(klass, "klass");
        this.f125922c = klass;
    }

    @Override // mi.h
    @dl.d
    public mi.x a() {
        return x.f125935a.a(this.f125922c);
    }
}
