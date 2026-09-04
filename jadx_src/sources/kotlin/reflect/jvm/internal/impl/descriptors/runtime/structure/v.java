package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: ReflectJavaPrimitiveType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v extends x implements mi.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Class<?> f125931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Collection<mi.a> f125932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f125933d;

    public v(@dl.d Class<?> reflectType) {
        f0.p(reflectType, "reflectType");
        this.f125931b = reflectType;
        this.f125932c = CollectionsKt__CollectionsKt.E();
    }

    @Override // mi.d
    public boolean A() {
        return this.f125933d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x
    @dl.d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Class<?> P() {
        return this.f125931b;
    }

    @Override // mi.d
    @dl.d
    public Collection<mi.a> getAnnotations() {
        return this.f125932c;
    }

    @Override // mi.v
    @dl.e
    public PrimitiveType getType() {
        if (f0.g(P(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(P().getName()).getPrimitiveType();
    }
}
