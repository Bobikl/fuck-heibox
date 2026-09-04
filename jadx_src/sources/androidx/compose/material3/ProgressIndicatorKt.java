package androidx.compose.material3;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\u0007*\u00020\f2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u001d\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010\u001f\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001e\u001aA\u0010 \u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\"\u001d\u0010%\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$\"\u001d\u0010'\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b&\u0010$\"\u001d\u0010)\u001a\u00020\u00148\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010$\"\u0014\u0010,\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010+\"\u0014\u0010.\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u00100\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00102\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00104\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010+\"\u0014\u00106\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010+\"\u0014\u00108\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010+\"\u0014\u0010:\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010+\"\u0014\u0010<\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010+\"\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010A\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010?\"\u0014\u0010B\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010?\"\u0014\u0010C\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010?\"\u0014\u0010D\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010+\"\u0014\u0010E\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010+\"\u0014\u0010F\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"\"\u0014\u0010G\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010H\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010J\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010\"\"\u0014\u0010L\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010+\"\u0014\u0010N\u001a\u00020*8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010+\"\u0014\u0010P\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Q"}, d2 = {"", "progress", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/l0;", "color", "trackColor", "Lkotlin/b2;", "d", "(FLandroidx/compose/ui/n;JJLandroidx/compose/runtime/p;II)V", ak.aF, "(Landroidx/compose/ui/n;JJLandroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/graphics/drawscope/g;", "startFraction", "endFraction", "strokeWidth", "q", "(Landroidx/compose/ui/graphics/drawscope/g;FFJF)V", "r", "(Landroidx/compose/ui/graphics/drawscope/g;JF)V", "Ls1/h;", ak.av, "(FLandroidx/compose/ui/n;JFLandroidx/compose/runtime/p;II)V", "b", "(Landroidx/compose/ui/n;JFLandroidx/compose/runtime/p;II)V", "startAngle", "sweep", "Landroidx/compose/ui/graphics/drawscope/p;", "stroke", "n", "(Landroidx/compose/ui/graphics/drawscope/g;FFJLandroidx/compose/ui/graphics/drawscope/p;)V", "o", "p", "(Landroidx/compose/ui/graphics/drawscope/g;FFFJLandroidx/compose/ui/graphics/drawscope/p;)V", "F", ak.aG, "()F", "LinearIndicatorWidth", "t", "LinearIndicatorHeight", ak.aB, "CircularIndicatorDiameter", "", "I", "LinearAnimationDuration", "e", "FirstLineHeadDuration", "f", "FirstLineTailDuration", "g", "SecondLineHeadDuration", RXScreenCaptureService.KEY_HEIGHT, "SecondLineTailDuration", "i", "FirstLineHeadDelay", "j", "FirstLineTailDelay", "k", "SecondLineHeadDelay", "l", "SecondLineTailDelay", "Landroidx/compose/animation/core/v;", "m", "Landroidx/compose/animation/core/v;", "FirstLineHeadEasing", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "RotationsPerCycle", "RotationDuration", "StartAngleOffset", "BaseRotationAngle", "JumpRotationAngle", "v", "RotationAngleOffset", RXScreenCaptureService.KEY_WIDTH, "HeadAndTailAnimationDuration", "x", "HeadAndTailDelayDuration", "y", "CircularEasing", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class ProgressIndicatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f10304a = s1.h.g(240);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f10305b = t0.b0.f139485a.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f10306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f10307d = 1800;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f10308e = 750;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f10309f = 850;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f10310g = 567;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f10311h = 533;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f10312i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f10313j = 333;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f10314k = 1000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f10315l = 1267;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.v f10316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.v f10317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.v f10318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.v f10319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f10320q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f10321r = 1332;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f10322s = -90.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f10323t = 286.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f10324u = 290.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f10325v = 216.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f10326w = 666;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f10327x = 666;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.v f10328y;

    static {
        t0.e eVar = t0.e.f139649a;
        f10306c = s1.h.g(eVar.h() - s1.h.g(eVar.b() * 2));
        f10316m = new androidx.compose.animation.core.v(0.2f, 0.0f, 0.8f, 1.0f);
        f10317n = new androidx.compose.animation.core.v(0.4f, 0.0f, 1.0f, 1.0f);
        f10318o = new androidx.compose.animation.core.v(0.0f, 0.0f, 0.65f, 1.0f);
        f10319p = new androidx.compose.animation.core.v(0.1f, 0.0f, 0.45f, 1.0f);
        f10328y = new androidx.compose.animation.core.v(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(final float f10, @dl.e androidx.compose.ui.n nVar, long j10, float f11, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        long j11;
        int i13;
        float f12;
        int i14;
        androidx.compose.ui.n nVar3;
        long jA;
        androidx.compose.ui.n nVar4;
        float fB;
        final long j12;
        final androidx.compose.ui.n nVar5;
        final long j13;
        final float f13;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(402841196);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.w(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                if ((i11 & 4) == 0) {
                    j11 = j10;
                    int i16 = pVarF.z(j11) ? 256 : 128;
                    i12 |= i16;
                } else {
                    j11 = j10;
                }
                i12 |= i16;
            } else {
                j11 = j10;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    f12 = f11;
                    if (pVarF.w(f12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & bb.c.f.br) == 1170 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i15 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if ((i11 & 4) != 0) {
                            jA = a1.f11753a.a(pVarF, 6);
                        } else {
                            jA = j11;
                        }
                        if (i13 != 0) {
                            nVar4 = nVar3;
                            j12 = jA;
                            fB = a1.f11753a.b();
                        } else {
                            nVar4 = nVar3;
                            fB = f12;
                            j12 = jA;
                        }
                    } else {
                        pVarF.l();
                        nVar4 = nVar2;
                        fB = f12;
                        j12 = j11;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
                    }
                    final Stroke stroke = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
                    CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                            a(gVar);
                            return kotlin.b2.f124493a;
                        }
                    }, pVarF, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar4;
                    j13 = j12;
                    f13 = fB;
                } else {
                    pVarF.l();
                    nVar5 = nVar2;
                    j13 = j11;
                    f13 = f12;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                        ProgressIndicatorKt.a(f10, nVar5, j13, f13, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            f12 = f11;
            if ((i12 & bb.c.f.br) == 1170) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
                }
                final Stroke stroke2 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
                CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke2);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                }, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j13 = j12;
                f13 = fB;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
                }
                final Stroke stroke3 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
                CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke3);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                }, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j13 = j12;
                f13 = fB;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                    ProgressIndicatorKt.a(f10, nVar5, j13, f13, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                if (pVarF.z(j11)) {
                }
                i12 |= i16;
            } else {
                j11 = j10;
            }
            i12 |= i16;
        } else {
            j11 = j10;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                f12 = f11;
                if (pVarF.w(f12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & bb.c.f.br) == 1170) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
                }
                final Stroke stroke4 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
                CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke4);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                }, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j13 = j12;
                f13 = fB;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 4) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i13 != 0) {
                        nVar4 = nVar3;
                        j12 = jA;
                        fB = a1.f11753a.b();
                    } else {
                        nVar4 = nVar3;
                        fB = f12;
                        j12 = jA;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
                }
                final Stroke stroke5 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
                CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke5);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                }, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar4;
                j13 = j12;
                f13 = fB;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                    ProgressIndicatorKt.a(f10, nVar5, j13, f13, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        f12 = f11;
        if ((i12 & bb.c.f.br) == 1170) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    nVar4 = nVar3;
                    j12 = jA;
                    fB = a1.f11753a.b();
                } else {
                    nVar4 = nVar3;
                    fB = f12;
                    j12 = jA;
                }
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    nVar4 = nVar3;
                    j12 = jA;
                    fB = a1.f11753a.b();
                } else {
                    nVar4 = nVar3;
                    fB = f12;
                    j12 = jA;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
            }
            final Stroke stroke6 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
            CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                    kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke6);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                    a(gVar);
                    return kotlin.b2.f124493a;
                }
            }, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            j13 = j12;
            f13 = fB;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    nVar4 = nVar3;
                    j12 = jA;
                    fB = a1.f11753a.b();
                } else {
                    nVar4 = nVar3;
                    fB = f12;
                    j12 = jA;
                }
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 4) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i13 != 0) {
                    nVar4 = nVar3;
                    j12 = jA;
                    fB = a1.f11753a.b();
                } else {
                    nVar4 = nVar3;
                    fB = f12;
                    j12 = jA;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(402841196, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:226)");
            }
            final Stroke stroke7 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.a(), 0, null, 26, null);
            CanvasKt.b(SizeKt.C(ProgressSemanticsKt.c(nVar4, f10, null, 0, 6, null), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                    kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.o(Canvas, 270.0f, f10 * 360.0f, j12, stroke7);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                    a(gVar);
                    return kotlin.b2.f124493a;
                }
            }, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar4;
            j13 = j12;
            f13 = fB;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i17) {
                ProgressIndicatorKt.a(f10, nVar5, j13, f13, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x019d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.e androidx.compose.ui.n nVar, long j10, float f10, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        long j11;
        float f11;
        androidx.compose.ui.n nVar3;
        long jA;
        long j12;
        final float fB;
        androidx.compose.runtime.u1 u1VarH;
        androidx.compose.runtime.p pVarF = pVar.F(947193756);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                j11 = j10;
                int i14 = pVarF.z(j11) ? 32 : 16;
                i12 |= i14;
            } else {
                j11 = j10;
            }
            i12 |= i14;
        } else {
            j11 = j10;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                f11 = f10;
                i12 |= pVarF.w(f11) ? 256 : 128;
            }
            if ((i12 & bb.c.b.f30586db) == 146 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i13 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = a1.f11753a.a(pVarF, 6);
                    } else {
                        jA = j11;
                    }
                    if (i15 != 0) {
                        fB = a1.f11753a.b();
                        j12 = jA;
                    } else {
                        j12 = jA;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(947193756, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:261)");
                    }
                    final Stroke stroke = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.c(), 0, null, 26, null);
                    InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c(pVarF, 0);
                    androidx.compose.animation.core.f1<Integer, androidx.compose.animation.core.l> f1VarF = VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a);
                    androidx.compose.animation.core.n0 n0VarF = androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(bb.c.g.f33184x2, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null);
                    int i16 = InfiniteTransition.f4159e;
                    int i17 = i16 | bb.c.f.E1;
                    int i18 = androidx.compose.animation.core.n0.f4468d;
                    final m2 m2VarB = InfiniteTransitionKt.b(infiniteTransitionC, 0, 5, f1VarF, n0VarF, pVarF, i17 | (i18 << 12));
                    final m2<Float> m2VarA = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, f10323t, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(1332, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null), pVarF, i16 | bb.c.b.f30879q5 | (i18 << 9));
                    final m2<Float> m2VarA2 = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                        public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                            kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                            keyframes.g(bb.c.b.Gm);
                            keyframes.h(keyframes.a(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f10328y);
                            keyframes.a(Float.valueOf(290.0f), bb.c.b.Q9);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                            a(bVar);
                            return kotlin.b2.f124493a;
                        }
                    }), null, 0L, 6, null), pVarF, i16 | bb.c.b.f30879q5 | (i18 << 9));
                    final m2<Float> m2VarA3 = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                        public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                            kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                            keyframes.g(bb.c.b.Gm);
                            keyframes.h(keyframes.a(Float.valueOf(0.0f), bb.c.b.Q9), ProgressIndicatorKt.f10328y);
                            keyframes.a(Float.valueOf(290.0f), keyframes.getDurationMillis());
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                            a(bVar);
                            return kotlin.b2.f124493a;
                        }
                    }), null, 0L, 6, null), pVarF, i16 | bb.c.b.f30879q5 | (i18 << 9));
                    final float f12 = fB;
                    final long j13 = j12;
                    CanvasKt.b(SizeKt.C(ProgressSemanticsKt.a(nVar3), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            ProgressIndicatorKt.p(Canvas, m2VarA3.getValue().floatValue() + (((m2VarB.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + m2VarA.getValue().floatValue(), f12, Math.abs(m2VarA2.getValue().floatValue() - m2VarA3.getValue().floatValue()), j13, stroke);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                            a(gVar);
                            return kotlin.b2.f124493a;
                        }
                    }, pVarF, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                } else {
                    pVarF.l();
                    nVar3 = nVar2;
                    j12 = j11;
                }
                fB = f11;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(947193756, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:261)");
                }
                final Stroke stroke2 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.c(), 0, null, 26, null);
                InfiniteTransition infiniteTransitionC2 = InfiniteTransitionKt.c(pVarF, 0);
                androidx.compose.animation.core.f1<Integer, androidx.compose.animation.core.l> f1VarF2 = VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a);
                androidx.compose.animation.core.n0 n0VarF2 = androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(bb.c.g.f33184x2, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null);
                int i19 = InfiniteTransition.f4159e;
                int i110 = i19 | bb.c.f.E1;
                int i111 = androidx.compose.animation.core.n0.f4468d;
                final m2<Integer> m2VarB2 = InfiniteTransitionKt.b(infiniteTransitionC2, 0, 5, f1VarF2, n0VarF2, pVarF, i110 | (i111 << 12));
                final m2<Float> m2VarA4 = InfiniteTransitionKt.a(infiniteTransitionC2, 0.0f, f10323t, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(1332, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null), pVarF, i19 | bb.c.b.f30879q5 | (i111 << 9));
                final m2<Float> m2VarA5 = InfiniteTransitionKt.a(infiniteTransitionC2, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                        kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                        keyframes.g(bb.c.b.Gm);
                        keyframes.h(keyframes.a(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f10328y);
                        keyframes.a(Float.valueOf(290.0f), bb.c.b.Q9);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                        a(bVar);
                        return kotlin.b2.f124493a;
                    }
                }), null, 0L, 6, null), pVarF, i19 | bb.c.b.f30879q5 | (i111 << 9));
                final m2<Float> m2VarA6 = InfiniteTransitionKt.a(infiniteTransitionC2, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                        kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                        keyframes.g(bb.c.b.Gm);
                        keyframes.h(keyframes.a(Float.valueOf(0.0f), bb.c.b.Q9), ProgressIndicatorKt.f10328y);
                        keyframes.a(Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                        a(bVar);
                        return kotlin.b2.f124493a;
                    }
                }), null, 0L, 6, null), pVarF, i19 | bb.c.b.f30879q5 | (i111 << 9));
                final float f13 = fB;
                final long j14 = j12;
                CanvasKt.b(SizeKt.C(ProgressSemanticsKt.a(nVar3), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        ProgressIndicatorKt.p(Canvas, m2VarA6.getValue().floatValue() + (((m2VarB2.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + m2VarA4.getValue().floatValue(), f13, Math.abs(m2VarA5.getValue().floatValue() - m2VarA6.getValue().floatValue()), j14, stroke2);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                }, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            } else {
                pVarF.l();
                nVar3 = nVar2;
                j12 = j11;
                fB = f11;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar4 = nVar3;
            final long j15 = j12;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                    ProgressIndicatorKt.b(nVar4, j15, fB, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        f11 = f10;
        if ((i12 & bb.c.b.f30586db) == 146) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i15 != 0) {
                    fB = a1.f11753a.b();
                    j12 = jA;
                } else {
                    j12 = jA;
                    fB = f11;
                }
            } else {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i15 != 0) {
                    fB = a1.f11753a.b();
                    j12 = jA;
                } else {
                    j12 = jA;
                    fB = f11;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(947193756, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:261)");
            }
            final Stroke stroke3 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.c(), 0, null, 26, null);
            InfiniteTransition infiniteTransitionC3 = InfiniteTransitionKt.c(pVarF, 0);
            androidx.compose.animation.core.f1<Integer, androidx.compose.animation.core.l> f1VarF3 = VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a);
            androidx.compose.animation.core.n0 n0VarF3 = androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(bb.c.g.f33184x2, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null);
            int i112 = InfiniteTransition.f4159e;
            int i113 = i112 | bb.c.f.E1;
            int i114 = androidx.compose.animation.core.n0.f4468d;
            final m2<Integer> m2VarB3 = InfiniteTransitionKt.b(infiniteTransitionC3, 0, 5, f1VarF3, n0VarF3, pVarF, i113 | (i114 << 12));
            final m2<Float> m2VarA7 = InfiniteTransitionKt.a(infiniteTransitionC3, 0.0f, f10323t, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(1332, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null), pVarF, i112 | bb.c.b.f30879q5 | (i114 << 9));
            final m2<Float> m2VarA8 = InfiniteTransitionKt.a(infiniteTransitionC3, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Gm);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f10328y);
                    keyframes.a(Float.valueOf(290.0f), bb.c.b.Q9);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i112 | bb.c.b.f30879q5 | (i114 << 9));
            final m2<Float> m2VarA9 = InfiniteTransitionKt.a(infiniteTransitionC3, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Gm);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), bb.c.b.Q9), ProgressIndicatorKt.f10328y);
                    keyframes.a(Float.valueOf(290.0f), keyframes.getDurationMillis());
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i112 | bb.c.b.f30879q5 | (i114 << 9));
            final float f14 = fB;
            final long j16 = j12;
            CanvasKt.b(SizeKt.C(ProgressSemanticsKt.a(nVar3), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                    kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.p(Canvas, m2VarA9.getValue().floatValue() + (((m2VarB3.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + m2VarA7.getValue().floatValue(), f14, Math.abs(m2VarA8.getValue().floatValue() - m2VarA9.getValue().floatValue()), j16, stroke3);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                    a(gVar);
                    return kotlin.b2.f124493a;
                }
            }, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i15 != 0) {
                    fB = a1.f11753a.b();
                    j12 = jA;
                } else {
                    j12 = jA;
                    fB = f11;
                }
            } else {
                if (i13 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = a1.f11753a.a(pVarF, 6);
                } else {
                    jA = j11;
                }
                if (i15 != 0) {
                    fB = a1.f11753a.b();
                    j12 = jA;
                } else {
                    j12 = jA;
                    fB = f11;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(947193756, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:261)");
            }
            final Stroke stroke4 = new Stroke(((s1.e) pVarF.K(CompositionLocalsKt.i())).E1(fB), 0.0f, j2.INSTANCE.c(), 0, null, 26, null);
            InfiniteTransition infiniteTransitionC4 = InfiniteTransitionKt.c(pVarF, 0);
            androidx.compose.animation.core.f1<Integer, androidx.compose.animation.core.l> f1VarF4 = VectorConvertersKt.f(kotlin.jvm.internal.d0.f124911a);
            androidx.compose.animation.core.n0 n0VarF4 = androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(bb.c.g.f33184x2, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null);
            int i115 = InfiniteTransition.f4159e;
            int i116 = i115 | bb.c.f.E1;
            int i117 = androidx.compose.animation.core.n0.f4468d;
            final m2<Integer> m2VarB4 = InfiniteTransitionKt.b(infiniteTransitionC4, 0, 5, f1VarF4, n0VarF4, pVarF, i116 | (i117 << 12));
            final m2<Float> m2VarA10 = InfiniteTransitionKt.a(infiniteTransitionC4, 0.0f, f10323t, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.q(1332, 0, androidx.compose.animation.core.d0.c(), 2, null), null, 0L, 6, null), pVarF, i115 | bb.c.b.f30879q5 | (i117 << 9));
            final m2<Float> m2VarA11 = InfiniteTransitionKt.a(infiniteTransitionC4, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Gm);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f10328y);
                    keyframes.a(Float.valueOf(290.0f), bb.c.b.Q9);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i115 | bb.c.b.f30879q5 | (i117 << 9));
            final m2<Float> m2VarA12 = InfiniteTransitionKt.a(infiniteTransitionC4, 0.0f, f10324u, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Gm);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), bb.c.b.Q9), ProgressIndicatorKt.f10328y);
                    keyframes.a(Float.valueOf(290.0f), keyframes.getDurationMillis());
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i115 | bb.c.b.f30879q5 | (i117 << 9));
            final float f15 = fB;
            final long j17 = j12;
            CanvasKt.b(SizeKt.C(ProgressSemanticsKt.a(nVar3), f10306c), new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                    kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.p(Canvas, m2VarA12.getValue().floatValue() + (((m2VarB4.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + m2VarA10.getValue().floatValue(), f15, Math.abs(m2VarA11.getValue().floatValue() - m2VarA12.getValue().floatValue()), j17, stroke4);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                    a(gVar);
                    return kotlin.b2.f124493a;
                }
            }, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar5 = nVar3;
        final long j18 = j12;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                ProgressIndicatorKt.b(nVar5, j18, fB, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void c(@dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        long jC;
        long jD;
        androidx.compose.ui.n nVar3;
        androidx.compose.runtime.p pVarF = pVar.F(585576195);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                jC = j10;
                int i14 = pVarF.z(jC) ? 32 : 16;
                i12 |= i14;
            } else {
                jC = j10;
            }
            i12 |= i14;
        } else {
            jC = j10;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            if ((i11 & 4) == 0) {
                jD = j11;
                int i15 = pVarF.z(jD) ? 256 : 128;
                i12 |= i15;
            } else {
                jD = j11;
            }
            i12 |= i15;
        } else {
            jD = j11;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
            nVar3 = nVar2;
        } else {
            pVarF.W();
            if ((i10 & 1) == 0 || pVarF.o()) {
                nVar3 = i13 != 0 ? androidx.compose.ui.n.INSTANCE : nVar2;
                if ((i11 & 2) != 0) {
                    jC = a1.f11753a.c(pVarF, 6);
                }
                if ((i11 & 4) != 0) {
                    jD = a1.f11753a.d(pVarF, 6);
                }
            } else {
                pVarF.l();
                nVar3 = nVar2;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(585576195, i10, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:103)");
            }
            InfiniteTransition infiniteTransitionC = InfiniteTransitionKt.c(pVarF, 0);
            androidx.compose.animation.core.n0 n0VarF = androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Hv);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), 0), ProgressIndicatorKt.f10316m);
                    keyframes.a(Float.valueOf(1.0f), bb.c.b.f31017wb);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null);
            int i16 = InfiniteTransition.f4159e;
            int i17 = i16 | bb.c.b.f30879q5;
            int i18 = androidx.compose.animation.core.n0.f4468d;
            final m2<Float> m2VarA = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, 1.0f, n0VarF, pVarF, i17 | (i18 << 9));
            final m2<Float> m2VarA2 = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, 1.0f, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Hv);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), bb.c.b.f30987v3), ProgressIndicatorKt.f10317n);
                    keyframes.a(Float.valueOf(1.0f), bb.c.b.Nj);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i16 | bb.c.b.f30879q5 | (i18 << 9));
            final m2<Float> m2VarA3 = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, 1.0f, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Hv);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.f10318o);
                    keyframes.a(Float.valueOf(1.0f), bb.c.b.hr);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i16 | bb.c.b.f30879q5 | (i18 << 9));
            final m2<Float> m2VarA4 = InfiniteTransitionKt.a(infiniteTransitionC, 0.0f, 1.0f, androidx.compose.animation.core.i.f(androidx.compose.animation.core.i.g(new yh.l<androidx.compose.animation.core.p0.b<Float>, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                public final void a(@dl.d androidx.compose.animation.core.p0.b<Float> keyframes) {
                    kotlin.jvm.internal.f0.p(keyframes, "$this$keyframes");
                    keyframes.g(bb.c.b.Hv);
                    keyframes.h(keyframes.a(Float.valueOf(0.0f), bb.c.b.tl), ProgressIndicatorKt.f10319p);
                    keyframes.a(Float.valueOf(1.0f), bb.c.b.Hv);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.animation.core.p0.b<Float> bVar) {
                    a(bVar);
                    return kotlin.b2.f124493a;
                }
            }), null, 0L, 6, null), pVarF, i16 | bb.c.b.f30879q5 | (i18 << 9));
            androidx.compose.ui.n nVarE = SizeKt.E(ProgressSemanticsKt.a(nVar3), f10304a, f10305b);
            Object[] objArr = {androidx.compose.ui.graphics.l0.n(jD), m2VarA, m2VarA2, androidx.compose.ui.graphics.l0.n(jC), m2VarA3, m2VarA4};
            pVarF.T(-568225417);
            boolean zS = false;
            for (int i19 = 0; i19 < 6; i19++) {
                zS |= pVarF.s(objArr[i19]);
            }
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                final long j12 = jD;
                final long j13 = jC;
                objU = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fM = b1.m.m(Canvas.c());
                        ProgressIndicatorKt.r(Canvas, j12, fM);
                        if (m2VarA.getValue().floatValue() - m2VarA2.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.q(Canvas, m2VarA.getValue().floatValue(), m2VarA2.getValue().floatValue(), j13, fM);
                        }
                        if (m2VarA3.getValue().floatValue() - m2VarA4.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.q(Canvas, m2VarA3.getValue().floatValue(), m2VarA4.getValue().floatValue(), j13, fM);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            CanvasKt.b(nVarE, (yh.l) objU, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final long j14 = jD;
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar4 = nVar3;
        final long j15 = jC;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i20) {
                ProgressIndicatorKt.c(nVar4, j15, j14, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void d(final float f10, @dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        long jC;
        long jD;
        androidx.compose.ui.n nVar2;
        boolean zS;
        Object objU;
        final long j12;
        androidx.compose.runtime.u1 u1VarH;
        int i13;
        int i14;
        androidx.compose.runtime.p pVarF = pVar.F(-372717133);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.w(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i10 & bb.c.b.f30796me) == 0) {
                jC = j10;
                if ((i11 & 4) == 0 || !pVarF.z(jC)) {
                    i14 = 128;
                } else {
                    i14 = 256;
                }
                i12 |= i14;
            } else {
                jC = j10;
            }
            if ((i10 & bb.c.g.f32954lc) == 0) {
                jD = j11;
                if ((i11 & 8) == 0 || !pVarF.z(jD)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                jD = j11;
            }
            if ((i12 & bb.c.f.br) == 1170 || !pVarF.b()) {
                pVarF.W();
                if ((i10 & 1) != 0 || pVarF.o()) {
                    if (i15 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i11 & 4) != 0) {
                        jC = a1.f11753a.c(pVarF, 6);
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jD = a1.f11753a.d(pVarF, 6);
                    }
                } else {
                    pVarF.l();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    nVar2 = nVar;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:71)");
                }
                androidx.compose.ui.n nVarE = SizeKt.E(ProgressSemanticsKt.c(nVar2, f10, null, 0, 6, null), f10304a, f10305b);
                androidx.compose.ui.graphics.l0 l0VarN = androidx.compose.ui.graphics.l0.n(jD);
                Float fValueOf = Float.valueOf(f10);
                androidx.compose.ui.graphics.l0 l0VarN2 = androidx.compose.ui.graphics.l0.n(jC);
                pVarF.T(1618982084);
                zS = pVarF.s(l0VarN) | pVarF.s(fValueOf) | pVarF.s(l0VarN2);
                objU = pVarF.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    final long j13 = jD;
                    final long j14 = jC;
                    objU = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                            kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                            float fM = b1.m.m(Canvas.c());
                            ProgressIndicatorKt.r(Canvas, j13, fM);
                            ProgressIndicatorKt.q(Canvas, 0.0f, f10, j14, fM);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                            a(gVar);
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU);
                }
                pVarF.c0();
                CanvasKt.b(nVarE, (yh.l) objU, pVarF, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            } else {
                pVarF.l();
                nVar2 = nVar;
            }
            j12 = jD;
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar3 = nVar2;
            final long j15 = jC;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                    ProgressIndicatorKt.d(f10, nVar3, j15, j12, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 48;
        if ((i10 & bb.c.b.f30796me) == 0) {
            jC = j10;
            if ((i11 & 4) == 0) {
                i14 = 128;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            jC = j10;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            jD = j11;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            jD = j11;
        }
        if ((i12 & bb.c.f.br) == 1170) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    jC = a1.f11753a.c(pVarF, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = a1.f11753a.d(pVarF, 6);
                }
            } else {
                if (i15 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    jC = a1.f11753a.c(pVarF, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = a1.f11753a.d(pVarF, 6);
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:71)");
            }
            androidx.compose.ui.n nVarE2 = SizeKt.E(ProgressSemanticsKt.c(nVar2, f10, null, 0, 6, null), f10304a, f10305b);
            androidx.compose.ui.graphics.l0 l0VarN3 = androidx.compose.ui.graphics.l0.n(jD);
            Float fValueOf2 = Float.valueOf(f10);
            androidx.compose.ui.graphics.l0 l0VarN4 = androidx.compose.ui.graphics.l0.n(jC);
            pVarF.T(1618982084);
            zS = pVarF.s(l0VarN3) | pVarF.s(fValueOf2) | pVarF.s(l0VarN4);
            objU = pVarF.U();
            if (zS) {
                final long j16 = jD;
                final long j17 = jC;
                objU = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fM = b1.m.m(Canvas.c());
                        ProgressIndicatorKt.r(Canvas, j16, fM);
                        ProgressIndicatorKt.q(Canvas, 0.0f, f10, j17, fM);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            } else {
                final long j18 = jD;
                final long j19 = jC;
                objU = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fM = b1.m.m(Canvas.c());
                        ProgressIndicatorKt.r(Canvas, j18, fM);
                        ProgressIndicatorKt.q(Canvas, 0.0f, f10, j19, fM);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            CanvasKt.b(nVarE2, (yh.l) objU, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    jC = a1.f11753a.c(pVarF, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = a1.f11753a.d(pVarF, 6);
                }
            } else {
                if (i15 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i11 & 4) != 0) {
                    jC = a1.f11753a.c(pVarF, 6);
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jD = a1.f11753a.d(pVarF, 6);
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:71)");
            }
            androidx.compose.ui.n nVarE3 = SizeKt.E(ProgressSemanticsKt.c(nVar2, f10, null, 0, 6, null), f10304a, f10305b);
            androidx.compose.ui.graphics.l0 l0VarN5 = androidx.compose.ui.graphics.l0.n(jD);
            Float fValueOf3 = Float.valueOf(f10);
            androidx.compose.ui.graphics.l0 l0VarN6 = androidx.compose.ui.graphics.l0.n(jC);
            pVarF.T(1618982084);
            zS = pVarF.s(l0VarN5) | pVarF.s(fValueOf3) | pVarF.s(l0VarN6);
            objU = pVarF.U();
            if (zS) {
                final long j110 = jD;
                final long j111 = jC;
                objU = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fM = b1.m.m(Canvas.c());
                        ProgressIndicatorKt.r(Canvas, j110, fM);
                        ProgressIndicatorKt.q(Canvas, 0.0f, f10, j111, fM);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            } else {
                final long j112 = jD;
                final long j113 = jC;
                objU = new yh.l<androidx.compose.ui.graphics.drawscope.g, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.graphics.drawscope.g Canvas) {
                        kotlin.jvm.internal.f0.p(Canvas, "$this$Canvas");
                        float fM = b1.m.m(Canvas.c());
                        ProgressIndicatorKt.r(Canvas, j112, fM);
                        ProgressIndicatorKt.q(Canvas, 0.0f, f10, j113, fM);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
                        a(gVar);
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU);
            }
            pVarF.c0();
            CanvasKt.b(nVarE3, (yh.l) objU, pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        j12 = jD;
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar4 = nVar2;
        final long j114 = jC;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                ProgressIndicatorKt.d(f10, nVar4, j114, j12, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    private static final void n(androidx.compose.ui.graphics.drawscope.g gVar, float f10, float f11, long j10, Stroke stroke) {
        float f12 = 2;
        float width = stroke.getWidth() / f12;
        float fT = b1.m.t(gVar.c()) - (f12 * width);
        androidx.compose.ui.graphics.drawscope.f.v(gVar, j10, f10, f11, false, b1.g.a(width, width), b1.n.a(fT, fT), 0.0f, stroke, null, 0, bb.c.b.f30518ad, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.compose.ui.graphics.drawscope.g gVar, float f10, float f11, long j10, Stroke stroke) {
        n(gVar, f10, f11, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(androidx.compose.ui.graphics.drawscope.g gVar, float f10, float f11, float f12, long j10, Stroke stroke) {
        n(gVar, f10 + (((f11 / s1.h.g(f10306c / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(androidx.compose.ui.graphics.drawscope.g gVar, float f10, float f11, long j10, float f12) {
        float fT = b1.m.t(gVar.c());
        float fM = b1.m.m(gVar.c()) / 2;
        boolean z10 = gVar.getLayoutDirection() == LayoutDirection.Ltr;
        androidx.compose.ui.graphics.drawscope.f.C(gVar, j10, b1.g.a((z10 ? f10 : 1.0f - f11) * fT, fM), b1.g.a((z10 ? f11 : 1.0f - f10) * fT, fM), f12, 0, null, 0.0f, null, 0, bb.c.b.C6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(androidx.compose.ui.graphics.drawscope.g gVar, long j10, float f10) {
        q(gVar, 0.0f, 1.0f, j10, f10);
    }

    public static final float s() {
        return f10306c;
    }

    public static final float t() {
        return f10305b;
    }

    public static final float u() {
        return f10304a;
    }
}
