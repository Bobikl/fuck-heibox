package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d0 implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, si.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f128096b;

    private d0() {
    }

    public /* synthetic */ d0(kotlin.jvm.internal.u uVar) {
        this();
    }

    private final int L0() {
        return e0.a(this) ? super.hashCode() : (((O0().hashCode() * 31) + M0().hashCode()) * 31) + (P0() ? 1 : 0);
    }

    @dl.d
    public abstract List<c1> M0();

    @dl.d
    public abstract w0 N0();

    @dl.d
    public abstract z0 O0();

    public abstract boolean P0();

    @dl.d
    public abstract d0 Q0(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f fVar);

    @dl.d
    public abstract l1 R0();

    public final boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return P0() == d0Var.P0() && kotlin.reflect.jvm.internal.impl.types.checker.p.f128089a.a(R0(), d0Var.R0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        return i.a(N0());
    }

    public final int hashCode() {
        int i10 = this.f128096b;
        if (i10 != 0) {
            return i10;
        }
        int iL0 = L0();
        this.f128096b = iL0;
        return iL0;
    }

    @dl.d
    public abstract MemberScope u();
}
