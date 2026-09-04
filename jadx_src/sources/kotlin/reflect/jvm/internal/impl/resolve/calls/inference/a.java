package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import dl.d;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.h;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.w0;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends j0 implements si.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final c1 f127512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final b f127513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f127514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final w0 f127515f;

    public a(@d c1 typeProjection, @d b constructor, boolean z10, @d w0 attributes) {
        f0.p(typeProjection, "typeProjection");
        f0.p(constructor, "constructor");
        f0.p(attributes, "attributes");
        this.f127512c = typeProjection;
        this.f127513d = constructor;
        this.f127514e = z10;
        this.f127515f = attributes;
    }

    public /* synthetic */ a(c1 c1Var, b bVar, boolean z10, w0 w0Var, int i10, u uVar) {
        this(c1Var, (i10 & 2) != 0 ? new c(c1Var) : bVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? w0.f128193c.h() : w0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @d
    public List<c1> M0() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @d
    public w0 N0() {
        return this.f127515f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return this.f127514e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@d w0 newAttributes) {
        f0.p(newAttributes, "newAttributes");
        return new a(this.f127512c, O0(), P0(), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @d
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public b O0() {
        return this.f127513d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @d
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public a V0(boolean z10) {
        return z10 == P0() ? this : new a(this.f127512c, O0(), z10, N0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public a Y0(@d f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        c1 c1VarA = this.f127512c.a(kotlinTypeRefiner);
        f0.o(c1VarA, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(c1VarA, O0(), P0(), N0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f127512c);
        sb2.append(')');
        sb2.append(P0() ? "?" : "");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @d
    public MemberScope u() {
        return h.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
