package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0001R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R-\u0010'\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028\u0006@BX\u0086\u000eø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b\u001f\u0010\u0004R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroidx/compose/foundation/text/u;", "", "Ls1/r;", ak.av, "()J", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/q0;", "resolvedStyle", "typeface", "Lkotlin/b2;", "m", "Landroidx/compose/ui/unit/LayoutDirection;", "d", "()Landroidx/compose/ui/unit/LayoutDirection;", "j", "(Landroidx/compose/ui/unit/LayoutDirection;)V", ak.aF, "Landroidx/compose/ui/text/font/v$b;", "()Landroidx/compose/ui/text/font/v$b;", "i", "(Landroidx/compose/ui/text/font/v$b;)V", "Landroidx/compose/ui/text/q0;", "f", "()Landroidx/compose/ui/text/q0;", "k", "(Landroidx/compose/ui/text/q0;)V", "e", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "<set-?>", "J", "minSize", "Ls1/e;", "b", "()Ls1/e;", RXScreenCaptureService.KEY_HEIGHT, "(Ls1/e;)V", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Ls1/e;Landroidx/compose/ui/text/font/v$b;Landroidx/compose/ui/text/q0;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private s1.e f8398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private androidx.compose.ui.text.font.v.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private TextStyle resolvedStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object typeface;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long minSize;

    public u(@dl.d LayoutDirection layoutDirection, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d TextStyle resolvedStyle, @dl.d Object typeface) {
        f0.p(layoutDirection, "layoutDirection");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        f0.p(resolvedStyle, "resolvedStyle");
        f0.p(typeface, "typeface");
        this.layoutDirection = layoutDirection;
        this.f8398b = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = a();
    }

    private final long a() {
        return s.b(this.resolvedStyle, this.f8398b, this.fontFamilyResolver, null, 0, 24, null);
    }

    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    public final s1.e getF8398b() {
        return this.f8398b;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.text.font.v.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMinSize() {
        return this.minSize;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Object getTypeface() {
        return this.typeface;
    }

    public final void h(@dl.d s1.e eVar) {
        f0.p(eVar, "<set-?>");
        this.f8398b = eVar;
    }

    public final void i(@dl.d androidx.compose.ui.text.font.v.b bVar) {
        f0.p(bVar, "<set-?>");
        this.fontFamilyResolver = bVar;
    }

    public final void j(@dl.d LayoutDirection layoutDirection) {
        f0.p(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void k(@dl.d TextStyle textStyle) {
        f0.p(textStyle, "<set-?>");
        this.resolvedStyle = textStyle;
    }

    public final void l(@dl.d Object obj) {
        f0.p(obj, "<set-?>");
        this.typeface = obj;
    }

    public final void m(@dl.d LayoutDirection layoutDirection, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d TextStyle resolvedStyle, @dl.d Object typeface) {
        f0.p(layoutDirection, "layoutDirection");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        f0.p(resolvedStyle, "resolvedStyle");
        f0.p(typeface, "typeface");
        if (layoutDirection == this.layoutDirection && f0.g(density, this.f8398b) && f0.g(fontFamilyResolver, this.fontFamilyResolver) && f0.g(resolvedStyle, this.resolvedStyle) && f0.g(typeface, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.f8398b = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = a();
    }
}
