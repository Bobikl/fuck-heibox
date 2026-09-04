package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.g0;
import androidx.compose.ui.text.font.h0;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.i0;
import androidx.compose.ui.text.input.k0;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import p1.LocaleList;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "<init>", "()V", ak.av, "Companion", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class TextFieldDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: TextFieldDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b;\u0010<J<\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003JK\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\"\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#JI\u0010'\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(JZ\u0010/\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0\u0007H\u0001ø\u0001\u0001¢\u0006\u0004\b/\u00100JZ\u00101\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0\u0007H\u0001ø\u0001\u0001¢\u0006\u0004\b1\u00100J3\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b3\u00104J#\u00109\u001a\u0002072\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006="}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "", "Landroidx/compose/ui/text/input/g;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Lkotlin/b2;", "onValueChange", "Landroidx/compose/ui/text/input/k0;", com.umeng.analytics.pro.d.aw, "g", "Landroidx/compose/foundation/text/p;", "textDelegate", "Ls1/b;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/i0;", "prevResultText", "Lkotlin/Triple;", "", "d", "(Landroidx/compose/foundation/text/p;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/i0;)Lkotlin/Triple;", "Landroidx/compose/ui/graphics/d0;", "canvas", "value", "Landroidx/compose/ui/text/input/x;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/h1;", "selectionPaint", ak.aF, "(Landroidx/compose/ui/graphics/d0;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/x;Landroidx/compose/ui/text/i0;Landroidx/compose/ui/graphics/h1;)V", "Lb1/f;", CommonNetImpl.POSITION, "Landroidx/compose/foundation/text/w;", "j", "(JLandroidx/compose/foundation/text/w;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/x;Lyh/l;)V", "Landroidx/compose/ui/text/input/i0;", "textInputService", "Landroidx/compose/ui/text/input/p;", "imeOptions", "Landroidx/compose/ui/text/input/o;", "onImeActionPerformed", "i", "(Landroidx/compose/ui/text/input/i0;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/p;Lyh/l;Lyh/l;)Landroidx/compose/ui/text/input/k0;", RXScreenCaptureService.KEY_HEIGHT, "textInputSession", "f", "(Landroidx/compose/ui/text/input/k0;Landroidx/compose/ui/text/input/EditProcessor;Lyh/l;)V", "Landroidx/compose/ui/text/o0;", "compositionRange", "Landroidx/compose/ui/text/input/l0;", "transformed", "b", "(JLandroidx/compose/ui/text/input/l0;)Landroidx/compose/ui/text/input/l0;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ Triple e(Companion companion, p pVar, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.d(pVar, j10, layoutDirection, textLayoutResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @xh.m
        public final void g(List<? extends androidx.compose.ui.text.input.g> list, EditProcessor editProcessor, yh.l<? super TextFieldValue, b2> lVar, k0 k0Var) {
            TextFieldValue textFieldValueB = editProcessor.b(list);
            if (k0Var != null) {
                k0Var.g(null, textFieldValueB);
            }
            lVar.invoke(textFieldValueB);
        }

        @dl.d
        public final TransformedText b(long compositionRange, @dl.d TransformedText transformed) {
            f0.p(transformed, "transformed");
            androidx.compose.ui.text.d.a aVar = new androidx.compose.ui.text.d.a(transformed.getText());
            aVar.c(new SpanStyle(0L, 0L, (FontWeight) null, (g0) null, (h0) null, (androidx.compose.ui.text.font.v) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, androidx.compose.ui.text.style.i.INSTANCE.f(), (Shadow) null, 12287, (kotlin.jvm.internal.u) null), transformed.getOffsetMapping().b(o0.n(compositionRange)), transformed.getOffsetMapping().b(o0.i(compositionRange)));
            return new TransformedText(aVar.q(), transformed.getOffsetMapping());
        }

        @xh.m
        public final void c(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d TextFieldValue value, @dl.d androidx.compose.ui.text.input.x offsetMapping, @dl.d TextLayoutResult textLayoutResult, @dl.d h1 selectionPaint) {
            int iB;
            int iB2;
            f0.p(canvas, "canvas");
            f0.p(value, "value");
            f0.p(offsetMapping, "offsetMapping");
            f0.p(textLayoutResult, "textLayoutResult");
            f0.p(selectionPaint, "selectionPaint");
            if (!o0.h(value.getSelection()) && (iB = offsetMapping.b(o0.l(value.getSelection()))) != (iB2 = offsetMapping.b(o0.k(value.getSelection())))) {
                canvas.D(textLayoutResult.z(iB, iB2), selectionPaint);
            }
            m0.f16821a.a(canvas, textLayoutResult);
        }

        @dl.d
        @xh.m
        public final Triple<Integer, Integer, TextLayoutResult> d(@dl.d p textDelegate, long constraints, @dl.d LayoutDirection layoutDirection, @dl.e TextLayoutResult prevResultText) {
            f0.p(textDelegate, "textDelegate");
            f0.p(layoutDirection, "layoutDirection");
            TextLayoutResult textLayoutResultN = textDelegate.n(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf(s1.r.m(textLayoutResultN.getSize())), Integer.valueOf(s1.r.j(textLayoutResultN.getSize())), textLayoutResultN);
        }

        @xh.m
        public final void f(@dl.d k0 textInputSession, @dl.d EditProcessor editProcessor, @dl.d yh.l<? super TextFieldValue, b2> onValueChange) {
            f0.p(textInputSession, "textInputSession");
            f0.p(editProcessor, "editProcessor");
            f0.p(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.d(editProcessor.h(), null, 0L, null, 3, null));
            textInputSession.a();
        }

        @dl.d
        @xh.m
        public final k0 h(@dl.d i0 textInputService, @dl.d TextFieldValue value, @dl.d EditProcessor editProcessor, @dl.d ImeOptions imeOptions, @dl.d yh.l<? super TextFieldValue, b2> onValueChange, @dl.d yh.l<? super androidx.compose.ui.text.input.o, b2> onImeActionPerformed) {
            f0.p(textInputService, "textInputService");
            f0.p(value, "value");
            f0.p(editProcessor, "editProcessor");
            f0.p(imeOptions, "imeOptions");
            f0.p(onValueChange, "onValueChange");
            f0.p(onImeActionPerformed, "onImeActionPerformed");
            return i(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.k0] */
        @dl.d
        @xh.m
        public final k0 i(@dl.d i0 textInputService, @dl.d TextFieldValue value, @dl.d final EditProcessor editProcessor, @dl.d ImeOptions imeOptions, @dl.d final yh.l<? super TextFieldValue, b2> onValueChange, @dl.d yh.l<? super androidx.compose.ui.text.input.o, b2> onImeActionPerformed) {
            f0.p(textInputService, "textInputService");
            f0.p(value, "value");
            f0.p(editProcessor, "editProcessor");
            f0.p(imeOptions, "imeOptions");
            f0.p(onValueChange, "onValueChange");
            f0.p(onImeActionPerformed, "onImeActionPerformed");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? D = textInputService.d(value, imeOptions, new yh.l<List<? extends androidx.compose.ui.text.input.g>, b2>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(@dl.d List<? extends androidx.compose.ui.text.input.g> it) {
                    f0.p(it, "it");
                    TextFieldDelegate.INSTANCE.g(it, editProcessor, onValueChange, objectRef.f124891b);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(List<? extends androidx.compose.ui.text.input.g> list) {
                    a(list);
                    return b2.f124493a;
                }
            }, onImeActionPerformed);
            objectRef.f124891b = D;
            return D;
        }

        @xh.m
        public final void j(long position, @dl.d w textLayoutResult, @dl.d EditProcessor editProcessor, @dl.d androidx.compose.ui.text.input.x offsetMapping, @dl.d yh.l<? super TextFieldValue, b2> onValueChange) {
            f0.p(textLayoutResult, "textLayoutResult");
            f0.p(editProcessor, "editProcessor");
            f0.p(offsetMapping, "offsetMapping");
            f0.p(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.d(editProcessor.h(), null, p0.a(offsetMapping.a(w.h(textLayoutResult, position, false, 2, null))), null, 5, null));
        }
    }

    @xh.m
    public static final void a(@dl.d androidx.compose.ui.graphics.d0 d0Var, @dl.d TextFieldValue textFieldValue, @dl.d androidx.compose.ui.text.input.x xVar, @dl.d TextLayoutResult textLayoutResult, @dl.d h1 h1Var) {
        INSTANCE.c(d0Var, textFieldValue, xVar, textLayoutResult, h1Var);
    }

    @dl.d
    @xh.m
    public static final Triple<Integer, Integer, TextLayoutResult> b(@dl.d p pVar, long j10, @dl.d LayoutDirection layoutDirection, @dl.e TextLayoutResult textLayoutResult) {
        return INSTANCE.d(pVar, j10, layoutDirection, textLayoutResult);
    }

    @xh.m
    public static final void c(@dl.d k0 k0Var, @dl.d EditProcessor editProcessor, @dl.d yh.l<? super TextFieldValue, b2> lVar) {
        INSTANCE.f(k0Var, editProcessor, lVar);
    }

    @xh.m
    private static final void d(List<? extends androidx.compose.ui.text.input.g> list, EditProcessor editProcessor, yh.l<? super TextFieldValue, b2> lVar, k0 k0Var) {
        INSTANCE.g(list, editProcessor, lVar, k0Var);
    }

    @dl.d
    @xh.m
    public static final k0 e(@dl.d i0 i0Var, @dl.d TextFieldValue textFieldValue, @dl.d EditProcessor editProcessor, @dl.d ImeOptions imeOptions, @dl.d yh.l<? super TextFieldValue, b2> lVar, @dl.d yh.l<? super androidx.compose.ui.text.input.o, b2> lVar2) {
        return INSTANCE.h(i0Var, textFieldValue, editProcessor, imeOptions, lVar, lVar2);
    }

    @dl.d
    @xh.m
    public static final k0 f(@dl.d i0 i0Var, @dl.d TextFieldValue textFieldValue, @dl.d EditProcessor editProcessor, @dl.d ImeOptions imeOptions, @dl.d yh.l<? super TextFieldValue, b2> lVar, @dl.d yh.l<? super androidx.compose.ui.text.input.o, b2> lVar2) {
        return INSTANCE.i(i0Var, textFieldValue, editProcessor, imeOptions, lVar, lVar2);
    }

    @xh.m
    public static final void g(long j10, @dl.d w wVar, @dl.d EditProcessor editProcessor, @dl.d androidx.compose.ui.text.input.x xVar, @dl.d yh.l<? super TextFieldValue, b2> lVar) {
        INSTANCE.j(j10, wVar, editProcessor, xVar, lVar);
    }
}
