package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/animation/core/i0;", "", "startValue", "startVelocity", "Landroidx/compose/animation/core/d;", "Landroidx/compose/animation/core/l;", ak.av, "F", "ExponentialDecayFriction", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4440a = -4.2f;

    @dl.d
    public static final d<Float, l> a(@dl.d i0 i0Var, float f10, float f11) {
        kotlin.jvm.internal.f0.p(i0Var, "<this>");
        return AnimationKt.a(i0Var, f10, f11);
    }

    public static /* synthetic */ d b(i0 i0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return a(i0Var, f10, f11);
    }
}
