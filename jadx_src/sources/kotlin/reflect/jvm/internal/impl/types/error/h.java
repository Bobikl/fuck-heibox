package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.z0;
import xh.m;

/* JADX INFO: compiled from: ErrorUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h f128123a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final d0 f128124b = c.f128104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final a f128125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.types.d0 f128126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.types.d0 f128127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final o0 f128128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final Set<o0> f128129g;

    static {
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        f0.o(str, "format(this, *args)");
        kotlin.reflect.jvm.internal.impl.name.f fVarI = kotlin.reflect.jvm.internal.impl.name.f.i(str);
        f0.o(fVarI, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f128125c = new a(fVarI);
        f128126d = d(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f128127e = d(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        d dVar = new d();
        f128128f = dVar;
        f128129g = c1.f(dVar);
    }

    private h() {
    }

    @dl.d
    @m
    public static final e a(@dl.d ErrorScopeKind kind, boolean z10, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
        return z10 ? new i(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @dl.d
    @m
    public static final e b(@dl.d ErrorScopeKind kind, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @dl.d
    @m
    public static final f d(@dl.d ErrorTypeKind kind, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
        return f128123a.g(kind, CollectionsKt__CollectionsKt.E(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @m
    public static final boolean m(@dl.e k kVar) {
        if (kVar != null) {
            h hVar = f128123a;
            if (hVar.n(kVar) || hVar.n(kVar.c()) || kVar == f128124b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(k kVar) {
        return kVar instanceof a;
    }

    @m
    public static final boolean o(@dl.e kotlin.reflect.jvm.internal.impl.types.d0 d0Var) {
        if (d0Var == null) {
            return false;
        }
        z0 z0VarO0 = d0Var.O0();
        return (z0VarO0 instanceof g) && ((g) z0VarO0).f() == ErrorTypeKind.UNINFERRED_TYPE_VARIABLE;
    }

    @dl.d
    public final f c(@dl.d ErrorTypeKind kind, @dl.d z0 typeConstructor, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(typeConstructor, "typeConstructor");
        f0.p(formatParams, "formatParams");
        return f(kind, CollectionsKt__CollectionsKt.E(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @dl.d
    public final g e(@dl.d ErrorTypeKind kind, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
        return new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @dl.d
    public final f f(@dl.d ErrorTypeKind kind, @dl.d List<? extends kotlin.reflect.jvm.internal.impl.types.c1> arguments, @dl.d z0 typeConstructor, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(arguments, "arguments");
        f0.p(typeConstructor, "typeConstructor");
        f0.p(formatParams, "formatParams");
        return new f(typeConstructor, b(ErrorScopeKind.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @dl.d
    public final f g(@dl.d ErrorTypeKind kind, @dl.d List<? extends kotlin.reflect.jvm.internal.impl.types.c1> arguments, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(arguments, "arguments");
        f0.p(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @dl.d
    public final a h() {
        return f128125c;
    }

    @dl.d
    public final d0 i() {
        return f128124b;
    }

    @dl.d
    public final Set<o0> j() {
        return f128129g;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.types.d0 k() {
        return f128127e;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.types.d0 l() {
        return f128126d;
    }

    @dl.d
    public final String p(@dl.d kotlin.reflect.jvm.internal.impl.types.d0 type) {
        f0.p(type, "type");
        TypeUtilsKt.s(type);
        z0 z0VarO0 = type.O0();
        if (z0VarO0 != null) {
            return ((g) z0VarO0).g(0);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
    }
}
