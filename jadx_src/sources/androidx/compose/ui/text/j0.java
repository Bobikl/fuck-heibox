package androidx.compose.ui.text;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u008d\u0001\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010 \u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/j0;", "", "Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/q0;", "style", "Landroidx/compose/ui/text/style/q;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/b;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "skipCache", "Landroidx/compose/ui/text/i0;", ak.av, "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Ls1/e;Landroidx/compose/ui/text/font/v$b;Z)Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/text/font/v$b;", "fallbackFontFamilyResolver", ak.aF, "Landroidx/compose/ui/unit/LayoutDirection;", "fallbackLayoutDirection", "d", "I", "cacheSize", "Landroidx/compose/ui/text/g0;", "e", "Landroidx/compose/ui/text/g0;", "textLayoutCache", "fallbackDensity", "<init>", "(Landroidx/compose/ui/text/font/v$b;Ls1/e;Landroidx/compose/ui/unit/LayoutDirection;I)V", "f", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@g
public final class j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.font.v.b fallbackFontFamilyResolver;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final s1.e f16815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LayoutDirection fallbackLayoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int cacheSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final g0 textLayoutCache;

    /* JADX INFO: renamed from: androidx.compose.ui.text.j0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextMeasurer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/j0$a;", "", "Landroidx/compose/ui/text/h0;", "textLayoutInput", "Landroidx/compose/ui/text/i0;", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult b(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), r0.d(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.i(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iR = s1.b.r(textLayoutInput.getConstraints());
            boolean z10 = false;
            int iP = ((textLayoutInput.getSoftWrap() || androidx.compose.ui.text.style.q.g(textLayoutInput.getOverflow(), androidx.compose.ui.text.style.q.INSTANCE.c())) && s1.b.j(textLayoutInput.getConstraints())) ? s1.b.p(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            if (!textLayoutInput.getSoftWrap() && androidx.compose.ui.text.style.q.g(textLayoutInput.getOverflow(), androidx.compose.ui.text.style.q.INSTANCE.c())) {
                z10 = true;
            }
            int maxLines = z10 ? 1 : textLayoutInput.getMaxLines();
            if (iR != iP) {
                iP = fi.u.I(t.k(multiParagraphIntrinsics.b()), iR, iP);
            }
            j jVar = new j(multiParagraphIntrinsics, s1.c.b(0, iP, 0, s1.b.o(textLayoutInput.getConstraints()), 5, null), maxLines, androidx.compose.ui.text.style.q.g(textLayoutInput.getOverflow(), androidx.compose.ui.text.style.q.INSTANCE.c()), null);
            return new TextLayoutResult(textLayoutInput, jVar, s1.c.d(textLayoutInput.getConstraints(), s1.s.a((int) Math.ceil(jVar.getWidth()), (int) Math.ceil(jVar.getHeight()))), null);
        }
    }

    public j0(@dl.d androidx.compose.ui.text.font.v.b fallbackFontFamilyResolver, @dl.d s1.e fallbackDensity, @dl.d LayoutDirection fallbackLayoutDirection, int i10) {
        kotlin.jvm.internal.f0.p(fallbackFontFamilyResolver, "fallbackFontFamilyResolver");
        kotlin.jvm.internal.f0.p(fallbackDensity, "fallbackDensity");
        kotlin.jvm.internal.f0.p(fallbackLayoutDirection, "fallbackLayoutDirection");
        this.fallbackFontFamilyResolver = fallbackFontFamilyResolver;
        this.f16815b = fallbackDensity;
        this.fallbackLayoutDirection = fallbackLayoutDirection;
        this.cacheSize = i10;
        this.textLayoutCache = i10 > 0 ? new g0(i10) : null;
    }

    public /* synthetic */ j0(androidx.compose.ui.text.font.v.b bVar, s1.e eVar, LayoutDirection layoutDirection, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(bVar, eVar, layoutDirection, (i11 & 8) != 0 ? l0.f16820a : i10);
    }

    @j2
    @dl.d
    public final TextLayoutResult a(@dl.d d text, @dl.d TextStyle style, int overflow, boolean softWrap, int maxLines, @dl.d List<d.Range<Placeholder>> placeholders, long constraints, @dl.d LayoutDirection layoutDirection, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, boolean skipCache) {
        g0 g0Var;
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (kotlin.jvm.internal.u) null);
        TextLayoutResult textLayoutResultA = (skipCache || (g0Var = this.textLayoutCache) == null) ? null : g0Var.a(textLayoutInput);
        if (textLayoutResultA != null) {
            return textLayoutResultA.a(textLayoutInput, s1.c.d(constraints, s1.s.a(t.k(textLayoutResultA.getMultiParagraph().getWidth()), t.k(textLayoutResultA.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult textLayoutResultB = INSTANCE.b(textLayoutInput);
        g0 g0Var2 = this.textLayoutCache;
        if (g0Var2 != null) {
            g0Var2.b(textLayoutInput, textLayoutResultB);
        }
        return textLayoutResultB;
    }
}
