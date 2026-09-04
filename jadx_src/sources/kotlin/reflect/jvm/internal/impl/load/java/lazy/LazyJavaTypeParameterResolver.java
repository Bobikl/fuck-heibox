package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import mi.y;
import mi.z;
import yh.l;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaTypeParameterResolver implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d f126076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final k f126077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f126078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Map<y, Integer> f126079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<y, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e> f126080e;

    public LazyJavaTypeParameterResolver(@dl.d d c10, @dl.d k containingDeclaration, @dl.d z typeParameterOwner, int i10) {
        f0.p(c10, "c");
        f0.p(containingDeclaration, "containingDeclaration");
        f0.p(typeParameterOwner, "typeParameterOwner");
        this.f126076a = c10;
        this.f126077b = containingDeclaration;
        this.f126078c = i10;
        this.f126079d = kotlin.reflect.jvm.internal.impl.utils.a.d(typeParameterOwner.getTypeParameters());
        this.f126080e = c10.e().h(new l<y, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e invoke(@dl.d y typeParameter) {
                f0.p(typeParameter, "typeParameter");
                Integer num = (Integer) this.f126081b.f126079d.get(typeParameter);
                if (num == null) {
                    return null;
                }
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.f126081b;
                return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(ContextKt.h(ContextKt.b(lazyJavaTypeParameterResolver.f126076a, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f126077b.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f126078c + num.intValue(), lazyJavaTypeParameterResolver.f126077b);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.g
    @dl.e
    public y0 a(@dl.d y javaTypeParameter) {
        f0.p(javaTypeParameter, "javaTypeParameter");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e eVarInvoke = this.f126080e.invoke(javaTypeParameter);
        return eVarInvoke != null ? eVarInvoke : this.f126076a.f().a(javaTypeParameter);
    }
}
