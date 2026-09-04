package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: ErrorTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final ErrorTypeKind f128120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String[] f128121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f128122c;

    public g(@dl.d ErrorTypeKind kind, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
        this.f128120a = kind;
        this.f128121b = formatParams;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        f0.o(str, "format(this, *args)");
        String str2 = String.format(debugText, Arrays.copyOf(new Object[]{str}, 1));
        f0.o(str2, "format(this, *args)");
        this.f128122c = str2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public z0 a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f d() {
        return h.f128123a.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return false;
    }

    @dl.d
    public final ErrorTypeKind f() {
        return this.f128120a;
    }

    @dl.d
    public final String g(int i10) {
        return this.f128121b[i10];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public List<y0> getParameters() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public Collection<d0> l() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        return kotlin.reflect.jvm.internal.impl.builtins.d.f125357i.a();
    }

    @dl.d
    public String toString() {
        return this.f128122c;
    }
}
