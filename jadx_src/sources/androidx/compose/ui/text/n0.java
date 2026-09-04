package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a{\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001ae\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00182\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010%\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001aU\u0010)\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010,\u001a\u00020\u0015*\u00020+2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/text/j0;", "textMeasurer", "Landroidx/compose/ui/text/d;", "text", "Lb1/f;", "topLeft", "Landroidx/compose/ui/text/q0;", "style", "Landroidx/compose/ui/text/style/q;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/r;", "maxSize", "Lkotlin/b2;", "f", "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/text/j0;Landroidx/compose/ui/text/d;JLandroidx/compose/ui/text/q0;IZILjava/util/List;J)V", "", "d", "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/text/j0;Ljava/lang/String;JLandroidx/compose/ui/text/q0;IZIJ)V", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Landroidx/compose/ui/graphics/l0;", "color", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "shadow", "Landroidx/compose/ui/text/style/i;", com.google.android.exoplayer2.text.ttml.d.P, RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/text/i0;JJFLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;)V", "Landroidx/compose/ui/graphics/a0;", "brush", "b", "(Landroidx/compose/ui/graphics/drawscope/g;Landroidx/compose/ui/text/i0;Landroidx/compose/ui/graphics/a0;JFLandroidx/compose/ui/graphics/e2;Landroidx/compose/ui/text/style/i;)V", "Landroidx/compose/ui/graphics/drawscope/l;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class n0 {
    private static final void a(androidx.compose.ui.graphics.drawscope.l lVar, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.i() || androidx.compose.ui.text.style.q.g(textLayoutResult.getLayoutInput().getOverflow(), androidx.compose.ui.text.style.q.INSTANCE.e())) {
            return;
        }
        androidx.compose.ui.graphics.drawscope.k.d(lVar, 0.0f, 0.0f, s1.r.m(textLayoutResult.getSize()), s1.r.j(textLayoutResult.getSize()), 0, 16, null);
    }

    @g
    public static final void b(@dl.d androidx.compose.ui.graphics.drawscope.g drawText, @dl.d TextLayoutResult textLayoutResult, @dl.d androidx.compose.ui.graphics.a0 brush, long j10, float f10, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i iVar) {
        kotlin.jvm.internal.f0.p(drawText, "$this$drawText");
        kotlin.jvm.internal.f0.p(textLayoutResult, "textLayoutResult");
        kotlin.jvm.internal.f0.p(brush, "brush");
        if (shadow == null) {
            shadow = textLayoutResult.getLayoutInput().getStyle().G();
        }
        Shadow shadow2 = shadow;
        if (iVar == null) {
            iVar = textLayoutResult.getLayoutInput().getStyle().J();
        }
        androidx.compose.ui.text.style.i iVar2 = iVar;
        androidx.compose.ui.graphics.drawscope.e drawContext = drawText.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        androidx.compose.ui.graphics.drawscope.l transform = drawContext.getTransform();
        transform.b(b1.f.p(j10), b1.f.r(j10));
        a(transform, textLayoutResult);
        j multiParagraph = textLayoutResult.getMultiParagraph();
        androidx.compose.ui.graphics.d0 d0VarA = drawText.getDrawContext().a();
        if (Float.isNaN(f10)) {
            f10 = textLayoutResult.getLayoutInput().getStyle().j();
        }
        multiParagraph.H(d0VarA, brush, f10, shadow2, iVar2);
        drawContext.a().u();
        drawContext.b(jC);
    }

    @g
    public static final void d(@dl.d androidx.compose.ui.graphics.drawscope.g drawText, @dl.d j0 textMeasurer, @dl.d String text, long j10, @dl.d TextStyle style, int i10, boolean z10, int i11, long j11) {
        kotlin.jvm.internal.f0.p(drawText, "$this$drawText");
        kotlin.jvm.internal.f0.p(textMeasurer, "textMeasurer");
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        TextLayoutResult textLayoutResultA = textMeasurer.a(new d(text, null, null, 6, null), (bb.c.b.ir & 2) != 0 ? TextStyle.INSTANCE.a() : style, (bb.c.b.ir & 4) != 0 ? androidx.compose.ui.text.style.q.INSTANCE.a() : i10, (bb.c.b.ir & 8) != 0 ? true : z10, (bb.c.b.ir & 16) != 0 ? Integer.MAX_VALUE : i11, (bb.c.b.ir & 32) != 0 ? CollectionsKt__CollectionsKt.E() : null, (bb.c.b.ir & 64) != 0 ? s1.c.b(0, 0, 0, 0, 15, null) : s1.c.b(0, s1.r.m(j11), 0, s1.r.j(j11), 5, null), (bb.c.b.ir & 128) != 0 ? textMeasurer.fallbackLayoutDirection : drawText.getLayoutDirection(), (bb.c.b.ir & 256) != 0 ? textMeasurer.f16815b : drawText, (bb.c.b.ir & 512) != 0 ? textMeasurer.fallbackFontFamilyResolver : null, (bb.c.b.ir & 1024) != 0 ? false : false);
        androidx.compose.ui.graphics.drawscope.e drawContext = drawText.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        androidx.compose.ui.graphics.drawscope.l transform = drawContext.getTransform();
        transform.b(b1.f.p(j10), b1.f.r(j10));
        a(transform, textLayoutResultA);
        j.K(textLayoutResultA.getMultiParagraph(), drawText.getDrawContext().a(), 0L, null, null, 14, null);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void e(androidx.compose.ui.graphics.drawscope.g gVar, j0 j0Var, String str, long j10, TextStyle textStyle, int i10, boolean z10, int i11, long j11, int i12, Object obj) {
        long jE = (i12 & 4) != 0 ? b1.f.f30364b.e() : j10;
        d(gVar, j0Var, str, jE, (i12 & 8) != 0 ? TextStyle.INSTANCE.a() : textStyle, (i12 & 16) != 0 ? androidx.compose.ui.text.style.q.INSTANCE.a() : i10, (i12 & 32) != 0 ? true : z10, (i12 & 64) != 0 ? Integer.MAX_VALUE : i11, (i12 & 128) != 0 ? s1.s.a(di.d.L0((float) Math.ceil(b1.m.t(gVar.c()) - b1.f.p(jE))), di.d.L0((float) Math.ceil(b1.m.m(gVar.c()) - b1.f.r(jE)))) : j11);
    }

    @g
    public static final void f(@dl.d androidx.compose.ui.graphics.drawscope.g drawText, @dl.d j0 textMeasurer, @dl.d d text, long j10, @dl.d TextStyle style, int i10, boolean z10, int i11, @dl.d List<d.Range<Placeholder>> placeholders, long j11) {
        kotlin.jvm.internal.f0.p(drawText, "$this$drawText");
        kotlin.jvm.internal.f0.p(textMeasurer, "textMeasurer");
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        TextLayoutResult textLayoutResultA = textMeasurer.a(text, (bb.c.b.ir & 2) != 0 ? TextStyle.INSTANCE.a() : style, (bb.c.b.ir & 4) != 0 ? androidx.compose.ui.text.style.q.INSTANCE.a() : i10, (bb.c.b.ir & 8) != 0 ? true : z10, (bb.c.b.ir & 16) != 0 ? Integer.MAX_VALUE : i11, (bb.c.b.ir & 32) != 0 ? CollectionsKt__CollectionsKt.E() : placeholders, (bb.c.b.ir & 64) != 0 ? s1.c.b(0, 0, 0, 0, 15, null) : s1.c.b(0, s1.r.m(j11), 0, s1.r.j(j11), 5, null), (bb.c.b.ir & 128) != 0 ? textMeasurer.fallbackLayoutDirection : drawText.getLayoutDirection(), (bb.c.b.ir & 256) != 0 ? textMeasurer.f16815b : drawText, (bb.c.b.ir & 512) != 0 ? textMeasurer.fallbackFontFamilyResolver : null, (bb.c.b.ir & 1024) != 0 ? false : false);
        androidx.compose.ui.graphics.drawscope.e drawContext = drawText.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        androidx.compose.ui.graphics.drawscope.l transform = drawContext.getTransform();
        transform.b(b1.f.p(j10), b1.f.r(j10));
        a(transform, textLayoutResultA);
        j.K(textLayoutResultA.getMultiParagraph(), drawText.getDrawContext().a(), 0L, null, null, 14, null);
        drawContext.a().u();
        drawContext.b(jC);
    }

    public static /* synthetic */ void g(androidx.compose.ui.graphics.drawscope.g gVar, j0 j0Var, d dVar, long j10, TextStyle textStyle, int i10, boolean z10, int i11, List list, long j11, int i12, Object obj) {
        long jE = (i12 & 4) != 0 ? b1.f.f30364b.e() : j10;
        f(gVar, j0Var, dVar, jE, (i12 & 8) != 0 ? TextStyle.INSTANCE.a() : textStyle, (i12 & 16) != 0 ? androidx.compose.ui.text.style.q.INSTANCE.a() : i10, (i12 & 32) != 0 ? true : z10, (i12 & 64) != 0 ? Integer.MAX_VALUE : i11, (i12 & 128) != 0 ? CollectionsKt__CollectionsKt.E() : list, (i12 & 256) != 0 ? s1.s.a(di.d.L0((float) Math.ceil(b1.m.t(gVar.c()) - b1.f.p(jE))), di.d.L0((float) Math.ceil(b1.m.m(gVar.c()) - b1.f.r(jE)))) : j11);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    @g
    public static final void h(@dl.d androidx.compose.ui.graphics.drawscope.g drawText, @dl.d TextLayoutResult textLayoutResult, long j10, long j11, float f10, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i iVar) {
        kotlin.jvm.internal.f0.p(drawText, "$this$drawText");
        kotlin.jvm.internal.f0.p(textLayoutResult, "textLayoutResult");
        if (shadow == null) {
            shadow = textLayoutResult.getLayoutInput().getStyle().G();
        }
        if (iVar == null) {
            iVar = textLayoutResult.getLayoutInput().getStyle().J();
        }
        androidx.compose.ui.graphics.drawscope.e drawContext = drawText.getDrawContext();
        long jC = drawContext.c();
        drawContext.a().f();
        androidx.compose.ui.graphics.drawscope.l transform = drawContext.getTransform();
        transform.b(b1.f.p(j11), b1.f.r(j11));
        a(transform, textLayoutResult);
        androidx.compose.ui.graphics.a0 a0VarN = textLayoutResult.getLayoutInput().getStyle().n();
        if (a0VarN == null) {
            j multiParagraph = textLayoutResult.getMultiParagraph();
            androidx.compose.ui.graphics.d0 d0VarA = drawText.getDrawContext().a();
            if (!(j10 != androidx.compose.ui.graphics.l0.INSTANCE.u())) {
                j10 = textLayoutResult.getLayoutInput().getStyle().p();
            }
            multiParagraph.J(d0VarA, androidx.compose.ui.text.style.k.c(j10, f10), shadow, iVar);
        } else {
            if (j10 == androidx.compose.ui.graphics.l0.INSTANCE.u()) {
                j multiParagraph2 = textLayoutResult.getMultiParagraph();
                androidx.compose.ui.graphics.d0 d0VarA2 = drawText.getDrawContext().a();
                if (Float.isNaN(f10)) {
                    f10 = textLayoutResult.getLayoutInput().getStyle().j();
                }
                multiParagraph2.H(d0VarA2, a0VarN, f10, shadow, iVar);
            } else {
                j multiParagraph3 = textLayoutResult.getMultiParagraph();
                androidx.compose.ui.graphics.d0 d0VarA3 = drawText.getDrawContext().a();
                if (!(j10 != androidx.compose.ui.graphics.l0.INSTANCE.u())) {
                    j10 = textLayoutResult.getLayoutInput().getStyle().p();
                }
                multiParagraph3.J(d0VarA3, androidx.compose.ui.text.style.k.c(j10, f10), shadow, iVar);
            }
        }
        drawContext.a().u();
        drawContext.b(jC);
    }
}
