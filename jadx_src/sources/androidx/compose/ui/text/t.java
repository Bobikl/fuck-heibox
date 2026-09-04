package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Paragraph.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001ap\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u001ap\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007\u001a{\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a,\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a7\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a\f\u0010\"\u001a\u00020\n*\u00020\u000eH\u0000\"\u0014\u0010$\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"", "text", "Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Landroidx/compose/ui/text/w;", "placeholders", "", "maxLines", "", "ellipsis", "", "width", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "Landroidx/compose/ui/text/n;", ak.aF, "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "b", "Ls1/b;", "constraints", "g", "(Ljava/lang/String;Landroidx/compose/ui/text/q0;JLs1/e;Landroidx/compose/ui/text/font/v$b;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/n;", "Landroidx/compose/ui/text/r;", "paragraphIntrinsics", ak.av, "i", "(Landroidx/compose/ui/text/r;JIZ)Landroidx/compose/ui/text/n;", "k", "I", "DefaultMaxLines", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f16974a = Integer.MAX_VALUE;

    @dl.d
    @kotlin.k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.s0(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final n a(@dl.d r paragraphIntrinsics, int i10, boolean z10, float f10) {
        kotlin.jvm.internal.f0.p(paragraphIntrinsics, "paragraphIntrinsics");
        return androidx.compose.ui.text.platform.h.b(paragraphIntrinsics, i10, z10, s1.c.b(0, k(f10), 0, 0, 13, null));
    }

    @dl.d
    @kotlin.k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @kotlin.s0(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final n b(@dl.d String text, @dl.d TextStyle style, float f10, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d List<d.Range<SpanStyle>> spanStyles, @dl.d List<d.Range<Placeholder>> placeholders, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        return androidx.compose.ui.text.platform.h.c(text, style, spanStyles, placeholders, i10, z10, s1.c.b(0, k(f10), 0, 0, 13, null), density, fontFamilyResolver);
    }

    @dl.d
    @kotlin.k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @kotlin.s0(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final n c(@dl.d String text, @dl.d TextStyle style, @dl.d List<d.Range<SpanStyle>> spanStyles, @dl.d List<d.Range<Placeholder>> placeholders, int i10, boolean z10, float f10, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.u.b resourceLoader) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(resourceLoader, "resourceLoader");
        return androidx.compose.ui.text.platform.h.a(text, style, spanStyles, placeholders, i10, z10, f10, density, resourceLoader);
    }

    public static /* synthetic */ n d(r rVar, int i10, boolean z10, float f10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return a(rVar, i10, z10, f10);
    }

    @dl.d
    public static final n g(@dl.d String text, @dl.d TextStyle style, long j10, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d List<d.Range<SpanStyle>> spanStyles, @dl.d List<d.Range<Placeholder>> placeholders, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        return androidx.compose.ui.text.platform.h.c(text, style, spanStyles, placeholders, i10, z10, j10, density, fontFamilyResolver);
    }

    @dl.d
    public static final n i(@dl.d r paragraphIntrinsics, long j10, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(paragraphIntrinsics, "paragraphIntrinsics");
        return androidx.compose.ui.text.platform.h.b(paragraphIntrinsics, i10, z10, j10);
    }

    public static /* synthetic */ n j(r rVar, long j10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        return i(rVar, j10, i10, z10);
    }

    public static final int k(float f10) {
        return (int) Math.ceil(f10);
    }
}
