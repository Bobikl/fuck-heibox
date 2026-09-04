package androidx.compose.runtime.internal;

import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.n1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a \u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\"\u0014\u0010\u0014\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"", "bits", "slot", ak.av, "f", "d", "Landroidx/compose/runtime/n1;", "other", "", "e", "Landroidx/compose/runtime/p;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/a;", "b", ak.aF, "I", "SLOTS_PER_INT", "BITS_PER_SLOT", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13008a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13009b = 3;

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    @dl.d
    @androidx.compose.runtime.m
    public static final a b(@dl.d androidx.compose.runtime.p composer, int i10, boolean z10, @dl.d Object block) {
        ComposableLambdaImpl composableLambdaImpl;
        f0.p(composer, "composer");
        f0.p(block, "block");
        composer.T(i10);
        Object objU = composer.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i10, z10);
            composer.N(composableLambdaImpl);
        } else {
            f0.n(objU, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objU;
        }
        composableLambdaImpl.x(block);
        composer.c0();
        return composableLambdaImpl;
    }

    @dl.d
    @androidx.compose.runtime.m
    public static final a c(int i10, boolean z10, @dl.d Object block) {
        f0.p(block, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i10, z10);
        composableLambdaImpl.x(block);
        return composableLambdaImpl;
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final boolean e(@dl.e n1 n1Var, @dl.d n1 other) {
        f0.p(other, "other");
        if (n1Var != null) {
            if ((n1Var instanceof RecomposeScopeImpl) && (other instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) n1Var;
                if (!recomposeScopeImpl.s() || f0.g(n1Var, other) || f0.g(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) other).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
