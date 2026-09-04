package androidx.compose.material.ripple;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.t1;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.l0;
import b1.m;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0006\u0010 \u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0006\u0010\u0010\u001a\u00020\u0003R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR/\u0010)\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010/\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001f\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "Landroidx/compose/material/ripple/i;", "Landroidx/compose/runtime/t1;", "Lkotlin/b2;", "k", "Landroidx/compose/ui/graphics/drawscope/d;", ak.av, "Landroidx/compose/foundation/interaction/i$b;", "interaction", "Lkotlinx/coroutines/q0;", "scope", "e", "g", "b", "d", ak.aF, "n", "", "Z", "bounded", "Ls1/h;", "F", "radius", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "Landroidx/compose/runtime/m2;", "color", "Landroidx/compose/material/ripple/e;", "f", "rippleAlpha", "Landroidx/compose/material/ripple/RippleContainer;", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "Landroidx/compose/material/ripple/RippleHostView;", "<set-?>", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/runtime/a1;", "m", "()Landroidx/compose/material/ripple/RippleHostView;", "p", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", "i", "l", "()Z", "o", "(Z)V", "invalidateTick", "Lb1/m;", "j", "J", "rippleSize", "", "I", "rippleRadius", "<init>", "(ZFLandroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/material/ripple/RippleContainer;Lkotlin/jvm/internal/u;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidRippleIndicationInstance extends i implements t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<l0> color;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RippleContainer rippleContainer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 rippleHostView;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 invalidateTick;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int rippleRadius;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f8425l;

    private AndroidRippleIndicationInstance(boolean z10, float f10, m2<l0> m2Var, m2<RippleAlpha> m2Var2, RippleContainer rippleContainer) {
        super(z10, m2Var2);
        this.bounded = z10;
        this.radius = f10;
        this.color = m2Var;
        this.rippleAlpha = m2Var2;
        this.rippleContainer = rippleContainer;
        this.rippleHostView = h2.g(null, null, 2, null);
        this.invalidateTick = h2.g(Boolean.TRUE, null, 2, null);
        this.rippleSize = m.f30386b.c();
        this.rippleRadius = -1;
        this.f8425l = new yh.a<b2>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AndroidRippleIndicationInstance androidRippleIndicationInstance = this.f8426b;
                androidRippleIndicationInstance.o(!androidRippleIndicationInstance.l());
            }
        };
    }

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z10, float f10, m2 m2Var, m2 m2Var2, RippleContainer rippleContainer, u uVar) {
        this(z10, f10, m2Var, m2Var2, rippleContainer);
    }

    private final void k() {
        this.rippleContainer.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.invalidateTick.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RippleHostView m() {
        return (RippleHostView) this.rippleHostView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.invalidateTick.setValue(Boolean.valueOf(z10));
    }

    private final void p(RippleHostView rippleHostView) {
        this.rippleHostView.setValue(rippleHostView);
    }

    @Override // androidx.compose.foundation.y
    public void a(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        f0.p(dVar, "<this>");
        this.rippleSize = dVar.c();
        this.rippleRadius = Float.isNaN(this.radius) ? di.d.L0(f.a(dVar, this.bounded, dVar.c())) : dVar.e1(this.radius);
        long jM = this.color.getValue().M();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        dVar.T0();
        f(dVar, this.radius, jM);
        d0 d0VarA = dVar.M0().a();
        l();
        RippleHostView rippleHostViewM = m();
        if (rippleHostViewM != null) {
            rippleHostViewM.f(dVar.c(), this.rippleRadius, jM, pressedAlpha);
            rippleHostViewM.draw(androidx.compose.ui.graphics.c.d(d0VarA));
        }
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
        k();
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        k();
    }

    @Override // androidx.compose.material.ripple.i
    public void e(@dl.d androidx.compose.foundation.interaction.i.b interaction, @dl.d q0 scope) {
        f0.p(interaction, "interaction");
        f0.p(scope, "scope");
        RippleHostView rippleHostViewB = this.rippleContainer.b(this);
        rippleHostViewB.b(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().M(), this.rippleAlpha.getValue().getPressedAlpha(), this.f8425l);
        p(rippleHostViewB);
    }

    @Override // androidx.compose.material.ripple.i
    public void g(@dl.d androidx.compose.foundation.interaction.i.b interaction) {
        f0.p(interaction, "interaction");
        RippleHostView rippleHostViewM = m();
        if (rippleHostViewM != null) {
            rippleHostViewM.e();
        }
    }

    public final void n() {
        p(null);
    }
}
