package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.f1;
import androidx.compose.animation.core.x1;
import androidx.compose.animation.core.z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.o2;
import androidx.compose.ui.graphics.p2;
import androidx.compose.ui.graphics.v0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\"\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\"\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007\u001a>\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a>\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\nH\u0007ø\u0001\u0000\u001a9\u0010\u0016\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u0019\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aT\u0010 \u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2#\b\u0002\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aT\u0010#\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2#\b\u0002\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nH\u0007ø\u0001\u0000\u001aT\u0010(\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001c\u001a\u00020$2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2#\b\u0002\u0010'\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001aT\u0010,\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010\u001c\u001a\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2#\b\u0002\u0010+\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001aT\u0010.\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010!\u001a\u00020$2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2#\b\u0002\u0010-\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001aT\u00100\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\b\b\u0002\u0010!\u001a\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2#\b\u0002\u0010/\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001a@\u00102\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00101\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001a@\u00104\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00103\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001a@\u00106\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00105\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001a@\u00108\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u00002#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110%¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020%0\nH\u0007ø\u0001\u0000\u001a\f\u00109\u001a\u00020\u001b*\u00020$H\u0002\u001a\f\u0010:\u001a\u00020\u001b*\u00020)H\u0002\u001a1\u0010B\u001a\u00020A*\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010C\u001aB\u0010J\u001a\u00020A*\u00020A2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020<0;2\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0E2\u000e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0E2\u0006\u0010I\u001a\u00020?H\u0002\u001aB\u0010N\u001a\u00020A*\u00020A2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020<0;2\u000e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0E2\u000e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0E2\u0006\u0010I\u001a\u00020?H\u0002\"#\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bQ\u0010R\"\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V\"\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\"\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\t0X8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\\\u0010Z\"\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000b0X8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b^\u0010Z\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"Landroidx/compose/animation/core/f0;", "", "animationSpec", "initialAlpha", "Landroidx/compose/animation/f;", ak.aG, "targetAlpha", "Landroidx/compose/animation/h;", RXScreenCaptureService.KEY_WIDTH, "Ls1/n;", "Lkotlin/Function1;", "Ls1/r;", "Lkotlin/m0;", "name", "fullSize", "initialOffset", "J", "targetOffset", "Q", "initialScale", "Landroidx/compose/ui/graphics/o2;", "transformOrigin", "y", "(Landroidx/compose/animation/core/f0;FJ)Landroidx/compose/animation/f;", "targetScale", androidx.exifinterface.media.a.W4, "(Landroidx/compose/animation/core/f0;FJ)Landroidx/compose/animation/h;", "Landroidx/compose/ui/c;", "expandFrom", "", "clip", "initialSize", "q", "shrinkTowards", "targetSize", "F", "Landroidx/compose/ui/c$b;", "", "fullWidth", "initialWidth", "o", "Landroidx/compose/ui/c$c;", "fullHeight", "initialHeight", ak.aB, "targetWidth", "D", "targetHeight", "H", "initialOffsetX", "L", "initialOffsetY", "O", "targetOffsetX", androidx.exifinterface.media.a.R4, "targetOffsetY", "U", androidx.exifinterface.media.a.T4, "X", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", com.alipay.sdk.m.x.d.A, "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Landroidx/compose/ui/n;", "g", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "transition", "Landroidx/compose/runtime/m2;", "Landroidx/compose/animation/t;", "slideIn", "slideOut", "labelPrefix", "N", "Landroidx/compose/animation/ChangeSize;", "expand", "shrink", "C", "Landroidx/compose/animation/core/f1;", "Landroidx/compose/animation/core/m;", ak.av, "Landroidx/compose/animation/core/f1;", "TransformOriginVectorConverter", "Landroidx/compose/runtime/a1;", "b", "Landroidx/compose/runtime/a1;", "DefaultAlpha", "Landroidx/compose/animation/core/z0;", ak.aF, "Landroidx/compose/animation/core/z0;", "DefaultAlphaAndScaleSpring", "d", "DefaultOffsetAnimationSpec", "e", "DefaultSizeAnimationSpec", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class EnterExitTransitionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final f1<o2, androidx.compose.animation.core.m> f4008a = VectorConvertersKt.a(new yh.l<o2, androidx.compose.animation.core.m>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @dl.d
        public final androidx.compose.animation.core.m a(long j10) {
            return new androidx.compose.animation.core.m(o2.k(j10), o2.l(j10));
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.m invoke(o2 o2Var) {
            return a(o2Var.getPackedValue());
        }
    }, new yh.l<androidx.compose.animation.core.m, o2>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        public final long a(@dl.d androidx.compose.animation.core.m it) {
            f0.p(it, "it");
            return p2.a(it.getCom.alipay.sdk.m.x.c.d java.lang.String(), it.getV2());
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ o2 invoke(androidx.compose.animation.core.m mVar) {
            return o2.b(a(mVar));
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final a1<Float> f4009b = h2.g(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final z0<Float> f4010c = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final z0<s1.n> f4011d = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final z0<s1.r> f4012e = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4015a;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            f4015a = iArr;
        }
    }

    @j
    @j2
    @dl.d
    public static final h A(@dl.d androidx.compose.animation.core.f0<Float> animationSpec, float f10, long j10) {
        f0.p(animationSpec, "animationSpec");
        return new i(new TransitionData(null, null, null, new Scale(f10, j10, animationSpec, null), 7, null));
    }

    public static /* synthetic */ h B(androidx.compose.animation.core.f0 f0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = o2.INSTANCE.a();
        }
        return A(f0Var, f10, j10);
    }

    private static final androidx.compose.ui.n C(androidx.compose.ui.n nVar, final Transition<EnterExitState> transition, final m2<ChangeSize> m2Var, final m2<ChangeSize> m2Var2, final String str) {
        return ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean b(a1<Boolean> a1Var) {
                return a1Var.getValue().booleanValue();
            }

            private static final void c(a1<Boolean> a1Var, boolean z10) {
                a1Var.setValue(Boolean.valueOf(z10));
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar2, @dl.e androidx.compose.runtime.p pVar, int i10) {
                androidx.compose.ui.c cVarG;
                androidx.compose.ui.n composed = nVar2;
                f0.p(composed, "$this$composed");
                pVar.T(-140634085);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-140634085, i10, -1, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1010)");
                }
                Transition<EnterExitState> transition2 = transition;
                pVar.T(1157296644);
                boolean zS = pVar.s(transition2);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = h2.g(Boolean.FALSE, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                a1 a1Var = (a1) objU;
                boolean z10 = true;
                if (transition.h() == transition.o() && !transition.t()) {
                    c(a1Var, false);
                } else if (m2Var.getValue() != null || m2Var2.getValue() != null) {
                    c(a1Var, true);
                }
                if (b(a1Var)) {
                    boolean zB = transition.m().b(EnterExitState.PreEnter, EnterExitState.Visible);
                    m2<ChangeSize> m2Var3 = m2Var;
                    m2<ChangeSize> m2Var4 = m2Var2;
                    if (zB) {
                        ChangeSize value = m2Var3.getValue();
                        if (value == null || (cVarG = value.g()) == null) {
                            ChangeSize value2 = m2Var4.getValue();
                            if (value2 != null) {
                                cVarG = value2.g();
                            } else {
                                cVarG = null;
                            }
                        }
                    } else {
                        ChangeSize value3 = m2Var4.getValue();
                        if (value3 == null || (cVarG = value3.g()) == null) {
                            ChangeSize value4 = m2Var3.getValue();
                            if (value4 != null) {
                                cVarG = value4.g();
                            } else {
                                cVarG = null;
                            }
                        }
                    }
                    m2 m2VarT = e2.t(cVarG, pVar, 0);
                    Transition<EnterExitState> transition3 = transition;
                    f1<s1.r, androidx.compose.animation.core.m> f1VarJ = VectorConvertersKt.j(s1.r.f139246b);
                    String str2 = str;
                    pVar.T(-492369756);
                    Object objU2 = pVar.U();
                    androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU2 == companion.a()) {
                        objU2 = str2 + " shrink/expand";
                        pVar.N(objU2);
                    }
                    pVar.c0();
                    Transition.a aVarL = androidx.compose.animation.core.TransitionKt.l(transition3, f1VarJ, (String) objU2, pVar, bb.c.b.G5, 0);
                    pVar.X(-1553214439, Boolean.valueOf(transition.h() == transition.o()));
                    Transition<EnterExitState> transition4 = transition;
                    f1<s1.n, androidx.compose.animation.core.m> f1VarI = VectorConvertersKt.i(s1.n.f139237b);
                    String str3 = str;
                    pVar.T(-492369756);
                    Object objU3 = pVar.U();
                    if (objU3 == companion.a()) {
                        objU3 = str3 + " InterruptionHandlingOffset";
                        pVar.N(objU3);
                    }
                    pVar.c0();
                    Transition.a aVarL2 = androidx.compose.animation.core.TransitionKt.l(transition4, f1VarI, (String) objU3, pVar, bb.c.b.G5, 0);
                    pVar.b0();
                    Transition<EnterExitState> transition5 = transition;
                    m2<ChangeSize> m2Var5 = m2Var;
                    m2<ChangeSize> m2Var6 = m2Var2;
                    pVar.T(1157296644);
                    boolean zS2 = pVar.s(transition5);
                    Object objU4 = pVar.U();
                    if (zS2 || objU4 == companion.a()) {
                        objU4 = new ExpandShrinkModifier(aVarL, aVarL2, m2Var5, m2Var6, m2VarT);
                        pVar.N(objU4);
                    }
                    pVar.c0();
                    ExpandShrinkModifier expandShrinkModifier = (ExpandShrinkModifier) objU4;
                    if (transition.h() == transition.o()) {
                        expandShrinkModifier.n(null);
                    } else if (expandShrinkModifier.getCurrentAlignment() == null) {
                        androidx.compose.ui.c cVarC = (androidx.compose.ui.c) m2VarT.getValue();
                        if (cVarC == null) {
                            cVarC = androidx.compose.ui.c.INSTANCE.C();
                        }
                        expandShrinkModifier.n(cVarC);
                    }
                    ChangeSize value5 = m2Var.getValue();
                    if (!((value5 == null || value5.i()) ? false : true)) {
                        ChangeSize value6 = m2Var2.getValue();
                        if (!((value6 == null || value6.i()) ? false : true)) {
                            z10 = false;
                        }
                    }
                    androidx.compose.ui.n nVarB = androidx.compose.ui.n.INSTANCE;
                    if (!z10) {
                        nVarB = androidx.compose.ui.draw.d.b(nVarB);
                    }
                    composed = composed.s0(nVarB).s0(expandShrinkModifier);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return composed;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        }, 1, null);
    }

    @j2
    @dl.d
    public static final h D(@dl.d androidx.compose.animation.core.f0<s1.r> animationSpec, @dl.d androidx.compose.ui.c.b shrinkTowards, boolean z10, @dl.d final yh.l<? super Integer, Integer> targetWidth) {
        f0.p(animationSpec, "animationSpec");
        f0.p(shrinkTowards, "shrinkTowards");
        f0.p(targetWidth, "targetWidth");
        return F(animationSpec, W(shrinkTowards), z10, new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.s.a(targetWidth.invoke(Integer.valueOf(s1.r.m(j10))).intValue(), s1.r.j(j10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                return s1.r.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ h E(androidx.compose.animation.core.f0 f0Var, androidx.compose.ui.c.b bVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.s();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                @dl.d
                public final Integer a(int i11) {
                    return 0;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return D(f0Var, bVar, z10, lVar);
    }

    @j2
    @dl.d
    public static final h F(@dl.d androidx.compose.animation.core.f0<s1.r> animationSpec, @dl.d androidx.compose.ui.c shrinkTowards, boolean z10, @dl.d yh.l<? super s1.r, s1.r> targetSize) {
        f0.p(animationSpec, "animationSpec");
        f0.p(shrinkTowards, "shrinkTowards");
        f0.p(targetSize, "targetSize");
        return new i(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ h G(androidx.compose.animation.core.f0 f0Var, androidx.compose.ui.c cVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.e();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                public final long a(long j10) {
                    return s1.s.a(0, 0);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                    return s1.r.b(a(rVar.getF139248a()));
                }
            };
        }
        return F(f0Var, cVar, z10, lVar);
    }

    @j2
    @dl.d
    public static final h H(@dl.d androidx.compose.animation.core.f0<s1.r> animationSpec, @dl.d androidx.compose.ui.c.InterfaceC0079c shrinkTowards, boolean z10, @dl.d final yh.l<? super Integer, Integer> targetHeight) {
        f0.p(animationSpec, "animationSpec");
        f0.p(shrinkTowards, "shrinkTowards");
        f0.p(targetHeight, "targetHeight");
        return F(animationSpec, X(shrinkTowards), z10, new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.s.a(s1.r.m(j10), targetHeight.invoke(Integer.valueOf(s1.r.j(j10))).intValue());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                return s1.r.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ h I(androidx.compose.animation.core.f0 f0Var, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0079c = androidx.compose.ui.c.INSTANCE.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                @dl.d
                public final Integer a(int i11) {
                    return 0;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return H(f0Var, interfaceC0079c, z10, lVar);
    }

    @j2
    @dl.d
    public static final f J(@dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d yh.l<? super s1.r, s1.n> initialOffset) {
        f0.p(animationSpec, "animationSpec");
        f0.p(initialOffset, "initialOffset");
        return new g(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ f K(androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        return J(f0Var, lVar);
    }

    @j2
    @dl.d
    public static final f L(@dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d final yh.l<? super Integer, Integer> initialOffsetX) {
        f0.p(animationSpec, "animationSpec");
        f0.p(initialOffsetX, "initialOffsetX");
        return J(animationSpec, new yh.l<s1.r, s1.n>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.o.a(initialOffsetX.invoke(Integer.valueOf(s1.r.m(j10))).intValue(), 0);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar) {
                return s1.n.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ f M(androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                @dl.d
                public final Integer a(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return L(f0Var, lVar);
    }

    private static final androidx.compose.ui.n N(androidx.compose.ui.n nVar, final Transition<EnterExitState> transition, final m2<Slide> m2Var, final m2<Slide> m2Var2, final String str) {
        return ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInOut$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final boolean b(a1<Boolean> a1Var) {
                return a1Var.getValue().booleanValue();
            }

            private static final void c(a1<Boolean> a1Var, boolean z10) {
                a1Var.setValue(Boolean.valueOf(z10));
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(158379472);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(158379472, i10, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:928)");
                }
                Transition<EnterExitState> transition2 = transition;
                pVar.T(1157296644);
                boolean zS = pVar.s(transition2);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = h2.g(Boolean.FALSE, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                a1 a1Var = (a1) objU;
                if (transition.h() == transition.o() && !transition.t()) {
                    c(a1Var, false);
                } else if (m2Var.getValue() != null || m2Var2.getValue() != null) {
                    c(a1Var, true);
                }
                if (b(a1Var)) {
                    Transition<EnterExitState> transition3 = transition;
                    f1<s1.n, androidx.compose.animation.core.m> f1VarI = VectorConvertersKt.i(s1.n.f139237b);
                    String str2 = str;
                    pVar.T(-492369756);
                    Object objU2 = pVar.U();
                    androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU2 == companion.a()) {
                        objU2 = str2 + " slide";
                        pVar.N(objU2);
                    }
                    pVar.c0();
                    Transition.a aVarL = androidx.compose.animation.core.TransitionKt.l(transition3, f1VarI, (String) objU2, pVar, bb.c.b.G5, 0);
                    Transition<EnterExitState> transition4 = transition;
                    m2<Slide> m2Var3 = m2Var;
                    m2<Slide> m2Var4 = m2Var2;
                    pVar.T(1157296644);
                    boolean zS2 = pVar.s(transition4);
                    Object objU3 = pVar.U();
                    if (zS2 || objU3 == companion.a()) {
                        objU3 = new SlideModifier(aVarL, m2Var3, m2Var4);
                        pVar.N(objU3);
                    }
                    pVar.c0();
                    composed = composed.s0((SlideModifier) objU3);
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return composed;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        }, 1, null);
    }

    @j2
    @dl.d
    public static final f O(@dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d final yh.l<? super Integer, Integer> initialOffsetY) {
        f0.p(animationSpec, "animationSpec");
        f0.p(initialOffsetY, "initialOffsetY");
        return J(animationSpec, new yh.l<s1.r, s1.n>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.o.a(0, initialOffsetY.invoke(Integer.valueOf(s1.r.j(j10))).intValue());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar) {
                return s1.n.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ f P(androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                @dl.d
                public final Integer a(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return O(f0Var, lVar);
    }

    @j2
    @dl.d
    public static final h Q(@dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d yh.l<? super s1.r, s1.n> targetOffset) {
        f0.p(animationSpec, "animationSpec");
        f0.p(targetOffset, "targetOffset");
        return new i(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ h R(androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        return Q(f0Var, lVar);
    }

    @j2
    @dl.d
    public static final h S(@dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d final yh.l<? super Integer, Integer> targetOffsetX) {
        f0.p(animationSpec, "animationSpec");
        f0.p(targetOffsetX, "targetOffsetX");
        return Q(animationSpec, new yh.l<s1.r, s1.n>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.o.a(targetOffsetX.invoke(Integer.valueOf(s1.r.m(j10))).intValue(), 0);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar) {
                return s1.n.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ h T(androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                @dl.d
                public final Integer a(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return S(f0Var, lVar);
    }

    @j2
    @dl.d
    public static final h U(@dl.d androidx.compose.animation.core.f0<s1.n> animationSpec, @dl.d final yh.l<? super Integer, Integer> targetOffsetY) {
        f0.p(animationSpec, "animationSpec");
        f0.p(targetOffsetY, "targetOffsetY");
        return Q(animationSpec, new yh.l<s1.r, s1.n>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.o.a(0, targetOffsetY.invoke(Integer.valueOf(s1.r.j(j10))).intValue());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.n invoke(s1.r rVar) {
                return s1.n.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ h V(androidx.compose.animation.core.f0 f0Var, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                @dl.d
                public final Integer a(int i11) {
                    return Integer.valueOf((-i11) / 2);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return U(f0Var, lVar);
    }

    private static final androidx.compose.ui.c W(androidx.compose.ui.c.b bVar) {
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        if (f0.g(bVar, companion.u())) {
            return companion.o();
        }
        return f0.g(bVar, companion.s()) ? companion.k() : companion.i();
    }

    private static final androidx.compose.ui.c X(androidx.compose.ui.c.InterfaceC0079c interfaceC0079c) {
        androidx.compose.ui.c.Companion companion = androidx.compose.ui.c.INSTANCE;
        if (f0.g(interfaceC0079c, companion.w())) {
            return companion.y();
        }
        return f0.g(interfaceC0079c, companion.a()) ? companion.c() : companion.i();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0329  */
    /* JADX WARN: Code duplicated, block: B:143:0x040b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0485  */
    /* JADX WARN: Code duplicated, block: B:198:0x050d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01be  */
    /* JADX WARN: Code duplicated, block: B:79:0x0226  */
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.n g(@dl.d Transition<EnterExitState> transition, @dl.d final f enter, @dl.d final h exit, @dl.d String label, @dl.e androidx.compose.runtime.p pVar, int i10) {
        int i11;
        o2 o2Var;
        m2 m2VarM;
        float fG;
        o2 o2VarB;
        o2 o2VarB2;
        float fE;
        float fE2;
        f0.p(transition, "<this>");
        f0.p(enter, "enter");
        f0.p(exit, "exit");
        f0.p(label, "label");
        pVar.T(914000546);
        if (ComposerKt.g0()) {
            ComposerKt.w0(914000546, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:797)");
        }
        androidx.compose.ui.n nVarC = C(N(androidx.compose.ui.n.INSTANCE, transition, e2.t(enter.getData().j(), pVar, 0), e2.t(exit.getData().j(), pVar, 0), label), transition, e2.t(enter.getData().g(), pVar, 0), e2.t(exit.getData().g(), pVar, 0), label);
        int i12 = i10 & 14;
        pVar.T(1157296644);
        boolean zS = pVar.s(transition);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = h2.g(Boolean.FALSE, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        pVar.T(1157296644);
        boolean zS2 = pVar.s(transition);
        Object objU2 = pVar.U();
        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = h2.g(Boolean.FALSE, null, 2, null);
            pVar.N(objU2);
        }
        pVar.c0();
        a1 a1Var2 = (a1) objU2;
        if (transition.h() != transition.o() || transition.t()) {
            if (enter.getData().h() != null || exit.getData().h() != null) {
                k(a1Var, true);
            }
            if (enter.getData().i() != null || exit.getData().i() != null) {
                m(a1Var2, true);
            }
        } else {
            k(a1Var, false);
            m(a1Var2, false);
        }
        pVar.T(1657240746);
        float fG2 = 1.0f;
        if (h(a1Var)) {
            yh.q<Transition.b<EnterExitState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>> qVar = new yh.q<Transition.b<EnterExitState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<EnterExitState> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i13) {
                    androidx.compose.animation.core.f0<Float> f0VarF;
                    Fade fadeH;
                    f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(-57153604);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-57153604, i13, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:838)");
                    }
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (animateFloat.b(enterExitState, enterExitState2)) {
                        Fade fadeH2 = enter.getData().h();
                        if (fadeH2 == null || (f0VarF = fadeH2.f()) == null) {
                            f0VarF = EnterExitTransitionKt.f4010c;
                        }
                    } else if (!animateFloat.b(enterExitState2, EnterExitState.PostExit) || (fadeH = exit.getData().h()) == null || (f0VarF = fadeH.f()) == null) {
                        f0VarF = EnterExitTransitionKt.f4010c;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return f0VarF;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<EnterExitState> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVar.T(-492369756);
            Object objU3 = pVar.U();
            if (objU3 == androidx.compose.runtime.p.INSTANCE.a()) {
                objU3 = label + " alpha";
                pVar.N(objU3);
            }
            pVar.c0();
            String str = (String) objU3;
            int i13 = i12 | bb.c.b.f30966u4;
            pVar.T(-1338768149);
            f1<Float, androidx.compose.animation.core.l> f1VarE = VectorConvertersKt.e(y.f124996a);
            int i14 = i13 & 14;
            int i15 = i13 << 3;
            int i16 = (i15 & 57344) | i14 | (i15 & bb.c.b.f30796me) | (i15 & bb.c.g.f32954lc);
            pVar.T(-142660079);
            int i17 = (i16 >> 9) & 112;
            EnterExitState enterExitStateH = transition.h();
            pVar.T(755689166);
            if (ComposerKt.g0()) {
                ComposerKt.w0(755689166, i17, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:848)");
            }
            int[] iArr = a.f4015a;
            int i18 = iArr[enterExitStateH.ordinal()];
            if (i18 == 1) {
                fE = 1.0f;
            } else if (i18 == 2) {
                Fade fadeH = enter.getData().h();
                if (fadeH != null) {
                    fE = fadeH.e();
                } else {
                    fE = 1.0f;
                }
            } else {
                if (i18 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Fade fadeH2 = exit.getData().h();
                if (fadeH2 != null) {
                    fE = fadeH2.e();
                } else {
                    fE = 1.0f;
                }
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            Float fValueOf = Float.valueOf(fE);
            EnterExitState enterExitStateO = transition.o();
            pVar.T(755689166);
            if (ComposerKt.g0()) {
                ComposerKt.w0(755689166, i17, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:848)");
            }
            int i19 = iArr[enterExitStateO.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    Fade fadeH3 = enter.getData().h();
                    if (fadeH3 != null) {
                        fE2 = fadeH3.e();
                    }
                } else {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Fade fadeH4 = exit.getData().h();
                    if (fadeH4 != null) {
                        fE2 = fadeH4.e();
                    }
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                i11 = -492369756;
                o2Var = null;
                m2VarM = androidx.compose.animation.core.TransitionKt.m(transition, fValueOf, Float.valueOf(fE2), qVar.invoke(transition.m(), pVar, Integer.valueOf((i16 >> 3) & 112)), f1VarE, str, pVar, (i16 & 14) | ((i16 << 9) & 57344) | ((i16 << 6) & 458752));
                pVar.c0();
                pVar.c0();
            }
            fE2 = 1.0f;
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            i11 = -492369756;
            o2Var = null;
            m2VarM = androidx.compose.animation.core.TransitionKt.m(transition, fValueOf, Float.valueOf(fE2), qVar.invoke(transition.m(), pVar, Integer.valueOf((i16 >> 3) & 112)), f1VarE, str, pVar, (i16 & 14) | ((i16 << 9) & 57344) | ((i16 << 6) & 458752));
            pVar.c0();
            pVar.c0();
        } else {
            i11 = -492369756;
            o2Var = null;
            m2VarM = f4009b;
        }
        final m2 m2Var = m2VarM;
        pVar.c0();
        if (l(a1Var2)) {
            pVar.T(1657241646);
            yh.q<Transition.b<EnterExitState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>> qVar2 = new yh.q<Transition.b<EnterExitState>, androidx.compose.runtime.p, Integer, androidx.compose.animation.core.f0<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @dl.d
                @androidx.compose.runtime.h
                public final androidx.compose.animation.core.f0<Float> a(@dl.d Transition.b<EnterExitState> animateFloat, @dl.e androidx.compose.runtime.p pVar2, int i20) {
                    androidx.compose.animation.core.f0<Float> f0VarF;
                    Scale scaleI;
                    f0.p(animateFloat, "$this$animateFloat");
                    pVar2.T(-53984035);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-53984035, i20, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:861)");
                    }
                    EnterExitState enterExitState = EnterExitState.PreEnter;
                    EnterExitState enterExitState2 = EnterExitState.Visible;
                    if (animateFloat.b(enterExitState, enterExitState2)) {
                        Scale scaleI2 = enter.getData().i();
                        if (scaleI2 == null || (f0VarF = scaleI2.f()) == null) {
                            f0VarF = EnterExitTransitionKt.f4010c;
                        }
                    } else if (!animateFloat.b(enterExitState2, EnterExitState.PostExit) || (scaleI = exit.getData().i()) == null || (f0VarF = scaleI.f()) == null) {
                        f0VarF = EnterExitTransitionKt.f4010c;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return f0VarF;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.f0<Float> invoke(Transition.b<EnterExitState> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            pVar.T(i11);
            Object objU4 = pVar.U();
            androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
            if (objU4 == companion.a()) {
                objU4 = label + " scale";
                pVar.N(objU4);
            }
            pVar.c0();
            String str2 = (String) objU4;
            int i20 = i12 | bb.c.b.f30966u4;
            pVar.T(-1338768149);
            f1<Float, androidx.compose.animation.core.l> f1VarE2 = VectorConvertersKt.e(y.f124996a);
            int i21 = i20 & 14;
            int i22 = i20 << 3;
            int i23 = (i22 & 57344) | i21 | (i22 & bb.c.b.f30796me) | (i22 & bb.c.g.f32954lc);
            pVar.T(-142660079);
            int i24 = (i23 >> 9) & 112;
            EnterExitState enterExitStateH2 = transition.h();
            pVar.T(-596129937);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-596129937, i24, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)");
            }
            int[] iArr2 = a.f4015a;
            int i25 = iArr2[enterExitStateH2.ordinal()];
            if (i25 == 1) {
                fG = 1.0f;
            } else if (i25 == 2) {
                Scale scaleI = enter.getData().i();
                if (scaleI != null) {
                    fG = scaleI.g();
                } else {
                    fG = 1.0f;
                }
            } else {
                if (i25 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scaleI2 = exit.getData().i();
                if (scaleI2 != null) {
                    fG = scaleI2.g();
                } else {
                    fG = 1.0f;
                }
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            Float fValueOf2 = Float.valueOf(fG);
            EnterExitState enterExitStateO2 = transition.o();
            pVar.T(-596129937);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-596129937, i24, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)");
            }
            int i26 = iArr2[enterExitStateO2.ordinal()];
            if (i26 != 1) {
                if (i26 == 2) {
                    Scale scaleI3 = enter.getData().i();
                    if (scaleI3 != null) {
                        fG2 = scaleI3.g();
                    }
                } else {
                    if (i26 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scaleI4 = exit.getData().i();
                    if (scaleI4 != null) {
                        fG2 = scaleI4.g();
                    }
                }
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            final m2 m2VarM2 = androidx.compose.animation.core.TransitionKt.m(transition, fValueOf2, Float.valueOf(fG2), qVar2.invoke(transition.m(), pVar, Integer.valueOf((i23 >> 3) & 112)), f1VarE2, str2, pVar, (i23 & 14) | ((i23 << 9) & 57344) | ((i23 << 6) & 458752));
            pVar.c0();
            pVar.c0();
            if (transition.h() == EnterExitState.PreEnter) {
                Scale scaleI5 = enter.getData().i();
                if (scaleI5 == null && (scaleI5 = exit.getData().i()) == null) {
                    o2VarB = o2Var;
                } else {
                    o2VarB = o2.b(scaleI5.h());
                }
            } else {
                Scale scaleI6 = exit.getData().i();
                if (scaleI6 == null && (scaleI6 = enter.getData().i()) == null) {
                    o2VarB = o2Var;
                } else {
                    o2VarB = o2.b(scaleI6.h());
                }
            }
            f1<o2, androidx.compose.animation.core.m> f1Var = f4008a;
            int i27 = i12 | bb.c.d.f31470pk;
            pVar.T(-142660079);
            EnterExitTransitionKt$createModifier$$inlined$animateValue$1 enterExitTransitionKt$createModifier$$inlined$animateValue$1 = new yh.q<Transition.b<EnterExitState>, androidx.compose.runtime.p, Integer, z0<o2>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1
                @dl.d
                @androidx.compose.runtime.h
                public final z0<o2> a(@dl.d Transition.b<EnterExitState> bVar, @dl.e androidx.compose.runtime.p pVar2, int i28) {
                    f0.p(bVar, "$this$null");
                    pVar2.T(-895531546);
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-895531546, i28, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:851)");
                    }
                    z0<o2> z0VarO = androidx.compose.animation.core.i.o(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar2.c0();
                    return z0VarO;
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ z0<o2> invoke(Transition.b<EnterExitState> bVar, androidx.compose.runtime.p pVar2, Integer num) {
                    return a(bVar, pVar2, num.intValue());
                }
            };
            int i28 = (i27 >> 9) & 112;
            EnterExitState enterExitStateH3 = transition.h();
            pVar.T(-288165413);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-288165413, i28, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:889)");
            }
            int i29 = iArr2[enterExitStateH3.ordinal()];
            if (i29 == 1) {
                o2VarB2 = o2VarB;
            } else if (i29 == 2) {
                Scale scaleI7 = enter.getData().i();
                if (scaleI7 == null && (scaleI7 = exit.getData().i()) == null) {
                    o2VarB2 = o2Var;
                } else {
                    o2VarB2 = o2.b(scaleI7.h());
                }
            } else {
                if (i29 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Scale scaleI8 = exit.getData().i();
                if (scaleI8 == null && (scaleI8 = enter.getData().i()) == null) {
                    o2VarB2 = o2Var;
                } else {
                    o2VarB2 = o2.b(scaleI8.h());
                }
            }
            long packedValue = o2VarB2 != null ? o2VarB2.getPackedValue() : o2.INSTANCE.a();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            o2 o2VarB3 = o2.b(packedValue);
            EnterExitState enterExitStateO3 = transition.o();
            pVar.T(-288165413);
            if (ComposerKt.g0()) {
                ComposerKt.w0(-288165413, i28, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:889)");
            }
            int i30 = iArr2[enterExitStateO3.ordinal()];
            if (i30 != 1) {
                if (i30 == 2) {
                    Scale scaleI9 = enter.getData().i();
                    if (scaleI9 == null && (scaleI9 = exit.getData().i()) == null) {
                        o2VarB = o2Var;
                    } else {
                        o2VarB = o2.b(scaleI9.h());
                    }
                } else {
                    if (i30 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Scale scaleI10 = exit.getData().i();
                    if (scaleI10 == null && (scaleI10 = enter.getData().i()) == null) {
                        o2VarB = o2Var;
                    } else {
                        o2VarB = o2.b(scaleI10.h());
                    }
                }
            }
            long packedValue2 = o2VarB != null ? o2VarB.getPackedValue() : o2.INSTANCE.a();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar.c0();
            final m2 m2VarM3 = androidx.compose.animation.core.TransitionKt.m(transition, o2VarB3, o2.b(packedValue2), enterExitTransitionKt$createModifier$$inlined$animateValue$1.invoke(transition.m(), pVar, Integer.valueOf((i27 >> 3) & 112)), f1Var, "TransformOriginInterruptionHandling", pVar, (i27 & 14) | ((i27 << 9) & 57344) | ((i27 << 6) & 458752));
            pVar.c0();
            pVar.T(1618982084);
            boolean zS3 = pVar.s(m2Var) | pVar.s(m2VarM2) | pVar.s(m2VarM3);
            Object objU5 = pVar.U();
            if (zS3 || objU5 == companion.a()) {
                objU5 = new yh.l<v0, b2>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d v0 graphicsLayer) {
                        f0.p(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.f(EnterExitTransitionKt.n(m2Var));
                        graphicsLayer.P(EnterExitTransitionKt.i(m2VarM2));
                        graphicsLayer.T(EnterExitTransitionKt.i(m2VarM2));
                        graphicsLayer.q0(EnterExitTransitionKt.j(m2VarM3));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(v0 v0Var) {
                        a(v0Var);
                        return b2.f124493a;
                    }
                };
                pVar.N(objU5);
            }
            pVar.c0();
            nVarC = GraphicsLayerModifierKt.a(nVarC, (yh.l) objU5);
            pVar.c0();
        } else if (h(a1Var)) {
            pVar.T(1657243735);
            pVar.T(1157296644);
            boolean zS4 = pVar.s(m2Var);
            Object objU6 = pVar.U();
            if (zS4 || objU6 == androidx.compose.runtime.p.INSTANCE.a()) {
                objU6 = new yh.l<v0, b2>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d v0 graphicsLayer) {
                        f0.p(graphicsLayer, "$this$graphicsLayer");
                        graphicsLayer.f(EnterExitTransitionKt.n(m2Var));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(v0 v0Var) {
                        a(v0Var);
                        return b2.f124493a;
                    }
                };
                pVar.N(objU6);
            }
            pVar.c0();
            nVarC = GraphicsLayerModifierKt.a(nVarC, (yh.l) objU6);
            pVar.c0();
        } else {
            pVar.T(1657243827);
            pVar.c0();
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarC;
    }

    private static final boolean h(a1<Boolean> a1Var) {
        return a1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(m2<o2> m2Var) {
        return m2Var.getValue().getPackedValue();
    }

    private static final void k(a1<Boolean> a1Var, boolean z10) {
        a1Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean l(a1<Boolean> a1Var) {
        return a1Var.getValue().booleanValue();
    }

    private static final void m(a1<Boolean> a1Var, boolean z10) {
        a1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    @j2
    @dl.d
    public static final f o(@dl.d androidx.compose.animation.core.f0<s1.r> animationSpec, @dl.d androidx.compose.ui.c.b expandFrom, boolean z10, @dl.d final yh.l<? super Integer, Integer> initialWidth) {
        f0.p(animationSpec, "animationSpec");
        f0.p(expandFrom, "expandFrom");
        f0.p(initialWidth, "initialWidth");
        return q(animationSpec, W(expandFrom), z10, new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.s.a(initialWidth.invoke(Integer.valueOf(s1.r.m(j10))).intValue(), s1.r.j(j10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                return s1.r.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ f p(androidx.compose.animation.core.f0 f0Var, androidx.compose.ui.c.b bVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.s();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                @dl.d
                public final Integer a(int i11) {
                    return 0;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return o(f0Var, bVar, z10, lVar);
    }

    @j2
    @dl.d
    public static final f q(@dl.d androidx.compose.animation.core.f0<s1.r> animationSpec, @dl.d androidx.compose.ui.c expandFrom, boolean z10, @dl.d yh.l<? super s1.r, s1.r> initialSize) {
        f0.p(animationSpec, "animationSpec");
        f0.p(expandFrom, "expandFrom");
        f0.p(initialSize, "initialSize");
        return new g(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ f r(androidx.compose.animation.core.f0 f0Var, androidx.compose.ui.c cVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.e();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                public final long a(long j10) {
                    return s1.s.a(0, 0);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                    return s1.r.b(a(rVar.getF139248a()));
                }
            };
        }
        return q(f0Var, cVar, z10, lVar);
    }

    @j2
    @dl.d
    public static final f s(@dl.d androidx.compose.animation.core.f0<s1.r> animationSpec, @dl.d androidx.compose.ui.c.InterfaceC0079c expandFrom, boolean z10, @dl.d final yh.l<? super Integer, Integer> initialHeight) {
        f0.p(animationSpec, "animationSpec");
        f0.p(expandFrom, "expandFrom");
        f0.p(initialHeight, "initialHeight");
        return q(animationSpec, X(expandFrom), z10, new yh.l<s1.r, s1.r>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final long a(long j10) {
                return s1.s.a(s1.r.m(j10), initialHeight.invoke(Integer.valueOf(s1.r.j(j10))).intValue());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ s1.r invoke(s1.r rVar) {
                return s1.r.b(a(rVar.getF139248a()));
            }
        });
    }

    public static /* synthetic */ f t(androidx.compose.animation.core.f0 f0Var, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.r.b(x1.g(s1.r.f139246b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0079c = androidx.compose.ui.c.INSTANCE.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                @dl.d
                public final Integer a(int i11) {
                    return 0;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return a(num.intValue());
                }
            };
        }
        return s(f0Var, interfaceC0079c, z10, lVar);
    }

    @j2
    @dl.d
    public static final f u(@dl.d androidx.compose.animation.core.f0<Float> animationSpec, float f10) {
        f0.p(animationSpec, "animationSpec");
        return new g(new TransitionData(new Fade(f10, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ f v(androidx.compose.animation.core.f0 f0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return u(f0Var, f10);
    }

    @j2
    @dl.d
    public static final h w(@dl.d androidx.compose.animation.core.f0<Float> animationSpec, float f10) {
        f0.p(animationSpec, "animationSpec");
        return new i(new TransitionData(new Fade(f10, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ h x(androidx.compose.animation.core.f0 f0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return w(f0Var, f10);
    }

    @j
    @j2
    @dl.d
    public static final f y(@dl.d androidx.compose.animation.core.f0<Float> animationSpec, float f10, long j10) {
        f0.p(animationSpec, "animationSpec");
        return new g(new TransitionData(null, null, null, new Scale(f10, j10, animationSpec, null), 7, null));
    }

    public static /* synthetic */ f z(androidx.compose.animation.core.f0 f0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = androidx.compose.animation.core.i.o(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = o2.INSTANCE.a();
        }
        return y(f0Var, f10, j10);
    }
}
