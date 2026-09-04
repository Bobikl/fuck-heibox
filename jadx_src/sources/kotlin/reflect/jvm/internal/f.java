package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;

/* JADX INFO: compiled from: EmptyContainerForLocal.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final f f125319e = new f();

    private f() {
    }

    private final Void b0() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> N() {
        b0();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<w> O(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        b0();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.e
    public o0 P(int i10) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @dl.d
    public Collection<o0> S(@dl.d kotlin.reflect.jvm.internal.impl.name.f name) {
        f0.p(name, "name");
        b0();
        throw null;
    }

    @Override // kotlin.jvm.internal.r
    @dl.d
    public Class<?> i() {
        b0();
        throw null;
    }

    @Override // kotlin.reflect.h
    @dl.d
    public Collection<kotlin.reflect.c<?>> v() {
        b0();
        throw null;
    }
}
