package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/f0;", "d", "(Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/f0;", "androidx/compose/foundation/AndroidOverscrollKt$a", ak.av, "Landroidx/compose/foundation/AndroidOverscrollKt$a;", "getNoOpOverscrollEffect$annotations", "()V", "NoOpOverscrollEffect", "Landroidx/compose/ui/n;", "b", "Landroidx/compose/ui/n;", "StretchOverscrollNonClippingLayer", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidOverscrollKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final a f4657a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.n f4658b;

    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    @Metadata(bv = {}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"androidx/compose/foundation/AndroidOverscrollKt$a", "Landroidx/compose/foundation/f0;", "Lb1/f;", "scrollDelta", "Landroidx/compose/ui/input/nestedscroll/c;", "source", "e", "(JI)J", "initialDragDelta", "overscrollDelta", "Lkotlin/b2;", ak.av, "(JJI)V", "Ls1/x;", "velocity", "f", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "b", "", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", ak.aF, "isInProgress", "Landroidx/compose/ui/n;", "d", "()Landroidx/compose/ui/n;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isEnabled;

        a() {
        }

        @Override // androidx.compose.foundation.f0
        public void a(long initialDragDelta, long overscrollDelta, int source) {
        }

        @Override // androidx.compose.foundation.f0
        @dl.e
        public Object b(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            return b2.f124493a;
        }

        @Override // androidx.compose.foundation.f0
        public boolean c() {
            return false;
        }

        @Override // androidx.compose.foundation.f0
        @dl.d
        /* JADX INFO: renamed from: d */
        public androidx.compose.ui.n getEffectModifier() {
            return androidx.compose.ui.n.INSTANCE;
        }

        @Override // androidx.compose.foundation.f0
        public long e(long scrollDelta, int source) {
            return b1.f.f30364b.e();
        }

        @Override // androidx.compose.foundation.f0
        @dl.e
        public Object f(long j10, @dl.d kotlin.coroutines.c<? super s1.x> cVar) {
            return s1.x.b(s1.x.f139262b.a());
        }

        @Override // androidx.compose.foundation.f0
        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // androidx.compose.foundation.f0
        public void setEnabled(boolean z10) {
            this.isEnabled = z10;
        }
    }

    static {
        f4658b = Build.VERSION.SDK_INT >= 31 ? LayoutModifierKt.a(LayoutModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.q<androidx.compose.ui.layout.l0, androidx.compose.ui.layout.g0, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1
            @dl.d
            public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 layout, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                kotlin.jvm.internal.f0.p(measurable, "measurable");
                final e1 e1VarZ1 = measurable.z1(j10);
                final int iE1 = layout.e1(s1.h.g(j.b() * 2));
                return androidx.compose.ui.layout.k0.p(layout, e1VarZ1.k() - iE1, e1VarZ1.W() - iE1, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d e1.a layout2) {
                        kotlin.jvm.internal.f0.p(layout2, "$this$layout");
                        e1 e1Var = e1VarZ1;
                        e1.a.D(layout2, e1Var, ((-iE1) / 2) - ((e1Var.getWidth() - e1VarZ1.k()) / 2), ((-iE1) / 2) - ((e1VarZ1.getHeight() - e1VarZ1.W()) / 2), 0.0f, null, 12, null);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.layout.g0 g0Var, s1.b bVar) {
                return a(l0Var, g0Var, bVar.getF139216a());
            }
        }), new yh.q<androidx.compose.ui.layout.l0, androidx.compose.ui.layout.g0, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2
            @dl.d
            public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 layout, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                kotlin.jvm.internal.f0.p(measurable, "measurable");
                final e1 e1VarZ1 = measurable.z1(j10);
                final int iE1 = layout.e1(s1.h.g(j.b() * 2));
                return androidx.compose.ui.layout.k0.p(layout, e1VarZ1.getWidth() + iE1, e1VarZ1.getHeight() + iE1, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.AndroidOverscrollKt$StretchOverscrollNonClippingLayer$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d e1.a layout2) {
                        kotlin.jvm.internal.f0.p(layout2, "$this$layout");
                        e1 e1Var = e1VarZ1;
                        int i10 = iE1;
                        e1.a.p(layout2, e1Var, i10 / 2, i10 / 2, 0.0f, 4, null);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                        a(aVar);
                        return b2.f124493a;
                    }
                }, 4, null);
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.l0 l0Var, androidx.compose.ui.layout.g0 g0Var, s1.b bVar) {
                return a(l0Var, g0Var, bVar.getF139216a());
            }
        }) : androidx.compose.ui.n.INSTANCE;
    }

    private static /* synthetic */ void c() {
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final f0 d(@dl.e androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-81138291);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-81138291, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) pVar.K(AndroidCompositionLocals_androidKt.g());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) pVar.K(OverscrollConfigurationKt.a());
        pVar.T(511388516);
        boolean zS = pVar.s(context) | pVar.s(overscrollConfiguration);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = overscrollConfiguration != null ? new AndroidEdgeEffectOverscrollEffect(context, overscrollConfiguration) : f4657a;
            pVar.N(objU);
        }
        pVar.c0();
        f0 f0Var = (f0) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return f0Var;
    }
}
