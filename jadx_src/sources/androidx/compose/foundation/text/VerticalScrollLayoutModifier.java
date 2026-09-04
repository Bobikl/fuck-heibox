package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.text.input.TransformedText;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b,\u0010-J)\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001a\u001a\u00020\fHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/VerticalScrollLayoutModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", ak.av, "", ak.aF, "Landroidx/compose/ui/text/input/l0;", "d", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/w;", "e", "scrollerPosition", "cursorOffset", "transformedText", "textLayoutResultProvider", "f", "", "toString", "hashCode", "", "other", "", "equals", "b", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "n", "()Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "I", "m", "()I", "Landroidx/compose/ui/text/input/l0;", "q", "()Landroidx/compose/ui/text/input/l0;", "Lyh/a;", "o", "()Lyh/a;", "<init>", "(Landroidx/compose/foundation/text/TextFieldScrollerPosition;ILandroidx/compose/ui/text/input/l0;Lyh/a;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class VerticalScrollLayoutModifier implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextFieldScrollerPosition scrollerPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cursorOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TransformedText transformedText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from toString */
    @dl.d
    private final yh.a<w> textLayoutResultProvider;

    public VerticalScrollLayoutModifier(@dl.d TextFieldScrollerPosition scrollerPosition, int i10, @dl.d TransformedText transformedText, @dl.d yh.a<w> textLayoutResultProvider) {
        f0.p(scrollerPosition, "scrollerPosition");
        f0.p(transformedText, "transformedText");
        f0.p(textLayoutResultProvider, "textLayoutResultProvider");
        this.scrollerPosition = scrollerPosition;
        this.cursorOffset = i10;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = textLayoutResultProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerticalScrollLayoutModifier g(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i10, TransformedText transformedText, yh.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
        }
        if ((i11 & 2) != 0) {
            i10 = verticalScrollLayoutModifier.cursorOffset;
        }
        if ((i11 & 4) != 0) {
            transformedText = verticalScrollLayoutModifier.transformedText;
        }
        if ((i11 & 8) != 0) {
            aVar = verticalScrollLayoutModifier.textLayoutResultProvider;
        }
        return verticalScrollLayoutModifier.f(textFieldScrollerPosition, i10, transformedText, aVar);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.d(this, nVar, mVar, i10);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    @dl.d
    public final yh.a<w> e() {
        return this.textLayoutResultProvider;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) other;
        return f0.g(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && f0.g(this.transformedText, verticalScrollLayoutModifier.transformedText) && f0.g(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
    }

    @dl.d
    public final VerticalScrollLayoutModifier f(@dl.d TextFieldScrollerPosition scrollerPosition, int i10, @dl.d TransformedText transformedText, @dl.d yh.a<w> textLayoutResultProvider) {
        f0.p(scrollerPosition, "scrollerPosition");
        f0.p(transformedText, "transformedText");
        f0.p(textLayoutResultProvider, "textLayoutResultProvider");
        return new VerticalScrollLayoutModifier(scrollerPosition, i10, transformedText, textLayoutResultProvider);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + this.cursorOffset) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int i(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.a(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int j(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public j0 k(@dl.d final l0 measure, @dl.d g0 measurable, long j10) {
        f0.p(measure, "$this$measure");
        f0.p(measurable, "measurable");
        final e1 e1VarZ1 = measurable.z1(s1.b.e(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int iMin = Math.min(e1VarZ1.getHeight(), s1.b.o(j10));
        return k0.p(measure, e1VarZ1.getWidth(), iMin, null, new yh.l<e1.a, b2>() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d e1.a layout) {
                f0.p(layout, "$this$layout");
                l0 l0Var = measure;
                int iM = this.m();
                TransformedText transformedTextQ = this.q();
                w wVarInvoke = this.o().invoke();
                this.n().l(Orientation.Vertical, TextFieldScrollKt.b(l0Var, iM, transformedTextQ, wVarInvoke != null ? wVarInvoke.getValue() : null, false, e1VarZ1.getWidth()), iMin, e1VarZ1.getHeight());
                e1.a.v(layout, e1VarZ1, 0, di.d.L0(-this.n().d()), 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    public final int m() {
        return this.cursorOffset;
    }

    @dl.d
    public final TextFieldScrollerPosition n() {
        return this.scrollerPosition;
    }

    @dl.d
    public final yh.a<w> o() {
        return this.textLayoutResultProvider;
    }

    @dl.d
    public final TransformedText q() {
        return this.transformedText;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.d
    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
