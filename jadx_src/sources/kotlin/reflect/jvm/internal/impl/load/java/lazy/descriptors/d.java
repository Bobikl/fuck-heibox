package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.d0;
import mi.r;

/* JADX INFO: compiled from: LazyJavaStaticScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends LazyJavaScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10) {
        super(c10, null, 2, 0 == true ? 1 : 0);
        f0.p(c10, "c");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.e
    protected r0 A() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected LazyJavaScope.a I(@dl.d r method, @dl.d List<? extends y0> methodTypeParameters, @dl.d d0 returnType, @dl.d List<? extends b1> valueParameters) {
        f0.p(method, "method");
        f0.p(methodTypeParameters, "methodTypeParameters");
        f0.p(returnType, "returnType");
        f0.p(valueParameters, "valueParameters");
        return new LazyJavaScope.a(returnType, null, valueParameters, methodTypeParameters, false, CollectionsKt__CollectionsKt.E());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void t(@dl.d f name, @dl.d Collection<o0> result) {
        f0.p(name, "name");
        f0.p(result, "result");
    }
}
