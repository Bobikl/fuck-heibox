package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.h;
import androidx.compose.animation.core.k;
import androidx.compose.animation.core.l;
import androidx.compose.animation.core.x;
import androidx.compose.animation.core.z;
import androidx.compose.foundation.gestures.g;
import androidx.compose.foundation.gestures.m;
import androidx.compose.foundation.t;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.core.motion.utils.w;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@t
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010&\u001a\u00020$ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001f\u0010\u0011\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u001d\u0010&\u001a\u00020$8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/g;", "Landroidx/compose/foundation/gestures/m;", "", "velocity", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/gestures/m;FLkotlin/coroutines/c;)Ljava/lang/Object;", "initialVelocity", "f", "initialTargetOffset", "Landroidx/compose/foundation/gestures/snapping/b;", "g", "(Landroidx/compose/foundation/gestures/m;FFLkotlin/coroutines/c;)Ljava/lang/Object;", w.c.R, "", "e", ak.av, "", "other", "equals", "", "hashCode", "Landroidx/compose/foundation/gestures/snapping/e;", "Landroidx/compose/foundation/gestures/snapping/e;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/h;", "b", "Landroidx/compose/animation/core/h;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/x;", ak.aF, "Landroidx/compose/animation/core/x;", "highVelocityAnimationSpec", "d", "snapAnimationSpec", "Ls1/h;", "F", "shortSnapVelocityThreshold", "velocityThreshold", "Ls1/e;", "density", "<init>", "(Landroidx/compose/foundation/gestures/snapping/e;Landroidx/compose/animation/core/h;Landroidx/compose/animation/core/x;Landroidx/compose/animation/core/h;Ls1/e;FLkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class SnapFlingBehavior implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f5793h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e snapLayoutInfoProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h<Float> lowVelocityAnimationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x<Float> highVelocityAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final s1.e f5798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float shortSnapVelocityThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float velocityThreshold;

    private SnapFlingBehavior(e eVar, h<Float> hVar, x<Float> xVar, h<Float> hVar2, s1.e eVar2, float f10) {
        this.snapLayoutInfoProvider = eVar;
        this.lowVelocityAnimationSpec = hVar;
        this.highVelocityAnimationSpec = xVar;
        this.snapAnimationSpec = hVar2;
        this.f5798e = eVar2;
        this.shortSnapVelocityThreshold = f10;
        this.velocityThreshold = eVar2.E1(f10);
    }

    public /* synthetic */ SnapFlingBehavior(e eVar, h hVar, x xVar, h hVar2, s1.e eVar2, float f10, int i10, u uVar) {
        this(eVar, hVar, xVar, hVar2, eVar2, (i10 & 32) != 0 ? SnapFlingBehaviorKt.o() : f10, null);
    }

    public /* synthetic */ SnapFlingBehavior(e eVar, h hVar, x xVar, h hVar2, s1.e eVar2, float f10, u uVar) {
        this(eVar, hVar, xVar, hVar2, eVar2, f10);
    }

    private final boolean e(float offset, float velocity) {
        return Math.abs(z.a(this.highVelocityAnimationSpec, 0.0f, velocity)) > Math.abs(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(m mVar, float f10, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SnapFlingBehavior$longSnap$1 snapFlingBehavior$longSnap$1;
        SnapFlingBehavior snapFlingBehavior;
        if (cVar instanceof SnapFlingBehavior$longSnap$1) {
            snapFlingBehavior$longSnap$1 = (SnapFlingBehavior$longSnap$1) cVar;
            int i10 = snapFlingBehavior$longSnap$1.f5805f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$longSnap$1.f5805f = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$longSnap$1 = new SnapFlingBehavior$longSnap$1(this, cVar);
            }
        } else {
            snapFlingBehavior$longSnap$1 = new SnapFlingBehavior$longSnap$1(this, cVar);
        }
        SnapFlingBehavior$longSnap$1 snapFlingBehavior$longSnap$2 = snapFlingBehavior$longSnap$1;
        Object objG = snapFlingBehavior$longSnap$2.f5803d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = snapFlingBehavior$longSnap$2.f5805f;
        if (i11 != 0) {
            if (i11 == 1) {
                mVar = (m) snapFlingBehavior$longSnap$2.f5802c;
                snapFlingBehavior = (SnapFlingBehavior) snapFlingBehavior$longSnap$2.f5801b;
                t0.n(objG);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(objG);
            }
            return b2.f124493a;
        }
        t0.n(objG);
        float fAbs = Math.abs(this.snapLayoutInfoProvider.b(this.f5798e, f10)) * Math.signum(f10);
        snapFlingBehavior$longSnap$2.f5801b = this;
        snapFlingBehavior$longSnap$2.f5802c = mVar;
        snapFlingBehavior$longSnap$2.f5805f = 1;
        objG = g(mVar, fAbs, f10, snapFlingBehavior$longSnap$2);
        if (objG == objH) {
            return objH;
        }
        snapFlingBehavior = this;
        ApproachStepResult approachStepResult = (ApproachStepResult) objG;
        float remainingOffset = approachStepResult.getRemainingOffset();
        AnimationState<Float, l> animationStateB = approachStepResult.b();
        h<Float> hVar = snapFlingBehavior.snapAnimationSpec;
        snapFlingBehavior$longSnap$2.f5801b = null;
        snapFlingBehavior$longSnap$2.f5802c = null;
        snapFlingBehavior$longSnap$2.f5805f = 2;
        if (SnapFlingBehaviorKt.h(mVar, remainingOffset, remainingOffset, animationStateB, hVar, snapFlingBehavior$longSnap$2) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(m mVar, float f10, float f11, kotlin.coroutines.c<? super ApproachStepResult> cVar) {
        return SnapFlingBehaviorKt.i(mVar, f10, f11, e(f10, f11) ? new c(this.highVelocityAnimationSpec) : new d(this.lowVelocityAnimationSpec, this.snapLayoutInfoProvider, this.f5798e), this.snapLayoutInfoProvider, this.f5798e, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(m mVar, float f10, kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        float fM = SnapFlingBehaviorKt.m(0.0f, this.snapLayoutInfoProvider, this.f5798e);
        Object objH = SnapFlingBehaviorKt.h(mVar, fM, fM, k.c(0.0f, f10, 0L, 0L, false, 28, null), this.snapAnimationSpec, cVar);
        return objH == kotlin.coroutines.intrinsics.b.h() ? objH : b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.g
    @dl.e
    public Object a(@dl.d m mVar, float f10, @dl.d kotlin.coroutines.c<? super Float> cVar) throws Throwable {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        if (cVar instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) cVar;
            int i10 = snapFlingBehavior$performFling$1.f5808d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$1.f5808d = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, cVar);
            }
        } else {
            snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, cVar);
        }
        Object obj = snapFlingBehavior$performFling$1.f5806b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = snapFlingBehavior$performFling$1.f5808d;
        if (i11 == 0) {
            t0.n(obj);
            if (Math.abs(f10) <= Math.abs(this.velocityThreshold)) {
                snapFlingBehavior$performFling$1.f5808d = 1;
                if (h(mVar, f10, snapFlingBehavior$performFling$1) == objH) {
                    return objH;
                }
            } else {
                snapFlingBehavior$performFling$1.f5808d = 2;
                if (f(mVar, f10, snapFlingBehavior$performFling$1) == objH) {
                    return objH;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return kotlin.coroutines.jvm.internal.a.e(0.0f);
    }

    public boolean equals(@dl.e Object other) {
        if (!(other instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) other;
        return f0.g(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && f0.g(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) && f0.g(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) && f0.g(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider) && f0.g(snapFlingBehavior.f5798e, this.f5798e) && s1.h.l(snapFlingBehavior.shortSnapVelocityThreshold, this.shortSnapVelocityThreshold);
    }

    public int hashCode() {
        return ((((((((((0 + this.snapAnimationSpec.hashCode()) * 31) + this.highVelocityAnimationSpec.hashCode()) * 31) + this.lowVelocityAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode()) * 31) + this.f5798e.hashCode()) * 31) + s1.h.n(this.shortSnapVelocityThreshold);
    }
}
