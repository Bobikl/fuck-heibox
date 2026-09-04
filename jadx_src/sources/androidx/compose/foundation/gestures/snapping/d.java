package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.h;
import androidx.compose.animation.core.k;
import androidx.compose.animation.core.l;
import androidx.compose.foundation.gestures.m;
import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/d;", "Landroidx/compose/foundation/gestures/snapping/a;", "", "Landroidx/compose/animation/core/l;", "Landroidx/compose/foundation/gestures/m;", "scope", w.c.R, "velocity", "Landroidx/compose/animation/core/j;", "b", "(Landroidx/compose/foundation/gestures/m;FFLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/h;", ak.av, "Landroidx/compose/animation/core/h;", "lowVelocityAnimationSpec", "Landroidx/compose/foundation/gestures/snapping/e;", "Landroidx/compose/foundation/gestures/snapping/e;", "layoutInfoProvider", "Ls1/e;", "density", "<init>", "(Landroidx/compose/animation/core/h;Landroidx/compose/foundation/gestures/snapping/e;Ls1/e;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class d implements a<Float, l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h<Float> lowVelocityAnimationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e layoutInfoProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final s1.e f5834c;

    public d(@dl.d h<Float> lowVelocityAnimationSpec, @dl.d e layoutInfoProvider, @dl.d s1.e density) {
        f0.p(lowVelocityAnimationSpec, "lowVelocityAnimationSpec");
        f0.p(layoutInfoProvider, "layoutInfoProvider");
        f0.p(density, "density");
        this.lowVelocityAnimationSpec = lowVelocityAnimationSpec;
        this.layoutInfoProvider = layoutInfoProvider;
        this.f5834c = density;
    }

    @Override // androidx.compose.foundation.gestures.snapping.a
    public /* bridge */ /* synthetic */ Object a(m mVar, Float f10, Float f11, kotlin.coroutines.c cVar) {
        return b(mVar, f10.floatValue(), f11.floatValue(), cVar);
    }

    @dl.e
    public Object b(@dl.d m mVar, float f10, float f11, @dl.d kotlin.coroutines.c<? super AnimationState<Float, l>> cVar) throws Throwable {
        Object objH = SnapFlingBehaviorKt.h(mVar, (Math.abs(f10) + this.layoutInfoProvider.c(this.f5834c)) * Math.signum(f11), f10, k.c(0.0f, f11, 0L, 0L, false, 28, null), this.lowVelocityAnimationSpec, cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : (AnimationState) objH;
    }
}
