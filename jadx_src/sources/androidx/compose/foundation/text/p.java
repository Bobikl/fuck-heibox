package androidx.compose.foundation.text;

import androidx.compose.runtime.j2;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.r0;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@c
@j2
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0010B^\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\b\b\u0002\u0010&\u001a\u00020!\u0012\b\b\u0002\u0010)\u001a\u00020'\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010.\u001a\u00020*\u0012\u0014\b\u0002\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010)\u001a\u00020'8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010.\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0016\u0010-R#\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/8\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b7\u00109\"\u0004\b:\u0010;R$\u0010A\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010=\u001a\u0004\b\u001c\u0010>\"\u0004\b?\u0010@R\u0014\u0010B\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00109R\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b\u0010\u0010FR\u0011\u0010H\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bG\u0010\u001fR\u0011\u0010I\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/p;", "", "Ls1/b;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/j;", "q", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/j;", "Lkotlin/b2;", "p", "Landroidx/compose/ui/text/i0;", "prevResult", "n", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/i0;)Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/text/d;", ak.av, "Landroidx/compose/ui/text/d;", "m", "()Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/q0;", "b", "Landroidx/compose/ui/text/q0;", "l", "()Landroidx/compose/ui/text/q0;", "style", "", ak.aF, "I", "e", "()I", "maxLines", "", "d", "Z", "k", "()Z", "softWrap", "Landroidx/compose/ui/text/style/q;", RXScreenCaptureService.KEY_HEIGHT, "overflow", "Landroidx/compose/ui/text/font/v$b;", "g", "Landroidx/compose/ui/text/font/v$b;", "()Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "Ljava/util/List;", "j", "()Ljava/util/List;", "placeholders", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "i", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", ak.aB, "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "()Landroidx/compose/ui/unit/LayoutDirection;", "r", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "intrinsicsLayoutDirection", "nonNullIntrinsics", "Ls1/e;", "density", "Ls1/e;", "()Ls1/e;", "f", "minIntrinsicWidth", "maxIntrinsicWidth", "<init>", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;IZILs1/e;Landroidx/compose/ui/text/font/v$b;Ljava/util/List;Lkotlin/jvm/internal/u;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class p {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final s1.e f8116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.ui.text.font.v.b fontFamilyResolver;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private MultiParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.p$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextDelegate.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/p$a;", "", "Landroidx/compose/ui/graphics/d0;", "canvas", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Lkotlin/b2;", ak.av, "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final void a(@dl.d androidx.compose.ui.graphics.d0 canvas, @dl.d TextLayoutResult textLayoutResult) {
            f0.p(canvas, "canvas");
            f0.p(textLayoutResult, "textLayoutResult");
            m0.f16821a.a(canvas, textLayoutResult);
        }
    }

    private p(androidx.compose.ui.text.d dVar, TextStyle textStyle, int i10, boolean z10, int i11, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List<androidx.compose.ui.text.d.Range<Placeholder>> list) {
        this.text = dVar;
        this.style = textStyle;
        this.maxLines = i10;
        this.softWrap = z10;
        this.overflow = i11;
        this.f8116f = eVar;
        this.fontFamilyResolver = bVar;
        this.placeholders = list;
        if (!(i10 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ p(androidx.compose.ui.text.d dVar, TextStyle textStyle, int i10, boolean z10, int i11, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List list, int i12, kotlin.jvm.internal.u uVar) {
        this(dVar, textStyle, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? androidx.compose.ui.text.style.q.INSTANCE.a() : i11, eVar, bVar, (i12 & 128) != 0 ? CollectionsKt__CollectionsKt.E() : list, null);
    }

    public /* synthetic */ p(androidx.compose.ui.text.d dVar, TextStyle textStyle, int i10, boolean z10, int i11, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, List list, kotlin.jvm.internal.u uVar) {
        this(dVar, textStyle, i10, z10, i11, eVar, bVar, list);
    }

    private final MultiParagraphIntrinsics g() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public static /* synthetic */ TextLayoutResult o(p pVar, long j10, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            textLayoutResult = null;
        }
        return pVar.n(j10, layoutDirection, textLayoutResult);
    }

    private final androidx.compose.ui.text.j q(long constraints, LayoutDirection layoutDirection) {
        p(layoutDirection);
        int iR = s1.b.r(constraints);
        boolean z10 = false;
        int iP = ((this.softWrap || androidx.compose.ui.text.style.q.g(this.overflow, androidx.compose.ui.text.style.q.INSTANCE.c())) && s1.b.j(constraints)) ? s1.b.p(constraints) : Integer.MAX_VALUE;
        if (!this.softWrap && androidx.compose.ui.text.style.q.g(this.overflow, androidx.compose.ui.text.style.q.INSTANCE.c())) {
            z10 = true;
        }
        int i10 = z10 ? 1 : this.maxLines;
        if (iR != iP) {
            iP = fi.u.I(d(), iR, iP);
        }
        return new androidx.compose.ui.text.j(g(), s1.c.b(0, iP, 0, s1.b.o(constraints), 5, null), i10, androidx.compose.ui.text.style.q.g(this.overflow, androidx.compose.ui.text.style.q.INSTANCE.c()), null);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final s1.e getF8116f() {
        return this.f8116f;
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final androidx.compose.ui.text.font.v.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LayoutDirection getIntrinsicsLayoutDirection() {
        return this.intrinsicsLayoutDirection;
    }

    public final int d() {
        return q.a(g().b());
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int f() {
        return q.a(g().a());
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MultiParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @dl.d
    public final List<androidx.compose.ui.text.d.Range<Placeholder>> j() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final androidx.compose.ui.text.d getText() {
        return this.text;
    }

    @dl.d
    public final TextLayoutResult n(long constraints, @dl.d LayoutDirection layoutDirection, @dl.e TextLayoutResult prevResult) {
        f0.p(layoutDirection, "layoutDirection");
        if (prevResult != null && v.a(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.f8116f, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.a(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().i(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (kotlin.jvm.internal.u) null), s1.c.d(constraints, s1.s.a(q.a(prevResult.getMultiParagraph().getWidth()), q.a(prevResult.getMultiParagraph().getHeight()))));
        }
        androidx.compose.ui.text.j jVarQ = q(constraints, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.f8116f, layoutDirection, this.fontFamilyResolver, constraints, (kotlin.jvm.internal.u) null), jVarQ, s1.c.d(constraints, s1.s.a(q.a(jVarQ.getWidth()), q.a(jVarQ.getHeight()))), null);
    }

    public final void p(@dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, r0.d(this.style, layoutDirection), this.placeholders, this.f8116f, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void r(@dl.e LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void s(@dl.e MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }
}
