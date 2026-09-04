package androidx.compose.ui.text;

import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.h0, reason: from toString */
/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Br\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0001¢\u0006\u0004\bE\u0010FBh\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0001¢\u0006\u0004\bE\u0010GBh\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010\u0017\u001a\u00020\u0016ø\u0001\u0001¢\u0006\u0004\bE\u0010HJ\u0085\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b2\u00105R\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b.\u00108R \u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b&\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\b*\u0010AR\u001a\u0010\u0015\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\b:\u0010B\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006I"}, d2 = {"Landroidx/compose/ui/text/h0;", "", "Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/q;", "overflow", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "Ls1/b;", "constraints", ak.av, "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;IZILs1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/u$b;J)Landroidx/compose/ui/text/h0;", "other", "equals", "hashCode", "", "toString", "Landroidx/compose/ui/text/d;", "n", "()Landroidx/compose/ui/text/d;", "b", "Landroidx/compose/ui/text/q0;", "m", "()Landroidx/compose/ui/text/q0;", ak.aF, "Ljava/util/List;", "i", "()Ljava/util/List;", "d", "I", "g", "()I", "e", "Z", "l", "()Z", "f", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/compose/ui/unit/LayoutDirection;", "()Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/text/font/v$b;", "Landroidx/compose/ui/text/font/v$b;", "()Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "j", "J", "()J", "k", "Landroidx/compose/ui/text/font/u$b;", "_developerSuppliedResourceLoader", "Ls1/e;", "()Ls1/e;", "()Landroidx/compose/ui/text/font/u$b;", "getResourceLoader$annotations", "()V", "<init>", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;IZILs1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/u$b;Landroidx/compose/ui/text/font/v$b;J)V", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;IZILs1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/u$b;JLkotlin/jvm/internal/u;)V", "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;IZILs1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/v$b;JLkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class TextLayoutInput {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f16640l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final d text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final List<d.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from toString */
    @dl.d
    private final s1.e density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.text.font.v.b fontFamilyResolver;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.text.font.u.b _developerSuppliedResourceLoader;

    private TextLayoutInput(d dVar, TextStyle q0Var, List<d.Range<Placeholder>> list, int i10, boolean z10, int i11, s1.e eVar, LayoutDirection layoutDirection, androidx.compose.ui.text.font.u.b bVar, long j10) {
        this(dVar, q0Var, list, i10, z10, i11, eVar, layoutDirection, bVar, androidx.compose.ui.text.font.o.a(bVar), j10);
    }

    @kotlin.k(message = "Font.ResourceLoader is replaced with FontFamily.Resolver", replaceWith = @kotlin.s0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints", imports = {}))
    public /* synthetic */ TextLayoutInput(d dVar, TextStyle q0Var, List list, int i10, boolean z10, int i11, s1.e eVar, LayoutDirection layoutDirection, androidx.compose.ui.text.font.u.b bVar, long j10, kotlin.jvm.internal.u uVar) {
        this(dVar, q0Var, (List<d.Range<Placeholder>>) list, i10, z10, i11, eVar, layoutDirection, bVar, j10);
    }

    private TextLayoutInput(d dVar, TextStyle q0Var, List<d.Range<Placeholder>> list, int i10, boolean z10, int i11, s1.e eVar, LayoutDirection layoutDirection, androidx.compose.ui.text.font.u.b bVar, androidx.compose.ui.text.font.v.b bVar2, long j10) {
        this.text = dVar;
        this.style = q0Var;
        this.placeholders = list;
        this.maxLines = i10;
        this.softWrap = z10;
        this.overflow = i11;
        this.density = eVar;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = bVar2;
        this.constraints = j10;
        this._developerSuppliedResourceLoader = bVar;
    }

    private TextLayoutInput(d dVar, TextStyle q0Var, List<d.Range<Placeholder>> list, int i10, boolean z10, int i11, s1.e eVar, LayoutDirection layoutDirection, androidx.compose.ui.text.font.v.b bVar, long j10) {
        this(dVar, q0Var, list, i10, z10, i11, eVar, layoutDirection, (androidx.compose.ui.text.font.u.b) null, bVar, j10);
    }

    public /* synthetic */ TextLayoutInput(d dVar, TextStyle q0Var, List list, int i10, boolean z10, int i11, s1.e eVar, LayoutDirection layoutDirection, androidx.compose.ui.text.font.v.b bVar, long j10, kotlin.jvm.internal.u uVar) {
        this(dVar, q0Var, (List<d.Range<Placeholder>>) list, i10, z10, i11, eVar, layoutDirection, bVar, j10);
    }

    @kotlin.k(message = "Replaced with FontFamily.Resolver", replaceWith = @kotlin.s0(expression = "fontFamilyResolver", imports = {}))
    public static /* synthetic */ void k() {
    }

    @dl.d
    @kotlin.k(message = "Font.ResourceLoader is deprecated", replaceWith = @kotlin.s0(expression = "TextLayoutInput(text, style, placeholders, maxLines, softWrap, overFlow, density, layoutDirection, fontFamilyResolver, constraints)", imports = {}))
    public final TextLayoutInput a(@dl.d d text, @dl.d TextStyle style, @dl.d List<d.Range<Placeholder>> placeholders, int maxLines, boolean softWrap, int overflow, @dl.d s1.e density, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.text.font.u.b resourceLoader, long constraints) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.f0.p(resourceLoader, "resourceLoader");
        return new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, resourceLoader, this.fontFamilyResolver, constraints);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @dl.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final s1.e getDensity() {
        return this.density;
    }

    @dl.d
    /* JADX INFO: renamed from: e, reason: from getter */
    public final androidx.compose.ui.text.font.v.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return kotlin.jvm.internal.f0.g(this.text, textLayoutInput.text) && kotlin.jvm.internal.f0.g(this.style, textLayoutInput.style) && kotlin.jvm.internal.f0.g(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && androidx.compose.ui.text.style.q.g(this.overflow, textLayoutInput.overflow) && kotlin.jvm.internal.f0.g(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && kotlin.jvm.internal.f0.g(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && s1.b.g(this.constraints, textLayoutInput.constraints);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + androidx.compose.foundation.b0.a(this.softWrap)) * 31) + androidx.compose.ui.text.style.q.h(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + s1.b.t(this.constraints);
    }

    @dl.d
    public final List<d.Range<Placeholder>> i() {
        return this.placeholders;
    }

    @dl.d
    public final androidx.compose.ui.text.font.u.b j() {
        androidx.compose.ui.text.font.u.b bVar = this._developerSuppliedResourceLoader;
        return bVar == null ? f.INSTANCE.a(this.fontFamilyResolver) : bVar;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @dl.d
    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final d getText() {
        return this.text;
    }

    @dl.d
    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) androidx.compose.ui.text.style.q.i(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) s1.b.w(this.constraints)) + ')';
    }
}
