package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: ErrorType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z0 f128113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final MemberScope f128114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final ErrorTypeKind f128115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<c1> f128116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f128117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final String[] f128118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final String f128119i;

    /* JADX WARN: Multi-variable type inference failed */
    @xh.i
    public f(@dl.d z0 constructor, @dl.d MemberScope memberScope, @dl.d ErrorTypeKind kind, @dl.d List<? extends c1> arguments, boolean z10, @dl.d String... formatParams) {
        f0.p(constructor, "constructor");
        f0.p(memberScope, "memberScope");
        f0.p(kind, "kind");
        f0.p(arguments, "arguments");
        f0.p(formatParams, "formatParams");
        this.f128113c = constructor;
        this.f128114d = memberScope;
        this.f128115e = kind;
        this.f128116f = arguments;
        this.f128117g = z10;
        this.f128118h = formatParams;
        v0 v0Var = v0.f124986a;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        f0.o(str, "format(format, *args)");
        this.f128119i = str;
    }

    public /* synthetic */ f(z0 z0Var, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z10, String[] strArr, int i10, u uVar) {
        this(z0Var, memberScope, errorTypeKind, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.E() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return this.f128116f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return w0.f128193c.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public z0 O0() {
        return this.f128113c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return this.f128117g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        z0 z0VarO0 = O0();
        MemberScope memberScopeU = u();
        ErrorTypeKind errorTypeKind = this.f128115e;
        List<c1> listM0 = M0();
        String[] strArr = this.f128118h;
        return new f(z0VarO0, memberScopeU, errorTypeKind, listM0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        f0.p(newAttributes, "newAttributes");
        return this;
    }

    @dl.d
    public final String X0() {
        return this.f128119i;
    }

    @dl.d
    public final ErrorTypeKind Y0() {
        return this.f128115e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public f Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return this.f128114d;
    }
}
