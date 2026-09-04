package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b1;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.y0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\f\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0000\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000e\"\u001d\u0010\u0013\u001a\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lb1/f;", "handlePosition", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(JLandroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;I)V", "b", "(Landroidx/compose/ui/n;Landroidx/compose/runtime/p;I)V", ak.aF, "", "F", "Sqrt2", "Ls1/h;", "d", "()F", "CursorHandleHeight", "e", "CursorHandleWidth", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidCursorHandle_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f7562a = 1.4142135f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f7563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f7564c;

    static {
        float fG = s1.h.g(25);
        f7563b = fG;
        f7564c = s1.h.g(s1.h.g(fG * 2.0f) / 2.4142137f);
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(final long j10, @dl.d final androidx.compose.ui.n modifier, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar, @dl.e androidx.compose.runtime.p pVar2, final int i10) {
        final int i11;
        f0.p(modifier, "modifier");
        androidx.compose.runtime.p pVarF = pVar2.F(-5185995);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.z(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(modifier) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(pVar) ? 256 : 128;
        }
        if ((i11 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-5185995, i11, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            AndroidSelectionHandles_androidKt.b(j10, HandleReferencePoint.TopMiddle, androidx.compose.runtime.internal.b.b(pVarF, -1458480226, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i12) {
                    if ((i12 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1458480226, i12, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
                    }
                    if (pVar == null) {
                        pVar3.T(1275643833);
                        AndroidCursorHandle_androidKt.b(modifier, pVar3, (i11 >> 3) & 14);
                        pVar3.c0();
                    } else {
                        pVar3.T(1275643903);
                        pVar.invoke(pVar3, Integer.valueOf((i11 >> 6) & 14));
                        pVar3.c0();
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, (i11 & 14) | bb.c.b.f30879q5);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$CursorHandle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i12) {
                AndroidCursorHandle_androidKt.a(j10, modifier, pVar, pVar3, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final androidx.compose.ui.n modifier, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(modifier, "modifier");
        androidx.compose.runtime.p pVarF = pVar.F(694251107);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(694251107, i10, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            b1.a(c(SizeKt.E(modifier, f7564c, f7563b)), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$DefaultCursorHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                AndroidCursorHandle_androidKt.b(modifier, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar) {
        f0.p(nVar, "<this>");
        return ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-2126899193);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
                }
                final long selectionHandleColor = ((SelectionColors) pVar.K(TextSelectionColorsKt.c())).getSelectionHandleColor();
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                l0 l0VarN = l0.n(selectionHandleColor);
                pVar.T(1157296644);
                boolean zS = pVar.s(l0VarN);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new yh.l<CacheDrawScope, androidx.compose.ui.draw.k>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.ui.draw.k invoke(@dl.d CacheDrawScope drawWithCache) {
                            f0.p(drawWithCache, "$this$drawWithCache");
                            final float fT = b1.m.t(drawWithCache.c()) / 2.0f;
                            final y0 y0VarE = AndroidSelectionHandles_androidKt.e(drawWithCache, fT);
                            final m0 m0VarD = m0.Companion.d(m0.INSTANCE, selectionHandleColor, 0, 2, null);
                            return drawWithCache.i(new yh.l<androidx.compose.ui.graphics.drawscope.d, b2>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d androidx.compose.ui.graphics.drawscope.d onDrawWithContent) {
                                    f0.p(onDrawWithContent, "$this$onDrawWithContent");
                                    onDrawWithContent.T0();
                                    float f10 = fT;
                                    y0 y0Var = y0VarE;
                                    m0 m0Var = m0VarD;
                                    androidx.compose.ui.graphics.drawscope.e drawContext = onDrawWithContent.getDrawContext();
                                    long jC = drawContext.c();
                                    drawContext.a().f();
                                    androidx.compose.ui.graphics.drawscope.l transform = drawContext.getTransform();
                                    androidx.compose.ui.graphics.drawscope.k.g(transform, f10, 0.0f, 2, null);
                                    transform.g(45.0f, b1.f.f30364b.e());
                                    androidx.compose.ui.graphics.drawscope.f.A(onDrawWithContent, y0Var, 0L, 0.0f, null, m0Var, 0, 46, null);
                                    drawContext.a().u();
                                    drawContext.b(jC);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
                                    a(dVar);
                                    return b2.f124493a;
                                }
                            });
                        }
                    };
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarS0 = composed.s0(DrawModifierKt.b(companion, (yh.l) objU));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        }, 1, null);
    }

    public static final float d() {
        return f7563b;
    }

    public static final float e() {
        return f7564c;
    }
}
