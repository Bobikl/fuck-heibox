package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* JADX INFO: compiled from: StubTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class e extends j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f128097f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.types.checker.l f128098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f128099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final MemberScope f128100e;

    /* JADX INFO: compiled from: StubTypes.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public e(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.l originalTypeVariable, boolean z10) {
        kotlin.jvm.internal.f0.p(originalTypeVariable, "originalTypeVariable");
        this.f128098c = originalTypeVariable;
        this.f128099d = z10;
        this.f128100e = kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorScopeKind.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public List<c1> M0() {
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return w0.f128193c.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return this.f128099d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        return z10 == P0() ? this : Y0(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return this;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.types.checker.l X0() {
        return this.f128098c;
    }

    @dl.d
    public abstract e Y0(boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public e Y0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public MemberScope u() {
        return this.f128100e;
    }
}
