package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.m0;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000\u001a4\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0000\u001a6\u0010\u001a\u001a\u00020\u0019*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "scrollerPosition", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "", "enabled", "d", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/m0;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/w;", "textLayoutResultProvider", ak.aF, "Ls1/e;", "", "cursorOffset", "Landroidx/compose/ui/text/input/l0;", "transformedText", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "rtl", "textFieldWidth", "Lb1/i;", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TextFieldScrollKt {

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7990a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f7990a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1.i b(s1.e eVar, int i10, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z10, int i11) {
        b1.i iVarA;
        if (textLayoutResult == null || (iVarA = textLayoutResult.e(transformedText.getOffsetMapping().b(i10))) == null) {
            iVarA = b1.i.f30369e.a();
        }
        b1.i iVar = iVarA;
        int iE1 = eVar.e1(TextFieldCursorKt.c());
        return b1.i.h(iVar, z10 ? (i11 - iVar.t()) - iE1 : iVar.t(), 0.0f, z10 ? i11 - iVar.t() : iVar.t() + iE1, 0.0f, 10, null);
    }

    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d TextFieldScrollerPosition scrollerPosition, @dl.d TextFieldValue textFieldValue, @dl.d m0 visualTransformation, @dl.d yh.a<w> textLayoutResultProvider) {
        androidx.compose.ui.n verticalScrollLayoutModifier;
        f0.p(nVar, "<this>");
        f0.p(scrollerPosition, "scrollerPosition");
        f0.p(textFieldValue, "textFieldValue");
        f0.p(visualTransformation, "visualTransformation");
        f0.p(textLayoutResultProvider, "textLayoutResultProvider");
        Orientation orientationF = scrollerPosition.f();
        int iE = scrollerPosition.e(textFieldValue.getSelection());
        scrollerPosition.k(textFieldValue.getSelection());
        TransformedText transformedTextA = e0.a(visualTransformation, textFieldValue.getText());
        int i10 = a.f7990a[orientationF.ordinal()];
        if (i10 == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(scrollerPosition, iE, transformedTextA, textLayoutResultProvider);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(scrollerPosition, iE, transformedTextA, textLayoutResultProvider);
        }
        return androidx.compose.ui.draw.d.b(nVar).s0(verticalScrollLayoutModifier);
    }

    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d final TextFieldScrollerPosition scrollerPosition, @dl.e final androidx.compose.foundation.interaction.g gVar, final boolean z10) {
        f0.p(nVar, "<this>");
        f0.p(scrollerPosition, "scrollerPosition");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("textFieldScrollable");
                x0Var.getProperties().c("scrollerPosition", scrollerPosition);
                x0Var.getProperties().c("interactionSource", gVar);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0081  */
            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                boolean z11;
                f0.p(composed, "$this$composed");
                pVar.T(805428266);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:62)");
                }
                boolean z12 = scrollerPosition.f() == Orientation.Vertical || !(pVar.K(CompositionLocalsKt.p()) == LayoutDirection.Rtl);
                final TextFieldScrollerPosition textFieldScrollerPosition = scrollerPosition;
                pVar.T(1157296644);
                boolean zS = pVar.s(textFieldScrollerPosition);
                Object objU = pVar.U();
                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new yh.l<Float, Float>() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$controller$1$1
                        {
                            super(1);
                        }

                        @dl.d
                        public final Float a(float f10) {
                            float fD = textFieldScrollerPosition.d() + f10;
                            if (fD > textFieldScrollerPosition.c()) {
                                f10 = textFieldScrollerPosition.c() - textFieldScrollerPosition.d();
                            } else if (fD < 0.0f) {
                                f10 = -textFieldScrollerPosition.d();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                            textFieldScrollerPosition2.i(textFieldScrollerPosition2.d() + f10);
                            return Float.valueOf(f10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                            return a(f10.floatValue());
                        }
                    };
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.foundation.gestures.p pVarB = ScrollableStateKt.b((yh.l) objU, pVar, 0);
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                Orientation orientationF = scrollerPosition.f();
                if (z10) {
                    if (scrollerPosition.c() == 0.0f) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
                androidx.compose.ui.n nVarL = ScrollableKt.l(companion, pVarB, orientationF, z11, z12, null, gVar, 16, null);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarL;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ androidx.compose.ui.n e(androidx.compose.ui.n nVar, TextFieldScrollerPosition textFieldScrollerPosition, androidx.compose.foundation.interaction.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return d(nVar, textFieldScrollerPosition, gVar, z10);
    }
}
