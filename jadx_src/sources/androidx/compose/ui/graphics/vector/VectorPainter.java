package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.u;
import androidx.compose.runtime.u1;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\bA\u0010BJT\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022;\u0010\f\u001a7\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJd\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052;\u0010\u0011\u001a7\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\b\u000bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0015\u001a\u00020\n*\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0005H\u0014J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014R4\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010*\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R+\u00104\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b2\u0010'\"\u0004\b3\u0010)R\u0016\u00106\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u0010?\u001a\u0004\u0018\u00010\u00192\b\u0010:\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001d\u0010@\u001a\u00020\u001c8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b,\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/r;", "parent", "Lkotlin/Function2;", "", "Lkotlin/m0;", "name", "viewportWidth", "viewportHeight", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "composable", "Landroidx/compose/runtime/q;", "o", "(Landroidx/compose/runtime/r;Lyh/r;)Landroidx/compose/runtime/q;", "", "content", "l", "(Ljava/lang/String;FFLyh/r;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/graphics/drawscope/g;", "k", "alpha", "", ak.av, "Landroidx/compose/ui/graphics/m0;", "colorFilter", "b", "Lb1/m;", "<set-?>", "g", "Landroidx/compose/runtime/a1;", "r", "()J", RXScreenCaptureService.KEY_WIDTH, "(J)V", UiKitSpanObj.TYPE_SIZE, RXScreenCaptureService.KEY_HEIGHT, "p", "()Z", "t", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "i", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", "j", "Landroidx/compose/runtime/q;", "composition", ak.aB, ak.aG, "isDirty", "F", "currentAlpha", "m", "Landroidx/compose/ui/graphics/m0;", "currentColorFilter", "value", "q", "()Landroidx/compose/ui/graphics/m0;", "v", "(Landroidx/compose/ui/graphics/m0;)V", "intrinsicColorFilter", "intrinsicSize", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class VectorPainter extends Painter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f14106n = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 size = h2.g(b1.m.c(b1.m.f30386b.c()), null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 autoMirror = h2.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final VectorComponent vector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.runtime.q composition;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 isDirty;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float currentAlpha;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private m0 currentColorFilter;

    public VectorPainter() {
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.o(new yh.a<b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
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
                this.f14124b.u(true);
            }
        });
        this.vector = vectorComponent;
        this.isDirty = h2.g(Boolean.TRUE, null, 2, null);
        this.currentAlpha = 1.0f;
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    private final androidx.compose.runtime.q o(androidx.compose.runtime.r parent, final yh.r<? super Float, ? super Float, ? super androidx.compose.runtime.p, ? super Integer, b2> composable) {
        androidx.compose.runtime.q qVarA = this.composition;
        if (qVarA == null || qVarA.getDisposed()) {
            qVarA = u.a(new k(this.vector.getRoot()), parent);
        }
        this.composition = qVarA;
        qVarA.c(androidx.compose.runtime.internal.b.c(-1916507005, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$composeVector$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
                if ((i10 & 11) == 2 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1916507005, i10, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:211)");
                }
                composable.U0(Float.valueOf(this.vector.getViewportWidth()), Float.valueOf(this.vector.getViewportHeight()), pVar, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
                a(pVar, num.intValue());
                return b2.f124493a;
            }
        }));
        return qVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean s() {
        return ((Boolean) this.isDirty.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(boolean z10) {
        this.isDirty.setValue(Boolean.valueOf(z10));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(@dl.e m0 colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: i */
    public long getIntrinsicSize() {
        return r();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void k(@dl.d androidx.compose.ui.graphics.drawscope.g gVar) {
        f0.p(gVar, "<this>");
        VectorComponent vectorComponent = this.vector;
        m0 m0VarH = this.currentColorFilter;
        if (m0VarH == null) {
            m0VarH = vectorComponent.h();
        }
        if (p() && gVar.getLayoutDirection() == LayoutDirection.Rtl) {
            long jI = gVar.I();
            androidx.compose.ui.graphics.drawscope.e drawContext = gVar.getDrawContext();
            long jC = drawContext.c();
            drawContext.a().f();
            drawContext.getTransform().f(-1.0f, 1.0f, jI);
            vectorComponent.g(gVar, this.currentAlpha, m0VarH);
            drawContext.a().u();
            drawContext.b(jC);
        } else {
            vectorComponent.g(gVar, this.currentAlpha, m0VarH);
        }
        if (s()) {
            u(false);
        }
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public final void l(@dl.d final String name, final float f10, final float f11, @dl.d final yh.r<? super Float, ? super Float, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        f0.p(name, "name");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1264894527);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1264894527, i10, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:220)");
        }
        VectorComponent vectorComponent = this.vector;
        vectorComponent.p(name);
        vectorComponent.r(f10);
        vectorComponent.q(f11);
        final androidx.compose.runtime.q qVarO = o(ComposablesKt.u(pVarF, 0), content);
        EffectsKt.c(qVarO, new yh.l<androidx.compose.runtime.f0, e0>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.runtime.q f14115a;

                public a(androidx.compose.runtime.q qVar) {
                    this.f14115a = qVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f14115a.dispose();
                }
            }

            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                f0.p(DisposableEffect, "$this$DisposableEffect");
                return new a(qVarO);
            }
        }, pVarF, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                this.f14116b.l(name, f10, f11, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.autoMirror.getValue()).booleanValue();
    }

    @dl.e
    public final m0 q() {
        return this.vector.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((b1.m) this.size.getValue()).getF30389a();
    }

    public final void t(boolean z10) {
        this.autoMirror.setValue(Boolean.valueOf(z10));
    }

    public final void v(@dl.e m0 m0Var) {
        this.vector.n(m0Var);
    }

    public final void w(long j10) {
        this.size.setValue(b1.m.c(j10));
    }
}
