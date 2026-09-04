package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import mi.c0;

/* JADX INFO: compiled from: ReflectJavaWildcardType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends x implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final WildcardType f125900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Collection<mi.a> f125901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f125902d;

    public a0(@dl.d WildcardType reflectType) {
        f0.p(reflectType, "reflectType");
        this.f125900b = reflectType;
        this.f125901c = CollectionsKt__CollectionsKt.E();
    }

    @Override // mi.d
    public boolean A() {
        return this.f125902d;
    }

    @Override // mi.c0
    @dl.e
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public x w() {
        Type[] upperBounds = P().getUpperBounds();
        Type[] lowerBounds = P().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + P());
        }
        if (lowerBounds.length == 1) {
            x.a aVar = x.f125935a;
            f0.o(lowerBounds, "lowerBounds");
            Object objHt = ArraysKt___ArraysKt.Ht(lowerBounds);
            f0.o(objHt, "lowerBounds.single()");
            return aVar.a((Type) objHt);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        f0.o(upperBounds, "upperBounds");
        Type ub2 = (Type) ArraysKt___ArraysKt.Ht(upperBounds);
        if (f0.g(ub2, Object.class)) {
            return null;
        }
        x.a aVar2 = x.f125935a;
        f0.o(ub2, "ub");
        return aVar2.a(ub2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x
    @dl.d
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public WildcardType P() {
        return this.f125900b;
    }

    @Override // mi.d
    @dl.d
    public Collection<mi.a> getAnnotations() {
        return this.f125901c;
    }

    @Override // mi.c0
    public boolean isExtends() {
        Type[] upperBounds = P().getUpperBounds();
        f0.o(upperBounds, "reflectType.upperBounds");
        return !f0.g(ArraysKt___ArraysKt.Oc(upperBounds), Object.class);
    }
}
