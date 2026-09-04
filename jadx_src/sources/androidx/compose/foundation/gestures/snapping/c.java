package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.k;
import androidx.compose.animation.core.l;
import androidx.compose.animation.core.x;
import androidx.compose.foundation.gestures.m;
import androidx.constraintlayout.core.motion.utils.w;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/c;", "Landroidx/compose/foundation/gestures/snapping/a;", "", "Landroidx/compose/animation/core/l;", "Landroidx/compose/foundation/gestures/m;", "scope", w.c.R, "velocity", "Landroidx/compose/animation/core/j;", "b", "(Landroidx/compose/foundation/gestures/m;FFLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/x;", ak.av, "Landroidx/compose/animation/core/x;", "decayAnimationSpec", "<init>", "(Landroidx/compose/animation/core/x;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class c implements a<Float, l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x<Float> decayAnimationSpec;

    public c(@dl.d x<Float> decayAnimationSpec) {
        f0.p(decayAnimationSpec, "decayAnimationSpec");
        this.decayAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.a
    public /* bridge */ /* synthetic */ Object a(m mVar, Float f10, Float f11, kotlin.coroutines.c cVar) {
        return b(mVar, f10.floatValue(), f11.floatValue(), cVar);
    }

    @dl.e
    public Object b(@dl.d m mVar, float f10, float f11, @dl.d kotlin.coroutines.c<? super AnimationState<Float, l>> cVar) throws Throwable {
        Object objF = SnapFlingBehaviorKt.f(mVar, f10, k.c(0.0f, f11, 0L, 0L, false, 28, null), this.decayAnimationSpec, cVar);
        return objF == kotlin.coroutines.intrinsics.b.h() ? objF : (AnimationState) objF;
    }
}
