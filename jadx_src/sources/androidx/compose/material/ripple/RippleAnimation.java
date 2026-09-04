package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.l0;
import b1.m;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.y;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B$\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u001f\u0010\u000b\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R+\u0010+\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010-\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b%\u0010(\"\u0004\b,\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "i", "f", "j", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/l0;", "color", "g", "(Landroidx/compose/ui/graphics/drawscope/g;J)V", "Ls1/h;", "b", "F", "radius", "", ak.aF, "Z", "bounded", "", "d", "Ljava/lang/Float;", "startRadius", "e", "targetRadius", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/l;", "Landroidx/compose/animation/core/Animatable;", "animatedAlpha", "animatedRadiusPercent", "animatedCenterPercent", "Lkotlinx/coroutines/y;", "Lkotlinx/coroutines/y;", "finishSignalDeferred", "<set-?>", "k", "Landroidx/compose/runtime/a1;", "l", "()Z", "n", "(Z)V", "finishedFadingIn", "m", "finishRequested", "Lb1/f;", "origin", "<init>", "(Lb1/f;FZLkotlin/jvm/internal/u;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class RippleAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private b1.f f8445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Float startRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Float targetRadius;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private b1.f f8450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Animatable<Float, androidx.compose.animation.core.l> animatedAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Animatable<Float, androidx.compose.animation.core.l> animatedRadiusPercent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Animatable<Float, androidx.compose.animation.core.l> animatedCenterPercent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y<b2> finishSignalDeferred;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 finishedFadingIn;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 finishRequested;

    private RippleAnimation(b1.f fVar, float f10, boolean z10) {
        this.f8445a = fVar;
        this.radius = f10;
        this.bounded = z10;
        this.animatedAlpha = androidx.compose.animation.core.b.b(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = androidx.compose.animation.core.b.b(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = androidx.compose.animation.core.b.b(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = a0.b(null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn = h2.g(bool, null, 2, null);
        this.finishRequested = h2.g(bool, null, 2, null);
    }

    public /* synthetic */ RippleAnimation(b1.f fVar, float f10, boolean z10, u uVar) {
        this(fVar, f10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new RippleAnimation$fadeIn$2(this, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new RippleAnimation$fadeOut$2(this, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean k() {
        return ((Boolean) this.finishRequested.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean l() {
        return ((Boolean) this.finishedFadingIn.getValue()).booleanValue();
    }

    private final void m(boolean z10) {
        this.finishRequested.setValue(Boolean.valueOf(z10));
    }

    private final void n(boolean z10) {
        this.finishedFadingIn.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public final Object f(@dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        RippleAnimation rippleAnimation;
        if (cVar instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) cVar;
            int i10 = rippleAnimation$animate$1.f8460e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.f8460e = i10 - Integer.MIN_VALUE;
            } else {
                rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, cVar);
            }
        } else {
            rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, cVar);
        }
        Object obj = rippleAnimation$animate$1.f8458c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = rippleAnimation$animate$1.f8460e;
        if (i11 != 0) {
            if (i11 == 1) {
                rippleAnimation = (RippleAnimation) rippleAnimation$animate$1.f8457b;
                t0.n(obj);
            } else if (i11 == 2) {
                rippleAnimation = (RippleAnimation) rippleAnimation$animate$1.f8457b;
                t0.n(obj);
                rippleAnimation$animate$1.f8457b = null;
                rippleAnimation$animate$1.f8460e = 3;
                if (rippleAnimation.i(rippleAnimation$animate$1) == objH) {
                    return objH;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.n(obj);
            }
            return b2.f124493a;
        }
        t0.n(obj);
        rippleAnimation$animate$1.f8457b = this;
        rippleAnimation$animate$1.f8460e = 1;
        if (h(rippleAnimation$animate$1) == objH) {
            return objH;
        }
        rippleAnimation = this;
        rippleAnimation.n(true);
        y<b2> yVar = rippleAnimation.finishSignalDeferred;
        rippleAnimation$animate$1.f8457b = rippleAnimation;
        rippleAnimation$animate$1.f8460e = 2;
        if (yVar.p(rippleAnimation$animate$1) == objH) {
            return objH;
        }
        rippleAnimation$animate$1.f8457b = null;
        rippleAnimation$animate$1.f8460e = 3;
        if (rippleAnimation.i(rippleAnimation$animate$1) == objH) {
            return objH;
        }
        return b2.f124493a;
    }

    public final void g(@dl.d androidx.compose.ui.graphics.drawscope.g draw, long j10) {
        f0.p(draw, "$this$draw");
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(f.b(draw.c()));
        }
        if (this.targetRadius == null) {
            this.targetRadius = Float.isNaN(this.radius) ? Float.valueOf(f.a(draw, this.bounded, draw.c())) : Float.valueOf(draw.E1(this.radius));
        }
        if (this.f8445a == null) {
            this.f8445a = b1.f.d(draw.I());
        }
        if (this.f8450f == null) {
            this.f8450f = b1.f.d(b1.g.a(m.t(draw.c()) / 2.0f, m.m(draw.c()) / 2.0f));
        }
        float fFloatValue = (!k() || l()) ? this.animatedAlpha.u().floatValue() : 1.0f;
        Float f10 = this.startRadius;
        f0.m(f10);
        float fFloatValue2 = f10.floatValue();
        Float f11 = this.targetRadius;
        f0.m(f11);
        float fA = u1.d.a(fFloatValue2, f11.floatValue(), this.animatedRadiusPercent.u().floatValue());
        b1.f fVar = this.f8445a;
        f0.m(fVar);
        float fP = b1.f.p(fVar.getF30368a());
        b1.f fVar2 = this.f8450f;
        f0.m(fVar2);
        float fA2 = u1.d.a(fP, b1.f.p(fVar2.getF30368a()), this.animatedCenterPercent.u().floatValue());
        b1.f fVar3 = this.f8445a;
        f0.m(fVar3);
        float fR = b1.f.r(fVar3.getF30368a());
        b1.f fVar4 = this.f8450f;
        f0.m(fVar4);
        long jA = b1.g.a(fA2, u1.d.a(fR, b1.f.r(fVar4.getF30368a()), this.animatedCenterPercent.u().floatValue()));
        long jW = l0.w(j10, l0.A(j10) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            androidx.compose.ui.graphics.drawscope.f.x(draw, jW, fA, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fT = m.t(draw.c());
        float fM = m.m(draw.c());
        int iB = k0.INSTANCE.b();
        androidx.compose.ui.graphics.drawscope.e eVarM0 = draw.M0();
        long jC = eVarM0.c();
        eVarM0.a().f();
        eVarM0.d().a(0.0f, 0.0f, fT, fM, iB);
        androidx.compose.ui.graphics.drawscope.f.x(draw, jW, fA, jA, 0.0f, null, null, 0, 120, null);
        eVarM0.a().u();
        eVarM0.b(jC);
    }

    public final void j() {
        m(true);
        this.finishSignalDeferred.A(b2.f124493a);
    }
}
