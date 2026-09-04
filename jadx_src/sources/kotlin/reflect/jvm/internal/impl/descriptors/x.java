package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.Pair;
import si.i;

/* JADX INFO: compiled from: InlineClassRepresentation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x<Type extends si.i> extends z0<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.f f125945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Type f125946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@dl.d kotlin.reflect.jvm.internal.impl.name.f underlyingPropertyName, @dl.d Type underlyingType) {
        super(null);
        kotlin.jvm.internal.f0.p(underlyingPropertyName, "underlyingPropertyName");
        kotlin.jvm.internal.f0.p(underlyingType, "underlyingType");
        this.f125945a = underlyingPropertyName;
        this.f125946b = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    @dl.d
    public List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a() {
        return kotlin.collections.s.k(kotlin.c1.a(this.f125945a, this.f125946b));
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.f c() {
        return this.f125945a;
    }

    @dl.d
    public final Type d() {
        return this.f125946b;
    }

    @dl.d
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f125945a + ", underlyingType=" + this.f125946b + ')';
    }
}
