package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/m0;", "", "Landroidx/compose/ui/graphics/d0;", "canvas", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Lkotlin/b2;", ak.av, "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m0 f16821a = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16822b = 0;

    private m0() {
    }

    public final void a(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d TextLayoutResult textLayoutResult) {
        kotlin.jvm.internal.f0.p(canvas, "canvas");
        kotlin.jvm.internal.f0.p(textLayoutResult, "textLayoutResult");
        boolean z10 = textLayoutResult.i() && !androidx.compose.ui.text.style.q.g(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.q.INSTANCE.e());
        if (z10) {
            b1.i iVarC = b1.j.c(b1.f.f30364b.e(), b1.n.a(s1.r.m(textLayoutResult.getSize()), s1.r.j(textLayoutResult.getSize())));
            canvas.f();
            androidx.compose.ui.graphics.c0.o(canvas, iVarC, 0, 2, null);
        }
        try {
            androidx.compose.ui.graphics.a0 a0VarN = textLayoutResult.getLayoutInput().getStyle().n();
            if (a0VarN != null) {
                textLayoutResult.getMultiParagraph().H(canvas, a0VarN, textLayoutResult.getLayoutInput().getStyle().j(), textLayoutResult.getLayoutInput().getStyle().G(), textLayoutResult.getLayoutInput().getStyle().J());
            } else {
                textLayoutResult.getMultiParagraph().J(canvas, textLayoutResult.getLayoutInput().getStyle().p(), textLayoutResult.getLayoutInput().getStyle().G(), textLayoutResult.getLayoutInput().getStyle().J());
            }
        } finally {
            if (z10) {
                canvas.u();
            }
        }
    }
}
