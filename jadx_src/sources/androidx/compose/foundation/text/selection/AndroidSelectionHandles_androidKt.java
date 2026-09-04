package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.b1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.a1;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.x;
import androidx.compose.ui.graphics.y0;
import androidx.compose.ui.graphics.z0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aR\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a8\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002\u001a\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0002H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lb1/f;", CommonNetImpl.POSITION, "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "handlesCrossed", "Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.aF, "(JZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;I)V", ak.av, "(Landroidx/compose/ui/n;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/runtime/p;I)V", "f", "Landroidx/compose/ui/draw/CacheDrawScope;", "", "radius", "Landroidx/compose/ui/graphics/y0;", "e", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "handleReferencePoint", "b", "(JLandroidx/compose/foundation/text/selection/HandleReferencePoint;Lyh/p;Landroidx/compose/runtime/p;I)V", RXScreenCaptureService.KEY_HEIGHT, "areHandlesCrossed", "g", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidSelectionHandles_androidKt {
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.n modifier, final boolean z10, @dl.d final ResolvedTextDirection direction, final boolean z11, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(modifier, "modifier");
        f0.p(direction, "direction");
        androidx.compose.runtime.p pVarF = pVar.F(47957398);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.u(z10) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(direction) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.u(z11) ? 2048 : 1024;
        }
        if ((i11 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(47957398, i10, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            b1.a(f(SizeKt.E(modifier, m.c(), m.b()), z10, direction, z11), pVarF, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                AndroidSelectionHandles_androidKt.a(modifier, z10, direction, z11, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(final long j10, @dl.d final HandleReferencePoint handleReferencePoint, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        f0.p(handleReferencePoint, "handleReferencePoint");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1409050158);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.z(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(handleReferencePoint) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(content) ? 256 : 128;
        }
        if ((i11 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1409050158, i11, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:224)");
            }
            long jA = s1.o.a(di.d.L0(b1.f.p(j10)), di.d.L0(b1.f.r(j10)));
            s1.n nVarB = s1.n.b(jA);
            pVarF.T(511388516);
            boolean zS = pVarF.s(nVarB) | pVarF.s(handleReferencePoint);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new d(handleReferencePoint, jA, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            AndroidPopup_androidKt.a((d) objU, null, new androidx.compose.ui.window.h(false, false, false, null, true, false, 15, null), content, pVarF, (i11 << 3) & bb.c.g.f32954lc, 2);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                AndroidSelectionHandles_androidKt.b(j10, handleReferencePoint, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void c(final long j10, final boolean z10, @dl.d final ResolvedTextDirection direction, final boolean z11, @dl.d final androidx.compose.ui.n modifier, @dl.e final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> pVar, @dl.e androidx.compose.runtime.p pVar2, final int i10) {
        int i11;
        f0.p(direction, "direction");
        f0.p(modifier, "modifier");
        androidx.compose.runtime.p pVarF = pVar2.F(-616295642);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.z(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.u(z10) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(direction) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.u(z11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= pVarF.s(modifier) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= pVarF.s(pVar) ? 131072 : 65536;
        }
        final int i12 = i11;
        if ((374491 & i12) == 74898 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-616295642, i12, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            b(j10, h(z10, direction, z11) ? HandleReferencePoint.TopRight : HandleReferencePoint.TopLeft, androidx.compose.runtime.internal.b.b(pVarF, 732099485, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i13) {
                    if ((i13 & 11) == 2 && pVar3.b()) {
                        pVar3.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(732099485, i13, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
                    }
                    if (pVar == null) {
                        pVar3.T(386443790);
                        androidx.compose.ui.n nVar = modifier;
                        Boolean boolValueOf = Boolean.valueOf(z10);
                        b1.f fVarD = b1.f.d(j10);
                        final boolean z12 = z10;
                        final long j11 = j10;
                        pVar3.T(511388516);
                        boolean zS = pVar3.s(boolValueOf) | pVar3.s(fVarD);
                        Object objU = pVar3.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                                    f0.p(semantics, "$this$semantics");
                                    semantics.a(m.d(), new SelectionHandleInfo(z12 ? Handle.SelectionStart : Handle.SelectionEnd, j11, null));
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                                    a(rVar);
                                    return b2.f124493a;
                                }
                            };
                            pVar3.N(objU);
                        }
                        pVar3.c0();
                        androidx.compose.ui.n nVarC = SemanticsModifierKt.c(nVar, false, (yh.l) objU, 1, null);
                        boolean z13 = z10;
                        ResolvedTextDirection resolvedTextDirection = direction;
                        boolean z14 = z11;
                        int i14 = i12;
                        AndroidSelectionHandles_androidKt.a(nVarC, z13, resolvedTextDirection, z14, pVar3, (i14 & 112) | (i14 & bb.c.b.f30796me) | (i14 & bb.c.g.f32954lc));
                        pVar3.c0();
                    } else {
                        pVar3.T(386444465);
                        pVar.invoke(pVar3, Integer.valueOf((i12 >> 15) & 14));
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
            }), pVarF, (i12 & 14) | bb.c.b.f30966u4);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i13) {
                AndroidSelectionHandles_androidKt.c(j10, z10, direction, z11, modifier, pVar, pVar3, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public static final y0 e(@dl.d CacheDrawScope cacheDrawScope, float f10) {
        f0.p(cacheDrawScope, "<this>");
        int iCeil = ((int) Math.ceil(f10)) * 2;
        c cVar = c.f8353a;
        y0 y0VarC = cVar.c();
        d0 d0VarA = cVar.a();
        androidx.compose.ui.graphics.drawscope.a aVarB = cVar.b();
        if (y0VarC == null || d0VarA == null || iCeil > y0VarC.getWidth() || iCeil > y0VarC.getHeight()) {
            y0VarC = a1.b(iCeil, iCeil, z0.INSTANCE.a(), false, null, 24, null);
            cVar.f(y0VarC);
            d0VarA = androidx.compose.ui.graphics.f0.a(y0VarC);
            cVar.d(d0VarA);
        }
        y0 y0Var = y0VarC;
        d0 d0Var = d0VarA;
        if (aVarB == null) {
            aVarB = new androidx.compose.ui.graphics.drawscope.a();
            cVar.e(aVarB);
        }
        androidx.compose.ui.graphics.drawscope.a aVar = aVarB;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long jA = b1.n.a(y0Var.getWidth(), y0Var.getHeight());
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams = aVar.getDrawParams();
        s1.e density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        d0 canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.l(cacheDrawScope);
        drawParams2.m(layoutDirection);
        drawParams2.k(d0Var);
        drawParams2.n(jA);
        d0Var.f();
        androidx.compose.ui.graphics.drawscope.f.K(aVar, l0.INSTANCE.a(), 0L, aVar.c(), 0.0f, null, null, x.INSTANCE.a(), 58, null);
        androidx.compose.ui.graphics.drawscope.f.K(aVar, n0.d(4278190080L), b1.f.f30364b.e(), b1.n.a(f10, f10), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.f.x(aVar, n0.d(4278190080L), f10, b1.g.a(f10, f10), 0.0f, null, null, 0, 120, null);
        d0Var.u();
        androidx.compose.ui.graphics.drawscope.a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.l(density);
        drawParams3.m(layoutDirection2);
        drawParams3.k(canvas);
        drawParams3.n(size);
        return y0Var;
    }

    @dl.d
    public static final androidx.compose.ui.n f(@dl.d androidx.compose.ui.n nVar, final boolean z10, @dl.d final ResolvedTextDirection direction, final boolean z11) {
        f0.p(nVar, "<this>");
        f0.p(direction, "direction");
        return ComposedModifierKt.l(nVar, null, new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
                  (r8v3 ?? I:java.lang.Object) from 0x0078: INVOKE (r12v0 ?? I:androidx.compose.runtime.p), (r8v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
                  (r8v3 ?? I:java.lang.Object) from 0x0078: INVOKE (r12v0 ?? I:androidx.compose.runtime.p), (r8v3 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                */

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        }, 1, null);
    }

    public static final boolean g(@dl.d ResolvedTextDirection direction, boolean z10) {
        f0.p(direction, "direction");
        return (direction == ResolvedTextDirection.Ltr && !z10) || (direction == ResolvedTextDirection.Rtl && z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        if (z10) {
            return g(resolvedTextDirection, z11);
        }
        return !g(resolvedTextDirection, z11);
    }
}
