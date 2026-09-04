package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import mi.z;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ContextKt {
    private static final d a(d dVar, k kVar, z zVar, int i10, kotlin.z<r> zVar2) {
        return new d(dVar.a(), zVar != null ? new LazyJavaTypeParameterResolver(dVar, kVar, zVar, i10) : dVar.f(), zVar2);
    }

    @dl.d
    public static final d b(@dl.d d dVar, @dl.d g typeParameterResolver) {
        f0.p(dVar, "<this>");
        f0.p(typeParameterResolver, "typeParameterResolver");
        return new d(dVar.a(), typeParameterResolver, dVar.c());
    }

    @dl.d
    public static final d c(@dl.d final d dVar, @dl.d final kotlin.reflect.jvm.internal.impl.descriptors.e containingDeclaration, @dl.e z zVar, int i10) {
        f0.p(dVar, "<this>");
        f0.p(containingDeclaration, "containingDeclaration");
        return a(dVar, containingDeclaration, zVar, i10, b0.b(LazyThreadSafetyMode.NONE, new yh.a<r>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke() {
                return ContextKt.g(dVar, containingDeclaration.getAnnotations());
            }
        }));
    }

    public static /* synthetic */ d d(d dVar, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            zVar = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c(dVar, eVar, zVar, i10);
    }

    @dl.d
    public static final d e(@dl.d d dVar, @dl.d k containingDeclaration, @dl.d z typeParameterOwner, int i10) {
        f0.p(dVar, "<this>");
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(typeParameterOwner, "typeParameterOwner");
        return a(dVar, containingDeclaration, typeParameterOwner, i10, dVar.c());
    }

    public static /* synthetic */ d f(d dVar, k kVar, z zVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return e(dVar, kVar, zVar, i10);
    }

    @dl.e
    public static final r g(@dl.d d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e additionalAnnotations) {
        f0.p(dVar, "<this>");
        f0.p(additionalAnnotations, "additionalAnnotations");
        return dVar.a().a().c(dVar.b(), additionalAnnotations);
    }

    @dl.d
    public static final d h(@dl.d final d dVar, @dl.d final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e additionalAnnotations) {
        f0.p(dVar, "<this>");
        f0.p(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? dVar : new d(dVar.a(), dVar.f(), b0.b(LazyThreadSafetyMode.NONE, new yh.a<r>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke() {
                return ContextKt.g(dVar, additionalAnnotations);
            }
        }));
    }

    @dl.d
    public static final d i(@dl.d d dVar, @dl.d a components) {
        f0.p(dVar, "<this>");
        f0.p(components, "components");
        return new d(components, dVar.f(), dVar.c());
    }
}
