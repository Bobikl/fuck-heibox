package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.j1;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u00101\u001a\u00020/¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u000e\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\r\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J \u0010\u0010\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u001d\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ%\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J-\u0010'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J!\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b-\u0010,J\n\u0010.\u001a\u00020\u0011*\u00020\u0004R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00107\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R\u0014\u00108\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0005098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00103R\u0014\u0010@\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00103R\u0014\u0010B\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00103R\u0014\u0010D\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00103R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00110E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR(\u0010Q\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bO\u0010P\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010JR\u001f\u0010V\u001a\u00020T8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bU\u0010MR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010GR*\u0010[\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010L\"\u0004\b\\\u0010NR!\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010e\u001a\u00020a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\b5\u0010dR\u0014\u0010f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010L\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/f0;", "", "K", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroid/widget/EdgeEffect;", com.google.android.exoplayer2.text.ttml.d.f49793l0, "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "x", "top", androidx.exifinterface.media.a.W4, com.google.android.exoplayer2.text.ttml.d.f49796n0, ak.aD, "bottom", RXScreenCaptureService.KEY_WIDTH, "Lkotlin/b2;", "D", "v", "Lb1/f;", "delta", "I", "(J)Z", sd.b.f139393k, "displacement", "", "H", "(JJ)F", androidx.exifinterface.media.a.S4, "F", "G", "scrollDelta", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "initialDragDelta", "overscrollDelta", ak.av, "(JJI)V", "Ls1/x;", "velocity", "f", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "b", "y", "Landroidx/compose/foundation/e0;", "Landroidx/compose/foundation/e0;", "overscrollConfig", ak.aF, "Landroid/widget/EdgeEffect;", "topEffect", "d", "bottomEffect", "leftEffect", "rightEffect", "", "g", "Ljava/util/List;", "allEffects", RXScreenCaptureService.KEY_HEIGHT, "topEffectNegation", "i", "bottomEffectNegation", "j", "leftEffectNegation", "k", "rightEffectNegation", "Landroidx/compose/runtime/a1;", "l", "Landroidx/compose/runtime/a1;", "redrawSignal", "m", "Z", "B", "()Z", "J", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "()V", "invalidationEnabled", "n", "scrollCycleInProgress", "Lb1/m;", "o", "containerSize", "p", "isEnabledState", "value", "q", "isEnabled", "setEnabled", "Landroidx/compose/ui/input/pointer/x;", ak.aB, "Landroidx/compose/ui/input/pointer/x;", "pointerId", "Landroidx/compose/ui/n;", "t", "Landroidx/compose/ui/n;", "()Landroidx/compose/ui/n;", "effectModifier", "isInProgress", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/e0;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidEdgeEffectOverscrollEffect implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final OverscrollConfiguration overscrollConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private b1.f f4627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect topEffect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect bottomEffect;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect leftEffect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect rightEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<EdgeEffect> allEffects;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect topEffectNegation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect bottomEffectNegation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect leftEffectNegation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final EdgeEffect rightEffectNegation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<b2> redrawSignal;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean invalidationEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean scrollCycleInProgress;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long containerSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<Boolean> isEnabledState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final yh.l<s1.r, b2> f4643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.input.pointer.x pointerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.n effectModifier;

    public AndroidEdgeEffectOverscrollEffect(@dl.d Context context, @dl.d OverscrollConfiguration overscrollConfig) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(overscrollConfig, "overscrollConfig");
        this.overscrollConfig = overscrollConfig;
        o oVar = o.f7450a;
        EdgeEffect edgeEffectA = oVar.a(context, null);
        this.topEffect = edgeEffectA;
        EdgeEffect edgeEffectA2 = oVar.a(context, null);
        this.bottomEffect = edgeEffectA2;
        EdgeEffect edgeEffectA3 = oVar.a(context, null);
        this.leftEffect = edgeEffectA3;
        EdgeEffect edgeEffectA4 = oVar.a(context, null);
        this.rightEffect = edgeEffectA4;
        List<EdgeEffect> listL = CollectionsKt__CollectionsKt.L(edgeEffectA3, edgeEffectA, edgeEffectA4, edgeEffectA2);
        this.allEffects = listL;
        this.topEffectNegation = oVar.a(context, null);
        this.bottomEffectNegation = oVar.a(context, null);
        this.leftEffectNegation = oVar.a(context, null);
        this.rightEffectNegation = oVar.a(context, null);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            listL.get(i10).setColor(androidx.compose.ui.graphics.n0.s(this.overscrollConfig.getGlowColor()));
        }
        b2 b2Var = b2.f124493a;
        this.redrawSignal = e2.j(b2Var, e2.l());
        this.invalidationEnabled = true;
        this.containerSize = b1.m.f30386b.c();
        this.isEnabledState = h2.g(Boolean.FALSE, null, 2, null);
        yh.l<s1.r, b2> lVar = new yh.l<s1.r, b2>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            public final void a(long j10) {
                boolean z10 = !b1.m.k(s1.s.f(j10), this.f4655b.containerSize);
                this.f4655b.containerSize = s1.s.f(j10);
                if (z10) {
                    this.f4655b.topEffect.setSize(s1.r.m(j10), s1.r.j(j10));
                    this.f4655b.bottomEffect.setSize(s1.r.m(j10), s1.r.j(j10));
                    this.f4655b.leftEffect.setSize(s1.r.j(j10), s1.r.m(j10));
                    this.f4655b.rightEffect.setSize(s1.r.j(j10), s1.r.m(j10));
                    this.f4655b.topEffectNegation.setSize(s1.r.m(j10), s1.r.j(j10));
                    this.f4655b.bottomEffectNegation.setSize(s1.r.m(j10), s1.r.j(j10));
                    this.f4655b.leftEffectNegation.setSize(s1.r.j(j10), s1.r.m(j10));
                    this.f4655b.rightEffectNegation.setSize(s1.r.j(j10), s1.r.m(j10));
                }
                if (z10) {
                    this.f4655b.D();
                    this.f4655b.v();
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(s1.r rVar) {
                a(rVar.getF139248a());
                return b2.f124493a;
            }
        };
        this.f4643r = lVar;
        this.effectModifier = OnRemeasuredModifierKt.a(SuspendingPointerInputFilterKt.c(androidx.compose.ui.n.INSTANCE.s0(AndroidOverscrollKt.f4658b), b2Var, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), lVar).s0(new DrawOverscrollModifier(this, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("overscroll");
                x0Var.e(this.f4656b);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    private final boolean A(androidx.compose.ui.graphics.drawscope.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, gVar.E1(this.overscrollConfig.getDrawPadding().getTop()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @j1
    public static /* synthetic */ void C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(b2.f124493a);
        }
    }

    private final float E(long scroll, long displacement) {
        return (-o.f7450a.d(this.bottomEffect, -(b1.f.r(scroll) / b1.m.m(this.containerSize)), 1 - (b1.f.p(displacement) / b1.m.t(this.containerSize)))) * b1.m.m(this.containerSize);
    }

    private final float F(long scroll, long displacement) {
        return o.f7450a.d(this.leftEffect, b1.f.p(scroll) / b1.m.t(this.containerSize), 1 - (b1.f.r(displacement) / b1.m.m(this.containerSize))) * b1.m.t(this.containerSize);
    }

    private final float G(long scroll, long displacement) {
        return (-o.f7450a.d(this.rightEffect, -(b1.f.p(scroll) / b1.m.t(this.containerSize)), b1.f.r(displacement) / b1.m.m(this.containerSize))) * b1.m.t(this.containerSize);
    }

    private final float H(long scroll, long displacement) {
        float fP = b1.f.p(displacement) / b1.m.t(this.containerSize);
        return o.f7450a.d(this.topEffect, b1.f.r(scroll) / b1.m.m(this.containerSize), fP) * b1.m.m(this.containerSize);
    }

    private final boolean I(long delta) {
        boolean zIsFinished;
        if (this.leftEffect.isFinished() || b1.f.p(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            o.f7450a.e(this.leftEffect, b1.f.p(delta));
            zIsFinished = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && b1.f.p(delta) > 0.0f) {
            o.f7450a.e(this.rightEffect, b1.f.p(delta));
            zIsFinished = zIsFinished || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && b1.f.r(delta) < 0.0f) {
            o.f7450a.e(this.topEffect, b1.f.r(delta));
            zIsFinished = zIsFinished || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || b1.f.r(delta) <= 0.0f) {
            return zIsFinished;
        }
        o.f7450a.e(this.bottomEffect, b1.f.r(delta));
        return zIsFinished || this.bottomEffect.isFinished();
    }

    private final boolean K() {
        boolean z10;
        long jB = b1.n.b(this.containerSize);
        o oVar = o.f7450a;
        if (oVar.b(this.leftEffect) == 0.0f) {
            z10 = false;
        } else {
            F(b1.f.f30364b.e(), jB);
            z10 = true;
        }
        if (!(oVar.b(this.rightEffect) == 0.0f)) {
            G(b1.f.f30364b.e(), jB);
            z10 = true;
        }
        if (!(oVar.b(this.topEffect) == 0.0f)) {
            H(b1.f.f30364b.e(), jB);
            z10 = true;
        }
        if (oVar.b(this.bottomEffect) == 0.0f) {
            return z10;
        }
        E(b1.f.f30364b.e(), jB);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            D();
        }
    }

    private final boolean w(androidx.compose.ui.graphics.drawscope.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-b1.m.t(this.containerSize), (-b1.m.m(this.containerSize)) + gVar.E1(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean x(androidx.compose.ui.graphics.drawscope.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-b1.m.m(this.containerSize), gVar.E1(this.overscrollConfig.getDrawPadding().b(gVar.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean z(androidx.compose.ui.graphics.drawscope.g gVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iL0 = di.d.L0(b1.m.t(this.containerSize));
        float fC = this.overscrollConfig.getDrawPadding().c(gVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-iL0) + gVar.E1(fC));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void J(boolean z10) {
        this.invalidationEnabled = z10;
    }

    @Override // androidx.compose.foundation.f0
    public void a(long initialDragDelta, long overscrollDelta, int source) {
        boolean z10;
        if (b1.m.v(this.containerSize)) {
            return;
        }
        boolean z11 = true;
        if (androidx.compose.ui.input.nestedscroll.c.g(source, androidx.compose.ui.input.nestedscroll.c.INSTANCE.a())) {
            b1.f fVar = this.f4627b;
            long f30368a = fVar != null ? fVar.getF30368a() : b1.n.b(this.containerSize);
            if (b1.f.p(overscrollDelta) > 0.0f) {
                F(overscrollDelta, f30368a);
            } else if (b1.f.p(overscrollDelta) < 0.0f) {
                G(overscrollDelta, f30368a);
            }
            if (b1.f.r(overscrollDelta) > 0.0f) {
                H(overscrollDelta, f30368a);
            } else if (b1.f.r(overscrollDelta) < 0.0f) {
                E(overscrollDelta, f30368a);
            }
            z10 = !b1.f.l(overscrollDelta, b1.f.f30364b.e());
        } else {
            z10 = false;
        }
        if (!I(initialDragDelta) && !z10) {
            z11 = false;
        }
        if (z11) {
            D();
        }
    }

    @Override // androidx.compose.foundation.f0
    @dl.e
    public Object b(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        if (b1.m.v(this.containerSize)) {
            return b2.f124493a;
        }
        this.scrollCycleInProgress = false;
        if (s1.x.l(j10) > 0.0f) {
            o.f7450a.c(this.leftEffect, di.d.L0(s1.x.l(j10)));
        } else if (s1.x.l(j10) < 0.0f) {
            o.f7450a.c(this.rightEffect, -di.d.L0(s1.x.l(j10)));
        }
        if (s1.x.n(j10) > 0.0f) {
            o.f7450a.c(this.topEffect, di.d.L0(s1.x.n(j10)));
        } else if (s1.x.n(j10) < 0.0f) {
            o.f7450a.c(this.bottomEffect, -di.d.L0(s1.x.n(j10)));
        }
        if (!s1.x.j(j10, s1.x.f139262b.a())) {
            D();
        }
        v();
        return b2.f124493a;
    }

    @Override // androidx.compose.foundation.f0
    public boolean c() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(o.f7450a.b(list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.f0
    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public androidx.compose.ui.n getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    @Override // androidx.compose.foundation.f0
    public long e(long scrollDelta, int source) {
        float fE;
        float fG;
        if (b1.m.v(this.containerSize)) {
            return b1.f.f30364b.e();
        }
        if (!this.scrollCycleInProgress) {
            K();
            this.scrollCycleInProgress = true;
        }
        b1.f fVar = this.f4627b;
        long f30368a = fVar != null ? fVar.getF30368a() : b1.n.b(this.containerSize);
        float f10 = 0.0f;
        if (b1.f.r(scrollDelta) == 0.0f) {
            fE = 0.0f;
        } else {
            o oVar = o.f7450a;
            if (oVar.b(this.topEffect) == 0.0f) {
                if (oVar.b(this.bottomEffect) == 0.0f) {
                    fE = 0.0f;
                } else {
                    fE = E(scrollDelta, f30368a);
                    if (oVar.b(this.bottomEffect) == 0.0f) {
                        this.bottomEffect.onRelease();
                    }
                }
            } else {
                fE = H(scrollDelta, f30368a);
                if (oVar.b(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            }
        }
        if (!(b1.f.p(scrollDelta) == 0.0f)) {
            o oVar2 = o.f7450a;
            if (oVar2.b(this.leftEffect) == 0.0f) {
                if (!(oVar2.b(this.rightEffect) == 0.0f)) {
                    fG = G(scrollDelta, f30368a);
                    if (oVar2.b(this.rightEffect) == 0.0f) {
                        this.rightEffect.onRelease();
                    }
                }
            } else {
                fG = F(scrollDelta, f30368a);
                if (oVar2.b(this.leftEffect) == 0.0f) {
                    this.leftEffect.onRelease();
                }
            }
            f10 = fG;
        }
        long jA = b1.g.a(f10, fE);
        if (!b1.f.l(jA, b1.f.f30364b.e())) {
            D();
        }
        return jA;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    @Override // androidx.compose.foundation.f0
    @dl.e
    public Object f(long j10, @dl.d kotlin.coroutines.c<? super s1.x> cVar) {
        float fL;
        o oVar;
        boolean z10;
        o oVar2;
        if (b1.m.v(this.containerSize)) {
            return s1.x.b(s1.x.f139262b.a());
        }
        float fN = 0.0f;
        if (s1.x.l(j10) > 0.0f) {
            o oVar3 = o.f7450a;
            if (!(oVar3.b(this.leftEffect) == 0.0f)) {
                oVar3.c(this.leftEffect, di.d.L0(s1.x.l(j10)));
                fL = s1.x.l(j10);
            } else if (s1.x.l(j10) < 0.0f) {
                oVar = o.f7450a;
                if (oVar.b(this.rightEffect) == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    fL = 0.0f;
                } else {
                    oVar.c(this.rightEffect, -di.d.L0(s1.x.l(j10)));
                    fL = s1.x.l(j10);
                }
            } else {
                fL = 0.0f;
            }
        } else if (s1.x.l(j10) < 0.0f) {
            oVar = o.f7450a;
            if (oVar.b(this.rightEffect) == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                oVar.c(this.rightEffect, -di.d.L0(s1.x.l(j10)));
                fL = s1.x.l(j10);
            } else {
                fL = 0.0f;
            }
        } else {
            fL = 0.0f;
        }
        if (s1.x.n(j10) > 0.0f) {
            o oVar4 = o.f7450a;
            if (!(oVar4.b(this.topEffect) == 0.0f)) {
                oVar4.c(this.topEffect, di.d.L0(s1.x.n(j10)));
                fN = s1.x.n(j10);
            } else if (s1.x.n(j10) < 0.0f) {
                oVar2 = o.f7450a;
                if (!(oVar2.b(this.bottomEffect) == 0.0f)) {
                    oVar2.c(this.bottomEffect, -di.d.L0(s1.x.n(j10)));
                    fN = s1.x.n(j10);
                }
            }
        } else if (s1.x.n(j10) < 0.0f) {
            oVar2 = o.f7450a;
            if (!(oVar2.b(this.bottomEffect) == 0.0f)) {
                oVar2.c(this.bottomEffect, -di.d.L0(s1.x.n(j10)));
                fN = s1.x.n(j10);
            }
        }
        long jA = s1.y.a(fL, fN);
        if (!s1.x.j(jA, s1.x.f139262b.a())) {
            D();
        }
        return s1.x.b(jA);
    }

    @Override // androidx.compose.foundation.f0
    /* JADX INFO: renamed from: isEnabled */
    public boolean getIsEnabled() {
        return this.isEnabledState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.f0
    public void setEnabled(boolean z10) {
        boolean z11 = this.isEnabled != z10;
        this.isEnabledState.setValue(Boolean.valueOf(z10));
        this.isEnabled = z10;
        if (z11) {
            this.scrollCycleInProgress = false;
            v();
        }
    }

    public final void y(@dl.d androidx.compose.ui.graphics.drawscope.g gVar) {
        boolean zX;
        kotlin.jvm.internal.f0.p(gVar, "<this>");
        if (b1.m.v(this.containerSize)) {
            return;
        }
        androidx.compose.ui.graphics.d0 d0VarA = gVar.getDrawContext().a();
        this.redrawSignal.getValue();
        Canvas canvasD = androidx.compose.ui.graphics.c.d(d0VarA);
        o oVar = o.f7450a;
        boolean z10 = true;
        if (!(oVar.b(this.leftEffectNegation) == 0.0f)) {
            z(gVar, this.leftEffectNegation, canvasD);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            zX = false;
        } else {
            zX = x(gVar, this.leftEffect, canvasD);
            oVar.d(this.leftEffectNegation, oVar.b(this.leftEffect), 0.0f);
        }
        if (!(oVar.b(this.topEffectNegation) == 0.0f)) {
            w(gVar, this.topEffectNegation, canvasD);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            zX = A(gVar, this.topEffect, canvasD) || zX;
            oVar.d(this.topEffectNegation, oVar.b(this.topEffect), 0.0f);
        }
        if (!(oVar.b(this.rightEffectNegation) == 0.0f)) {
            x(gVar, this.rightEffectNegation, canvasD);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            zX = z(gVar, this.rightEffect, canvasD) || zX;
            oVar.d(this.rightEffectNegation, oVar.b(this.rightEffect), 0.0f);
        }
        if (!(oVar.b(this.bottomEffectNegation) == 0.0f)) {
            A(gVar, this.bottomEffectNegation, canvasD);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            if (!w(gVar, this.bottomEffect, canvasD) && !zX) {
                z10 = false;
            }
            oVar.d(this.bottomEffectNegation, oVar.b(this.bottomEffect), 0.0f);
            zX = z10;
        }
        if (zX) {
            D();
        }
    }
}
