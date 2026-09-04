package androidx.compose.runtime.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComposableLambdaN.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a(\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/p;", "composer", "", "key", "", "tracked", "arity", "", "block", "Landroidx/compose/runtime/internal/c;", ak.av, "b", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @dl.d
    @androidx.compose.runtime.m
    public static final c a(@dl.d androidx.compose.runtime.p composer, int i10, boolean z10, int i11, @dl.d Object block) {
        ComposableLambdaNImpl composableLambdaNImpl;
        f0.p(composer, "composer");
        f0.p(block, "block");
        composer.T(i10);
        Object objU = composer.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i10, z10, i11);
            composer.N(composableLambdaNImpl);
        } else {
            f0.n(objU, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaNImpl = (ComposableLambdaNImpl) objU;
        }
        composableLambdaNImpl.e(block);
        composer.c0();
        return composableLambdaNImpl;
    }

    @dl.d
    @androidx.compose.runtime.m
    public static final c b(int i10, boolean z10, int i11, @dl.d Object block) {
        f0.p(block, "block");
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i10, z10, i11);
        composableLambdaNImpl.e(block);
        return composableLambdaNImpl;
    }
}
