package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import si.i;

/* JADX INFO: compiled from: MultiFieldValueClassRepresentation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e0<Type extends si.i> extends z0<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> f125612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.f, Type> f125613b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(@dl.d List<? extends Pair<kotlin.reflect.jvm.internal.impl.name.f, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        kotlin.jvm.internal.f0.p(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f125612a = underlyingPropertyNamesToTypes;
        Map<kotlin.reflect.jvm.internal.impl.name.f, Type> mapB0 = kotlin.collections.s0.B0(a());
        if (!(mapB0.size() == a().size())) {
            throw new IllegalArgumentException("Some properties have the same names".toString());
        }
        this.f125613b = mapB0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0
    @dl.d
    public List<Pair<kotlin.reflect.jvm.internal.impl.name.f, Type>> a() {
        return this.f125612a;
    }

    @dl.d
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + a() + ')';
    }
}
