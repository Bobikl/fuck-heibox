package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.w0;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends j0 implements si.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final CaptureStatus f128074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final NewCapturedTypeConstructor f128075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final l1 f128076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final w0 f128077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f128078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f128079h;

    public h(@dl.d CaptureStatus captureStatus, @dl.d NewCapturedTypeConstructor constructor, @dl.e l1 l1Var, @dl.d w0 attributes, boolean z10, boolean z11) {
        f0.p(captureStatus, "captureStatus");
        f0.p(constructor, "constructor");
        f0.p(attributes, "attributes");
        this.f128074c = captureStatus;
        this.f128075d = constructor;
        this.f128076e = l1Var;
        this.f128077f = attributes;
        this.f128078g = z10;
        this.f128079h = z11;
    }

    public /* synthetic */ h(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, l1 l1Var, w0 w0Var, boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this(captureStatus, newCapturedTypeConstructor, l1Var, (i10 & 8) != 0 ? w0.f128193c.h() : w0Var, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@dl.d CaptureStatus captureStatus, @dl.e l1 l1Var, @dl.d c1 projection, @dl.d y0 typeParameter) {
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), l1Var, null, false, false, 56, null);
        f0.p(captureStatus, "captureStatus");
        f0.p(projection, "projection");
        f0.p(typeParameter, "typeParameter");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return this.f128077f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return this.f128078g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        f0.p(newAttributes, "newAttributes");
        return new h(this.f128074c, O0(), this.f128076e, newAttributes, P0(), this.f128079h);
    }

    @dl.d
    public final CaptureStatus X0() {
        return this.f128074c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor O0() {
        return this.f128075d;
    }

    @dl.e
    public final l1 Z0() {
        return this.f128076e;
    }

    public final boolean a1() {
        return this.f128079h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @dl.d
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public h V0(boolean z10) {
        return new h(this.f128074c, O0(), this.f128076e, N0(), z10, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public h Y0(@dl.d f kotlinTypeRefiner) {
        f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f128074c;
        NewCapturedTypeConstructor newCapturedTypeConstructorA = O0().a(kotlinTypeRefiner);
        l1 l1Var = this.f128076e;
        return new h(captureStatus, newCapturedTypeConstructorA, l1Var != null ? kotlinTypeRefiner.a(l1Var).R0() : null, N0(), P0(), false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return kotlin.reflect.jvm.internal.impl.types.error.h.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
