package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.g0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.w0;
import kotlin.reflect.jvm.internal.impl.types.y;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends p implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j0 f126397c;

    public e(@dl.d j0 delegate) {
        f0.p(delegate, "delegate");
        this.f126397c = delegate;
    }

    private final j0 a1(j0 j0Var) {
        j0 j0VarV0 = j0Var.V0(false);
        return !TypeUtilsKt.r(j0Var) ? j0VarV0 : new e(j0VarV0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l
    public boolean K0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.d0
    public boolean P0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        return z10 ? X0().V0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    protected j0 X0() {
        return this.f126397c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.j0
    @dl.d
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public e U0(@dl.d w0 newAttributes) {
        f0.p(newAttributes, "newAttributes");
        return new e(X0().U0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public e Z0(@dl.d j0 delegate) {
        f0.p(delegate, "delegate");
        return new e(delegate);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l
    @dl.d
    public d0 v0(@dl.d d0 replacement) {
        f0.p(replacement, "replacement");
        l1 l1VarR0 = replacement.R0();
        if (!TypeUtilsKt.r(l1VarR0) && !i1.l(l1VarR0)) {
            return l1VarR0;
        }
        if (l1VarR0 instanceof j0) {
            return a1((j0) l1VarR0);
        }
        if (l1VarR0 instanceof y) {
            y yVar = (y) l1VarR0;
            return k1.d(KotlinTypeFactory.d(a1(yVar.W0()), a1(yVar.X0())), k1.a(l1VarR0));
        }
        throw new IllegalStateException(("Incorrect type: " + l1VarR0).toString());
    }
}
